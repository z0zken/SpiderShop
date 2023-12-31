package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Ani;

public final class ListAnimal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>IRCN V - Exotic pets shop</title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.leanhduc.pro.vn/utilities/animation/shake-effect/style.css\" />\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"bootstrap-5.0.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- style list Animal -->\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background-color: #999999;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .wrapper{\n");
      out.write("                padding-top: 41px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .row{\n");
      out.write("                margin-right: 0;\n");
      out.write("                margin-bottom: 1%;\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                display: grid;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <!-- style footer -->\n");
      out.write("        <style>\n");
      out.write("            .ho:hover {\n");
      out.write("                color: aqua;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            /* header */\n");
      out.write("            .searchbar {\n");
      out.write("                margin-bottom: auto;\n");
      out.write("                margin-top: auto;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #353b48;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search_input {\n");
      out.write("                color: white;\n");
      out.write("                border: 0;\n");
      out.write("                outline: 0;\n");
      out.write("                background: none;\n");
      out.write("                width: 0;\n");
      out.write("                caret-color: transparent;\n");
      out.write("                line-height: 30px;\n");
      out.write("                transition: width 0.4s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .searchbar:hover > .search_input {\n");
      out.write("                padding: 0 10px;\n");
      out.write("                width: 250px;\n");
      out.write("                caret-color: red;\n");
      out.write("                transition: width 0.4s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .searchbar:hover > .search_icon {\n");
      out.write("                background: white;\n");
      out.write("                color: #e74c3c;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search_icon {\n");
      out.write("                height: 30px;\n");
      out.write("                width: 40px;\n");
      out.write("                float: right;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                display: flex;\n");
      out.write("                text-align: center;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .opa {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 30%;\n");
      out.write("                background: rgba(0, 0, 0, 0.6);\n");
      out.write("            }\n");
      out.write("            ul li {\n");
      out.write("            }\n");
      out.write("            .bg-light {\n");
      out.write("                background-color: #212529 !important;\n");
      out.write("            }\n");
      out.write("            .nav {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .nav-link {\n");
      out.write("                color: white;\n");
      out.write("                /* border: solid 5px; */\n");
      out.write("            }\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 50;\n");
      out.write("                background: rgb(33, 37, 41);\n");
      out.write("            }\n");
      out.write("            .dropdown:not(:hover) .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .dropdown-item {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .navbar-nav .nav-item :hover .nav-link {\n");
      out.write("                color: yellow;\n");
      out.write("            }\n");
      out.write("            .navbar-nav .nav-item :not(:hover) .nav-link {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .dropdown-item .submit-item {\n");
      out.write("                background: transparent;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .nav-item .submit-item {\n");
      out.write("                background: transparent;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            /*  .carousel {\n");
      out.write("                     width: 640px;\n");
      out.write("                    height: 360px;\n");
      out.write("                  }*/\n");
      out.write("            .carousel-inner > .item > img {\n");
      out.write("                object-fit: cover;\n");
      out.write("            }\n");
      out.write("            /*.carousel-inner > .item > img, .carousel-inner > .item > a > img {\n");
      out.write("                      width: 100%;\n");
      out.write("                  }*/\n");
      out.write("            .carousel-control :hover .carousel-control {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- BIGCSS -->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("        <!-- style header -->\n");
      out.write("        <style>\n");
      out.write("            .ho:hover {\n");
      out.write("                color: aqua;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            /* header */\n");
      out.write("            .searchbar {\n");
      out.write("                margin-bottom: auto;\n");
      out.write("                margin-top: auto;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #353b48;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search_input {\n");
      out.write("                color: white;\n");
      out.write("                border: 0;\n");
      out.write("                outline: 0;\n");
      out.write("                background: none;\n");
      out.write("                width: 0;\n");
      out.write("                caret-color: transparent;\n");
      out.write("                line-height: 30px;\n");
      out.write("                transition: width 0.4s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .searchbar:hover > .search_input {\n");
      out.write("                padding: 0 10px;\n");
      out.write("                width: 250px;\n");
      out.write("                caret-color: red;\n");
      out.write("                transition: width 0.4s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .searchbar:hover > .search_icon {\n");
      out.write("                background: white;\n");
      out.write("                color: #e74c3c;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search_icon {\n");
      out.write("                height: 30px;\n");
      out.write("                width: 40px;\n");
      out.write("                float: right;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                display: flex;\n");
      out.write("                text-align: center;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .opa {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 30%;\n");
      out.write("                background: rgba(0, 0, 0, 0.6);\n");
      out.write("            }\n");
      out.write("            ul li {\n");
      out.write("            }\n");
      out.write("            .bg-light {\n");
      out.write("                background-color: #212529 !important;\n");
      out.write("            }\n");
      out.write("            .nav {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .nav-link {\n");
      out.write("                color: white;\n");
      out.write("                /* border: solid 5px; */\n");
      out.write("            }\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 50;\n");
      out.write("                background: rgb(33, 37, 41);\n");
      out.write("            }\n");
      out.write("            .dropdown:not(:hover) .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .dropdown-item {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .navbar-nav .nav-item :hover .nav-link {\n");
      out.write("                color: yellow;\n");
      out.write("            }\n");
      out.write("            .navbar-nav .nav-item :not(:hover) .nav-link {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .dropdown-item .submit-item {\n");
      out.write("                background: transparent;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .nav-item .submit-item {\n");
      out.write("                background: transparent;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            /*  .carousel {\n");
      out.write("                     width: 640px;\n");
      out.write("                    height: 360px;\n");
      out.write("                  }*/\n");
      out.write("            .carousel-inner > .item > img {\n");
      out.write("                object-fit: cover;\n");
      out.write("            }\n");
      out.write("            /*.carousel-inner > .item > img, .carousel-inner > .item > a > img {\n");
      out.write("                      width: 100%;\n");
      out.write("                  }*/\n");
      out.write("            .carousel-control :hover .carousel-control {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- BIGCSS -->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header style=\"position: fixed; z-index: 50; background: #5a5a5a; width: 100%\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <marquee behavior=\"scroll\" direction=\"left\" style=\"color: rgb(91, 231, 89); font-weight: bold\"\n");
      out.write("                             >🔥10% Discount when sending feedback about the product 🔥</marquee\n");
      out.write("                    >\n");
      out.write("                </div>\n");
      out.write("                <!-- PHONE -->\n");
      out.write("                <div style=\"display: inline\" class=\"col-md-2\">\n");
      out.write("                    <i style=\"font-size: 24px\" class=\"fa fa-phone rung\"></i>\n");
      out.write("                    <span>0668xxx</span>\n");
      out.write("                </div>\n");
      out.write("                <!-- SIGN IN /OUT -->\n");
      out.write("                <div style=\"\" class=\"col-md-4 float-right\">\n");
      out.write("                    <button style=\"border-radius: 10px; margin-top: 2%; padding-top: 5px\">\n");
      out.write("                        <a href=\"#\" style=\"text-decoration: none; color: black\"><i class=\"fa-solid fa-user\"></i></a>\n");
      out.write("                    </button>\n");
      out.write("                    <button style=\"font-weight: bold; border-radius: 10px; margin-top: 2%; padding-top: 5px; padding-bottom: px\">\n");
      out.write("                        Cart <img class=\"rung\" src=\"image/iconshop.png\" alt=\"iconcart\" style=\"width: 20px; height: 20px\" />\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"text-align: center\">\n");
      out.write("                <span style=\"font-size: 50px; font-weight: bold; color: burlywood\">IRCN V Shop </span\n");
      out.write("                ><i class=\"fa-sharp fa-regular fa-circle-quarters\"></i>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <nav class=\"navbar navbar-expand-sm bg-light justify-content-center\">\n");
      out.write("                    <ul class=\"navbar-nav\" style=\"font-weight: bold\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link container-fluid\" style=\"text-decoration: underline\" href=\"home.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\" style=\"text-align: center\">\n");
      out.write("                            <span class=\"nav-link container-fluid\"> Animals <i class=\"fa-solid fa-caret-down\"></i> </span>\n");
      out.write("                            <ul class=\"dropdown-content dropdown-toggle-split\">\n");
      out.write("                                <li>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <form action=\"SendToAnimal\">\n");
      out.write("                                        <input class=\"submit-item\" type=\"submit\" value=\"Spider\" name=\"animal\"/>\n");
      out.write("                                        <!-- <i  class=\"fa fa-phone\"></i> -->\n");
      out.write("                                    </form>\n");
      out.write("                                </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <form action=\"SendToAnimal\">\n");
      out.write("                                        <input class=\"submit-item\" type=\"submit\" value=\"Frog\" name='animal'/>\n");
      out.write("                                        <!-- <i  class=\"fa fa-phone\"></i> -->\n");
      out.write("                                    </form>\n");
      out.write("                                </a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <form action=\"SendToAnimal\">\n");
      out.write("                                        <input class=\"submit-item\" type=\"submit\" value=\"Scorpion\" name='animal'/>\n");
      out.write("                                        <!-- <i  class=\"fa fa-phone\"></i> -->\n");
      out.write("                                    </form>\n");
      out.write("                                </a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link container-fluid\" href=\"#\">Information</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link container-fluid\" href=\"#\">News</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link container-fluid\" href=\"#\">Contact</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\" style=\"margin-left: 20px\">\n");
      out.write("                            <form class=\"d-flex\">\n");
      out.write("                                <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("                                    <div class=\"searchbar\">\n");
      out.write("                                        <input class=\"search_input\" type=\"text\" name=\"\" placeholder=\"Search...\" />\n");
      out.write("                                        <a href=\"#\" class=\"search_icon\"><i class=\"fas fa-search rung\"></i></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"row slide\" style=\"margin-top: -4px\">\n");
      out.write("            <div id=\"demo\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-indicators\">\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"0\" class=\"active\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"1\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"2\"></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- The slideshow/carousel -->\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img src=\"image/shop.png\" alt=\"Spider\" class=\"d-block\" style=\"width: 100%\" />\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3></h3>\n");
      out.write("                            <p></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"image/1.png\" alt=\"Chicago\" class=\"d-block\" style=\"width: 100%\" />\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3></h3>\n");
      out.write("                            <p></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"image/2.png\" alt=\"New York\" class=\"d-block\" style=\"width: 100%\" />\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3></h3>\n");
      out.write("                            <p></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Left and right controls/icons -->\n");
      out.write("                <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 String ani = (String) request.getAttribute("ani"); 
           String icon = null;
           if(ani.equalsIgnoreCase("Spider")){
                icon = "&#128375;";
            }
            if(ani.equalsIgnoreCase("Frog")){
                icon = "&#128056;";
            }
            if(ani.equalsIgnoreCase("Scorpion")){
                icon = "&#129410;";
            }
            
        
      out.write("\n");
      out.write("        <div class=\"col-ms-12\" style=\"margin-top: 8%; margin-left: 2.5%;\">\n");
      out.write("                <div class=\"row justify-content-center\"  id=\"spider\" style=\"margin-top: 1%; margin-left: 1%;\">\n");
      out.write("                    <h2 style=\"text-align: center; padding:  2%; font-family: cursive; font-size: 5vw; color: white;\">");
      out.print( ani + " " + icon);
      out.write("</h2>\n");
      out.write("                    ");
ArrayList<Ani> sp
                                = (ArrayList<Ani>) request.getAttribute("AniListData");
                        System.out.println("length: " + sp.size());
                        //s.getImg_url().get(0)
                        //-
                        //                for (int i = 0; i <= std.size(); i++) {
                        //                    System.out.println("img: " + std.get(i).getImg_url().get(0));
                        //                }
                        try {

                        } catch (Exception e) {
                        }
                        for (int i = 0; i < sp.size(); i++) {
                            if (sp.get(i).getName_cat().equalsIgnoreCase(ani)) {
                    
      out.write("\n");
      out.write("                    <div class=\"row col-md-3\">\n");
      out.write("\n");
      out.write("                        <div class=\".ani-block\">\n");
      out.write("                            ");
try {
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ContentSubJSP/BlockAn.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(sp.get(i).getId_ani()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("img_link1", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(sp.get(i).getImg_url().get(0)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("img_link2", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(sp.get(i).getImg_url().get(1)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("price", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(sp.get(i).getPrice()[0]), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(sp.get(i).getName_ani()), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("                            ");
} catch (Exception e) {
                                    System.out.println("this is id wrong: " + sp.get(1).getId_ani());
                                }
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");
}
                        }
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <footer class=\"footer bg-white\" style=\"margin-top: 50px;\">\n");
      out.write("\n");
      out.write("                <div class=\"mid-footer\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12 col-md-6 col-lg-3 footer-click\">\n");
      out.write("                                <iframe\n");
      out.write("                                    src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d630.8556871040286!2d108.26099002634841!3d15.968867651905276!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1svi!2s!4v1676466633527!5m2!1svi!2s\"\n");
      out.write("                                    width=\"250\"\n");
      out.write("                                    height=\"200\"\n");
      out.write("                                    style=\"border: 0\"\n");
      out.write("                                    allowfullscreen=\"\"\n");
      out.write("                                    loading=\"lazy\"\n");
      out.write("                                    referrerpolicy=\"no-referrer-when-downgrade\"\n");
      out.write("                                    ></iframe>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12 col-md-6 col-lg-3 footer-click\">\n");
      out.write("                                <h4 class=\"title-menu clicked\">\n");
      out.write("                                    Contact Information <i class=\"fa fa-angle-down d-md-none d-inline-block\"></i>\n");
      out.write("                                </h4>\n");
      out.write("                                <b>Address: </b>Đà Nẵng <br />\n");
      out.write("                                <b>Phone: </b> 09830668xxx<br />\n");
      out.write("                                <b>Email: </b> admin@ircnvstore.vn\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("                            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-xs-12 col-md-6 col-lg-2 footer-click\">\n");
      out.write("                                <h4 class=\"title-menu clicked\">Policy <i class=\"fa fa-angle-down d-md-none d-inline-block\"></i></h4>\n");
      out.write("                                <a href=\"\" style=\"text-decoration: none; color: black;\" class=\"ho\">Return Policy</a></br>\n");
      out.write("                                <a href=\"\" style=\"text-decoration: none; color: black;\"class=\"ho\">Terms Of Use</a></br>\n");
      out.write("                                <a href=\"\" style=\"text-decoration: none; color: black;\"class=\"ho\">Security</a></br>\n");
      out.write("                                <a href=\"\" style=\"text-decoration: none; color: black;\"class=\"ho\">Privacy</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12 col-md-6 col-lg-4 footer-click\">\n");
      out.write("                                <div class=\"social-footer\">\n");
      out.write("\n");
      out.write("                                    <iframe                src=\"https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FIRCNVShop&tabs=%20messages&width=340&height=200&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId\"\n");
      out.write("                                                           width=\"340\"\n");
      out.write("                                                           height=\"200\"\n");
      out.write("                                                           style=\"border: none; overflow: hidden\"\n");
      out.write("                                                           scrolling=\"no\"\n");
      out.write("                                                           frameborder=\"0\"\n");
      out.write("                                                           allowfullscreen=\"true\"\n");
      out.write("                                                           allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\"\n");
      out.write("                                                           ></iframe>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bg-footer-bottom copyright clearfix py-2\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div id=\"copyright\" class=\"col-lg-12 col-md-12 col-xs-12 fot_copyright text-center \" >\n");
      out.write("                                <span class=\"wsp\"> © The Coppyright by IRCNVSHOP </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <a href=\"index.html\" id=\"back-to-top\" class=\"backtop back-to-top show end\" title=\"Ontoppage\"\n");
      out.write("                           ><i class=\"fa fa-angle-up\" aria-hidden=\"true\"></i\n");
      out.write("                            ></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
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
