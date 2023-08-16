package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license\n");
      out.write("Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.2.1/css/fontawesome.min.css\" integrity=\"sha384-QYIZto+st3yW+o8+5OHfT6S482Zsvz2WfOzpFSXMF9zqeLcFV0/wlZpMtyFcZALm\" crossorigin=\"anonymous\"> -->\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"bootstrap-5.0.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            ul{\n");
      out.write("                display: flex;\n");
      out.write("                text-align: center;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            ul li{\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .bg-light {\n");
      out.write("                background-color: #212529!important;\n");
      out.write("            }\n");
      out.write("            .nav{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .nav-link{\n");
      out.write("                color: white;\n");
      out.write("                /* border: solid 5px; */\n");
      out.write("            }\n");
      out.write("            .dropdown:hover .dropdown-content{\n");
      out.write("                display: block;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 50;\n");
      out.write("                background: rgb(33,37,41);\n");
      out.write("            }\n");
      out.write("            .dropdown:not(:hover) .dropdown-content{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .dropdown-item{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .navbar-nav .nav-item :hover .nav-link{\n");
      out.write("                color: yellow;\n");
      out.write("            }\n");
      out.write("            .navbar-nav .nav-item :not(:hover) .nav-link{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .dropdown-item .submit-item{\n");
      out.write("                background: transparent;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .nav-item .submit-item{\n");
      out.write("                background: transparent;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            /*  .carousel {\n");
      out.write("               width: 640px;\n");
      out.write("              height: 360px;\n");
      out.write("            }*/\n");
      out.write("            .carousel-inner > .item > img {\n");
      out.write("                object-fit: cover;\n");
      out.write("            }\n");
      out.write("            /*.carousel-inner > .item > img, .carousel-inner > .item > a > img {\n");
      out.write("                width: 100%;\n");
      out.write("            }*/\n");
      out.write("            .carousel-control :hover .carousel-control{\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: #5a5a5a;\">\n");
      out.write("        <!--        <div>TODO write</div>\n");
      out.write("                <form action=\"View\" method=\"post\">\n");
      out.write("                    <input type=\"submit\" value=\"Submitt\" />\n");
      out.write("                     <i  class=\"fa fa-phone\"></i> \n");
      out.write("                </form>-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("\n");
      out.write("                <marquee behavior=\"scroll\" direction=\"left\">Gi?m giá 10% khi g?i feedback v? s?n ph?m</marquee>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"display: inline;\" class=\"col-md-3\">\n");
      out.write("                <i style=\"font-size:24px\" class=\"fa fa-phone \"></i>\n");
      out.write("                <span>03848xxxxx</span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--        <div style=\"text-align: center;\">\n");
      out.write("                    <span style=\"font-size: 30px; font-weight: bold; color: burlywood;\">IRCN V</span>\n");
      out.write("                     <i class=\"fa fa-address-book\"></i>\n");
      out.write("                    <i class=\"fa fa-search\"></i>\n");
      out.write("                    <i class=\"fa fa-cart-plus\"></i> \n");
      out.write("                </div>-->\n");
      out.write("        <div>\n");
      out.write("            <nav class=\"navbar navbar-expand-sm bg-light justify-content-center\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\"  style=\"font-size: 30px; font-weight: bold; color: burlywood;\">IRCN V</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link container-fluid\" href=\"home.jsp\">Trang chu</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\" style=\"text-align: center;\">\n");
      out.write("                        <span  class=\"nav-link container-fluid\">\n");
      out.write("                            Loài Dong Vatt\n");
      out.write("                        </span>\n");
      out.write("                        <ul class=\"dropdown-content dropdown-toggle-split\"  >\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"dropdown-item\">\n");
      out.write("                                    <form action=\"SendToAnimal\">\n");
      out.write("                                        <input class=\"submit-item\" type=\"submit\" value=\"Spider\" name=\"animal\"/>\n");
      out.write("                                    </form>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"dropdown-item\">\n");
      out.write("                                    <form action=\"SendToAnimal\">\n");
      out.write("                                        <input class=\"submit-item\" type=\"submit\" value=\"Frog\" name=\"animal\"/>\n");
      out.write("                                        <!-- <i  class=\"fa fa-phone\"></i> -->\n");
      out.write("                                    </form>\n");
      out.write("                                </a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\">\n");
      out.write("                                    <form action=\"SendToAnimal\">\n");
      out.write("                                        <input class=\"submit-item\" type=\"submit\" value=\"Scorpion\" name=\"animal\"/>\n");
      out.write("                                        <!-- <i  class=\"fa fa-phone\"></i> -->\n");
      out.write("                                    </form>\n");
      out.write("                                </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("\n");
      out.write("                        <a class=\"nav-link container-fluid\" href=\"#\">\n");
      out.write("                            <form action=\"IntroDuction\">\n");
      out.write("                                <input class=\"submit-item\" type=\"submit\" value=\"Thông tin\" />\n");
      out.write("                                <!-- <i  class=\"fa fa-phone\"></i> -->\n");
      out.write("                            </form>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link container-fluid\" href=\"#\">Gi?i Thi?u</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link container-fluid\" href=\"#\">Tin t?c</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link container-fluid\" href=\"#\">Cách ch?m sóc</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <form class=\"d-flex\">\n");
      out.write("                            <input class=\"form-control me-2\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"button\" style=\"background: #5a5a5a; border: none;\">Search</button>\n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"demo\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("\n");
      out.write("            <!-- Indicators/dots -->\n");
      out.write("            <div class=\"carousel-indicators\">\n");
      out.write("                <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"0\" class=\"active\"></button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"1\"></button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"2\"></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- The slideshow/carousel -->\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"https://cdn-prod.medicalnewstoday.com/content/images/articles/290/290338/tarantula.jpg\" alt=\"Spider\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <p></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"https://images.ctfassets.net/cnu0m8re1exe/2wxnVZrE8n4CfBfg8y6MQG/3aadbc65e01c09bc55de941182118986/shutterstock_426831952.jpg\" alt=\"Chicago\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <p></p>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"https://www.thesprucepets.com/thmb/REXiqwvQ5p7T2NhO1A3x0MU8YME=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/AC3272-001-56a2bceb5f9b58b7d0cdf84b.jpg\" alt=\"New York\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <p> </p>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Left and right controls/icons -->\n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </button>\n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
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
