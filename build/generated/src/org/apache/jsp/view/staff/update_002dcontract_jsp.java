package org.apache.jsp.view.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_002dcontract_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>InsuranceCard</title>\n");
      out.write("        <link rel=\"icon\" href=\"asset/image/favicon.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        <!-- CDN to reset CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"/>\n");
      out.write("        <link href=\"../../asset/style/staff/update_contract.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header_staff.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("currentscreen", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("contract", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <h1 class=\"header__heading\">Contract ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("\n");
      out.write("                <div class=\"header__btn\">\n");
      out.write("                    <button class=\"btn btn--success ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusCode == 2 ? '' : 'btn--disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"btn__text\">Update</div>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <a class=\"btn btn--danger ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusCode == 1 ? '' : 'btn--disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <img class=\"btn__icon\" src=\"asset/image/staff/view_contract/icon_close.png\"></img>\n");
      out.write("                        <div class=\"btn__text\">Cancel</div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mess-box mess-box--success\" \n");
      out.write("                 style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.isPay ? \"display:flex;\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <img src=\"asset/image/staff/customer_create_edit/icon_approve.png\" class=\"mess-box__icon\" />\n");
      out.write("                <p class=\"mess-box__mess\">Payment successful!</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2 class=\"section__heading\">Contract Information</h2>\n");
      out.write("\n");
      out.write("                <div class=\"section__main\">\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Contract ID</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Status</div>\n");
      out.write("                        <div class=\"section__text\" id=\"contractStatus\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Product</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Contract fee</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.contractFee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>                        \n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Staff</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.startStaff.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.startStaff.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Start Date</div>\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Request Date</div>\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">End Date</div>\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Resolve Date</div>\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_3(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2 class=\"section__heading\">Customer Information</h2>\n");
      out.write("\n");
      out.write("                <div class=\"section__main\">\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Name</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Email</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Date of Birth</div>\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_5(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Personal ID</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.personalID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Phone</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Address</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2 class=\"section__heading\">Vehicle Information</h2>\n");
      out.write("\n");
      out.write("                <div class=\"section__main\">\n");
      out.write("                    <div class=\"section__left\">\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">Vehicle type</div>\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.vehicleType2.vehicleType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">Engine</div>\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.engine}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">License Plate</div>\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.licensePlate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">Color</div>\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">Brand</div>\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.brand2.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">Owner</div>\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.owner}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">Chassis</div>\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.chassis}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__right\">\n");
      out.write("                        <div class=\"section__item\">\n");
      out.write("                            <div class=\"section__title\">Cert Image</div>\n");
      out.write("                            <img class=\"section__img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.certImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></img>\n");
      out.write("                        </div>\n");
      out.write("                    </div>          \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2 class=\"section__heading\">Product Information</h2>\n");
      out.write("\n");
      out.write("                <div class=\"section__main\">\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Product ID</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Product Title</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Status</div>\n");
      out.write("                        <div class=\"section__text\" id=\"productStatus\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.statusCode.statusName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section__item\">\n");
      out.write("                        <div class=\"section__title\">Content detail</div>\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.contentDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer_full.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                const contractStatus = document.getElementById(\"contractStatus\");\n");
      out.write("                const contractStatusID = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("\n");
      out.write("                if (contractStatusID === 0) {\n");
      out.write("                    contractStatus.style.color = \"#D62A25\";\n");
      out.write("                } else if (contractStatusID === 1) {\n");
      out.write("                    contractStatus.style.color = \"#1AC36B\";\n");
      out.write("                } else if (contractStatusID === 2) {\n");
      out.write("                    contractStatus.style.color = \"#4BBDDF\";\n");
      out.write("                } else if (contractStatusID === 3) {\n");
      out.write("                    contractStatus.style.color = \"#FFC107\";\n");
      out.write("                } else if (contractStatusID === 4) {\n");
      out.write("                    contractStatus.style.color = \"#FD671F\";\n");
      out.write("                } else {\n");
      out.write("                    contractStatus.style.color = \"#7B0B0B\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                const productStatus = document.getElementById(\"productStatus\");\n");
      out.write("                const productStatusID = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.statusCode.statusCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("\n");
      out.write("                if (productStatusID === 0) {\n");
      out.write("                    productStatus.style.color = \"#D62A25\";\n");
      out.write("                } else {\n");
      out.write("                    productStatus.style.color = \"#1AC36B\";\n");
      out.write("                }\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.9.2/jquery-ui.js\"></script> \n");
      out.write("        <script src=\"asset/script/staff/update_contract.js\"></script>\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setType("both");
    _jspx_th_fmt_formatDate_0.setDateStyle("short");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.startDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent(null);
    _jspx_th_fmt_formatDate_1.setType("both");
    _jspx_th_fmt_formatDate_1.setDateStyle("short");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.requestDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent(null);
    _jspx_th_fmt_formatDate_2.setType("both");
    _jspx_th_fmt_formatDate_2.setDateStyle("short");
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.endDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_3.setParent(null);
    _jspx_th_fmt_formatDate_3.setType("both");
    _jspx_th_fmt_formatDate_3.setDateStyle("short");
    _jspx_th_fmt_formatDate_3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.resolveDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_3 = _jspx_th_fmt_formatDate_3.doStartTag();
    if (_jspx_th_fmt_formatDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_3);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_3);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusCode >= 3 && requestScope.contract.statusCode.statusCode <= 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"section__item\">\n");
        out.write("                            <div class=\"section__title\">Cancel Date</div>\n");
        out.write("                            <div class=\"section__text\">");
        if (_jspx_meth_fmt_formatDate_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <div class=\"section__item\">\n");
        out.write("                            <div class=\"section__title\">Cancel Reason</div>\n");
        out.write("                            <div class=\"section__text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.cancelReason}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <div class=\"section__item\">\n");
        out.write("                            <div class=\"section__title\">Cancel Comment</div>\n");
        out.write("                            <div class=\"section__text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.cancelComment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                        </div>\n");
        out.write("                    ");
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

  private boolean _jspx_meth_fmt_formatDate_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_fmt_formatDate_4.setType("both");
    _jspx_th_fmt_formatDate_4.setDateStyle("short");
    _jspx_th_fmt_formatDate_4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.cancelDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_4 = _jspx_th_fmt_formatDate_4.doStartTag();
    if (_jspx_th_fmt_formatDate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_4);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_5.setParent(null);
    _jspx_th_fmt_formatDate_5.setType("date");
    _jspx_th_fmt_formatDate_5.setDateStyle("short");
    _jspx_th_fmt_formatDate_5.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.dob}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_5 = _jspx_th_fmt_formatDate_5.doStartTag();
    if (_jspx_th_fmt_formatDate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_5);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_5);
    return false;
  }
}
