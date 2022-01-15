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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <a href=\"header_moderator.jsp\"></a>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"logo-group\">\r\n");
      out.write("            <div class=\"car\">\r\n");
      out.write("                <img src=\"../asset/image/icon_car.png\" alt=\"LogoIcon\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"insurance-card\">\r\n");
      out.write("                <img src=\"../asset/image/InsuranceCard.png\" alt=\"LogoTitle\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"limiter\">\r\n");
      out.write("            <form action=\"login\" method=\"POST\">\r\n");
      out.write("                <div class=\"login100-form-title\">\r\n");
      out.write("                    Sign In\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"username\">\r\n");
      out.write("                    <input class=\"input100\" type=\"text\" name=\"user\" pattern=\"[a-zA-Z0-9@_.]+\" placeholder=\"Email\"/>\r\n");
      out.write("                    <img src=\"../asset/image/user_1.png\" alt=\"UserIcon\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"password\">\r\n");
      out.write("                    <input class=\"input100\" type=\"password\" name=\"pass\" pattern=\"[a-zA-Z0-9@]+\" placeholder=\"Password\">\r\n");
      out.write("                    <img src=\"../asset/image/password_1.png\" alt=\"PassIcon\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"remember\">\r\n");
      out.write("                    <input type=\"checkbox\" name=\"remember\"> Remember Me?\r\n");
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
