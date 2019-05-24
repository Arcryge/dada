package org.apache.jsp.seftrain.seftrain;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class print_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdw_005fbody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdw_005fsPrinter_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnf_005fbuttons;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnf_005fbutton_0026_005fvalue_005fonclick_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdw_005fbody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdw_005fsPrinter_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnf_005fbuttons = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnf_005fbutton_0026_005fvalue_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdw_005fbody.release();
    _005fjspx_005ftagPool_005fdw_005fsPrinter_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fnf_005fbuttons.release();
    _005fjspx_005ftagPool_005fnf_005fbutton_0026_005fvalue_005fonclick_005fnobody.release();
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
      response.setContentType("text/html; charset=gbk");
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
      out.write("\r\n");
      if (_jspx_meth_dw_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction initPrint() {\r\n");
      out.write("\t\tvar url = new URL(\"test.do?method=createTxtModel\");\r\n");
      out.write("\t\tasynchFillData(url.getURLString(), \"printView:htmlStr1\", function() {\r\n");
      out.write("\t\t\talert();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_dw_005fbody_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  dw:body
    com.dareway.framework.taglib.body.BodyTag _jspx_th_dw_005fbody_005f0 = (com.dareway.framework.taglib.body.BodyTag) _005fjspx_005ftagPool_005fdw_005fbody.get(com.dareway.framework.taglib.body.BodyTag.class);
    boolean _jspx_th_dw_005fbody_005f0_reused = false;
    try {
      _jspx_th_dw_005fbody_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dw_005fbody_005f0.setParent(null);
      int _jspx_eval_dw_005fbody_005f0 = _jspx_th_dw_005fbody_005f0.doStartTag();
      if (_jspx_eval_dw_005fbody_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_dw_005fbody_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_dw_005fbody_005f0);
        }
        do {
          out.write("\r\n");
          out.write(" \t");
          if (_jspx_meth_dw_005fsPrinter_005f0(_jspx_th_dw_005fbody_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write(" \t");
          if (_jspx_meth_nf_005fbuttons_005f0(_jspx_th_dw_005fbody_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_dw_005fbody_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_dw_005fbody_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_dw_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdw_005fbody.reuse(_jspx_th_dw_005fbody_005f0);
      _jspx_th_dw_005fbody_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dw_005fbody_005f0, _jsp_annotationprocessor, _jspx_th_dw_005fbody_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_dw_005fsPrinter_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_dw_005fbody_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  dw:sPrinter
    com.dareway.framework.taglib.sprinter.SPrinterTag _jspx_th_dw_005fsPrinter_005f0 = (com.dareway.framework.taglib.sprinter.SPrinterTag) _005fjspx_005ftagPool_005fdw_005fsPrinter_0026_005fname_005fnobody.get(com.dareway.framework.taglib.sprinter.SPrinterTag.class);
    boolean _jspx_th_dw_005fsPrinter_005f0_reused = false;
    try {
      _jspx_th_dw_005fsPrinter_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dw_005fsPrinter_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_dw_005fbody_005f0);
      // /seftrain/seftrain/print.jsp(7,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_dw_005fsPrinter_005f0.setName("printView");
      int _jspx_eval_dw_005fsPrinter_005f0 = _jspx_th_dw_005fsPrinter_005f0.doStartTag();
      if (_jspx_th_dw_005fsPrinter_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdw_005fsPrinter_0026_005fname_005fnobody.reuse(_jspx_th_dw_005fsPrinter_005f0);
      _jspx_th_dw_005fsPrinter_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dw_005fsPrinter_005f0, _jsp_annotationprocessor, _jspx_th_dw_005fsPrinter_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_nf_005fbuttons_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_dw_005fbody_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nf:buttons
    com.dareway.framework.taglib.sform.widgets.ButtonsTag _jspx_th_nf_005fbuttons_005f0 = (com.dareway.framework.taglib.sform.widgets.ButtonsTag) _005fjspx_005ftagPool_005fnf_005fbuttons.get(com.dareway.framework.taglib.sform.widgets.ButtonsTag.class);
    boolean _jspx_th_nf_005fbuttons_005f0_reused = false;
    try {
      _jspx_th_nf_005fbuttons_005f0.setPageContext(_jspx_page_context);
      _jspx_th_nf_005fbuttons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_dw_005fbody_005f0);
      int _jspx_eval_nf_005fbuttons_005f0 = _jspx_th_nf_005fbuttons_005f0.doStartTag();
      if (_jspx_eval_nf_005fbuttons_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_nf_005fbuttons_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_nf_005fbuttons_005f0);
        }
        do {
          out.write("\r\n");
          out.write(" \t\t");
          if (_jspx_meth_nf_005fbutton_005f0(_jspx_th_nf_005fbuttons_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write(" \t");
          int evalDoAfterBody = _jspx_th_nf_005fbuttons_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_nf_005fbuttons_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_nf_005fbuttons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fnf_005fbuttons.reuse(_jspx_th_nf_005fbuttons_005f0);
      _jspx_th_nf_005fbuttons_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_nf_005fbuttons_005f0, _jsp_annotationprocessor, _jspx_th_nf_005fbuttons_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_nf_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_nf_005fbuttons_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nf:button
    com.dareway.framework.taglib.sform.widgets.ButtonTag _jspx_th_nf_005fbutton_005f0 = (com.dareway.framework.taglib.sform.widgets.ButtonTag) _005fjspx_005ftagPool_005fnf_005fbutton_0026_005fvalue_005fonclick_005fnobody.get(com.dareway.framework.taglib.sform.widgets.ButtonTag.class);
    boolean _jspx_th_nf_005fbutton_005f0_reused = false;
    try {
      _jspx_th_nf_005fbutton_005f0.setPageContext(_jspx_page_context);
      _jspx_th_nf_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nf_005fbuttons_005f0);
      // /seftrain/seftrain/print.jsp(9,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_nf_005fbutton_005f0.setValue("打印");
      // /seftrain/seftrain/print.jsp(9,3) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_nf_005fbutton_005f0.setOnclick("initPrint");
      int _jspx_eval_nf_005fbutton_005f0 = _jspx_th_nf_005fbutton_005f0.doStartTag();
      if (_jspx_th_nf_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fnf_005fbutton_0026_005fvalue_005fonclick_005fnobody.reuse(_jspx_th_nf_005fbutton_005f0);
      _jspx_th_nf_005fbutton_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_nf_005fbutton_005f0, _jsp_annotationprocessor, _jspx_th_nf_005fbutton_005f0_reused);
    }
    return false;
  }
}
