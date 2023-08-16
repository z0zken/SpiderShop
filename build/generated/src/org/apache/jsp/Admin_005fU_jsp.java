package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fU_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <form action=\"adminupdate\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Species\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"radio\" name=\"spec\" value=\"Spider\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.name_cat==\"Spider\"?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("> SPI\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <input type=\"radio\" name=\"spec\" value=\"Scopion\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.name_cat==\"Scopion\"?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("> SCO\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <input type=\"radio\" name=\"spec\" value=\"Frog\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.name_cat==\"Frog\"?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("> FRO\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                ID\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"id_ani\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.id_ani}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("            </td>\n");
      out.write("            <th>\n");
      out.write("                Genus <input type=\"text\" name=\"gen\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.genus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </th>\n");
      out.write("            \n");
      out.write("            <th style=\" text-align: center;\">\n");
      out.write("                Species name <input type=\"text\" name=\"name_spec\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.species_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("            </th>\n");
      out.write("            <th style=\" text-align: center;\">\n");
      out.write("                Name  <input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.name_ani}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("            </th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Link img1\n");
      out.write("            </th>\n");
      out.write("            \n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"img1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.getImg_url().get(0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Link img2\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"img2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.getImg_url().get(1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <th>\n");
      out.write("                Link img3\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"img3\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.getImg_url().get(2)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Price\n");
      out.write("                </th>\n");
      out.write("                <td>\n");
      out.write("                    Sling <input type=\"text\" name=\"psling\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.psling}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Semili-mature <input type=\"text\" name=\"psemili\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.psemili_mature}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Mature-Male <input type=\"text\" name=\"pmale\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.pmale_mature}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    Matuer-Female <input type=\"text\" name=\"pfemale\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.pfemale_mature}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <p>Text detail</p>\n");
      out.write("        <textarea name=\"detail\" cols=\"50\" rows=\"5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${up.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea><br>\n");
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
