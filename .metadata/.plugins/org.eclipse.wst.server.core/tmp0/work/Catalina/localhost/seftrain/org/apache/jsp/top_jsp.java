package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.util.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	CurrentUser _user = (CurrentUser) SessionUtil.getUser(request);
	String _userName = null;
	if(_user != null){
		_userName = _user.getUsername();
	}

      out.write("\r\n");
      out.write("<div class=\"dw-header\" style=\"background-image:url(images/topArea/top_bg.jpg);\">\r\n");
      out.write("<p>heheh</p>\r\n");
      out.write("\t<div class=\"dw-header-title\" style=\"background-image:url(images/topArea/title.png);\"></div>\r\n");
      out.write("\t<div class=\"dw-header-rightarea\">\r\n");
      out.write("\t\t<div class=\"dw-header-rightarea-quickentrance\">\r\n");
      out.write("\t\t\t<input id=\"dwSearchInput\" type=\"text\" class=\"dw-header-rightarea-quickentrance-input\"/>\r\n");
      out.write("\t\t\t<input id=\"dwSearchButton\" type=\"button\" class=\"dw-header-rightarea-quickentrance-btn\"/>\r\n");
      out.write("\t\t\t<label id=\"dwPlaceholder\" class=\"dw-header-rightarea-quickentrance-placeholder\">请输入业务流水号</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"dw-header-rightarea-username\">");
      out.print(_userName);
      out.write("</div>\r\n");
      out.write("\t\t<div class=\"dw-header-rightarea-institution\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" defer=\"defer\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar $dwSearchInput = $(\"#dwSearchInput\");\r\n");
      out.write("\t\tvar $dwSearchButton = $(\"#dwSearchButton\");\r\n");
      out.write("\t\tvar $dwPlaceholder = $(\"#dwPlaceholder\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 开始录入业务流水号时，去掉提示【请输入业务流水号..】\r\n");
      out.write("\t\t$dwPlaceholder.bind(\"click\", function(){\r\n");
      out.write("\t\t\t$dwPlaceholder.css(\"visibility\", \"hidden\");\r\n");
      out.write("\t\t\t$dwSearchInput.focus();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 光标进入输入框\r\n");
      out.write("\t\t$dwSearchInput.bind(\"focus\", function(){\r\n");
      out.write("\t\t\t$dwPlaceholder.css(\"visibility\", \"hidden\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 光标离开输入框后\r\n");
      out.write("\t\t$dwSearchInput.bind(\"blur\", function(){\r\n");
      out.write("\t\t\tif(!$(this).val()){\r\n");
      out.write("\t\t\t\t$dwPlaceholder.css(\"visibility\", \"visible\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 回车动作\r\n");
      out.write("\t\t$dwSearchInput.bind(\"keydown\", function(jEvent){\r\n");
      out.write("\t\t\tvar value = this.value;\r\n");
      out.write("\t\t\tif(jEvent.which == 13){\r\n");
      out.write("\t\t\t\tJSEManager.doJSInNewJSE(function(){\r\n");
      out.write("\t\t\t\t\tWorkFlowUtil.goProcess(value);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tjEvent.preventDefault();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tjEvent.stopPropagation();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 鼠标单击动作\r\n");
      out.write("\t\t$dwSearchButton.bind(\"click\", function(){\r\n");
      out.write("\t\t\tvar value = $dwSearchInput.val();\r\n");
      out.write("\t\t\tJSEManager.doJSInNewJSE(function(){\r\n");
      out.write("\t\t\t\tWorkFlowUtil.goProcess(value);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 注销按钮动作\r\n");
      out.write("\t\tvar laneManager = getLaneManager();\r\n");
      out.write("\t\tlaneManager.setLogoffJsAction(function(){\r\n");
      out.write("\t\t\tvar menubar = getMainFrame().getObject(\"menubar\"),\r\n");
      out.write("\t\t\t\tbarName = null,\r\n");
      out.write("\t\t\t\tchild = menubar.getChildren(),\r\n");
      out.write("\t\t\t\tchildLength = child.length;\r\n");
      out.write("\t\r\n");
      out.write("\t\t\tfor(var i=childLength-1; i>=0; i--) {\r\n");
      out.write("\t\t\t\tbarName = child[i].getProperty(\"name\");\r\n");
      out.write("\t\t\t\tmenubar.removeBarItem(barName);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tAjaxUtil.ajaxRequest(\"logoffController.do\");\r\n");
      out.write("\t\t\tCookieUtil.delCookie(\"password\");\r\n");
      out.write("\t\t\tlocation.href = \"logonDialog.jsp\";\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//系统信息动作\r\n");
      out.write("\t\tlaneManager.setSysInfoJsAction(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar lanes = laneManager.searchLanesByKeySet({name:\"系统信息\"});\t\r\n");
      out.write("\t\t\tif(lanes.length == 1){\r\n");
      out.write("\t\t\t\tlaneManager.activeLane(lanes[0].getID());\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(lanes.length > 1){\r\n");
      out.write("\t\t\t\talert(\"系统信息航道已存在!请直接切换!\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar sysInfoLane;\r\n");
      out.write("\t\t\tsysInfoLane = laneManager.addLane({name:\"系统信息\"},\"系统信息\",\"tag_lane_sys\");\r\n");
      out.write("\t\t\tlaneManager.activeLane(sysInfoLane.getID());\r\n");
      out.write("\t\t\tsysInfoLane.openBeacon(\"sysInfo\", \"系统信息\", \"systemMonitor.do?method=openSysInfoPage\",function(){\r\n");
      out.write("\t\t\t\t//移除当前航道并跳转到主航道\r\n");
      out.write("\t\t\t\tvar mainlaneID = laneManager.getMainLane().getID();\r\n");
      out.write("\t\t\t\tlaneManager.removeActiveLane(mainlaneID);\r\n");
      out.write("\t\t\t},null,\"600\",\"470\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
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
