//    ENROLL NO. : SR21BSIT156
//    NAME       : RAJ JIGNESHBHAI SHAH
//    CLASS      : SYIT (SEM 3)
//    DIV        : B
//    FACULTY    : DR. RUPAL MAM
//    SUBJECT    : JSP ASS 10
//    AIM        : ONLINE FOOD ORDERING SYSTEM
//    DATE       : 22/11/2022


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class cart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            try 
            {
                 HttpSession session;
                 session=request.getSession();
                 Connection con=null;
                 Class.forName("com.mysql.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
                
//                if(con!=null)
//                {
//                    out.println("Connected");
//                }
                 int quantity=Integer.parseInt(request.getParameter("qty"));
                 int price=Integer.parseInt(request.getParameter("price"));
                 int fid=Integer.parseInt(request.getParameter("fid"));
                 String id=(String)session.getAttribute("id");
                 int cid=Integer.parseInt(id);
                    out.println(price);

                 
                 String qry="SELECT * FROM cart WHERE cid="+cid+" AND pid="+fid;
                 Statement st=con.createStatement();
                 ResultSet rs=st.executeQuery(qry);
                 
                 if(rs.next())
                 {
                        String q="UPDATE cart SET quantity=quantity+?,total_price=(?*quantity) WHERE cid=? AND pid=?";
                        PreparedStatement p=con.prepareStatement(q);
                        p.setInt(1,quantity);
                        p.setInt(2,price);
                        p.setInt(3,cid);
                        p.setInt(4,fid);
                        int j=p.executeUpdate();
                        if(j>0)
                        {
                            out.println("<script>alert('ADDED TO THE CART');location.replace('menu.jsp')</script>");
//                            out.println(price);
                        }
                        else
                        {
                           out.println("<script>alert('SOMETHING WENT WRONG');location.replace('menu.jsp')</script>");

                        }

                 }
                 else
                 {
                    price=(price*quantity);
                    String query="INSERT INTO cart(quantity,total_price,cid,pid) VALUES(?,?,?,?)";
                    PreparedStatement ps=con.prepareStatement(query);
                    ps.setInt(1,quantity);
                    ps.setInt(2,price);
                    ps.setInt(3,cid);
                    ps.setInt(4,fid);
                    int i=ps.executeUpdate();
                    if(i>0)
                    {
                        out.println("<script>alert('ADDED TO THE CART');location.replace('menu.jsp')</script>");
                    }
                    else
                    {
                       out.println("<script>alert('SOMETHING WENT WRONG');location.replace('menu.jsp')</script>");

                    }
                 }
                 
            }
            catch (Exception e) 
            {
                out.println(e.getMessage());
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
