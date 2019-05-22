package org.apache.jsp.errorpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error404_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <title>404 error page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            @font-face {\n");
      out.write("                font-family: 'open_sanslight';\n");
      out.write("                src: url('../fonts/opensans_light_macroman/OpenSans-Light-webfont.eot');\n");
      out.write("                src: url('../fonts/opensans_light_macroman/OpenSans-Light-webfont.eot?#iefix') format('embedded-opentype'),\n");
      out.write("                    url('../fonts/opensans_light_macroman/OpenSans-Light-webfont.woff') format('woff'),\n");
      out.write("                    url('../fonts/opensans_light_macroman/OpenSans-Light-webfont.ttf') format('truetype'),\n");
      out.write("                    url('../fonts/opensans_light_macroman/OpenSans-Light-webfont.svg#open_sanslight') format('svg');\n");
      out.write("                font-weight: normal;\n");
      out.write("                font-style: normal;\n");
      out.write("            }\n");
      out.write("            /*-----regular-font----*/\n");
      out.write("            /*-----regular-font----*/\n");
      out.write("            @font-face {\n");
      out.write("                font-family: 'open_sansregular';\n");
      out.write("                src: url('../fonts/opensans_regular_macroman/OpenSans-Regular-webfont.eot');\n");
      out.write("                src: url('../fonts/opensans_regular_macroman/OpenSans-Regular-webfont.eot?#iefix') format('embedded-opentype'),\n");
      out.write("                    url('../fonts/opensans_regular_macroman/OpenSans-Regular-webfont.woff') format('woff'),\n");
      out.write("                    url('../fonts/opensans_regular_macroman/OpenSans-Regular-webfont.ttf') format('truetype'),\n");
      out.write("                    url('../fonts/opensans_regular_macroman/OpenSans-Regular-webfont.svg#open_sansregular') format('svg');\n");
      out.write("                font-weight: normal;\n");
      out.write("                font-style: normal;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background:url(../images/bg.jpg) no-repeat 100%;\n");
      out.write("                background-size: 100%;\n");
      out.write("                font-family: 'open_sanslight';\n");
      out.write("                font-size: 100%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            /**-----start-wrap---------**/\n");
      out.write("            .wrap\n");
      out.write("            {\n");
      out.write("                width:70%;\n");
      out.write("                margin:5.2% auto 4% auto;\n");
      out.write("            }\n");
      out.write("            /**-----start-logo--------**/\n");
      out.write("            .logo\n");
      out.write("            {\n");
      out.write("                padding: 1em;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 1% 1% 5% 1%;\n");
      out.write("            }\n");
      out.write("            .logo h1{\n");
      out.write("                display: block;\n");
      out.write("                padding: 2em 0em;\n");
      out.write("            }\n");
      out.write("            .logo span{\n");
      out.write("                font-size: 2em;\n");
      out.write("                color:#fff;\n");
      out.write("            }\n");
      out.write("            .logo span img{\n");
      out.write("                width:40px;\n");
      out.write("                height: 40px;\n");
      out.write("                vertical-align:bottom;\n");
      out.write("                margin: 0px 10px;\n");
      out.write("            }\n");
      out.write("            /**-----end-logo---------**/\n");
      out.write("            /**-----start-search-bar-section------**/\n");
      out.write("            .buttom\n");
      out.write("            {\n");
      out.write("                background:url(../images/bg2.png) no-repeat 100% 0%;\n");
      out.write("                background-size: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                width: 556px;\n");
      out.write("            }\n");
      out.write("            .seach_bar\n");
      out.write("            {\n");
      out.write("                padding:2em;\n");
      out.write("            }\n");
      out.write("            .seach_bar p{\n");
      out.write("                font-size: 1.5em;\n");
      out.write("                color:#fff;\n");
      out.write("                font-weight: 300;\n");
      out.write("                margin: 2.6em 0em 0.9em 0em;\n");
      out.write("            }\n");
      out.write("            .seach_bar span a{\n");
      out.write("                font-size: 1em;\n");
      out.write("                color:#fff;\n");
      out.write("                text-decoration:underline;\n");
      out.write("                font-weight: 300;\n");
      out.write("                font-family: 'open_sansregular';\n");
      out.write("            }\n");
      out.write("            /**********search_box*************/\n");
      out.write("            .search_box{\n");
      out.write("                background: #F1F3F6;\n");
      out.write("                -webkit-transition: all 0.3s ease;\n");
      out.write("                -moz-transition: all 0.3s ease;\n");
      out.write("                -o-transition: all 0.3s ease;\n");
      out.write("                transition: all 0.3s ease;\n");
      out.write("                padding: 6px 10px;\n");
      out.write("                position: relative;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 75%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                -webkit-border-radius: 5px;\n");
      out.write("                -moz-border-radius: 5px;\n");
      out.write("                -o-border-radius: 5px;\n");
      out.write("                box-shadow: inset 0 0 5px rgba(156, 156, 156, 0.75);\n");
      out.write("                -moz-box-shadow: inset 0 0 5px rgba(156, 156, 156, 0.75);\n");
      out.write("                -webkit-box-shadow: inset 0px 0px 5px rgba(156, 156, 156, 0.75);\n");
      out.write("            }\n");
      out.write("            .search_box img {\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .search_box form input[type=\"text\"] {\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                background: none;\n");
      out.write("                font-size: 1em;\n");
      out.write("                color:#999;\n");
      out.write("                width:100%;\n");
      out.write("                font-family: 'open_sansregular';\n");
      out.write("                -webkit-apperance: none;\n");
      out.write("            }\n");
      out.write("            .search_box form input[type=\"submit\"] {\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                background: url(../images/search.png) no-repeat 0px 1px;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                width: 34px;\n");
      out.write("                height: 25px;\n");
      out.write("                outline: none;\n");
      out.write("                -webkit-appearance:none;\n");
      out.write("            }\n");
      out.write("            /*****copy-right*****/\n");
      out.write("            .copy_right  {\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 0.85em;\n");
      out.write("                line-height: 1.8em;\n");
      out.write("                padding: 5em 0px 0px 0px;\n");
      out.write("                font-family: 'open_sansregular';\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .copy_right a {\n");
      out.write("                color:#FF7ED5;\n");
      out.write("                -webkit-transition: all 0.3s ease-out;\n");
      out.write("                -moz-transition: all 0.3s ease-out;\n");
      out.write("                -ms-transition: all 0.3s ease-out;\n");
      out.write("                -o-transition: all 0.3s ease-out;\n");
      out.write("                transition: all 0.3s ease-out;\n");
      out.write("            }\n");
      out.write("            .copy_right a:hover {\n");
      out.write("                color:#fff;\n");
      out.write("            }\n");
      out.write("            /*********Media Queries************/\n");
      out.write("            @media only screen and (max-width: 768px)\n");
      out.write("            {\n");
      out.write("                .wrap {\n");
      out.write("                    width: 80%;\n");
      out.write("                }\t\n");
      out.write("                .logo img {\n");
      out.write("                    width: 315px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media only screen and (max-width: 640px)\n");
      out.write("            {\n");
      out.write("                .wrap {\n");
      out.write("                    width: 85%;\n");
      out.write("                }\t\n");
      out.write("                .logo {\n");
      out.write("                    padding: 1% 1% 12% 1%;\n");
      out.write("                }\n");
      out.write("                .buttom {\n");
      out.write("                    width: 515px;\n");
      out.write("                }\n");
      out.write("                .logo img {\n");
      out.write("                    width: 300px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media only screen and (max-width: 480px)\n");
      out.write("            {\n");
      out.write("                .wrap {\n");
      out.write("                    width: 90%;\n");
      out.write("                }\t\n");
      out.write("                .logo {\n");
      out.write("                    padding: 1% 1% 12% 1%;\n");
      out.write("                }\n");
      out.write("                .buttom {\n");
      out.write("                    width: 440px;\n");
      out.write("                }\n");
      out.write("                /***/\n");
      out.write("                .logo span {\n");
      out.write("                    font-size: 1.6em;\n");
      out.write("                }\n");
      out.write("                .seach_bar p {\n");
      out.write("                    font-size: 1.2em;\n");
      out.write("                    margin: 2.6em 0em 0.7em 0em;\n");
      out.write("                }\n");
      out.write("                .search_box {\n");
      out.write("                    padding: 3px 10px;\n");
      out.write("                }\n");
      out.write("                .logo img {\n");
      out.write("                    width: 270px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media only screen and (max-width: 320px)\n");
      out.write("            {\n");
      out.write("                .wrap {\n");
      out.write("                    width: 90%;\n");
      out.write("                }\t\n");
      out.write("                .logo {\n");
      out.write("                    padding: 1% 1% 12% 1%;\n");
      out.write("                }\n");
      out.write("                .buttom {\n");
      out.write("                    width: 290px;\n");
      out.write("                }\n");
      out.write("                /***/\n");
      out.write("                .logo span {\n");
      out.write("                    font-size: 1.4em;\n");
      out.write("                }\n");
      out.write("                .seach_bar p {\n");
      out.write("                    font-size: 1em;\n");
      out.write("                    margin: 1.5em 0em 2em 0em;\n");
      out.write("                }\n");
      out.write("                .logo span img {\n");
      out.write("                    vertical-align: middle;\n");
      out.write("                }\n");
      out.write("                .logo img {\n");
      out.write("                    width: 200px;\n");
      out.write("                }\n");
      out.write("                .copy_right {\n");
      out.write("                    padding: 2em 0px 0px 0px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <h1><a href=\"#\"><img src=\"../images/logo.png\"/></a></h1>\n");
      out.write("                    <span><img src=\"../images/signal.png\"/>Oops! The Page you requested was not found!</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"buttom\">\n");
      out.write("                    <div class=\"seach_bar\">\n");
      out.write("                        <p>you can go to <span><a href=\"#\">home</a></span> page or search here</p>\n");
      out.write("                        <div class=\"search_box\">\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                            this.value = 'Search';\n");
      out.write("                                        }\"><input type=\"submit\" value=\"\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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