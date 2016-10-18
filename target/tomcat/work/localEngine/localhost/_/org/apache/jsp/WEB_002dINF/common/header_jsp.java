package org.apache.jsp.WEB_002dINF.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Trade Room</title>\r\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"skin-black\">\r\n");
      out.write("        <!-- header logo: style can be found in header.less -->\r\n");
      out.write("        <header class=\"header\" >\r\n");
      out.write("            <a href=\"index.html\" class=\"logo\">\r\n");
      out.write("                <!-- Add the class icon to your logo image or logo icon to add the margining -->\r\n");
      out.write("                TraderOOm /\r\n");
      out.write("            </a>\r\n");
      out.write("            <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("                <!-- Sidebar toggle button-->\r\n");
      out.write("                 <div class=\"navbar-right\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("                          <li class=\"about\">\r\n");
      out.write("                            <a href=\"/login\">\r\n");
      out.write("                                <strong>Login</strong>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"about\">\r\n");
      out.write("                            <a>\r\n");
      out.write("                                <strong>About us</strong>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- Notifications: style can be found in dropdown.less -->\r\n");
      out.write("                        <li class=\"dropdown notifications-menu\">\r\n");
      out.write("                            <a>\r\n");
      out.write("                                <strong>Features</strong>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- Tasks: style can be found in dropdown.less -->\r\n");
      out.write("                        <li class=\"dropdown tasks-menu\">\r\n");
      out.write("                            <a>\r\n");
      out.write("                                <strong>Docs</strong>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- User Account: style can be found in dropdown.less -->\r\n");
      out.write("                        <li class=\"dropdown user user-menu\">\r\n");
      out.write("                            <a>\r\n");
      out.write("                                <strong>Pricing</strong>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- ./wrapper -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("   \r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
}
