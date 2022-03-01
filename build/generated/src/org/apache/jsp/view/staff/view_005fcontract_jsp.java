package org.apache.jsp.view.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_005fcontract_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("        <title>Insurance Card</title>\r\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"icon\"\r\n");
      out.write("            href=\"asset/image/favicon.png\"\r\n");
      out.write("            type=\"image/png\"\r\n");
      out.write("            sizes=\"16x16\"\r\n");
      out.write("            />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/style/staff/view_contract.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header_staff.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("currentscreen", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("customer", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <main>\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <h1 class=\"header__heading\">Contract ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"header__btn\">\r\n");
      out.write("                    <button class=\"btn btn--success ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusCode == 2 ? '' : 'btn--disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                            onclick=\"confirmBox()\">\r\n");
      out.write("                        <img class=\"btn__icon\" src=\"asset/image/staff/view_contract/icon_cash.png\"></img>\r\n");
      out.write("                        <div class=\"btn__text\">Payment</div>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <a class=\"btn btn--primary ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.contract.statusCode.statusCode == 0 \r\n                                                 || requestScope.contract.statusCode.statusCode == 1) \r\n                                                 && requestScope.contract.product.statusCode.statusCode == 1 ? '' : 'btn--disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \r\n");
      out.write("                       href=\"staff/contract/renew?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <img class=\"btn__icon\" src=\"asset/image/staff/view_contract/icon_reload.png\"></img>\r\n");
      out.write("                        <div class=\"btn__text\">Renew</div>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <a class=\"btn btn--danger ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusCode == 1 ? '' : 'btn--disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \r\n");
      out.write("                       href=\"staff/contract/cancel?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <img class=\"btn__icon\" src=\"asset/image/staff/view_contract/icon_close.png\"></img>\r\n");
      out.write("                        <div class=\"btn__text\">Cancel</div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mess-box mess-box--success\" \r\n");
      out.write("                 style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.isPay ? \"display:flex;\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <img src=\"asset/image/staff/customer_create_edit/icon_approve.png\" class=\"mess-box__icon\" />\r\n");
      out.write("                <p class=\"mess-box__mess\">Payment successful!</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <h2 class=\"section__heading\">Contract Information</h2>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section__main\">\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Contract ID</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Status</div>\r\n");
      out.write("                        <div class=\"section__text\" id=\"contractStatus\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Product</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Contract fee</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.contractFee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>                        \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Staff</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.startStaff.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.startStaff.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Start Date</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Request Date</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_1(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">End Date</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_2(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Resolve Date</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_3(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <h2 class=\"section__heading\">Customer Information</h2>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section__main\">\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Name</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Email</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Date of Birth</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      if (_jspx_meth_fmt_formatDate_5(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Personal ID</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.personalID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Phone</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Address</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.customer.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <h2 class=\"section__heading\">Vehicle Information</h2>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section__main\">\r\n");
      out.write("                    <div class=\"section__left\">\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">Vehicle type</div>\r\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.vehicleType2.vehicleType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">Engine</div>\r\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.engine}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">License Plate</div>\r\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.licensePlate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">Color</div>\r\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">Brand</div>\r\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.brand2.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">Owner</div>\r\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.owner}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">Chassis</div>\r\n");
      out.write("                            <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.chassis}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__right\">\r\n");
      out.write("                        <div class=\"section__item\">\r\n");
      out.write("                            <div class=\"section__title\">Cert Image</div>\r\n");
      out.write("                            <img class=\"section__img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.certImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></img>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>          \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <h2 class=\"section__heading\">Product Information</h2>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section__main\">\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Product ID</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Product Title</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Status</div>\r\n");
      out.write("                        <div class=\"section__text\" id=\"productStatus\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.statusCode.statusName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section__item\">\r\n");
      out.write("                        <div class=\"section__title\">Content detail</div>\r\n");
      out.write("                        <div class=\"section__text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.contentDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <h2 class=\"section__heading\">Payment history</h2>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section__main\">\r\n");
      out.write("                    <table class=\"section__table\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>ID</th>\r\n");
      out.write("                                <th>Start date</th>\r\n");
      out.write("                                <th>Paid date</th>\r\n");
      out.write("                                <th>Payment method</th>\r\n");
      out.write("                                <th>Amount</th>\r\n");
      out.write("                                <th>Note</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"section\">\r\n");
      out.write("                <h2 class=\"section__heading\">Compensation history</h2>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section__main\">\r\n");
      out.write("                    <table class=\"section__table\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>ID</th>\r\n");
      out.write("                                <th>Created date</th>\r\n");
      out.write("                                <th>Resolve date</th>\r\n");
      out.write("                                <th>Status</th>\r\n");
      out.write("                                <th>Detail</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer_full.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("currentscreen", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("customer", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            const contractStatus = document.getElementById(\"contractStatus\");\r\n");
      out.write("            const contractStatusID = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.statusCode.statusCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("            if (contractStatusID === 0) {\r\n");
      out.write("                contractStatus.style.color = \"#D62A25\";\r\n");
      out.write("            } else if (contractStatusID === 1) {\r\n");
      out.write("                contractStatus.style.color = \"#1AC36B\";\r\n");
      out.write("            } else if (contractStatusID === 2) {\r\n");
      out.write("                contractStatus.style.color = \"#4BBDDF\";\r\n");
      out.write("            } else if (contractStatusID === 3) {\r\n");
      out.write("                contractStatus.style.color = \"#FFC107\";\r\n");
      out.write("            } else if (contractStatusID === 4) {\r\n");
      out.write("                contractStatus.style.color = \"#FD671F\";\r\n");
      out.write("            } else {\r\n");
      out.write("                contractStatus.style.color = \"#7B0B0B\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            const productStatus = document.getElementById(\"productStatus\");\r\n");
      out.write("            const productStatusID = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.product.statusCode.statusCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("            if (productStatusID === 0) {\r\n");
      out.write("                productStatus.style.color = \"#D62A25\";\r\n");
      out.write("            } else {\r\n");
      out.write("                productStatus.style.color = \"#1AC36B\";\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- confirm box -->\r\n");
      out.write("        <script>\r\n");
      out.write("            function confirmBox() {\r\n");
      out.write("                if (confirm(\"Are you sure you want to do this?\")) {\r\n");
      out.write("                    window.location.href = \"staff/contract/pay?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
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
        out.write("\r\n");
        out.write("                        <div class=\"section__item\">\r\n");
        out.write("                            <div class=\"section__title\">Cancel Date</div>\r\n");
        out.write("                            <div class=\"section__text\">");
        if (_jspx_meth_fmt_formatDate_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                        </div>\r\n");
        out.write("\r\n");
        out.write("                        <div class=\"section__item\">\r\n");
        out.write("                            <div class=\"section__title\">Cancel Reason</div>\r\n");
        out.write("                            <div class=\"section__text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.cancelReason}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\r\n");
        out.write("                        </div>\r\n");
        out.write("\r\n");
        out.write("                        <div class=\"section__item\">\r\n");
        out.write("                            <div class=\"section__title\">Cancel Comment</div>\r\n");
        out.write("                            <div class=\"section__text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.contract.cancelComment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\r\n");
        out.write("                        </div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.payments}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pay");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pay.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_fmt_formatDate_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_fmt_formatDate_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pay.paymentMethod2.paymentMethod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pay.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pay.note}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
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

  private boolean _jspx_meth_fmt_formatDate_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_6 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_6.setType("both");
    _jspx_th_fmt_formatDate_6.setDateStyle("short");
    _jspx_th_fmt_formatDate_6.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pay.startDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_6 = _jspx_th_fmt_formatDate_6.doStartTag();
    if (_jspx_th_fmt_formatDate_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_6);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_6);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_7 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_7.setType("both");
    _jspx_th_fmt_formatDate_7.setDateStyle("short");
    _jspx_th_fmt_formatDate_7.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pay.paidDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_7 = _jspx_th_fmt_formatDate_7.doStartTag();
    if (_jspx_th_fmt_formatDate_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_7);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.compensations}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("com");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${com.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_fmt_formatDate_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_fmt_formatDate_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td style=\"color: #");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${com.status.statusCode == 0 ? 'D62A25' : '1AC36B'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${com.status.statusName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td class=\"not-hightlight\"><a class=\"table-btn\" href=\"\">View</a></td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_8 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_formatDate_8.setType("both");
    _jspx_th_fmt_formatDate_8.setDateStyle("short");
    _jspx_th_fmt_formatDate_8.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${com.createDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_8 = _jspx_th_fmt_formatDate_8.doStartTag();
    if (_jspx_th_fmt_formatDate_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_8);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_8);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_9 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_formatDate_9.setType("both");
    _jspx_th_fmt_formatDate_9.setDateStyle("short");
    _jspx_th_fmt_formatDate_9.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${com.resolveDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_9 = _jspx_th_fmt_formatDate_9.doStartTag();
    if (_jspx_th_fmt_formatDate_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_9);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_9);
    return false;
  }
}
