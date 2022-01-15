package org.apache.jsp.view.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>InsuranceCard</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color: #F8F8F8;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto,\n");
      out.write("                    Oxygen, Ubuntu, Cantarell, \"Open Sans\", \"Helvetica Neue\", sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            section {\n");
      out.write("                width: 1100px;\n");
      out.write("                height: 630px;\n");
      out.write("                margin-left: 370px;\n");
      out.write("                margin-top: 117px;\n");
      out.write("                background: #FFF9EC;\n");
      out.write("                color: #5C2941;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .col-md-4 {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 150px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .col-md-4 #name {\n");
      out.write("                display: block;\n");
      out.write("                word-break: break-all;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #edit {\n");
      out.write("                margin-top: 70px;\n");
      out.write("                width: 142px;\n");
      out.write("                height: 62px;\n");
      out.write("                background: #FFDCCC;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #edit:hover {\n");
      out.write("                color: #ffffff;\n");
      out.write("                background: #FC6376;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .row .col-md-8{\n");
      out.write("                border-left: 2px solid #E5E5E5;\n");
      out.write("                margin-top: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .info {\n");
      out.write("                margin-top: 35px;\n");
      out.write("                margin-left: 30px;\n");
      out.write("                padding-bottom: 30px;\n");
      out.write("                border-bottom: 1px solid #E5E5E5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .type-info {\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .info-label {\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container .left {\n");
      out.write("                display: block;\n");
      out.write("                float: left;\n");
      out.write("                width: 200px;\n");
      out.write("                margin-right: 100px;\n");
      out.write("                word-break: break-all;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container .right {\n");
      out.write("                float: left;\n");
      out.write("                width: 300px;\n");
      out.write("                word-break: break-all;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .contract {\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header_staff.jsp", out, false);
      out.write("  \n");
      out.write("        <section>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <img src=\"../../asset/image/staff/icon member.png\" alt=\"member icon\"/>\n");
      out.write("                    <h3 id=\"name\">Do Phuong Loan</h3>\n");
      out.write("                    <p>Join date: 17/01/2022</p>\n");
      out.write("                    <form action=\"customerEdit\" method=\"GET\">\n");
      out.write("                        <input type=\"submit\" id=\"edit\" value=\"Edit\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"acc info\">\n");
      out.write("                        <p class=\"type-info\">Account information</p>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"left\">\n");
      out.write("                                <p class=\"info-label\">Email</p>\n");
      out.write("                                <p class=\"info-content\">loandphe150131@fpt.edu.vn</p>\n");
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
      out.write("                                <p class=\"info-content\">17</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
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
}
