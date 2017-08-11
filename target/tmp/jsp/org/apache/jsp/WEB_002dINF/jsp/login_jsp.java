package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".form-signin {\r\n");
      out.write("  max-width: 330px;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .form-signin-heading,\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .form-control {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  height: auto;\r\n");
      out.write("  -webkit-box-sizing: border-box;\r\n");
      out.write("     -moz-box-sizing: border-box;\r\n");
      out.write("          box-sizing: border-box;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .form-control:focus {\r\n");
      out.write("  z-index: 2;\r\n");
      out.write("}\r\n");
      out.write(".form-signin input[type=\"email\"] {\r\n");
      out.write("  margin-bottom: -1px;\r\n");
      out.write("  border-bottom-right-radius: 0;\r\n");
      out.write("  border-bottom-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write(".form-signin input[type=\"password\"] {\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  border-top-left-radius: 0;\r\n");
      out.write("  border-top-right-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form class=\"form-signin\" method=\"POST\"\r\n");
      out.write("\taction=\"/j_spring_security_check\">\r\n");
      out.write("\t<h2 class=\"form-signin-heading\">Please sign in</h2>\r\n");
      out.write("\t<label class=\"sr-only\">Name</label> \r\n");
      out.write("\t\t<input type=\"text\" name=\"j_username\" class=\" form-control\" placeholder=\"Name\"> \r\n");
      out.write("\t<label class=\"sr-only\">Password</label>\r\n");
      out.write("\t<input type=\"password\" name=\"j_password\" class=\"form-control\"\r\n");
      out.write("\t\tplaceholder=\"Password\">\r\n");
      out.write("\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign\r\n");
      out.write("\t\tin</button>\r\n");
      out.write("</form>\r\n");
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
