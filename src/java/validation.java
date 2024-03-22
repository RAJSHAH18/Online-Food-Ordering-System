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
import javax.servlet.http.HttpSession;

public class validation extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            HttpSession session;
            try
            {
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
                
//                if(con!=null)
//                {
//                    out.println("Connected");
//                }                
                
                String nm=request.getParameter("admin");
                String pass=request.getParameter("pass");
//                out.println(nm);
//                out.println(pass);
                String sql="SELECT * FROM tbl_users WHERE name='"+nm+"' AND password='"+pass+"'";
                Statement s=con.createStatement();
                ResultSet rs=s.executeQuery(sql);

                if(rs.next())
                {
//                    out.println("hello");
                    session=request.getSession();
                    session.setAttribute("name", nm);
                    session.setAttribute("role", rs.getString("role"));
                    session.setAttribute("id", rs.getString("id"));
                    session.setAttribute("email", rs.getString("email"));
                    session.setAttribute("password", rs.getString("password"));
                    
//                    String id=(String)session.getAttribute("id");
                    out.println("<script>alert('Login Successfully'); location.replace('home.jsp')</script>");
                }
                else
                {
                    out.println("<script>alert('Invalid Email-ID And Password'); location.replace('adminlogin.jsp')</script>");

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
