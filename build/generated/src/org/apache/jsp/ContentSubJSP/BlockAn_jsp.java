package org.apache.jsp.ContentSubJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BlockAn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../bootstrap-5.0.2-dist/css/bootstrap.min.css\"/>\n");
      out.write("        <style>\n");
      out.write("            @import url(\"https://fonts.googleapis.com/css?family=Raleway:300,400\");\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .ani-block{\n");
      out.write("                width: 100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .content h4{\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                text-align: center;\n");
      out.write("                width: 100%;\n");
      out.write("                color: black;\n");
      out.write("                margin-top:  0;\n");
      out.write("                padding: 2px 0 2px 0;\n");
      out.write("                font-family: Arial, Helvetica;\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                background-color: gray;\n");
      out.write("                width: 100%;\n");
      out.write("                min-width: 150px;\n");
      out.write("                max-width: 350px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content p{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .ani-block .content .thumbex {\n");
      out.write("                width: 100%;\n");
      out.write("                min-width: 150px;\n");
      out.write("                max-width: 400px;\n");
      out.write("                -webkit-flex: 1;\n");
      out.write("                -ms-flex: 1;\n");
      out.write("                flex: 1;\n");
      out.write("                overflow: hidden;\n");
      out.write("                outline-offset: -15px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            .ani-block .thumbex .thumbnail {\n");
      out.write("                overflow: hidden;\n");
      out.write("                width: 100%;\n");
      out.write("                min-width: 150px;\n");
      out.write("                max-width: 400px;\n");
      out.write("                height: 268px;\n");
      out.write("                position: relative;\n");
      out.write("                opacity: 0.88;\n");
      out.write("                backface-visibility: hidden;\n");
      out.write("                transition: all 0.4s ease-out;\n");
      out.write("            }\n");
      out.write("            .ani-block .thumbex .thumbnail img {\n");
      out.write("                position: absolute;\n");
      out.write("                z-index: 1;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 50%;\n");
      out.write("                height: 112.5%;\n");
      out.write("                width: auto;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                backface-visibility: hidden;\n");
      out.write("            }\n");
      out.write("            .ani-block .thumbex .thumbnail span{\n");
      out.write("                position: absolute;\n");
      out.write("                z-index: 2;\n");
      out.write("                top: 5%;\n");
      out.write("                background: rgba(0, 0, 0, 0.7);\n");
      out.write("                padding: 40%;\n");
      out.write("                text-align: center;\n");
      out.write("                color: white;\n");
      out.write("                letter-spacing: 0.2px;\n");
      out.write("                transition: all 0.3s ease-out;\n");
      out.write("            }\n");
      out.write("            .ani-block .thumbex .thumbnail:hover {\n");
      out.write("                backface-visibility: hidden;\n");
      out.write("                transform: scale(1.1, 1.1);\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .ani-block .thumbex .thumbnail:hover .img2 {\n");
      out.write("                opacity: 0;\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ani-block .thumbex .thumbnail label h4{\n");
      out.write("                position: absolute;\n");
      out.write("                background: gray;\n");
      out.write("                opacity: 50%;\n");
      out.write("                z-index: 2;\n");
      out.write("                top: 83%;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                background: rgba(0, 0, 0, 0.7);\n");
      out.write("                padding: 15px 0.5% 15px 0.5%;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: white;\n");
      out.write("                font-weight:100;\n");
      out.write("                font-family: \"Raleway\", sans-serif;\n");
      out.write("            }\n");
      out.write("            #name-price{\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String id = request.getParameter("id");
            String img_link1 = request.getParameter("img_link1");
            String img_link2 = request.getParameter("img_link2");
            String price = request.getParameter("price");
            String name = request.getParameter("name");
        
      out.write("\n");
      out.write("        <div class=\"ani-block\" style=\"margin-bottom: 4%;\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                \n");
      out.write("                <div class=\"thumbex\">\n");
      out.write("\n");
      out.write("                    <div class=\"thumbnail\"> <a href=\"describe?id_ani=");
      out.print(id);
      out.write("\">\n");
      out.write("                            <img style=\"width: 100%;object-fit: cover; \" class=\"img-responsive img-fluid img1\" src=\"");
      out.print(img_link1);
      out.write("\" alt=\"alt\"/>\n");
      out.write("                            <img style=\"width: 100%;object-fit: cover; \" class=\"img-responsive img-fluid img2\" src=\"");
      out.print(img_link2);
      out.write("\" \n");
      out.write("                                       alt=\"alt\"/>\n");
      out.write("                            <label><h4 id=\"name-price\">");
      out.print(name);
      out.write(" - ");
      out.print(price);
      out.write("</h4></label>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                        \n");
      out.write("    </body>\n");
      out.write("</html>");
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
