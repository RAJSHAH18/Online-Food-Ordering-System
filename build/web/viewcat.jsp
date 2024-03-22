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
        <div class="center">            
        <table border="2px" cellspacing="0px" cellpadding="10px">
            <tr>
                <th>
                    Id
                </th>
                <th>
                    Category
                </th>
                <th>
                    Operations
                </th>
            </tr>
        <%
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
            
//            if(con!=null)
//            {
//                out.println("Connected");
//            }

            String sql="SELECT * FROM food_category";
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery(sql);
            
            while(rs.next())
            {

        %>
        <tr>
            <td>
                <%= rs.getInt("id") %>
            </td>
            <td>
                <%= rs.getString("category") %>
            </td>
            <td>
                <button><a href="deletecat?id=<%= rs.getInt("id") %>" style="text-decoration: none">DELETE</a></button>
                <button><a href="updatecat.jsp?id=<%= rs.getInt("id") %>" style="text-decoration: none">UPDATE</a></button>
            </td>
        </tr>
        <%
            }
        %>
        </table>
        <br>
        <br>
        <div style="text-align: center">
            <button><a href="home.jsp" style="text-decoration: none">BACK</a></button>
        </div>
        </div>
    </body>
</html>
