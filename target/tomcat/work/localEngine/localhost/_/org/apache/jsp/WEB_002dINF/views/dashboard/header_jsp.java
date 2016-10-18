package org.apache.jsp.WEB_002dINF.views.dashboard;

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

      out.write("        <!-- header logo: style can be found in header.less -->\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <a href=\"index.html\" class=\"logo\">\r\n");
      out.write("                <!-- Add the class icon to your logo image or logo icon to add the margining -->\r\n");
      out.write("                TradeRoom/\r\n");
      out.write("            </a>\r\n");
      out.write("            <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("                <!-- Sidebar toggle button-->\r\n");
      out.write("                <a href=\"#\" class=\"navbar-btn sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"navbar-right\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("                        <li class=\"dropdown messages-menu\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                                <span class=\"label label-success\">4</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"header\">You have 4 messages</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\r\n");
      out.write("                                    <ul class=\"menu\">\r\n");
      out.write("                                        <li><!-- start message -->\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <div class=\"pull-left\">\r\n");
      out.write("                                                    <img src=\"/resources/img/avatar3.png\" class=\"img-circle\" alt=\"User Image\"/>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4>\r\n");
      out.write("                                                    Support Team\r\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\r\n");
      out.write("                                                </h4>\r\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li><!-- end message -->\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <div class=\"pull-left\">\r\n");
      out.write("                                                    <img src=\"img/avatar2.png\" class=\"img-circle\" alt=\"user image\"/>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4>\r\n");
      out.write("                                                    AdminLTE Design Team\r\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> 2 hours</small>\r\n");
      out.write("                                                </h4>\r\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <div class=\"pull-left\">\r\n");
      out.write("                                                    <img src=\"img/avatar.png\" class=\"img-circle\" alt=\"user image\"/>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4>\r\n");
      out.write("                                                    Developers\r\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> Today</small>\r\n");
      out.write("                                                </h4>\r\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <div class=\"pull-left\">\r\n");
      out.write("                                                    <img src=\"img/avatar2.png\" class=\"img-circle\" alt=\"user image\"/>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4>\r\n");
      out.write("                                                    Sales Department\r\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> Yesterday</small>\r\n");
      out.write("                                                </h4>\r\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <div class=\"pull-left\">\r\n");
      out.write("                                                    <img src=\"img/avatar.png\" class=\"img-circle\" alt=\"user image\"/>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4>\r\n");
      out.write("                                                    Reviewers\r\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> 2 days</small>\r\n");
      out.write("                                                </h4>\r\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- Notifications: style can be found in dropdown.less -->\r\n");
      out.write("                        <li class=\"dropdown notifications-menu\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <i class=\"fa fa-warning\"></i>\r\n");
      out.write("                                <span class=\"label label-warning\">10</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"header\">You have 10 notifications</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\r\n");
      out.write("                                    <ul class=\"menu\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <i class=\"ion ion-ios7-people info\"></i> 5 new members joined today\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <i class=\"fa fa-warning danger\"></i> Very long description here that may not fit into the page and may cause design problems\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <i class=\"fa fa-users warning\"></i> 5 new members joined\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <i class=\"ion ion-ios7-cart success\"></i> 25 sales made\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <i class=\"ion ion-ios7-person danger\"></i> You changed your username\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"footer\"><a href=\"#\">View all</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- Tasks: style can be found in dropdown.less -->\r\n");
      out.write("                        <li class=\"dropdown tasks-menu\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <i class=\"fa fa-tasks\"></i>\r\n");
      out.write("                                <span class=\"label label-danger\">9</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"header\">You have 9 tasks</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\r\n");
      out.write("                                    <ul class=\"menu\">\r\n");
      out.write("                                        <li><!-- Task item -->\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <h3>\r\n");
      out.write("                                                    Design some buttons\r\n");
      out.write("                                                    <small class=\"pull-right\">20%</small>\r\n");
      out.write("                                                </h3>\r\n");
      out.write("                                                <div class=\"progress xs\">\r\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                                                        <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li><!-- end task item -->\r\n");
      out.write("                                        <li><!-- Task item -->\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <h3>\r\n");
      out.write("                                                    Create a nice theme\r\n");
      out.write("                                                    <small class=\"pull-right\">40%</small>\r\n");
      out.write("                                                </h3>\r\n");
      out.write("                                                <div class=\"progress xs\">\r\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-green\" style=\"width: 40%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                                                        <span class=\"sr-only\">40% Complete</span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li><!-- end task item -->\r\n");
      out.write("                                        <li><!-- Task item -->\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <h3>\r\n");
      out.write("                                                    Some task I need to do\r\n");
      out.write("                                                    <small class=\"pull-right\">60%</small>\r\n");
      out.write("                                                </h3>\r\n");
      out.write("                                                <div class=\"progress xs\">\r\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-red\" style=\"width: 60%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                                                        <span class=\"sr-only\">60% Complete</span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li><!-- end task item -->\r\n");
      out.write("                                        <li><!-- Task item -->\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <h3>\r\n");
      out.write("                                                    Make beautiful transitions\r\n");
      out.write("                                                    <small class=\"pull-right\">80%</small>\r\n");
      out.write("                                                </h3>\r\n");
      out.write("                                                <div class=\"progress xs\">\r\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-yellow\" style=\"width: 80%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                                                        <span class=\"sr-only\">80% Complete</span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li><!-- end task item -->\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"footer\">\r\n");
      out.write("                                    <a href=\"#\">View all tasks</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- User Account: style can be found in dropdown.less -->\r\n");
      out.write("                        <li class=\"dropdown user user-menu\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-user\"></i>\r\n");
      out.write("                                <span>Jane Doe <i class=\"caret\"></i></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <!-- User image -->\r\n");
      out.write("                                <li class=\"user-header bg-light-blue\">\r\n");
      out.write("                                    <img src=\"/resources/img/avatar3.png\" class=\"img-circle\" alt=\"User Image\" />\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        Jane Doe - Web Developer\r\n");
      out.write("                                        <small>Member since Nov. 2012</small>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- Menu Body -->\r\n");
      out.write("                                <li class=\"user-body\">\r\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                                        <a href=\"#\">Followers</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                                        <a href=\"#\">Sales</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                                        <a href=\"#\">Friends</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- Menu Footer-->\r\n");
      out.write("                                <li class=\"user-footer\">\r\n");
      out.write("                                    <div class=\"pull-left\">\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"pull-right\">\r\n");
      out.write("                                        <a href=\"/dashboard/logout\" class=\"btn btn-default btn-flat\">Sign out</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>");
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
