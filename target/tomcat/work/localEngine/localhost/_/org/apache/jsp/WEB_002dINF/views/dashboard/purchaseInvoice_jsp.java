package org.apache.jsp.WEB_002dINF.views.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class purchaseInvoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<body class=\"skin-black\">\r\n");
      out.write("<aside class=\"right-side\">                \r\n");
      out.write("                <!-- Content Header (Page header) -->\r\n");
      out.write("                <section class=\"content-header\">\r\n");
      out.write("                    <h1>\r\n");
      out.write("                        Generate Purchase Invoice\r\n");
      out.write("                        <!-- <small>Control panel</small> -->\r\n");
      out.write("                    </h1>\r\n");
      out.write("                   </section>\r\n");
      out.write("                    <!-- <ol class=\"breadcrumb\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\r\n");
      out.write("                        <li class=\"active\">Blank page</li>\r\n");
      out.write("                    </ol> -->\r\n");
      out.write("                    <section class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                    \t<div class=\"col-md-12\">\r\n");
      out.write("                            <!-- general form elements -->\r\n");
      out.write("                            <div class=\"box box-primary\">\r\n");
      out.write("                                <div class=\"box-header\">\r\n");
      out.write("                                    <h3 class=\"box-title\">Create purchase Invoice</h3>\r\n");
      out.write("                                </div><!-- /.box-header -->\r\n");
      out.write("                                <!-- form start -->\r\n");
      out.write("                                \r\n");
      out.write("                                  <div class=\"row\">\r\n");
      out.write("                    \t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("                                 <div class=\"col-md-3\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"supplier\">Supplier</label>\r\n");
      out.write("                                             <select class=\"form-control\" name=\"supplier\" id=\"supplier\" onchange=\"showSupplierDetails()\">\r\n");
      out.write("                                                <option value=\"\">--Select--</option>\r\n");
      out.write("                                              \r\n");
      out.write("                                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                \r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                <div class=\"supplierDetailsContainer\"></div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                   <form role=\"form\" id=\"addProducts\">\r\n");
      out.write("                                <div class=\"box-body\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                       <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"exampleInputEmail1\">Brand</label>\r\n");
      out.write("                                           <select class=\"form-control\" name=\"brand\" id=\"brand\" onchange=\"getProductTypes(this.value);\" required>\r\n");
      out.write("                                               <option value=\"\">--Select--</option>\r\n");
      out.write("                                                <option>Voltas</option>\r\n");
      out.write("                                                <option>Whirpool</option>\r\n");
      out.write("                                                <option>LG</option>\r\n");
      out.write("                                                <option>samsung</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"exampleInputEmail1\">Product type</label>\r\n");
      out.write("                                             <select class=\"form-control\" name=\"productType\" id=\"productTypeContainer\" onchange=\"getModelNumber(this.value);\">\r\n");
      out.write("                                                <option value=\"\">--Select--</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 \r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"exampleInputEmail1\">Model number</label>\r\n");
      out.write("                                          <select class=\"form-control\" name=\"modelNumber\" id=\"modelContainer\" onchange=\"getSize(this.value);\">\r\n");
      out.write("                                                <option value=\"\">--Select--</option>\r\n");
      out.write("                                                \r\n");
      out.write("                                          </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"exampleInputEmail1\">Size</label>\r\n");
      out.write("                                          <select class=\"form-control\" name=\"size\" id=\"sizeContainer\" onchange=\"getProductInfo(this.value)\">\r\n");
      out.write("                                                <option value=\"\">--Select--</option>\r\n");
      out.write("                                              \r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"Quantity\">Quantity</label>\r\n");
      out.write("                                            <input type=\"number\" name=\"quantity\" min=\"0\" placeholder=\"Quantity\" id=\"quantity\" class=\"form-control\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                      <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"unitPrice\">Unit Price</label>\r\n");
      out.write("                                            <input type=\"text\" id=\"unitPrice\" name=\"unitPrice\"  id=\"unitPrice\" class=\"form-control\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"discount\">Discount</label>\r\n");
      out.write("                                            <input type=\"number\" name=\"discountRate\" id=\"discountRate\" id=\"discount\" class=\"form-control\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-2\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"finalAmount\">Discounted amount</label>\r\n");
      out.write("                                            <input type=\"text\" id=\"discountAmountt\" name=\"discountedAmount\" placeholder=\"Discounted amount\" value=\"4\" class=\"form-control\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                  \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                         <input type=\"hidden\" id=\"productId\" name=\"productId\"/>                       \r\n");
      out.write("                                    \r\n");
      out.write("                                    </div><!-- /.box-body -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\" style=\"margin-left:0px !important;margin-right:0px !important;\">\r\n");
      out.write("                                    <div class=\"box-footer\">\r\n");
      out.write("                                        <button class=\"btn btn-primary\" id=\"addProduct\"  type=\"button\">Add more</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                                 <div class=\"box-footer\">\r\n");
      out.write("                                        <button class=\"btn btn-primary\" id=\"customerButton\" type=\"button\">Submit</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </div><!-- /.box -->\r\n");
      out.write("                        \r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Form Element sizes -->\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                <!-- Main content -->\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </section><!-- /.content -->\r\n");
      out.write("            </aside><!-- /.right-side -->\r\n");
      out.write("     </body>\r\n");
      out.write("     \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("     \r\n");
      out.write("    function showSupplierDetails(){\r\n");
      out.write("    \t var supplierDetailsJson=$('#supplier').val();\r\n");
      out.write("    \t var supplierDetails=JSON.parse(supplierDetailsJson);\r\n");
      out.write("    \t var id=supplierDetails.id;\r\n");
      out.write("    \t $(\".supplierDetailsContainer\").html(\"<label>Address>>\"+supplierDetails.address+\" Contact Number>>\"+supplierDetails.contact+\" Email>>\"+supplierDetails.email+\"</label>\");\r\n");
      out.write("    \t \r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     $(\"#customerButton\").on(\"click\",function(){ \r\n");
      out.write("    \t \r\n");
      out.write("    \t var supplierDetailsJson=$('#supplier').val();\r\n");
      out.write("    \t var supplierDetails=JSON.parse(supplierDetailsJson);\r\n");
      out.write("    \t \r\n");
      out.write("         demoarr={};\r\n");
      out.write("         demoarr[\"invoiceNumber\"]=\"ee-345\";\r\n");
      out.write("        // demoarr[\"totalDiscount\"]=\"9940.9\";\r\n");
      out.write("         //demoarr[\"finalAmount\"]=\"12582.6\";\r\n");
      out.write("         demoarr[\"paymentMode\"]=\"Cash\";\r\n");
      out.write("         demoarr[\"amountPaid\"]=\"89000\";\r\n");
      out.write("         demoarr[\"balanceLeft\"]=\"2000\";\r\n");
      out.write("         demoarr[\"comments\"]=\"okkk\";\r\n");
      out.write("         demoarr[\"supplierId\"]=supplierDetails.id;\r\n");
      out.write("        //demoarr[\"date\"]=$(\".invoicedate\").val();\r\n");
      out.write("         products=[];\r\n");
      out.write("         product={};\r\n");
      out.write("         product[\"id\"]=\"2\";\r\n");
      out.write("         product[\"brand\"]=\"LG\";\r\n");
      out.write("         product[\"modelNumber\"]=\"ss-110\";\r\n");
      out.write("         product[\"productType\"]=\"Split AC\";\r\n");
      out.write("         product[\"quantity\"]=\"10\";\r\n");
      out.write("         product[\"unitPrice\"]=\"5000\";\r\n");
      out.write("         product[\"discountRate\"]=\"5.2\";\r\n");
      out.write("         \r\n");
      out.write("         product[\"size\"]=\"1 Ton\";\r\n");
      out.write("         \r\n");
      out.write("         products.push(product);\r\n");
      out.write("        \r\n");
      out.write("         demoarr[\"products\"]=products;\r\n");
      out.write("         jQuery.ajax({\r\n");
      out.write("             type : \"POST\",\r\n");
      out.write("             contentType: \"application/json\",\r\n");
      out.write("             url : \"/dashboard/save-purchaseinvoice\",\r\n");
      out.write("             data : JSON.stringify(demoarr),\r\n");
      out.write("\r\n");
      out.write("             success : function(response, status, code){\r\n");
      out.write("            \t alert(\"success\");\r\n");
      out.write("            \t alert(response);\r\n");
      out.write("               // window.location.href=\"/dashboard/finalSaleInvoice?si=\"+response;\r\n");
      out.write("             },\r\n");
      out.write("             error : function(response, status, code){\r\n");
      out.write("            \t alert(\"error \"+response.responseText);\r\n");
      out.write("            \t $(\".error_msg\").html(\"<div class='alert alert-danger text-center'><a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>\"+response.responseText+\"</strong></div>\");\r\n");
      out.write("                  \r\n");
      out.write("             }\r\n");
      out.write("         });\r\n");
      out.write("     });\r\n");
      out.write("     \r\n");
      out.write("     </script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/dashboard/purchaseInvoice.jsp(33,48) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/dashboard/purchaseInvoice.jsp(33,48) '${suppliers}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${suppliers}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/dashboard/purchaseInvoice.jsp(33,48) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("supplier");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                               <option value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${supplier.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${supplier.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                                                \r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
