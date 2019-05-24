package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.util.StringUtil;

public final class errorPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=GBK");
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
      out.write("\r\n");

	Exception ex = (Exception) request.getAttribute(GlobalNames.EXCEPTION_KEY);
	String message = (String) request.getAttribute("message");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"dw-exception\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div class=\"dw-exception-summary\" style=\"min-height:70px\">\r\n");
      out.write("\t");
 if (ex != null) {
			if (message != null) {
 				out.println(message);
 			}else{
 				out.println(ex.getMessage());
 			}
 			
 	   }
 	
      out.write("\t\r\n");
      out.write(" \t</div>\t\r\n");
      out.write("\t    \r\n");
      out.write("\t");
 if (ex != null) { 
			try {
				out.println("<pre class=\"dw-exception-content\">");
				java.io.CharArrayWriter cw = new java.io.CharArrayWriter();
				java.io.PrintWriter pw = new java.io.PrintWriter(cw, true);
				ex.printStackTrace(pw);
				out.println(cw.toString());
				out.println("</pre>");
			} catch (Exception e) {
				e.printStackTrace();
			}
	   } 
	
      out.write("\t\t    \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script id=\"script_exception\" type=\"text/javascript\" defer=\"defer\">\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
