package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>    \r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>InsuranceCard</title>\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"icon\"\r\n");
      out.write("            href=\"asset/image/favicon.png\"\r\n");
      out.write("            type=\"image/png\"\r\n");
      out.write("            sizes=\"16x16\"\r\n");
      out.write("            />\r\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/style/homepage.css\" />\r\n");
      out.write("        <!--Font Awesome-->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_common.jsp", out, false);
      out.write("\r\n");
      out.write("        <main>\r\n");
      out.write("            <div\r\n");
      out.write("                class=\"head-image\"\r\n");
      out.write("                style=\"background-image: url('asset/image/homepage_header_image.png')\"\r\n");
      out.write("                >\r\n");
      out.write("                <div class=\"header-title-quote\">\r\n");
      out.write("                    <h1>Save About</h1>\r\n");
      out.write("                    <h1>Your Vehicle</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"header-param-quote\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        We live in an unpredictable world these days. Thus, there are many\r\n");
      out.write("                        legitimate reasons to prepare yourself for those unannounced\r\n");
      out.write("                        curveballs.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container short-intro\">\r\n");
      out.write("                <h2 class=\"short-intro-title\">\r\n");
      out.write("                    Satisfaction in enjoying life’s pleasures with Insurance offers\r\n");
      out.write("                </h2>\r\n");
      out.write("                <p class=\"short-intro-text\">\r\n");
      out.write("                    Car Insurance is an auto insurance plan that offers you the best service, together with many attractive benefits and competitive premium rates\r\n");
      out.write("                </p>\r\n");
      out.write("                <div class=\"card-deck\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"card-title\">\r\n");
      out.write("                                <img src=\"asset/image/icon-park_easy.png\" alt=\"\" class=\"\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h5 class=\"card-subtitle card-subtitle-custom\">Easy</h5>\r\n");
      out.write("                            <p class=\"card-text\">Easy to use</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"card-title\">\r\n");
      out.write("                                <img src=\"asset/image/healthicons_ui-secure.png\" alt=\"\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h5 class=\"card-subtitle card-subtitle-custom\">Secure</h5>\r\n");
      out.write("                            <p class=\"card-text\">Be sure in your account security</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"card-title\">\r\n");
      out.write("                                <img src=\"asset/image/cil_mood-very-good.png\" alt=\"\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h5 class=\"card-subtitle card-subtitle-custom\">Ultility</h5>\r\n");
      out.write("                            <p class=\"card-text\">Detail</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"intro-project\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"intro-project-title\">\r\n");
      out.write("                        <h2>Our project</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"intro-project-text\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Provide more convenience to users through a completely online insurance program\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"intro-team\">\r\n");
      out.write("                <div class=\"intro-team-title\">\r\n");
      out.write("                    <h2>Our team</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row row-cols-1 row-cols-3\">\r\n");
      out.write("                        <div class=\"col md-4 card-image-custom\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img\r\n");
      out.write("                                    src=\"https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now\"\r\n");
      out.write("                                    alt=\"\"\r\n");
      out.write("                                    class=\"card-img-top\"\r\n");
      out.write("                                    />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col md-4 card-image-custom\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img\r\n");
      out.write("                                    src=\"https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now\"\r\n");
      out.write("                                    alt=\"\"\r\n");
      out.write("                                    class=\"card-img-top\"\r\n");
      out.write("                                    />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col md-4 card-image-custom\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img\r\n");
      out.write("                                    src=\"https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now\"\r\n");
      out.write("                                    alt=\"\"\r\n");
      out.write("                                    class=\"card-img-top\"\r\n");
      out.write("                                    />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row row-cols-1 row-cols-2 card-customer-child-group\">\r\n");
      out.write("                        <div class=\"col md-4 card-image-custom\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img\r\n");
      out.write("                                    src=\"https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now\"\r\n");
      out.write("                                    alt=\"\"\r\n");
      out.write("                                    class=\"card-img-top\"\r\n");
      out.write("                                    />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col md-4 card-image-custom\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img\r\n");
      out.write("                                    src=\"https://via.placeholder.com/468x60?text=Visit+Blogging.com+Now\"\r\n");
      out.write("                                    alt=\"\"\r\n");
      out.write("                                    class=\"card-img-top\"\r\n");
      out.write("                                    />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"achivement-showoff\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"achivement-title\">\r\n");
      out.write("                        <h2>Achivements</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"achivement-text\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            After a period of operation, here are the results we have achieved\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-deck\">\r\n");
      out.write("                        <div class=\"card border-0 achivement-card\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <img src=\"asset/image/bi_people-fill.png\" alt=\"\" class=\"card-img-top\"/>\r\n");
      out.write("                                <h3 class=\"card-title card-subtitle-custom\">Customers</h3>\r\n");
      out.write("                                <p class=\"card-text total-number-active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_customer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card border-0 achivement-card\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <img src=\"asset/image/teenyicons_contract-solid.png\" alt=\"\" class=\"card-img-top\"/>\r\n");
      out.write("                                <h3 class=\"card-title card-subtitle-custom\">Contracts</h3>\r\n");
      out.write("                                <p class=\"card-text total-number-active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_active_contract}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card border-0 achivement-card\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <img src=\"asset/image/ic_round-where-to-vote.png\" alt=\"\" class=\"card-img-top\"/>\r\n");
      out.write("                                <h3 class=\"card-title card-subtitle-custom\">Products</h3>\r\n");
      out.write("                                <p class=\"card-text total-number-active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_active_product}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer_full.jsp", out, false);
      out.write("\r\n");
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
