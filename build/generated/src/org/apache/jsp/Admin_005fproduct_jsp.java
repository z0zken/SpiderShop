package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"\");\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin: 20px 0;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 8px;\n");
      out.write("                text-align: left;\n");
      out.write("                border-bottom: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                transition-duration: 0.4s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button:hover {\n");
      out.write("                box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .space{\n");
      out.write("                height: 50px;\n");
      out.write("            }\n");
      out.write("            tr:hover {\n");
      out.write("                background-color: aquamarine;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    ID\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Species\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Name\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Name science\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Quantity in warehouse.\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            ");
      Control.GetInfor a = null;
      synchronized (_jspx_page_context) {
        a = (Control.GetInfor) _jspx_page_context.getAttribute("a", PageContext.PAGE_SCOPE);
        if (a == null){
          a = new Control.GetInfor();
          _jspx_page_context.setAttribute("a", a, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"background-color: #4CAF50; text-align: center;\"><a href=\"Admin_CR.jsp\" style=\"padding: 0 45%; color: white; text-decoration: none;font-size: larger; font-weight: bold;\">+</a></td>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("e");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.allAniAdmin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.id_ani}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.name_cat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.name_ani}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.scient_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    <td >\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <a href=\"admindelete?id_ani=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.id_ani}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"text-decoration: none; font-size: larger;\"><i class=\"fa-solid fa-trash-can-list\">&#128465;</i></a>\n");
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <a href=\"adminupdate?id_ani=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.id_ani}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"text-decoration: none;\"><i class=\"fa-solid fa-trash-can-list\">&#9881;</i></a>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
