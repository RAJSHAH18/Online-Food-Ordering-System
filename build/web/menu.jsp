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
        <title>MENU</title>
        <style>
            *, *::before, *::after {box-sizing: border-box;}
            .nav-bar
            {
                position:fixed;
                width:100%;
            }
            .container{
                text-align: center;
                padding:10px;
            }

            .main{
                display: grid;
                grid-template-columns: repeat(3, 1fr);
                padding: 1.2rem;
            }
            p{
                text-align: left;
            }
            img{
                object-fit: contain;
            }

            button{
                all: unset;
                cursor:pointer;
                color: black;
                background-color: rgba(0,0,0,20%);
                padding: .25rem .50rem .25rem .50rem;
                border-radius: 1.5rem;
                transition: all 250ms ease-in;
            }

            button:hover{
                background-color: rgba(0,0,0,25%);
            }
        </style>
    </head>
    <body>
         <%@include file="navbar.jsp" %>
   
         <br><br><br><br><br>
         <%
             
                 Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/online food system","root","");
                
//                if(con!=null)
//                {
//                    out.println("Connected");
//                }
             String qry = "SELECT * FROM food_category";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(qry);
             
             while(rs.next())
             {
                 
        %>   
        <div class="main">
        <%
                
                String query="SELECT * FROM food_item,tbl_restaurant WHERE food_item.res_id=tbl_restaurant.id AND cat_id="+rs.getInt("id");
                Statement s=con.createStatement();
                ResultSet r=s.executeQuery(query);
                
                while(r.next())
                {
        %>           
                    
                    <div class="container">
                        <form action="cart?fid=<%=r.getInt("id")%>&price=<%=r.getString("food_price")%>" method="POST">
                            <br><br>
                            <img src="<%=r.getString("food_img")%>"alt="<%=r.getString("food_nm")%>" height="200px" width="200px">
                            <br>
                            <h3 style="text-align:center"><%=r.getString("food_nm")%> &#8377;<%=r.getString("food_price")%></h3>
                            <br>
                            <h2 style="text-align:center"> <%=r.getString("res_name")%></h2>
                            <br>
                            <input type="number" name="qty" placeholder="Enter Quantity" required> 
                            <button type="submit">ADD TO CART</button></a>
                        </form>
                    </div>
                    
        <%            
                }

        %>    
        </div>
       
        <%       
             }
        %>
    </body>
</html>
