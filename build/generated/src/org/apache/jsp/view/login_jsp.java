package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<link href=\"../asset/style/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("        background-image: url('../asset/image/login_background.jpg');\r\n");
      out.write("        background-repeat: no-repeat;\r\n");
      out.write("        position: relative;\r\n");
      out.write("        background-size: 1560px 894px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"limiter\">\r\n");
      out.write("            <form action=\"login\" method=\"POST\" class=\"limiter\">\r\n");
      out.write("                <div class=\"logo-group\">\r\n");
      out.write("                    <div class=\"car\">\r\n");
      out.write("                        <img src=\"../asset/image/icon_car.png\" alt=\"LogoIcon\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"insurance-card\">\r\n");
      out.write("                        <img src=\"../asset/image/InsuranceCard.png\" alt=\"LogoTitle\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"username\">\r\n");
      out.write("                    <input class=\"input100\" id=\"u\" type=\"email\" name=\"user\" placeholder=\"Email\" required/>\r\n");
      out.write("                    <label for=\"u\"><img src=\"../asset/image/user_1.png\" alt=\"UserIcon\"/></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"password\">\r\n");
      out.write("                    <input class=\"input100\" id=\"p\" type=\"password\" name=\"pass\" pattern=\"[a-zA-Z0-9@]+\" placeholder=\"Password\" required>\r\n");
      out.write("                    <label for=\"p\"><img src=\"../asset/image/password_1.png\" alt=\"PassIcon\"/></label>\r\n");
      out.write("                </div>\r\n");
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
      out.write("                    <div class=\"facebook\">\r\n");
      out.write("                        <img src=\"../asset/image/fb_icon.png\" alt=\"\"/>\r\n");
      out.write("                        <input type=\"button\" name=\"fb\" value=\"Facebook\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"google\">\r\n");
      out.write("                        <img src=\"../asset/image/gg_icon.png\" alt=\"\"/>\r\n");
      out.write("                        <input type=\"button\" name=\"gg\" value=\"Google\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
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
}
