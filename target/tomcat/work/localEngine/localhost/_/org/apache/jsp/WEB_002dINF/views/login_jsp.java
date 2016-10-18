package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"form-box\" id=\"login-box\">\r\n");
      out.write("<div class=\"error_container\"></div>\r\n");
      out.write("            <div class=\"header\">Sign In</div>\r\n");
      out.write("            <form method=\"post\" action=\"/login\">\r\n");
      out.write("                <div class=\"body bg-gray\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" name=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Email\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"pass\" class=\"form-control\" placeholder=\"Password\"/>\r\n");
      out.write("                    </div>   \r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                       <select class=\"form-control\" id=\"role_value\" name=\"role_value\">\r\n");
      out.write("                                  <option value=\"-1\">--Login As--</option>\r\n");
      out.write("                                  <option value=\"Admin\">Admin</option>\r\n");
      out.write("                                  <option value=\"Checker\">Checker</option>\r\n");
      out.write("                                  <option value=\"Maker\">Maker</option>\r\n");
      out.write("                                   <option value=\"Sales Person\">Sales Person</option>\r\n");
      out.write("                         </select>\r\n");
      out.write("\r\n");
      out.write("                    </div>        \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"remember_me\"/> Remember me\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer\">                                                               \r\n");
      out.write("                    <button type=\"submit\" class=\"btn bg-olive btn-block\">Sign me in</button>  \r\n");
      out.write("                    \r\n");
      out.write("                    <p><a href =\"/forgot\">I forgot my password</a></p>\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"/signup\" class=\"text-center\">Register a new membership</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"margin text-center\">\r\n");
      out.write("                <span>Sign in using social networks</span>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <button class=\"btn bg-light-blue btn-circle\"><i class=\"fa fa-facebook\"></i></button>\r\n");
      out.write("                <button class=\"btn bg-aqua btn-circle\"><i class=\"fa fa-twitter\"></i></button>\r\n");
      out.write("                <button class=\"btn bg-red btn-circle\"><i class=\"fa fa-google-plus\"></i></button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       <script>\r\n");
      out.write("     /*   function checkLoginDetails(){\r\n");
      out.write("    \t   var email=$('#email').val();\r\n");
      out.write("    \t   var password=$('#pass').val();\r\n");
      out.write("    \t   var role=$('#role_value').val();\r\n");
      out.write("    \t  \r\n");
      out.write("    \t   if(email.trim().length ==0 ||password.trim().length ==0 || role=='-1'){\r\n");
      out.write("    \t\t   $('.error_container').html(\"User Id or Password or Login As cannot be null\");\r\n");
      out.write("    \t\t   return false;\r\n");
      out.write("    \t   }\r\n");
      out.write("    \t   loginRequest ={};\r\n");
      out.write("    \t   loginRequest[\"userid\"] =userid;\r\n");
      out.write("    \t   loginRequest[\"password\"] =password;\r\n");
      out.write("\t\t\t\r\n");
      out.write("    \t   var url=null;\r\n");
      out.write("\t\t\t if(role=='Admin'){\r\n");
      out.write("\t\t\t\t url=\"/admin/login/\";\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t else if(role=='Admin'){\r\n");
      out.write("\t\t\t\t url=\"/checker/login/\";\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t else if(role=='Admin'){\r\n");
      out.write("\t\t\t\t url=\"/maker/login/\";\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t else{\r\n");
      out.write("\t\t\t\t url=\"/salesPerson/login/\";\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t \r\n");
      out.write("          \r\n");
      out.write("           jQuery.ajax({\r\n");
      out.write("               type : \"POST\",\r\n");
      out.write("               contentType: \"application/json\",\r\n");
      out.write("               url :url,\r\n");
      out.write("               data : JSON.stringify(loginRequest),\r\n");
      out.write("               dataType: \"text\",\r\n");
      out.write("               success : function(response, status, code){\r\n");
      out.write("          \t\tvar returnedData = JSON.parse(response);\r\n");
      out.write("                  \r\n");
      out.write("          \t\tif(returnedData.login=='successful');\r\n");
      out.write("                   {\r\n");
      out.write("                \t   window.location.href=\"/dashboard/\";\r\n");
      out.write("                   }\r\n");
      out.write("                   if(returnedData.login=='unsuccessful'){\r\n");
      out.write("                \t   $('.error_container').html(\"User Id or password is wrong\");\r\n");
      out.write("                   }\r\n");
      out.write("               },\r\n");
      out.write("               error : function(response, status, code){\r\n");
      out.write("            \t   $('.error_container').html(\"Some Error Occured,Please try later\");\r\n");
      out.write("               }\r\n");
      out.write("           });\r\n");
      out.write("       } */\r\n");
      out.write("       </script>");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/login.jsp(2,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty hasError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<div class=\"alert alert-danger text-center\">\r\n");
        out.write("\t    <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\r\n");
        out.write("\t    <strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" </strong>\r\n");
        out.write("\t  </div>\r\n");
        out.write("\t  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
