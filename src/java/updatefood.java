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
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class updatefood extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            try
            {
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
                
//                if(con!=null)
//                {
//                    out.println("Connected");
//                }
                
                String fname=request.getParameter("fname");
                int cid=Integer.parseInt(request.getParameter("category"));
                int rid=Integer.parseInt(request.getParameter("restaurant"));
                int id=Integer.parseInt(request.getParameter("id"));
                String sql="UPDATE food_item SET food_nm=?,cat_id=?,res_id=? WHERE id=?";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,fname);
                ps.setInt(2,cid);
                ps.setInt(3,rid);
                ps.setInt(4,id);
                
                int x=ps.executeUpdate();
                
                if(x==1)
                {
                    out.println("<script>alert('Updated Successfully'); location.replace('viewfooditem.jsp')</script>");
                }
            }
            catch(Exception e)
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
