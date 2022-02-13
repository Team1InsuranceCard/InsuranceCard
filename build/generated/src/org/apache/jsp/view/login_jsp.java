package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<link href=\"asset/style/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("        background-image: url('asset/image/login_background.jpg');\r\n");
      out.write("        background-repeat: no-repeat;\r\n");
      out.write("        background-position-y: 55%;\r\n");
      out.write("        background-size: cover;\r\n");
      out.write("        /*background-color: #E5E5E5;*/\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\"\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"asset/image/favicon.png\" type=\"image/png\" sizes=\"16x16\">\r\n");
      out.write("           <meta name=\"google-signin-client_id\" content=\"80615342986-dff0u5ao63gt3ghum6kk9oo3j3a2pj72.apps.googleusercontent.com\">\r\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("        <script src=\"asset/script/google_login.js\" defer></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"limiter\">\r\n");
      out.write("            <form action=\"login\" method=\"POST\">\r\n");
      out.write("                <div class=\"logo-group\">\r\n");
      out.write("                    <div class=\"car\">\r\n");
      out.write("                        <img src=\"asset/image/icon_car.png\" alt=\"LogoIcon\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"insurance-card\">\r\n");
      out.write("                        <img src=\"asset/image/InsuranceCard.png\" alt=\"LogoTitle\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"username\"><input class=\"input100\" type=\"email\" name=\"user\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Email\" required/></div>\r\n");
      out.write("                <div class=\"img-user\"><img src=\"asset/image/user_1.png\" alt=\"UserIcon\"/></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"password\"><input class=\"input100\" type=\"password\" name=\"pass\" pattern=\"[a-zA-Z0-9@]+\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Password\" required></div>\r\n");
      out.write("                <div class=\"img-pass\"><img src=\"asset/image/password_1.png\" alt=\"PassIcon\"/></div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"remember\">\r\n");
      out.write("                    <label for=\"check\"><input type=\"checkbox\" id=\"check\" name=\"remember\">\r\n");
      out.write("                        <span class=\"checkmark\"></span><span>Remember Me?</span>\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"logbutton\">\r\n");
      out.write("                    <input type=\"submit\" name=\"log\" value=\"LOGIN\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"forgot-sign\">\r\n");
      out.write("                    <div class=\"forgot\"><a href=\"#\">Forgot Password?</a></div>\r\n");
      out.write("                    <div class=\"sign\"><a href=\"#\">Sign Up</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"quick-log\">\r\n");
      out.write("                    <div  class=\"google\">\r\n");
      out.write("                        <img src=\"asset/image/gg_icon.png\" alt=\"\"/>\r\n");
      out.write("                        <input class=\"g-signin2\" data-onsuccess=\"onSignIn\" type=\"button\" name=\"gg\" value=\"Google\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.alert != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <div class=\"alert\">\r\n");
        out.write("                    <div class=\"alert-danger\">\r\n");
        out.write("                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.alert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
