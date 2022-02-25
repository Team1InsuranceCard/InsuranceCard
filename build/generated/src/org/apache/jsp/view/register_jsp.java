package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>InsuranceCard</title>\r\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"80615342986-dff0u5ao63gt3ghum6kk9oo3j3a2pj72.apps.googleusercontent.com\">\r\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("        <script src=\"asset/script/google_login.js\" defer></script>\r\n");
      out.write("        <link rel=\"icon\" href=\"asset/image/favicon.png\" type=\"image/png\" sizes=\"16x16\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("        <Link rel = \"stylesheet\" href = \"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\r\n");
      out.write("        <link href=\"asset/style/register.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"homepage\">\r\n");
      out.write("                <img class=\"logo-icon\"\r\n");
      out.write("                     src=\"asset/image/icon_car.png\"\r\n");
      out.write("                     alt=\"LogoIcon\" />\r\n");
      out.write("                <br/>\r\n");
      out.write("                <img class=\"logo-title\"\r\n");
      out.write("                     src=\"asset/image/InsuranceCard.png\"\r\n");
      out.write("                     alt=\"LogoTitle\" />\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"signUp\">\r\n");
      out.write("                <h1>Sign Up</h1>\r\n");
      out.write("                <p class=\"mess\" style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess_pass==null?\"\":\"padding: 1rem 2rem;background-color: rgba(220, 123, 123, 0.51);\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                   >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess_pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <p class=\"mess\" Style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess_pID==null?\"\":\"padding: 1rem;background-color: rgba(220, 123, 123, 0.51);\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                   >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess_pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <p class=\"mess\" style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess_email==null?\"\":\"padding: 1rem 2rem;background-color: rgba(220, 123, 123, 0.51);\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                   >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess_email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <form id=\"myForm\" action=\"register\" method=\"POST\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                   placeholder=\"Email *\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"tel\" name=\"phone\" pattern=\"[0]{1}[0-9]{9}\"  \r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \r\n");
      out.write("                                   minlength=\"10\" maxlength=\"10\"\r\n");
      out.write("                                   placeholder=\"Phone *\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\" \r\n");
      out.write("                                   pattern=\"[a-zA-Z0-9]+\" \r\n");
      out.write("                                   minlength=\"8\" maxlength=\"32\"\r\n");
      out.write("                                   placeholder=\"Password *\" \r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"text\" name=\"personalID\" pattern=\"[0-9]+\"\r\n");
      out.write("                                   minlength=\"12\" maxlength=\"12\"\r\n");
      out.write("                                   placeholder=\"Personal ID *\" \r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.personalID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                   required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"password\" name=\"password2\" \r\n");
      out.write("                                   pattern=\"[a-zA-Z0-9]+\" \r\n");
      out.write("                                   minlength=\"8\" maxlength=\"32\"\r\n");
      out.write("                                   placeholder=\"Confirm password *\" \r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.pass2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                   required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"text\" name=\"address\" \r\n");
      out.write("                                   pattern=\"^[^-\\s][\\S\\s]+$\"\r\n");
      out.write("                                   placeholder=\"Address *\" \r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"text\" name=\"firstName\" \r\n");
      out.write("                                   placeholder=\"First name *\" \r\n");
      out.write("                                   pattern=\"/[^a-z0-9A-Z_\\x{00C0}-\\x{00FF}\\x{1EA0}-\\x{1EFF}]/u\"\r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <select name=\"calc_shipping_provinces\" required>\r\n");
      out.write("                                <option hidden>Province</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <input class=\"billing_address_1\" name=\"province\" \r\n");
      out.write("                                   type=\"hidden\" value=\"\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"text\" name=\"lastName\" \r\n");
      out.write("                                   placeholder=\"Last name *\" \r\n");
      out.write("                                   pattern=\"/[^a-z0-9A-Z_\\x{00C0}-\\x{00FF}\\x{1EA0}-\\x{1EFF}]/u\"\r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <select name=\"calc_shipping_district\" \r\n");
      out.write("                                    required>\r\n");
      out.write("                                <option hidden>District</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <input class=\"billing_address_2\" name=\"district\" \r\n");
      out.write("                                   type=\"hidden\" value=\"\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"date\" name=\"dob\" placeholder=\"DOB *\" \r\n");
      out.write("                                   min=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dateMin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \r\n");
      out.write("                                   max=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dateMax}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \r\n");
      out.write("                                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <div class=\"icon-login\">\r\n");
      out.write("                                <p style=\"color:#5C2941;font-size:15px;\r\n");
      out.write("                                   font-weight:bold;\">Or register by</p>\r\n");
      out.write("                                <div class=\"g-signin2\" data-onsuccess=\"onSignIn\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"register\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Register\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"login\">\r\n");
      out.write("                    <a href=\"login\">Login</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $('select[name=\"calc_shipping_provinces\"]').each(function () {\r\n");
      out.write("                var $this = $(this),\r\n");
      out.write("                        stc = \"\";\r\n");
      out.write("                c.forEach(function (i, e) {\r\n");
      out.write("                    e += +1;\r\n");
      out.write("                    stc += \"<option value=\" + e + \">\" + i + \"</option>\";\r\n");
      out.write("                    $this.html('<option value=\"\">Provinces</option>' + stc);\r\n");
      out.write("                    $this.on(\"change\", function (i) {\r\n");
      out.write("                        i = $this.children(\"option:selected\").index() - 1;\r\n");
      out.write("                        var str = \"\",\r\n");
      out.write("                                r = $this.val();\r\n");
      out.write("                        if (r != \"\") {\r\n");
      out.write("                            arr[i].forEach(function (el) {\r\n");
      out.write("                                str += '<option value=\"' + el + '\">' + el + \"</option>\";\r\n");
      out.write("                                $('select[name=\"calc_shipping_district\"]').html(\r\n");
      out.write("                                        '<option value=\"\">Districts</option>' + str\r\n");
      out.write("                                        );\r\n");
      out.write("                            });\r\n");
      out.write("                            var address_1 = $this.children(\"option:selected\").text();\r\n");
      out.write("                            var district = $('select[name=\"calc_shipping_district\"]').html();\r\n");
      out.write("                            $('select[name=\"calc_shipping_district\"]').on(\r\n");
      out.write("                                    \"change\",\r\n");
      out.write("                                    function () {\r\n");
      out.write("                                        var target = $(this).children(\"option:selected\");\r\n");
      out.write("                                        target.attr(\"selected\", \"\");\r\n");
      out.write("                                        $('select[name=\"calc_shipping_district\"] option')\r\n");
      out.write("                                                .not(target)\r\n");
      out.write("                                                .removeAttr(\"selected\");\r\n");
      out.write("                                        var address_2 = target.text();\r\n");
      out.write("                                        $(\"input.billing_address_2\").attr(\"value\", address_2);\r\n");
      out.write("                                        district = $('select[name=\"calc_shipping_district\"]').html();\r\n");
      out.write("                                    }\r\n");
      out.write("                            );\r\n");
      out.write("                            $(\"input.billing_address_1\").attr(\"value\", address_1)\r\n");
      out.write("                        } else {\r\n");
      out.write("                            $('select[name=\"calc_shipping_district\"]').html(\r\n");
      out.write("                                    '<option value=\"\">Districts</option>'\r\n");
      out.write("                                    );\r\n");
      out.write("                            district = $('select[name=\"calc_shipping_district\"]').html();\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_c_set_0.setVar("rs");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
