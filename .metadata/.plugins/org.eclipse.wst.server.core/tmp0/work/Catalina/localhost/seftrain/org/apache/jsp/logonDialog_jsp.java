package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dareway.framework.plugin.DebugModeConfig;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.util.CurrentUser;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.common.BusinessNames;

public final class logonDialog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/jsp/ca/caLogonHandle.jsp");
    _jspx_dependants.add("/jsp/nsca/nscaLogonHandle.jsp");
    _jspx_dependants.add("/logonHandle.jsp");
    _jspx_dependants.add("/jsp/ukey/ukeyActiveX.jsp");
  }

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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"dareway.ico\" type=\"image/x-icon\" />\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"dareway.ico\">\r\n");
      out.write("\t\t<link rel=\"Bookmark\" href=\"dareway.ico\">\r\n");
      out.write("\t\t<title>系统登录</title>\r\n");
      out.write("\t\t");

			String version = null;
			if(GlobalNames.DEBUGMODE == true){
				// 调试模式下，JS的时间戳是当前时间
				version = String.valueOf(System.currentTimeMillis()); 
			}else{
				// 非调试模式下，JS的时间戳是封板时间
				version = GlobalNames.FRAMEWORK_VERSION;
			}
		
      out.write("\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"./themes/default/sef.min.css?_=");
      out.print(version );
      out.write("\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"UTF-8\" src=\"./widgets/Utils.min.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javaScript\" charset=\"UTF-8\" src='./widgets/layout/GlobalNames.js?_=");
      out.print(version );
      out.write("'></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"UTF-8\" src=\"./widgets/layout/requestSubmit.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"UTF-8\" src=\"./widgets/ca/Ca.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"UTF-8\" src=\"./widgets/nsca/NSCAUtil.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"UTF-8\" src=\"./widgets/layer/layer.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<img class=\"dw-logon-bg\" src=\"./images/logon/body_bg.jpg\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(GlobalNames.CA_LOGON_MODE){ 
      out.write("\r\n");
      out.write("\t\t<div class=\"dw-ca-logon-form\">\r\n");
      out.write("\t\t\t<div id=\"userNameInput\" class=\"dw-ca-logon-form-loginname\"></div>\t\t\t\t\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"userPwdInput\" class=\"dw-ca-logon-form-pwd\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" id=\"logonBtn\" class=\"dw-ca-logon-form-btnlogin\" onclick=\"onLogin()\"/>\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String requestURL = (String)request.getParameter("requestURL");
	if(null == requestURL){
		requestURL = "mainFrame.jsp?";
	}else{
		if(requestURL.indexOf("?")>-1){
			requestURL=requestURL+"&";
		}else{
			requestURL=requestURL+"?";
		}
	}
	
	boolean caLogonMode = GlobalNames.CA_LOGON_MODE;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
if (GlobalNames.CA_LOGON_MODE) {
      out.write(" \r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;\">\r\n");
      out.write("\t<OBJECT id=\"hkeyActiveXObject\" type=\"application/x-qt-plugin\"  classid=\"CLSID:0F347D17-1AC1-480F-82AB-A50DF47EAEAE\" width=\"0\" height=\"0\"></OBJECT>\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javaScript\">\r\n");
      out.write("\tvar caLogonMode = ");
      out.print(caLogonMode);
      out.write(",\r\n");
      out.write("\t\t$userNameObj = $(\"#userNameInput\"),\r\n");
      out.write("\t\t$passwdObj = $(\"#userPwdInput\"),\r\n");
      out.write("\t\t$logonBtn = $(\".dw-logon-form-btnlogin\"),\r\n");
      out.write("\t\tcaObject = null;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$userNameObj.attr(\"readonly\",\"readonly\");\r\n");
      out.write("\t\t$passwdObj.attr(\"readonly\",\"readonly\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcaObject = new Ca({\r\n");
      out.write("\t\t\thkeyActiveXObject : document.getElementById(\"hkeyActiveXObject\"),\r\n");
      out.write("\t\t\t$userListContainer : $userNameObj\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar ret = caObject.isCAPluginExist();\r\n");
      out.write("\t\tif(!ret){\r\n");
      out.write("\t\t\tcaObject.showPluginDownloadDialog($(\"body\"));\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar readHkeyTimer = setInterval(function(){\r\n");
      out.write("\t\t\tvar existHkey = caObject.isHkeyInsert();\t\t\t\r\n");
      out.write("\t\t\tif(existHkey){\r\n");
      out.write("\t\t\t\t$userNameObj.empty();\r\n");
      out.write("\t\t\t\tcaObject.showUserList();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tclearInterval(readHkeyTimer);\r\n");
      out.write("\t\t\t\t$passwdObj.attr(\"readonly\",false);\r\n");
      out.write("\t\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$userNameObj.text(\"请插入Hkey设备\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},500);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction onLogin(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar ukeyPasswd = $passwdObj.val();\r\n");
      out.write("\t\tif(typeof ukeyPasswd == \"undefined\" || ukeyPasswd ==\"\" || ukeyPasswd == null ){\r\n");
      out.write("\t\t\talert(\"请输入ukey的密码！\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//打开Hkey\r\n");
      out.write("\t\tif(!caObject){\r\n");
      out.write("\t\t\talert(\"登录初始化出现错误！\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar openResult = caObject.openHkey(ukeyPasswd);\r\n");
      out.write("\t\tif(!openResult){\r\n");
      out.write("\t\t\talert(\"Hkey登录失败！用户名或密码错误!请检查!\");\r\n");
      out.write("\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar sessionUserId = caObject.checkSignAndCert();\r\n");
      out.write("\t\tif(sessionUserId){\r\n");
      out.write("\t\t\tlocation.href = '");
      out.print(requestURL);
      out.write("' + new Date().getMilliseconds() + \"&__usersession_uuid=\" + sessionUserId;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\r\n");
      out.write("\r\n");
      out.write("\tdocument.onkeydown = function(){\r\n");
      out.write("\t\tif (13 == getEvent().keyCode) {\r\n");
      out.write("\t\t\tonLogin();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write(" </script>");
      out.write("\t\r\n");
      out.write("    ");
}else if(GlobalNames.NSCA_LOGON_MODE){ 
      out.write("\r\n");
      out.write("\t\t<div class=\"dw-ca-logon-form\">\r\n");
      out.write("\t\t\t<div id=\"userNameInput\" class=\"dw-ca-logon-form-loginname\"></div>\t\t\t\t\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"userPwdInput\" class=\"dw-ca-logon-form-pwd\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" id=\"logonBtn\" class=\"dw-ca-logon-form-btnlogin\" onclick=\"onLogin()\"/>\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String requestURL = (String)request.getParameter("requestURL");
	if(null == requestURL){
		requestURL = "mainFrame.jsp?";
	}else{
		if(requestURL.indexOf("?")>-1){
			requestURL=requestURL+"&";
		}else{
			requestURL=requestURL+"?";
		}
	}
	
	// 从Cookie中获取KeyId -- 来自于网关
	Cookie[] cookies = request.getCookies();
	String keyid = "";
	if (null != cookies) {
		for (int i = 0; i < cookies.length; i++) {
			if ("Serial".equals(cookies[i].getName())) {
				keyid = cookies[i].getValue();
       			continue;
    		}
		}
	}
	
	boolean caLogonMode = GlobalNames.CA_LOGON_MODE;

      out.write("\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;\">\r\n");
      out.write("\t<OBJECT id=\"hkeyActiveXObject\"  type=\"application/x-qt-plugin\" width=\"0\" height=\"0\" codebase=\"widgets/nsca/NetSign20.cab#version=2,0,59,3\" classid=\"clsid:B3B938C4-4190-4F37-8CF0-A92B0A91CC77\" VIEWASTEXT></OBJECT>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javaScript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction getLoginNameByNSCAKeyId(keyId){\r\n");
      out.write("\t\tif(!keyId){\r\n");
      out.write("\t\t\talert(\"方法getLoginNameByNSCAKeyId入参【keyid】为空，请检查!\");\r\n");
      out.write("\t\t\treturn null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = new URL(\"logon.do?method=getLoginNameByNSCAKeyId\");\r\n");
      out.write("\t\turl.addPara(\"keyId\", keyId);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar loginName = AjaxUtil.ajaxRequest(url.getURLString());\r\n");
      out.write("\t\tif(!AjaxUtil.checkException(loginName)){\r\n");
      out.write("\t\t\tAjaxUtil.showException(loginName);\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn loginName\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 1. 根据keyid获取用户的登录名\r\n");
      out.write("\t// 2. 登陆系统\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar $userNameObj = $(\"#userNameInput\"),\r\n");
      out.write("\t\t\tloginName = null,\r\n");
      out.write("\t\t\tpwd = null;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 设定用户名部分为只读\r\n");
      out.write("\t\t$userNameObj.prop(\"readonly\", true);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 转换keyid为loginName\r\n");
      out.write("\t\tloginName = getLoginNameByNSCAKeyId(\"");
      out.print(keyid);
      out.write("\");\r\n");
      out.write("\t\tif(!loginName){\r\n");
      out.write("\t\t\talert(\"获取用户登录名称失败!\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$userNameObj.text(loginName);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction onLogin() {\r\n");
      out.write("\t\tvar $userNameObj = $(\"#userNameInput\"),\r\n");
      out.write("\t\t\t$passwdObj = $(\"#userPwdInput\"),\r\n");
      out.write("\t\t\tloginName = $userNameObj.text(),\r\n");
      out.write("\t\t\tpwd = $passwdObj.val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!loginName){\r\n");
      out.write("\t\t\talert(\"用户名不能为空，请检查!\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!pwd){\r\n");
      out.write("\t\t\talert(\"密码不能为空，请检查!\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar keyid = NSCAUtil.isKeyExist();\r\n");
      out.write("\t\tif(keyid === null){\r\n");
      out.write("\t\t\talert(\"检测到KEY不存在,或未输入KEY密码。\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tpwd = $.md5(pwd);\r\n");
      out.write("\t\tpwd = $.md5(pwd);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tlogin(loginName, pwd);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 登录方法\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction login(loginName, password) {\r\n");
      out.write("\t\ttry{\r\n");
      out.write("\t\t\tvar url = new URL(\"logon.do?method=doLogon\");\r\n");
      out.write("\t\t\turl.addPara(\"userid\", loginName);\r\n");
      out.write("\t\t\turl.addPara(\"passwd\", password);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar msg = AjaxUtil.ajaxRequest(url.getURLString());\r\n");
      out.write("\t\t\tif(!AjaxUtil.checkException(msg)){\r\n");
      out.write("\t\t\t\tAjaxUtil.showException(msg);\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\ttry{\r\n");
      out.write("\t\t\t\tvar result  = JSON.parse(msg);\r\n");
      out.write("\t\t\t}catch(oE) {\r\n");
      out.write("\t\t\t\tMsgBox.show(msg);\r\n");
      out.write("\t\t\t\tCookieUtil.delCookie(\"password\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tGlobalNames.__usersession_uuid = result.__usersession_uuid;\r\n");
      out.write("\t\t\tvar mainUrl = '");
      out.print(requestURL);
      out.write("' + new Date().getMilliseconds() + \"&__usersession_uuid=\" + GlobalNames.__usersession_uuid;\r\n");
      out.write("\t\t\tcreateNewWindow(mainUrl);\r\n");
      out.write("\t\t}catch(oE){\r\n");
      out.write("\t\t\talert(oE.message);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.onkeydown = function(){\r\n");
      out.write("\t\tif (13 == getEvent().keyCode) {\r\n");
      out.write("\t\t\tonLogin();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write(" </script>");
      out.write("    \t\r\n");
      out.write("    ");
}else{ 
      out.write("\r\n");
      out.write("     \t<div class=\"dw-logon-form\">\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"userNameInput\" class=\"dw-logon-form-loginname\"/>\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"userPwdInput\" class=\"dw-logon-form-pwd\"/>\r\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"logPassword\" class=\"dw-logon-form-savepwd\" value=\"1\"/>\r\n");
      out.write("\t\t\t<div class=\"dw-logon-form-getloginname\" onclick=\"retrieveUserName()\"></div>\r\n");
      out.write("\t\t\t<input type=\"button\" id=\"logonBtn\" class=\"dw-logon-form-btnlogin\" onclick=\"onLogin()\"/>\r\n");
      out.write("\t\t\t");
 if(DebugModeConfig.getDebugMode()){ 
      out.write("\r\n");
      out.write("\t\t\t<input type=\"button\" class=\"dw-logon-form-btndebug\" onclick=\"debugLoginName();\"/>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String requestURL = (String)request.getParameter("requestURL");
	if(null == requestURL){
		requestURL = "mainFrame.jsp?";
	}else{
		if(requestURL.indexOf("?")>-1){
			requestURL=requestURL+"&";
		}else{
			requestURL=requestURL+"?";
		}
	}
	
	String logonMode = GlobalNames.LOGON_MODE;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javaScript\">\r\n");
      out.write("\tvar logonMode = '");
      out.print(logonMode);
      out.write("',\r\n");
      out.write("\t\t$useridObj = $(\"#userNameInput\"),\r\n");
      out.write("\t\t$passwdObj = $(\"#userPwdInput\"),\r\n");
      out.write("\t\t$retrieveObj = $(\"#retrieveUserName\"),\r\n");
      out.write("\t\treadUkey = null;\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tinitRetrieveUserName();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(logonMode == \"0\") {\r\n");
      out.write("\t\t\tlogonInWithoutUKey();\r\n");
      out.write("\t\t}else {\r\n");
      out.write("\t\t\tlogonInWithUKey();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction retrieveUserName() {\r\n");
      out.write("\t\tvar __layer = $(\".dw-getusername-bgmask\");\r\n");
      out.write("\t\tvar __res=$(\".dw-getusername-form\");\r\n");
      out.write("\t\t__layer.show();\r\n");
      out.write("\t\t__res.show();\r\n");
      out.write("\t\t $(\".dw-getusername-form-content-card\").focus();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction initRetrieveUserName() {\r\n");
      out.write("\t\t$(\"<div class=\\\"dw-getusername-bgmask\\\"><iframe  scrolling='no' frameborder='0' class=\\\"dw-getusername-bgmask-frame\\\"></iframe></div>\").appendTo(\"body\");\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar sHTML= \"<div class=\\\"dw-getusername-form\\\">\"+\r\n");
      out.write("\t\t\t\t\t\t\"<div class=\\\"dw-getusername-form-content\\\">\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<div class=\\\"dw-getusername-form-content-btnclose\\\"></div>\"+\r\n");
      out.write("\t\t\t\t\t\t\t\"<div class=\\\"dw-getusername-form-content-placeholder\\\">请输入身份证号</div>\" +\t\r\n");
      out.write("\t\t\t\t\t\t\t\"<input class=\\\"dw-getusername-form-content-card\\\" type=\\\"text\\\"/>\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<div class=\\\"dw-getusername-form-content-loginname\\\"></div>\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<div class=\\\"dw-getusername-form-content-btn\\\"></div>\"+\r\n");
      out.write("\t\t\t\t\t\t\"</div>\" +\r\n");
      out.write("\t\t\t\t   \"</div>\";\r\n");
      out.write("\t\t$(sHTML).appendTo(\"body\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar __layer = $(\".dw-getusername-bgmask\");\r\n");
      out.write("\t\tvar __res=$(\".dw-getusername-form\");\r\n");
      out.write("\t\tvar __pidObj = $(\".dw-getusername-form-content-card\");\r\n");
      out.write("\t\tvar __pid_hide_obj = $(\".dw-getusername-form-content-placeholder\");\r\n");
      out.write("\t\tvar __closeBtn = $(\".dw-getusername-form-content-btnclose\");\r\n");
      out.write("\t\tvar __loginName = $(\".dw-getusername-form-content-loginname\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 绑定找回按钮\r\n");
      out.write("\t\t$(\".dw-getusername-form-content-btn\").bind(\"click\", function(){\r\n");
      out.write("\t\t\tfoundLoginName();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t__res.bind(\"keydown\", function(e){\r\n");
      out.write("\t\t\te.stopPropagation();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t__closeBtn.bind(\"click\", function(){\r\n");
      out.write("\t\t\tcloseRetrieveUserName();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t__pidObj.bind(\"keydown\", function(jEvent){\r\n");
      out.write("\t\t\t__pid_hide_obj.hide();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar keyCode = jEvent.which;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(keyCode == FrameConstants.KEYCODE_MAPPING.ENTER) {\r\n");
      out.write("\t\t\t\tfoundLoginName();\r\n");
      out.write("\t\t\t\tjEvent.stopPropagation();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t__pidObj.bind(\"click\", function(jEvent) {\r\n");
      out.write("\t\t\t__pid_hide_obj.hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t__pid_hide_obj.show();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t__res.find(\".responseClose\").bind(\"click\", function(){\r\n");
      out.write("\t\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t\tcloseRetrieveUserName();\r\n");
      out.write("\t\t\t},0);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction closeRetrieveUserName() {\r\n");
      out.write("\t\t\t__pidObj.val(\"\");\r\n");
      out.write("\t\t\t__loginName.text(\"\");\r\n");
      out.write("\t\t\t__pid_hide_obj.show();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t__res.hide();\r\n");
      out.write("\t\t\t__layer.hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction foundLoginName(){\r\n");
      out.write("\t\t\t//个系统自己实现，根据输入的身份证好查询登录名\r\n");
      out.write("\t\t\tvar _pid_value = __pidObj.val(),\r\n");
      out.write("\t\t\t\turl = null,\r\n");
      out.write("\t\t\t\tloginName = null;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!_pid_value){\r\n");
      out.write("\t\t\t\tMsgBox.show(\"请先输入身份证号码，然后点击【申请找回】按钮!\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!IDCardUtil.checkSfzhm(_pid_value)) {\r\n");
      out.write("\t\t\t\tMsgBox.show(\"你输入的身份证号码不合法，请重新输入！\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\turl = new URL(\"logon.do?method=foundLoginName\");\r\n");
      out.write("\t\t\turl.addPara(\"sfzhm\", _pid_value)\r\n");
      out.write("\t\t\tloginName = AjaxUtil.ajaxRequest(url.getURLString());\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(AjaxUtil.checkException(loginName)) {\r\n");
      out.write("\t\t\t\t__loginName.text(loginName);\r\n");
      out.write("\t\t\t\treturn ;\r\n");
      out.write("\t\t\t}else {\r\n");
      out.write("\t\t\t\tMsgBox.show(\"没有找到身份证号为【\"+_pid_value+\"】的人员的登录名\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction logonInWithoutUKey() {\r\n");
      out.write("\t\t//读cookie信息\r\n");
      out.write("\t\tvar loginName = CookieUtil.getCookie(\"loginName\");\r\n");
      out.write("\t\tvar password = CookieUtil.getCookie(\"password\"); \r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (loginName  && password ) {\r\n");
      out.write("\t\t\tlogin(loginName, password, \"1\");\r\n");
      out.write("\t\t} else if(loginName  && !password ) {\r\n");
      out.write("\t\t\t$useridObj.val(loginName);\r\n");
      out.write("\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$useridObj.focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction logonInWithUKey() {\r\n");
      out.write("\t\t//读cookie信息\r\n");
      out.write("\t\tvar loginName = CookieUtil.getCookie(\"loginName\");\r\n");
      out.write("\t\tvar password = CookieUtil.getCookie(\"password\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//读UKey信息\r\n");
      out.write("\t\tinitUserIdInputState();\r\n");
      out.write("\t\tukeyValue = getUkeyValue();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//每隔固定时间读取ukey信息\r\n");
      out.write("\t\treadUkey = setInterval(function(){\r\n");
      out.write("\t\t\tif($useridObj.attr(\"readonly\") != \"readonly\") {\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar __ukeyValue = getUkeyValue();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(__ukeyValue) {\r\n");
      out.write("\t\t\t\tif(__ukeyValue == $useridObj.val()) {\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$useridObj.val(__ukeyValue);\r\n");
      out.write("\t\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\t\t$(\"#logPassword\").prop(\"checked\", false);\r\n");
      out.write("\t\t\t}else {\r\n");
      out.write("\t\t\t\tMsgBox.show(\"登录请插入UKEY!\");\r\n");
      out.write("\t\t\t\t$useridObj.val(\"\");\r\n");
      out.write("\t\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},500); \r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(loginName && loginName == ukeyValue && password ) {\r\n");
      out.write("\t\t\tlogin(loginName, password, \"1\");\r\n");
      out.write("\t\t}else {\r\n");
      out.write("\t\t\t$useridObj.val(ukeyValue);\r\n");
      out.write("\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\tCookieUtil.delCookie(\"password\");\r\n");
      out.write("\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// UKEY登陆时，【用户名】录入框只读、【密码】录入框获得焦点\r\n");
      out.write("\tfunction initUserIdInputState(){\r\n");
      out.write("\t\tif(logonMode == \"1\") {\r\n");
      out.write("\t\t\t$useridObj.attr(\"readonly\",\"readonly\")\r\n");
      out.write("\t\t\t$useridObj.css({\r\n");
      out.write("\t\t\t\t\"background\" : \"#BEBEBE\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//debug模式手动录入loginName\r\n");
      out.write("\tfunction debugLoginName() {\r\n");
      out.write("\t\tif(logonMode != \"0\" && $useridObj.attr(\"readonly\") == \"readonly\") {\r\n");
      out.write("\t\t\t$useridObj.removeAttr(\"readonly\");\r\n");
      out.write("\t\t\t$useridObj.css({\r\n");
      out.write("\t\t\t\t\"background\" : \"transparent\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$useridObj.focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction onLogin() {\r\n");
      out.write("\t\tvar useridObj = document.getElementById(\"userNameInput\");\r\n");
      out.write("\t\tvar passwdObj = document.getElementById(\"userPwdInput\");\r\n");
      out.write("\t\r\n");
      out.write("\t\tpasswdObj.value = $.md5(passwdObj.value);\r\n");
      out.write("\t\tpasswdObj.value = $.md5(passwdObj.value);\r\n");
      out.write("\t\tvar passWordLogSign = $(\"#logPassword\").prop(\"checked\") ? \"1\" : \"0\";\r\n");
      out.write("\t\tlogin(useridObj.value, passwdObj.value, passWordLogSign);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 登录方法\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction login(loginName, password, passWordLogSign) {\r\n");
      out.write("\t\ttry{\r\n");
      out.write("\t\t\tvar url = new URL(\"logon.do?method=doLogon\");\r\n");
      out.write("\t\t\turl.addPara(\"userid\", loginName);\r\n");
      out.write("\t\t\turl.addPara(\"passwd\", password);\r\n");
      out.write("\t\t\turl.addPara(\"passWordLogSign\", passWordLogSign);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar msg = AjaxUtil.ajaxRequest(url.getURLString());\r\n");
      out.write("\t\t\tif(!AjaxUtil.checkException(msg)){\r\n");
      out.write("\t\t\t\tAjaxUtil.showException(msg);\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\ttry{\r\n");
      out.write("\t\t\t\tvar result  = JSON.parse(msg);\r\n");
      out.write("\t\t\t}catch(oE) {\r\n");
      out.write("\t\t\t\tMsgBox.show(msg);\r\n");
      out.write("\t\t\t\tCookieUtil.delCookie(\"password\");\r\n");
      out.write("\t\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\t\t$useridObj.val(loginName);\r\n");
      out.write("\t\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tGlobalNames.setUserSessionUuid(result.__usersession_uuid);\r\n");
      out.write("\t\t\tclearInterval(readUkey); \r\n");
      out.write("\t\t\tlocation.href = GlobalNames.compileURL('");
      out.print(requestURL);
      out.write("' + new Date().getMilliseconds());\r\n");
      out.write("\t\t}catch(oE){\r\n");
      out.write("\t\t\talert(oE.message);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.onkeydown = function(){\r\n");
      out.write("\t\tif (13 == getEvent().keyCode) {\r\n");
      out.write("\t\t\tonLogin();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
if ( !GlobalNames.LOGON_MODE.equals("0") ) {
      out.write("\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;\">\r\n");
      out.write("\t<OBJECT ID=\"UsbKeyIdentity\" type=\"application/x-qt-plugin\" \r\n");
      out.write("\t\tcodebase=\"dwUKey/DWUKEndUser.CAB#version=2,0,0,1\" \r\n");
      out.write("\t\tCLASSID=\"CLSID:48A1C49D-C6D6-4E44-9FAB-0E75A622306B\"\r\n");
      out.write("\t\twidth=\"0\" height=\"0\">\r\n");
      out.write("\t</OBJECT>\r\n");
      out.write("\t<OBJECT ID=\"UsbKeyIdentity2\" type=\"application/x-qt-plugin\"\r\n");
      out.write("\t\tCLASSID=\"CLSID:A2847849-1A97-4723-ACCF-90E4E7144419\"\r\n");
      out.write("\t\tCODEBASE=\"dwUKey/DWZFKey.CAB#version=1,0,0,1\"\r\n");
      out.write("\t\twidth=\"0\" height=\"0\">\r\n");
      out.write("\t</OBJECT>\r\n");
      out.write("\t<OBJECT ID=\"ZfNewKey\" type=\"application/x-qt-plugin\"\r\n");
      out.write("\t\tCLASSID=\"clsid:E0EBAB74-9434-44AB-B9CB-60E5E0D9C439\"\r\n");
      out.write("\t\tCODEBASE=\"dwUKey/DWZFNewKey.CAB#version=1,0,3,0\"\r\n");
      out.write("\t\twidth=\"0\" height=\"0\">\r\n");
      out.write("\t</OBJECT>\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javaScript\">\r\n");
      out.write("\r\n");
      out.write("// 获取UKey中的值\r\n");
      out.write("function getUkeyValue(){\r\n");
      out.write("\tfunction getGen1UkeyValue(){\r\n");
      out.write("\t\ttry{\r\n");
      out.write("\t\t\tvar ukeyObj = document.getElementById(\"UsbKeyIdentity\"),\r\n");
      out.write("\t\t\t\tukeyValue = null,\r\n");
      out.write("\t\t\t\tt = null;\r\n");
      out.write("\t\t\tif(ukeyObj){\r\n");
      out.write("\t\t\t\tt = ukeyObj.Card_read();\r\n");
      out.write("\t\t\t\tif( t.indexOf('Failed')<0 && t.indexOf('无')<0 ){\r\n");
      out.write("\t\t\t\t\tukeyValue = t;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn ukeyValue;\t\r\n");
      out.write("\t\t}catch(oE){\r\n");
      out.write("\t\t\treturn null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getGen2UkeyValue(){\r\n");
      out.write("\t\ttry{\r\n");
      out.write("\t\t\tvar ukeyObj = document.getElementById(\"UsbKeyIdentity2\"),\r\n");
      out.write("\t\t\t\tukeyValue = null,\r\n");
      out.write("\t\t\t\tt = null,\r\n");
      out.write("\t\t\t\tpos = null,\r\n");
      out.write("\t\t\t\tdbid = null,\r\n");
      out.write("\t\t\t\trybh = null;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(ukeyObj){\r\n");
      out.write("\t\t\t\tt = ukeyObj.readDwUkey();\r\n");
      out.write("\t\t\t\tif( t.indexOf('Failed')<0 && t.indexOf('无')<0 ){\r\n");
      out.write("\t\t\t\t\tukeyValue = t;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tpos = ukeyValue.indexOf(\";\");\r\n");
      out.write("\t\t\t\t\tdbid = ukeyValue.substring(0,pos);\r\n");
      out.write("\t\t\t\t\trybh = ukeyValue.substring(pos+1, ukeyValue.length);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn rybh;\r\n");
      out.write("\t\t}catch(oE){\r\n");
      out.write("\t\t\treturn null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar zfNewKey = document.getElementById(\"ZfNewKey\"); \r\n");
      out.write("\tvar isZfNewKey = zfNewKey.JudgeKey();\r\n");
      out.write("\t//是新的中孚key\r\n");
      out.write("\tif(isZfNewKey == 0){\r\n");
      out.write("\t\tvar resultStr = zfNewKey.FileRead(\"userid\");\r\n");
      out.write("\t\tvar result = JSON.parse(resultStr);\r\n");
      out.write("\t\tif(result.errorCode != 0){\r\n");
      out.write("\t\t\treturn null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar userid = result.fileData;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn userid || \"\";\r\n");
      out.write("\t}else {\r\n");
      out.write("\t\treturn getGen1UkeyValue() || getGen2UkeyValue() || \"\";\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>");
      out.write('\r');
      out.write('\n');
      out.write('	');
} 
      out.write("\t\t\t\r\n");
      out.write("\t</body>\r\n");
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
}
