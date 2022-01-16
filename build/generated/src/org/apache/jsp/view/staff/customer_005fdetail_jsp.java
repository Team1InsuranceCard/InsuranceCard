package org.apache.jsp.view.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("        <title>InsuranceCard</title>\n");
      out.write("        <link rel=\"icon\" href=\"../../asset/image/favicon.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"../../asset/style/staff/customer_detail.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header_staff.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("currentscreen", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("customer", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <img src=\"../../asset/image/staff/icon member.png\" alt=\"member icon\"/>\n");
      out.write("                    <h3 id=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                    <p>Join date: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.joinDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <form action=\"customerEdit\" method=\"POST\">\n");
      out.write("                        <input type=\"submit\" id=\"edit\" value=\"Edit\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"acc info\">\n");
      out.write("                        <p class=\"type-info\">Account information</p>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"left\">\n");
      out.write("                                <p class=\"info-label\">Email</p>\n");
      out.write("                                <p class=\"info-content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.accountID.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"right\">\n");
      out.write("                                <p class=\"info-label\">Status</p>\n");
      out.write("                                <p class=\"info-content\">Active</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"person info\">\n");
      out.write("                        <p class=\"type-info\">Personal information</p>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"left\">\n");
      out.write("                                <p class=\"info-label\">DOB</p>\n");
      out.write("                                <p class=\"info-content\">17/02/2001</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"right\">\n");
      out.write("                                <p class=\"info-label\">Phone</p>\n");
      out.write("                                <p class=\"info-content\">0355070517</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"left\">\n");
      out.write("                                <p class=\"info-label\">Address</p>\n");
      out.write("                                <p class=\"info-content\">Yen Phu, Tay Ho, Ha Noi</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"right\">\n");
      out.write("                                <p class=\"info-label\">Personal ID</p>\n");
      out.write("                                <p class=\"info-content\">027301000028</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"contract info\">\n");
      out.write("                        <p class=\"type-info\">Contract information</p>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"left\">\n");
      out.write("                                <p class=\"info-label\">Staff</p>\n");
      out.write("                                <p class=\"info-content\">Nguyen Van A</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"right\">\n");
      out.write("                                <p class=\"info-label\">Toal contracts</p>\n");
      out.write("                                <p class=\"info-content\">17\n");
      out.write("                                    <a href=\"#\" style=\"margin-left:10px;\n");
      out.write("                                       text-decoration: underline;\">View</a>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer_full.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("c");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
