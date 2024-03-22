<!--ENROLL NO. : SR21BSIT156
    NAME       : RAJ JIGNESHBHAI SHAH
    CLASS      : SYIT (SEM 3)
    DIV        : B
    FACULTY    : DR. RUPAL MAM
    SUBJECT    : JSP ASS 10
    AIM        : ONLINE FOOD ORDERING SYSTEM
    DATE       : 22/11/2022
-->

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .center
            {
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%,-50%);
            }
        </style>
    </head>
    <body>
        <form action="updatecat" method="post">
            
        <fieldset class="center" style="width: 390px" >
            <legend align="center">Update Category</legend>
        <table cellspacing="0px" cellpadding="10px">
            
        <%
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
            
//            if(con!=null)
//            {
//                out.println("Connected");
//            }

            int id=Integer.parseInt(request.getParameter("id"));
//            out.println(id);
            String sql="SELECT * FROM food_category WHERE id="+id;
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery(sql);
            
            while(rs.next())
            {
            
        %>
        <tr>
            <th>
                Id
            </th>
            <td>
                ::
            </td>
            <td>
                <%= rs.getInt("id") %>
                <input type="hidden" name="id" value="<%= rs.getInt("id") %>">
            </td>
        </tr>
        <tr>
            <th>
                Category Name
            </th>
            <td>
                ::
            </td>
            <td>
                <input type="text" name="catname" value="<%= rs.getString("category") %>">
            </td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <input type="submit" name="submit" value="Update Now">
            </td>
        </tr>
        <%
            }
        %>
        </table>
        </fieldset>
        </form>
    </body>
</html>
