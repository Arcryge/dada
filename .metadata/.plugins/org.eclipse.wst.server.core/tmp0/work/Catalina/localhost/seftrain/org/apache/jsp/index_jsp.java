package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dareway.framework.util.SessionUtil;
import com.dareway.framework.util.CurrentUser;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.custom.BusinessCustomHandler;
import com.dareway.framework.util.DataStore;
import java.net.URLDecoder;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/top.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdw_005fbody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdw_005fdiy_0026_005fheight;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdw_005fmenubar_0026_005fname_005fcontainer_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdw_005fsheetContainer_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdw_005fbody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdw_005fdiy_0026_005fheight = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdw_005fmenubar_0026_005fname_005fcontainer_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdw_005fsheetContainer_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdw_005fbody.release();
    _005fjspx_005ftagPool_005fdw_005fdiy_0026_005fheight.release();
    _005fjspx_005ftagPool_005fdw_005fmenubar_0026_005fname_005fcontainer_005fnobody.release();
    _005fjspx_005ftagPool_005fdw_005fsheetContainer_0026_005fname_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
            out.write('\r');
            out.write('\n');
            out.write('	');
            //  dw:diy
            com.dareway.framework.taglib.html.HTMLTag _jspx_th_dw_005fdiy_005f0 = (com.dareway.framework.taglib.html.HTMLTag) _005fjspx_005ftagPool_005fdw_005fdiy_0026_005fheight.get(com.dareway.framework.taglib.html.HTMLTag.class);
            boolean _jspx_th_dw_005fdiy_005f0_reused = false;
            try {
              _jspx_th_dw_005fdiy_005f0.setPageContext(_jspx_page_context);
              _jspx_th_dw_005fdiy_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_dw_005fbody_005f0);
              // /index.jsp(10,1) name = height type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_dw_005fdiy_005f0.setHeight("49");
              int _jspx_eval_dw_005fdiy_005f0 = _jspx_th_dw_005fdiy_005f0.doStartTag();
              if (_jspx_eval_dw_005fdiy_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_dw_005fdiy_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_dw_005fdiy_005f0);
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t");
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
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  int evalDoAfterBody = _jspx_th_dw_005fdiy_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_dw_005fdiy_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_dw_005fdiy_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005fdw_005fdiy_0026_005fheight.reuse(_jspx_th_dw_005fdiy_005f0);
              _jspx_th_dw_005fdiy_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dw_005fdiy_005f0, _jsp_annotationprocessor, _jspx_th_dw_005fdiy_005f0_reused);
            }
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_dw_005fmenubar_005f0(_jspx_th_dw_005fbody_005f0, _jspx_page_context))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_dw_005fsheetContainer_005f0(_jspx_th_dw_005fbody_005f0, _jspx_page_context))
              return;
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
          return;
        }
        _005fjspx_005ftagPool_005fdw_005fbody.reuse(_jspx_th_dw_005fbody_005f0);
        _jspx_th_dw_005fbody_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dw_005fbody_005f0, _jsp_annotationprocessor, _jspx_th_dw_005fbody_005f0_reused);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction GetDWCardReaderActiveXObject(){\r\n");
      out.write("\t\tvar ele = document.frames[\"download_hidden_frame\"].document.getElementById(\"DWCardReader\");\r\n");
      out.write("\t\tif(ele==null || ele.object==null){\r\n");
      out.write("\t\t\treturn null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn ele;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction setReaderList(){\r\n");
      out.write("\t\tvar cardtype = \"");
      out.print(GlobalNames.CARD_TYPE);
      out.write("\".split(\",\");\r\n");
      out.write("\t\tDWSetReaderList(cardtype);\r\n");
      out.write("\t}\r\n");
      out.write("\t/** 读卡器延迟加载 - END **/\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" defer=\"defer\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t//window.open(\"pluginInstall.jsp\", \"download_hidden_frame\");\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t(function createNewPage(){\r\n");
      out.write("\t\tvar mainFrame = getMainFrame();\r\n");
      out.write("\t\tvar menuBar = mainFrame.getObject(\"menubar\");\r\n");
      out.write("\t\tmenuBar.newItem(\"index\", \"培训\", \"seftrain/main.jsp\", false);\r\n");
      out.write("\t\tmenuBar.newItem(\"demo\", \"demo\", \"seftrain/demo/pageIndex.jsp\", false);\r\n");
      out.write("\t\tmenuBar.newItem(\"process\", \"工作流\", \"workflow/workflowTrain.jsp\", false);\r\n");
      out.write("\t\tmenuBar.newItem(\"text\", \"练习form基础\", \"seftrain/arcrytest/pageDWjbxxck.jsp\", false);\r\n");
      out.write("\t\tmenuBar.goItem(\"index\");\r\n");
      out.write("\t}());\r\n");
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

  private boolean _jspx_meth_dw_005fmenubar_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_dw_005fbody_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  dw:menubar
    com.dareway.framework.taglib.menubar.MenuBarTag _jspx_th_dw_005fmenubar_005f0 = (com.dareway.framework.taglib.menubar.MenuBarTag) _005fjspx_005ftagPool_005fdw_005fmenubar_0026_005fname_005fcontainer_005fnobody.get(com.dareway.framework.taglib.menubar.MenuBarTag.class);
    boolean _jspx_th_dw_005fmenubar_005f0_reused = false;
    try {
      _jspx_th_dw_005fmenubar_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dw_005fmenubar_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_dw_005fbody_005f0);
      // /index.jsp(13,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_dw_005fmenubar_005f0.setName("menubar");
      // /index.jsp(13,1) name = container type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_dw_005fmenubar_005f0.setContainer("pageSheetContainer");
      int _jspx_eval_dw_005fmenubar_005f0 = _jspx_th_dw_005fmenubar_005f0.doStartTag();
      if (_jspx_th_dw_005fmenubar_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdw_005fmenubar_0026_005fname_005fcontainer_005fnobody.reuse(_jspx_th_dw_005fmenubar_005f0);
      _jspx_th_dw_005fmenubar_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dw_005fmenubar_005f0, _jsp_annotationprocessor, _jspx_th_dw_005fmenubar_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_dw_005fsheetContainer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_dw_005fbody_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  dw:sheetContainer
    com.dareway.framework.taglib.sheetContainer.SheetContainerTag _jspx_th_dw_005fsheetContainer_005f0 = (com.dareway.framework.taglib.sheetContainer.SheetContainerTag) _005fjspx_005ftagPool_005fdw_005fsheetContainer_0026_005fname_005fnobody.get(com.dareway.framework.taglib.sheetContainer.SheetContainerTag.class);
    boolean _jspx_th_dw_005fsheetContainer_005f0_reused = false;
    try {
      _jspx_th_dw_005fsheetContainer_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dw_005fsheetContainer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_dw_005fbody_005f0);
      // /index.jsp(14,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_dw_005fsheetContainer_005f0.setName("pageSheetContainer");
      int _jspx_eval_dw_005fsheetContainer_005f0 = _jspx_th_dw_005fsheetContainer_005f0.doStartTag();
      if (_jspx_th_dw_005fsheetContainer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdw_005fsheetContainer_0026_005fname_005fnobody.reuse(_jspx_th_dw_005fsheetContainer_005f0);
      _jspx_th_dw_005fsheetContainer_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dw_005fsheetContainer_005f0, _jsp_annotationprocessor, _jspx_th_dw_005fsheetContainer_005f0_reused);
    }
    return false;
  }
}
