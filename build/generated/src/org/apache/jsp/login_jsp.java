package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import lk.ijse.lms.dto.DepartmentDTO;
import lk.ijse.lms.dto.ManagerDTO;
import java.util.ArrayList;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Sanu-Leaving-Management-System</title>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,400italic,600,300italic,300|Oswald:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/owl.theme.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/owl.transitions.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".main-nav\">\n");
      out.write("        ");

//            if there is no current thread and no user loged in
            if (!session.isNew() && request.getSession().getAttribute("user") != null) {
            } else {
            }
        
      out.write("\n");
      out.write("        <header class=\"st-navbar\">\n");
      out.write("            <nav class=\"navbar navbar-default navbar-fixed-top clearfix\" role=\"navigation\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#sept-main-nav\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><img src=\"photos/logo3.png\" alt=\"\" class=\"img-responsive\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse main-nav\" id=\"sept-main-nav\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"active\"><a href=\"#home\">Home</a></li>\n");
      out.write("                            <li><a href=\"#about\">Profile</a></li>\n");
      out.write("                            <li><a href=\"#blog\">Request</a></li>\n");
      out.write("                            <li><a href=\"#service\">Departments</a></li>\n");
      out.write("                            <li><a href=\"#portfolio\">Ofiicers</a></li>\n");
      out.write("                            <li><a href=\"#pricing\">Employees</a></li>\n");
      out.write("                            <li><a href=\"#contact\">Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!--header is over from here sanu-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--home section strats from here-->\n");
      out.write("        <section class=\"home\" id=\"home\" data-stellar-background-ratio=\"0.4\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"st-home-unit\">\n");
      out.write("                            <div class=\"hero-txt\">\n");
      out.write("                                <p class=\"hero-work\">Desinged-By Sanu Vithanage IJSE Galle</p>\n");
      out.write("                                <h2 class=\"hero-title\">Sanu Leave Manage System</h2>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-main btn-lg\">Login & Leave</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mouse-icon\"><div class=\"wheel\"></div></div>\n");
      out.write("        </section>\n");
      out.write("        <!--home ends-->\n");
      out.write("\n");
      out.write("        <!--sanus login from-->\n");
      out.write("        <section class=\"contact\" id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" style=\"height: 410px;\">\n");
      out.write("                    <div class=\"col-md-5\" id=\"log-fo\">\n");
      out.write("                        <div class=\"\" style=\"margin-top: 100px;\">\n");
      out.write("                            <form class=\"form-group\"  id=\"log-forma\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  name=\"email\" placeholder=\"Email\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\"  name=\"password\" placeholder=\"Password\">\n");
      out.write("                                <div class=\"form-inline\">\n");
      out.write("                                    <select name=\"pos\" class=\"form-control\"  style=\"width: 30%\">\n");
      out.write("                                        <option>Manager</option>\n");
      out.write("                                        <option>Branch Manager</option>\n");
      out.write("                                        <option>Employe</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    <button type=\"button\"  class=\"btn btn-primary\"  id=\"sends\"/> <i class=\"fa fa-paper-plane \"></i> Login</button>\n");
      out.write("                                    <a id=\"cre-new\" class=\"pull-right\">Create new Account</a>                                                                     \n");
      out.write("                                </div>                               \n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"result-message\"  style=\"color: white;background-color: rgba(13, 16, 10, 0.47);width: 60%\" role=\"alert\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-5 col-sm-12 col-xs-12\" style=\"display:none\" id=\"new-user\">\n");
      out.write("                        <div class=\"\" style=\"margin-top: 20px;\">\n");
      out.write("                            <form class=\"form-group\"  id=\"sing-form\">\n");
      out.write("                                <input type=\"email\" class=\"form-control\"  name=\"email\" placeholder=\"Email\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\"  name=\"pass\" placeholder=\"Password\">\n");
      out.write("                                <div class=\"form-inline\">        \n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  name=\"fname\" placeholder=\"First-Name\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control pull-right\"  name=\"lname\" placeholder=\"Last-Name\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-inline\">                                 \n");
      out.write("                                    <input type=\"text\" id=\"inp\" class=\"form-control\"  name=\"address\" placeholder=\"Address\" style=\"margin-top: 0px;\">\n");
      out.write("                                </div>\n");
      out.write("                                <select name=\"department\" id=\"pos-sele\" class=\"form-control\" style=\"margin-bottom: 25px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    ");
      out.write("\n");
      out.write("\n");
      out.write("                                    <!-- replaced el expressions-->\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                                   \n");
      out.write("\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <select name=\"pos\" id=\"\" class=\"form-control\" >\n");
      out.write("                                    <option>Branch Manager</option>\n");
      out.write("                                    <option>Employe</option>\n");
      out.write("                                </select>\n");
      out.write("                            </form>\n");
      out.write("                            <button type=\"button\"   class=\"btn btn-primary pull-right\"  id=\"sing\"/>SingIn</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"result-message\"  style=\"color: white;background-color: rgba(13, 16, 10, 0.47);width: 60%\" role=\"alert\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Import links-->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.easing.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.stellar.js\"></script>\n");
      out.write("        <script src=\"js/jquery.appear.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.countTo.js\"></script>\n");
      out.write("        <script src=\"js/jquery.shuffle.modernizr.js\"></script>\n");
      out.write("        <script src=\"js/jquery.shuffle.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("        <script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("        <script src=\"controllers/managerscipt.js\"></script>\n");
      out.write("        <script src=\"controllers/logingscript.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("a");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${branch}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
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
}
