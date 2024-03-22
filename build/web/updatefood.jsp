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
        <form action="updatefood" method="post">
        <fieldset style="width: 370px; text-align: left" class="center">
            <legend align="center">Update Food Item</legend>
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

                String sql="SELECT * FROM food_item WHERE id="+id;
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
                Food Name
            </th>
            <td>
                ::
            </td>
            <td>
                <input type="text" value="<%= rs.getString("food_nm") %>" name="fname" placeholder="Enter Food Item">
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

        <%            
            
            String sql2="SELECT * FROM food_category";
            Statement s2=con.createStatement();
            ResultSet rs2=s2.executeQuery(sql2);

            while(rs2.next())
            {
            
        %>
            <option value="<%= rs2.getInt("id") %>"
                    <%
                        if(rs.getInt("cat_id")==rs2.getInt("id"))
                        {
                            out.println("selected");
                        }
                    %>
            ><%= rs2.getString("category") %></option>
            <%
                }
            %>
                </select>
            </td>
        <tr>
            <th>
                Restaurant
            </th>
            <td>
                ::
            </td>
            <td>
                <select name="restaurant">
                <%
                    String sql3="SELECT * FROM tbl_restaurant";
                    Statement s3=con.createStatement();
                    ResultSet rs3=s3.executeQuery(sql3);
                    
                    while(rs3.next())
                    {

                %>
                <option value="<%= rs3.getInt("id")%>"
                        <%
                            if(rs3.getInt("id")==rs.getInt("res_id"))
                            {
                                out.println("selected");
                            }
                        %>
                ><%= rs3.getString("res_name") %></option>
                <%                            
                        }   
                    }
                %>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <input type="submit" value="UPDATE NOW">
            </td> 
        </tr>
        </table>
        </fieldset>    
        </form>
   </body>
</html>
