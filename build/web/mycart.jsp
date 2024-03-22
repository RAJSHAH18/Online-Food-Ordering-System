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
        <title>MY CART</title>
       
    </head>
    <body>
         <%@include file="navbar.jsp" %>
         <br><br>
    <center>
        <table cellspacing="0px" cellpadding="10px" border="2px">
            <caption><h1>PRODUCT DETAILS</h1></caption>
            <tr>
                <th>Sr.No</th>
                <th>Food Image</th>
                <th>Food Name</th>
                <th>Food Price</th>
                <th>Food Quantity</th>
                <th>Resturant</th>
                <th>Operation</th>
            </tr>
            <%
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
                
//                if(con!=null)
//                {
//                    out.println("Connected");
//                }

                String id=(String)session.getAttribute("id");
                int cid=Integer.parseInt(id);
                int total=0;
                String query="SELECT * FROM tbl_users,tbl_restaurant,food_item,cart WHERE cart.pid=food_item.id  AND cart.cid=tbl_users.id AND food_item.res_id=tbl_restaurant.id AND cart.cid="+cid;
//                SELECT * FROM register,product_table,cart WHERE cart.Product_id=product_table.Product_id AND cart.cid=id AND cart.cid="+cid
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(query);
                int i=1;
                while(rs.next())
                {
                    total=total+rs.getInt("total_price");


        %>            
                    
                    <tr>
                        <td><%=i%></td>
                        <td><img src="<%=rs.getString("food_img")%>" alt="<%=rs.getString("food_nm")%>" height="200px" widrh="200px"></td>
                        <td><%=rs.getString("food_nm")%></td>
                        <td><%=rs.getString("food_price")%></td>
                        <td><%=rs.getInt("quantity")%></td>
                        <td><%=rs.getString("res_name")%></td>
                        <td><a href="removecart?cart_id=<%=rs.getInt("cart_id")%>"><button>REMOVE</button></a></td>
                    </tr>
                    
                    
                    
                    
                    
                    
                    
                    
                
       <%           
                    i++;
                }
            %>
            <tr>
                <td colspan="7" align="center" >TOTAL PRICE = &#8377;<%=total%></td>
            </tr>
        </table>
            <br>
            <a href="menu.jsp"><button>CONTINUE SHOPPING</button></a>&nbsp;&nbsp;&nbsp;
            <button onclick="alert('Feature Coming Soon')">CHECKOUT</button>
            <br><br><br><br>
                
    </center>  
    </body>
</html>
