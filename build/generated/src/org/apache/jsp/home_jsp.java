package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>WELCOME Page</title>\n");
      out.write("        <style>\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                position:absolute;\n");
      out.write("                top:50%;\n");
      out.write("                left:50%;\n");
      out.write("                transform:translate(-50%,-50%);\n");
      out.write("                width:1100px;\n");
      out.write("                /*background-color: white;*/\n");
      out.write("                /*border-radius:5px;*/\n");
      out.write("                font-weight: 1400;\n");
      out.write("                font-size: 50px;\n");
      out.write("                text-decoration: underline double;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h1:hover\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                    background-image: linear-gradient(to right, #fc5c7d, #6a82fb);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
            if(role=="user")
            {

    
      out.write("\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">Online Food Ordering</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"home.jsp\">HOME</a></li>\n");
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
            else
            {

      out.write("\n");
      out.write("            <nav class=\"nav-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">Online Food Ordering</li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"addfood.jsp\">FOOD ITEM</a></li>\n");
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
      out.write("        \n");
      out.write("        <h1>Welcome To Online Food Ordering System</h1>\n");
      out.write("\n");
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
