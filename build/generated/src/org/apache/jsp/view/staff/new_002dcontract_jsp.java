package org.apache.jsp.view.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_002dcontract_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <link href=\"../../asset/style/staff/new_contract.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header_staff.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("currentscreen", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("contract", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2 class=\"title\">NEW CONTRACT</h2>\n");
      out.write("            <form method=\"POST\" action=\"staff/contract/create\">\n");
      out.write("                <div class=\"content_container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 left\">\n");
      out.write("                            <h3 class=\"group-title\">1. OWNER'S INFORMATION</h3>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <label for=\"txt1\" class=\"label-input\">Full name (*):</label>\n");
      out.write("                            <input id=\"txt1\" class=\"inputdata\" type=\"text\" required\n");
      out.write("                                   name=\"ownerName\" onchange=\"fillRightOwner()\"\n");
      out.write("                                   placeholder=\"Owner full name (in vehicle registration)\"/><br/>\n");
      out.write("                            <label for=\"txt2\" class=\"label-input\">ID Number (*):</label>\n");
      out.write("                            <!--Do not save to DB-->\n");
      out.write("                            <input id=\"txt2\" class=\"inputdata\" type=\"text\" required\n");
      out.write("                                   placeholder=\"ID Card Number\"/><br/>\n");
      out.write("                            <h3 class=\"group-title\">2. VEHICLE'S INFORMATION</h3>\n");
      out.write("                            <label for=\"select1\" class=\"label-input\">Type (*):</label>\n");
      out.write("                            <select id=\"select1\" class=\"selectdata\" name=\"vehicleTypeID\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select><br/>\n");
      out.write("                            <label for=\"select3\" class=\"label-input\">Brand (*):</label>\n");
      out.write("                            <select id=\"select3\" class=\"selectdata\" name=\"brandID\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select><br/>\n");
      out.write("                            <label for=\"txt3\" class=\"label-input\">License plate (*):</label>\n");
      out.write("                            <input id=\"txt3\" class=\"inputdata\" type=\"text\" required\n");
      out.write("                                   name=\"licensePlate\"\n");
      out.write("                                   onchange=\"fillRightLicensePlate()\"\n");
      out.write("                                   placeholder=\"License plate (in vehicle registration)\"/><br/>\n");
      out.write("                            <label for=\"txt9\" class=\"label-input\">Chassis number:</label>\n");
      out.write("                            <input id=\"txt9\" class=\"inputdata\" type=\"text\"\n");
      out.write("                                   name=\"chassis\"\n");
      out.write("                                   placeholder=\"Chassis number (in vehicle registration)\"/><br/>\n");
      out.write("                            <label for=\"txt10\" class=\"label-input\">Engine number:</label>\n");
      out.write("                            <input id=\"txt10\" class=\"inputdata\" type=\"text\" \n");
      out.write("                                   name=\"engine\"\n");
      out.write("                                   placeholder=\"Engine number (in vehicle registration)\"/><br/>\n");
      out.write("                            <h3 class=\"group-title\">3. INSURANCE SERVICE INFORMATION</h3>\n");
      out.write("                            <div class=\"row-input\">\n");
      out.write("                                <span class=\"row-input1\">\n");
      out.write("                                    <label for=\"txt4\" class=\"label-input\">Product (*):</label>\n");
      out.write("                                    <input id=\"txt4\" class=\"inputdata\" type=\"text\" disabled=\"true\"\n");
      out.write("                                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"productID\"\n");
      out.write("                                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                </span>\n");
      out.write("                                <a href=\"customer/dashboard\" class=\"btnProduct\">Change product</a>\n");
      out.write("                            </div>\n");
      out.write("                            <label for=\"select2\" class=\"label-input\">Type (*):</label>\n");
      out.write("                            <select id=\"select2\" class=\"selectdata\" \n");
      out.write("                                    onchange=\"changePeriod(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\">\n");
      out.write("                                <option value=\"1\">1 year</option>\n");
      out.write("                                <option value=\"2\">2 years</option>\n");
      out.write("                                <option value=\"3\">3 years</option>\n");
      out.write("                            </select><br/>\n");
      out.write("                            <div class=\"row-input\">\n");
      out.write("                                <span class=  \"row-input1\">\n");
      out.write("                                    <label for=\"startdate\" class=\"label-input\">Start date (*):</label>\n");
      out.write("                                    <input id=\"startdate\" class=\"startdate\" type=\"date\"\n");
      out.write("                                           name=\"startDate\"\n");
      out.write("                                           onchange=\"fillEndDate()\" required\n");
      out.write("                                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.now}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"row-input2\">\n");
      out.write("                                    <label for=\"enddate\" class=\"label-input\">End date:</label>\n");
      out.write("                                    <input id=\"enddate\" class=\"enddate\" type=\"date\" disabled=\"true\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"endDate\" id=\"endDateSent\"/>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <h3 class=\"group-title\">4. DELIVERY INFORMATION</h3>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <label for=\"txt5\" class=\"label-input\">Full name (*):</label>\n");
      out.write("                            <input id=\"txt5\" class=\"inputdata\" type=\"text\" required\n");
      out.write("                                   name=\"deliveryName\"\n");
      out.write("                                   placeholder=\"Full name of recipient\"/><br/>\n");
      out.write("                            <label for=\"txt6\" class=\"label-input\">Phone number (*):</label>\n");
      out.write("                            <input id=\"txt6\" class=\"inputdata\" type=\"text\" required\n");
      out.write("                                   name=\"deliveryPhone\"\n");
      out.write("                                   placeholder=\"Phone number\"/><br/>\n");
      out.write("                            <label for=\"txt7\" class=\"label-input\">Email (*):</label>\n");
      out.write("                            <input id=\"txt7\" class=\"inputdata\" type=\"text\" required\n");
      out.write("                                   name=\"deliveryEmail\"\n");
      out.write("                                   placeholder=\"Email\"/><br/>\n");
      out.write("                            <label for=\"txt8\" class=\"label-input\">Address (*):</label>\n");
      out.write("                            <span class=\"address-container\">\n");
      out.write("                                <input id=\"txt8\" class=\"inputdata\" type=\"text\" \n");
      out.write("                                       name=\"deliveryAddress\"\n");
      out.write("                                       placeholder=\"Address\" required/><br/>\n");
      out.write("                                <div class=\"select-container\">\n");
      out.write("                                    <span class=\"province-container\">\n");
      out.write("                                        <select id=\"province\" name=\"calc_shipping_provinces\" required>\n");
      out.write("                                            <option hidden>--Choose the province--</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <input class=\"billing_address_1\" name=\"province\" \n");
      out.write("                                               type=\"hidden\" value=\"\"/>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"district-container\">\n");
      out.write("                                        <select id=\"district\" name=\"calc_shipping_district\" required>\n");
      out.write("                                            <option hidden>--Choose the district--</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <input class=\"billing_address_2\" name=\"district\" \n");
      out.write("                                               type=\"hidden\" value=\"\"/>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                            <div class=\"confirm-checkbox\">\n");
      out.write("                                <input id=\"chk-3\" type=\"checkbox\" required\n");
      out.write("                                       onchange=\"enableCheckout()\"/>\n");
      out.write("                                <label for=\"chk-3\" class=\"label-confirm\">\n");
      out.write("                                    I/we certify that the foregoing information is \n");
      out.write("                                    complete and correct to the best of my/our \n");
      out.write("                                    knowledge and agree that the foregoing \n");
      out.write("                                    declarations form the basis of the insurance \n");
      out.write("                                    policy and accept receive the insurance \n");
      out.write("                                    conditions specified in the insurance contract.\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer_full.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.9.2/jquery-ui.js\"></script> \n");
      out.write("        <script src=\"asset/script/staff/new_contract.js\"></script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"quick-checkbox\">\n");
        out.write("                                    <input id=\"chk-1\" type=\"checkbox\" \n");
        out.write("                                           onchange=\"fillOwnerInfo('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.personalID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\"/>\n");
        out.write("                                    <label for=\"chk-1\">Use your account's information</label>\n");
        out.write("                                </div>\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <span>Do you have an account? \n");
        out.write("                                    <a href=\"login\">Login </a>\n");
        out.write("                                    to quickly fill!</span> <br/>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.vehicletypes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("type");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type.vehicleType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.brands}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("brand");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"quick-checkbox\">\n");
        out.write("                                    <input id=\"chk-2\" type=\"checkbox\" \n");
        out.write("                                           onchange=\"fillDeliveryInfo('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.province}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("',\n");
        out.write("                                                           '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.customer.district}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\"/>\n");
        out.write("                                    <label for=\"chk-2\">Use your account's information</label>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <span>Do you have an account? \n");
        out.write("                                    <a href=\"login\">Login </a>\n");
        out.write("                                    to quickly fill!</span> <br/>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
