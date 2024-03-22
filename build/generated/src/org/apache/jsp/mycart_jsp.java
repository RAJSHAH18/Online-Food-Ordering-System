package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class mycart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MY CART</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Navbar Page</title>\n");
      out.write("         <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: \"Poppins\", Sans-serif;\n");
      out.write("            }\n");
      out.write("            .nav-bar{\n");
      out.write("                /*width: 98%;*/\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                background-color: #34495e;\n");
      out.write("                padding: 1.2rem;\n");
      out.write("                /*position: fixed;*/\n");
      out.write("            }       \n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                all: unset;\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a:hover{\n");
      out.write("                cursor: pointer;\n");
      out.write("                color: steelblue;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            ul{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                list-style: none;\n");
      out.write("                gap: 1.2rem;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

         String role = (String) session.getAttribute("role");
         String nm = (String) session.getAttribute("name");
//         out.println(role);
//         out.println(nm);
         if(role==null && nm==null)
         {
    
      out.write("\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">Online Food Ordering</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"adminlogin.jsp\">LOGIN</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"register.jsp\">REGISTER</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("    ");

       }
       else
        {
            if(role.equals("user"))
            {

    
      out.write("\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">Online Food Ordering</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"menu.jsp\">MENU</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"mycart.jsp\">MY_CART</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"myorder.jsp\">MY_ORDER</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"myaccount.jsp\">MY_ACCOUNT</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"logout\">LOGOUT</a></li>\n");
      out.write("                    <li class=\"active\" style=\"font-weight:bold;font-size: 25px;color: #666dff; \"> Welcome ");
      out.print(nm);
      out.write("</li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

            }
            else if(role.equals("admin"))
            {

      out.write("\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">Online Food Ordering</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"addfooditem.jsp\">FOOD ITEM</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"addcategory.jsp\">FOOD CATEGORY</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"addrestaurant.jsp\">RESTAURANT</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"logout\">LOGOUT</a></li>\n");
      out.write("                    <li class=\"active\" style=\"font-weight:bold;font-size: 25px;color: #666dff; \"> Welcome ");
      out.print(nm);
      out.write("</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");

            }
        }        
    
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <table cellspacing=\"0px\" cellpadding=\"10px\" border=\"2px\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Sr.No</th>\n");
      out.write("                <th>Food Image</th>\n");
      out.write("                <th>Food Name</th>\n");
      out.write("                <th>Food Price</th>\n");
      out.write("                <th>Food Quantity</th>\n");
      out.write("                <th>Resturant</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

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
                int i=0;
                while(rs.next())
                {
                    
        
      out.write("            \n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("food_img"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("food_nm"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("food_price"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getInt("quantity"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getInt("res_name"));
      out.write("</td>\n");
      out.write("                        total=total+");
      out.print(rs.getInt("total_price"));
      out.write(";\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("       ");
           
                    i++;
                }
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"5\" align=\"center\" >TOTAL PRICE = &#8377");
      out.print(total);
      out.write(";</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
