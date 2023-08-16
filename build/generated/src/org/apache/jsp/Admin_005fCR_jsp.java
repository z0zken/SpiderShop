package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fCR_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: larger;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"admincreate\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Species\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"radio\" name=\"spec\" value=\"Spider\"> SPI\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <input type=\"radio\" name=\"spec\" value=\"Scopion\"> SCO\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <input type=\"radio\" name=\"spec\" value=\"Frog\"> FROG\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                ID\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"id_ani\" value=\"\">\n");
      out.write("            </td>\n");
      out.write("            <th>\n");
      out.write("                Genus <input type=\"text\" name=\"gen\" value=\"\">\n");
      out.write("            </th>\n");
      out.write("            \n");
      out.write("            <th style=\" text-align: center;\">\n");
      out.write("                Species name <input type=\"text\" name=\"name_spec\" value=\"\"> \n");
      out.write("            </th>\n");
      out.write("            <th style=\" text-align: center;\">\n");
      out.write("                Name  <input type=\"text\" name=\"name\" value=\"\"> \n");
      out.write("            </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Link img1\n");
      out.write("            </th>\n");
      out.write("            \n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"img1\" value=\"\">\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Link img2\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"img2\" value=\"\"> \n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Link img3\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"img3\" value=\"\"> \n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Price\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    Sling <input type=\"text\" name=\"psling\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Semili-mature <input type=\"text\" name=\"psemili\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Mature-Male <input type=\"text\" name=\"pmale\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Matuer-Female <input type=\"text\" name=\"pfemale\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Quantity\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    Sling <input type=\"text\" name=\"Qsling\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Semili-mature <input type=\"text\" name=\"Qsemili\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Mature-Male <input type=\"text\" name=\"Qmale\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Matuer-Female <input type=\"text\" name=\"Qfemale\" value=\"\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <p>Text detail</p>\n");
      out.write("        <textarea name=\"detail\" cols=\"50\" rows=\"5\"></textarea><br>\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>\n");
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
