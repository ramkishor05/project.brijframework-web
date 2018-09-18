package org.brijframework.web.servlet;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private static final javax.servlet.jsp.JspFactory _jspxFactory =javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    System.err.println(_el_expressionfactory.getClass());
    System.err.println(_jsp_instancemanager.getClass());
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=US-ASCII");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\n");
      out.write("<title>Index JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h4>Hi There</h4>\n");
      out.write("<strong>Current Time is</strong>: ");
 out.print(new Date()); 
      out.write("<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<strong>Request User-Agent</strong>: ");
      out.print(request.getHeader("User-Agent") );
      out.write("<br><br>\n");
      out.write("\n");
      out.write('\n');
response.addCookie(new Cookie("Test","Value")); 
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<strong>User init param value</strong>:");
      out.print(config.getInitParameter("User") );
      out.write("<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<strong>User context param value</strong>:");
      out.print(application.getInitParameter("User") );
      out.write("<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<strong>User Session ID</strong>:");
      out.print(session.getId() );
      out.write("<br><br>\n");
      out.write("\n");
      out.write('\n');
 pageContext.setAttribute("Test", "Test Value"); 
      out.write("\n");
      out.write("<strong>PageContext attribute</strong>: {Name=\"Test\",Value=\"");
      out.print(pageContext.getAttribute("Test") );
      out.write("\"}<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<strong>Generated Servlet Name</strong>:");
      out.print(page.getClass().getName() );
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}