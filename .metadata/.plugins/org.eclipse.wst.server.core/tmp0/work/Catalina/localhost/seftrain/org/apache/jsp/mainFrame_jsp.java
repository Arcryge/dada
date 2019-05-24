package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dareway.framework.util.*;
import com.dareway.framework.common.GlobalNames;
import java.net.URLDecoder;
import com.dareway.framework.taglib.theme.ThemeConstants;
import com.dareway.framework.taglib.theme.ThemeNames;
import com.dareway.framework.common.GlobalNames;

public final class mainFrame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/frameImportFile.jsp");
    _jspx_dependants.add("/importFile.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdw_005flaneContainer_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdw_005flaneContainer_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdw_005flaneContainer_0026_005fname_005fnobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");

	CurrentUser user = (CurrentUser) SessionUtil.getUser(request);
	String usersessionuuid = (String)request.getParameter("__usersession_uuid");
	if(usersessionuuid == null) {
		usersessionuuid = (String)request.getAttribute("__usersession_uuid");
	}
	if (user == null) {

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\twindow.location=\"reLogonWithoutChangeUser.jsp\";\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
	} else {
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("\t\t<link rel=\"icon\" type=\"image/x-icon\" href=\"dareway.ico\"/>\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"dareway.ico\">\r\n");
      out.write("\t\t<link rel=\"Bookmark\" href=\"dareway.ico\">\r\n");
      out.write("\t\t<title>SEF框架培训系统</title>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String version = null;
	if(GlobalNames.DEBUGMODE == true){
		// 调试模式下，用时间戳，防止浏览器缓存JS
		version = String.valueOf(System.currentTimeMillis()); 
	}else{
		// 非调试模式下，要利用浏览器缓存
		version = GlobalNames.FRAMEWORK_VERSION; 
	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"./themes/default/sef.min.css?_=");
      out.print(version );
      out.write("\">\r\n");
if(ThemeNames.THEME_TYPE.equalsIgnoreCase(ThemeConstants.THEME_EXT)){
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"./themes/ext/sgridExt.css?_=");
      out.print(version );
      out.write("\">\r\n");
}
      out.write("\r\n");
      out.write("<script type=\"text/javaScript\" charset=\"UTF-8\" src='./widgets/Utils.min.js?_=");
      out.print(version );
      out.write("'></script>\r\n");
      out.write("<script type=\"text/javaScript\" charset=\"UTF-8\" src='./widgets/Widgets.min.js?_=");
      out.print(version );
      out.write("'></script>\r\n");
      out.write("<script type=\"text/javaScript\" charset=\"UTF-8\" src='./widgets/echarts/echarts.min.js?_=");
      out.print(version );
      out.write("'></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"./jsp/workflow/component/material/scan/pub/batchUploadFilePage.css?_=");
      out.print(version );
      out.write("\"/>\r\n");
      out.write("<script type=\"text/javaScript\" charset=\"UTF-8\" src=\"./jsp/workflow/component/material/scan/pub/ScanPubFunction.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javaScript\" charset=\"UTF-8\" src=\"./jsp/workflow/component/material/scan/pub/MaterialUtil.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javaScript\" charset=\"UTF-8\" src=\"./jsp/workflow/component/material/PDFViewer/PDFViewer.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"dw-mainFrame\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_dw_005flaneContainer_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<iframe name='download_hidden_frame' id=\"download_hidden_frame\" style='display: none'></iframe>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\tJSEManager.doJSInNewJSE(function(){\r\n");
      out.write("\t\t\t\t\tGlobalNames.__usersession_uuid = '");
      out.print(usersessionuuid);
      out.write("';\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar laneContainer = getLaneManager(),\r\n");
      out.write("\t\t\t\t\t\tmainLane = null;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(!laneContainer){\r\n");
      out.write("\t\t\t\t\t\talert(\"mainFrame:未在页面中检测到LaneManager组件，请检查!\");\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tmainLane = laneContainer.setMainLane({key:\"mainLane\"}, \"主工作台\");\r\n");
      out.write("\t\t\t\t\tlaneContainer.activeLane(mainLane.getID());\r\n");
      out.write("\t\t\t\t\tmainLane.openBeacon(\"mainFrame\", \"mainFrame\", \"index.jsp\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\twindow.onbeforeunload=function(){\r\n");
      out.write("\t\t\t\t\tJSEManager.doJSInNewJSE(function(){\r\n");
      out.write("\t\t\t\t\t\tvar menubar = getMainFrame().getObject(\"menubar\"),\r\n");
      out.write("\t\t\t\t\t\t\tbarName = null,\r\n");
      out.write("\t\t\t\t\t\t\tchild = null,\r\n");
      out.write("\t\t\t\t\t\t\tchildLength = null,\r\n");
      out.write("\t\t\t\t\t\t\ti;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(menubar){\r\n");
      out.write("\t\t\t\t\t\t\tchild = menubar.getChildren();\r\n");
      out.write("\t\t\t\t\t\t\tchildLength = child.length;\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tfor(i=childLength-1; i>=0; i--) {\r\n");
      out.write("\t\t\t\t\t\t\t\tbarName = child[i].getProperty(\"name\");\r\n");
      out.write("\t\t\t\t\t\t\t\tmenubar.removeBarItem(barName);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t   \tAjaxUtil.asynchAjaxRequest(\"logoffController.do\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t};\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
	}	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_dw_005flaneContainer_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  dw:laneContainer
    com.dareway.framework.taglib.laneContainer.LaneContainerTag _jspx_th_dw_005flaneContainer_005f0 = (com.dareway.framework.taglib.laneContainer.LaneContainerTag) _005fjspx_005ftagPool_005fdw_005flaneContainer_0026_005fname_005fnobody.get(com.dareway.framework.taglib.laneContainer.LaneContainerTag.class);
    boolean _jspx_th_dw_005flaneContainer_005f0_reused = false;
    try {
      _jspx_th_dw_005flaneContainer_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dw_005flaneContainer_005f0.setParent(null);
      // /mainFrame.jsp(37,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_dw_005flaneContainer_005f0.setName("dw-laneContainer");
      int _jspx_eval_dw_005flaneContainer_005f0 = _jspx_th_dw_005flaneContainer_005f0.doStartTag();
      if (_jspx_th_dw_005flaneContainer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdw_005flaneContainer_0026_005fname_005fnobody.reuse(_jspx_th_dw_005flaneContainer_005f0);
      _jspx_th_dw_005flaneContainer_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dw_005flaneContainer_005f0, _jsp_annotationprocessor, _jspx_th_dw_005flaneContainer_005f0_reused);
    }
    return false;
  }
}
