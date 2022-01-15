package org.apache.jsp.view.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <Link rel = \"stylesheet\" href = \"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("        <link href=\"../asset/style/common/register.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"signUp\">\n");
      out.write("            <h1>Sign Up</h1>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"register\" method=\"POST\">\n");
      out.write("            <div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"email\" name=\"email\" \n");
      out.write("                               placeholder=\"Email *\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"tel\" name=\"phone\" pattern=\"[0]{1}[0-9]{9}\"  \n");
      out.write("                               placeholder=\"Phone *\" required/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"password\" name=\"password\" \n");
      out.write("                               placeholder=\"Password *\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"number\" name=\"personalID\" \n");
      out.write("                               placeholder=\"Personal ID *\" required/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"password\" name=\"password2\" \n");
      out.write("                               placeholder=\"Confirm password *\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" name=\"address\" \n");
      out.write("                               placeholder=\"Address *\" required/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" name=\"firstName\" \n");
      out.write("                               placeholder=\"First name *\" \n");
      out.write("                               pattern=\"[a-zA-Z]+[ a-zA-Z]*\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <select name=\"calc_shipping_provinces\" required>\n");
      out.write("                        </select>\n");
      out.write("                        <input class=\"billing_address_1\" name=\"province\" \n");
      out.write("                               type=\"hidden\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" name=\"lastName\" \n");
      out.write("                               placeholder=\"Last name *\" \n");
      out.write("                               pattern=\"[a-zA-Z]+[ a-zA-Z]*\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <select name=\"calc_shipping_district\" required>\n");
      out.write("                            <option hidden>District</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input class=\"billing_address_2\" name=\"district\" \n");
      out.write("                               type=\"hidden\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"date\" name=\"dob\" placeholder=\"DOB *\" \n");
      out.write("                               required/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"icon-login\">\n");
      out.write("                            <i class=\"fab fa-facebook\"></i>\n");
      out.write("                            <i class=\"fab fa-google-plus\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"register\">\n");
      out.write("                <input type=\"submit\" value=\"Register\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <a href=\"login\">Login</a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>\n");
      out.write("        <script>\n");
      out.write("            if ((address_2 = localStorage.getItem(\"address_2_saved\"))) {\n");
      out.write("                $('select[name=\"calc_shipping_district\"] option').each(function () {\n");
      out.write("                    if ($(this).text() == address_2) {\n");
      out.write("                        $(this).attr(\"selected\", \"\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                $(\"input.billing_address_2\").attr(\"value\", address_2);\n");
      out.write("            }\n");
      out.write("            if ((district = localStorage.getItem(\"district\"))) {\n");
      out.write("                $('select[name=\"calc_shipping_district\"]').html(district);\n");
      out.write("                $('select[name=\"calc_shipping_district\"]').on(\"change\", function () {\n");
      out.write("                    var target = $(this).children(\"option:selected\");\n");
      out.write("                    target.attr(\"selected\", \"\");\n");
      out.write("                    $('select[name=\"calc_shipping_district\"] option')\n");
      out.write("                            .not(target)\n");
      out.write("                            .removeAttr(\"selected\");\n");
      out.write("                    address_2 = target.text();\n");
      out.write("                    $(\"input.billing_address_2\").attr(\"value\", address_2);\n");
      out.write("                    district = $('select[name=\"calc_shipping_district\"]').html();\n");
      out.write("                    localStorage.setItem(\"district\", district);\n");
      out.write("                    localStorage.setItem(\"address_2_saved\", address_2);\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            $('select[name=\"calc_shipping_provinces\"]').each(function () {\n");
      out.write("                var $this = $(this),\n");
      out.write("                        stc = \"\";\n");
      out.write("                c.forEach(function (i, e) {\n");
      out.write("                    e += +1;\n");
      out.write("                    stc += \"<option value=\" + e + \">\" + i + \"</option>\";\n");
      out.write("                    $this.html('<option value=\"\">Province</option>' + stc);\n");
      out.write("                    if ((address_1 = localStorage.getItem(\"address_1_saved\"))) {\n");
      out.write("                        $('select[name=\"calc_shipping_provinces\"] option').each(\n");
      out.write("                                function () {\n");
      out.write("                                    if ($(this).text() == address_1) {\n");
      out.write("                                        $(this).attr(\"selected\", \"\");\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                        );\n");
      out.write("                        $(\"input.billing_address_1\").attr(\"value\", address_1);\n");
      out.write("                    }\n");
      out.write("                    $this.on(\"change\", function (i) {\n");
      out.write("                        i = $this.children(\"option:selected\").index() - 1;\n");
      out.write("                        var str = \"\",\n");
      out.write("                                r = $this.val();\n");
      out.write("                        if (r != \"\") {\n");
      out.write("                            arr[i].forEach(function (el) {\n");
      out.write("                                str += '<option value=\"' + el + '\">' + el + \"</option>\";\n");
      out.write("                                $('select[name=\"calc_shipping_district\"]').html(\n");
      out.write("                                        '<option value=\"\">District</option>' + str\n");
      out.write("                                        );\n");
      out.write("                            });\n");
      out.write("                            var address_1 = $this.children(\"option:selected\").text();\n");
      out.write("                            var district = $('select[name=\"calc_shipping_district\"]').html();\n");
      out.write("                            localStorage.setItem(\"address_1_saved\", address_1);\n");
      out.write("                            localStorage.setItem(\"district\", district);\n");
      out.write("                            $('select[name=\"calc_shipping_district\"]').on(\n");
      out.write("                                    \"change\",\n");
      out.write("                                    function () {\n");
      out.write("                                        var target = $(this).children(\"option:selected\");\n");
      out.write("                                        target.attr(\"selected\", \"\");\n");
      out.write("                                        $('select[name=\"calc_shipping_district\"] option')\n");
      out.write("                                                .not(target)\n");
      out.write("                                                .removeAttr(\"selected\");\n");
      out.write("                                        var address_2 = target.text();\n");
      out.write("                                        $(\"input.billing_address_2\").attr(\"value\", address_2);\n");
      out.write("                                        district = $('select[name=\"calc_shipping_district\"]').html();\n");
      out.write("                                        localStorage.setItem(\"district\", district);\n");
      out.write("                                        localStorage.setItem(\"address_2_saved\", address_2);\n");
      out.write("                                    }\n");
      out.write("                            );\n");
      out.write("                        } else {\n");
      out.write("                            $('select[name=\"calc_shipping_district\"]').html(\n");
      out.write("                                    '<option value=\"\">District</option>'\n");
      out.write("                                    );\n");
      out.write("                            district = $('select[name=\"calc_shipping_district\"]').html();\n");
      out.write("                            localStorage.setItem(\"district\", district);\n");
      out.write("                            localStorage.removeItem(\"address_1_saved\", address_1);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
