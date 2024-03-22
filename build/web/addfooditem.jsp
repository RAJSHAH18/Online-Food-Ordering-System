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
        <form action="insertfood" method="post">
            <div class="center">
            <fieldset style="width: 370px; text-align: left">
                <legend align="center">Food Item</legend>                    
                <table cellspacing="0px" cellpadding="12px">
                    <tr>
                        <th>
                            Food Item
                        </th>
                        <td>
                            ::
                        </td>
                        <td>
                            <input type="text" name="food" placeholder="Enter Food Item" required>
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Food Price
                        </th>
                        <td>
                            ::
                        </td>
                        <td>
                            <input type="text" name="price" placeholder="Enter Food " required>
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Food Image
                        </th>
                        <td>
                            ::
                        </td>
                        <td>
                            <input type="file" name="image" placeholder="Enter Food Item" required>
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Category
                        </th>
                        <td>
                            ::
                        </td>
                        <td>
                            <select name="category">
                                <option value="" selected hidden disabled>SELECT FOOD CATEGORY</option>
                                
                    <%
                        Connection con=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
                        
                        String sql="SELECT * FROM food_category";
                        Statement s=con.createStatement();
                        ResultSet rs=s.executeQuery(sql);
                        
                        while(rs.next())
                        {
                                                    
                    %>
                    <option value="<%= rs.getInt("id") %>"><%= rs.getString("category") %></option>
                    <%
                        }
                    %>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <th>
                            Restaurant
                        </th>
                        <td>
                            ::
                        </td>
                        <td>
                            <select name="restaurant">
                                <option value="" selected hidden disabled>SELECT RESTAURANT</option>
                    <%
                        String sql2="SELECT * FROM tbl_restaurant";
                        Statement s2=con.createStatement();
                        ResultSet rs2=s2.executeQuery(sql2);
                        
                        while(rs2.next())
                        {
                        
                    %>
                        <option value="<%= rs2.getInt("id") %>"><%= rs2.getString("res_name") %></option>
                    <%
                        }
                    %>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: right" align="center">
                            <input type="submit" name="submit" value="ADD NOW">
                        </td>
                        <td style="text-align: left">
                            <button><a href="viewfooditem.jsp" style="text-decoration: none">View Food Item</a></button>
                        </td>
                    </tr>
                </table>
            </fieldset>
                <br>
                <div align="center">
                    <button><a href="home.jsp" style="text-decoration: none">BACK</a></button>
                </div>
                            
            </div>
        </form>
    </body>
</html>
