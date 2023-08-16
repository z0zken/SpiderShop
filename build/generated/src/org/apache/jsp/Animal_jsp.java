package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Ani;
import java.util.ArrayList;

public final class Animal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"bootstrap-5.0.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .ani-block{\n");
      out.write("                width: 100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--header-->\n");
      out.write("        <!--duoc boc boi 1 cai row-->\n");
      out.write("        <!--col-3-->\n");
      out.write("        <!--col -9-->\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            ");
ArrayList<Ani> std
                        = (ArrayList<Ani>) request.getAttribute("AniListData");
                System.out.println("length: " + std.size());
                //s.getImg_url().get(0)
                //-
//                for (int i = 0; i <= std.size(); i++) {
//                    System.out.println("img: " + std.get(i).getImg_url().get(0));
//                }
                try {

                } catch (Exception e) {
                }
                for (int i = 0; i < std.size(); i++) {
      out.write("\n");
      out.write("            <div class=\"row col-md-3\">\n");
      out.write("\n");
      out.write("                <div class=\".ani-block\">\n");
      out.write("                    ");
try {
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ContentSubJSP/BlockAn.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(std.get(i).getId_ani()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("img_link1", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(std.get(i).getImg_url().get(0)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("img_link2", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(std.get(i).getImg_url().get(1)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("price", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(std.get(i).getPrice()[0]), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("name", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(std.get(i).getName_ani()), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("                    ");
} catch (Exception e) {
                            System.out.println("this is id wrong: " + std.get(1).getId_ani());
                        }
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--footer-->\n");
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
