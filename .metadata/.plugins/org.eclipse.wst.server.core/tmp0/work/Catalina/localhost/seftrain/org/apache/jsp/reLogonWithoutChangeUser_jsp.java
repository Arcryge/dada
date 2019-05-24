package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.util.CurrentUser;
import com.dareway.framework.common.GlobalNames;
import com.dareway.framework.common.BusinessNames;

public final class reLogonWithoutChangeUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
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

	String logonMode = GlobalNames.LOGON_MODE;

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
      out.write("\t\t\r\n");
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
      out.write("\t\t<script type=\"text/javascript\" charset=\"UTF-8\" src=\"./widgets/layer/layer.js?_=");
      out.print(version );
      out.write("\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<img class=\"dw-logon-bg\" src=\"./images/logon/body_bg.jpg\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<div class=\"dw-logon-form\"> \r\n");
      out.write("\t\t\t<input type=\"text\" id=\"userNameInput\" class=\"dw-logon-form-loginname\"/>\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"userPwdInput\" class=\"dw-logon-form-pwd\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" id=\"logonBtn\" class=\"dw-logon-form-btnlogin\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
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
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javaScript\">\r\n");
      out.write("\t(function(){\r\n");
      out.write("\t\tvar $useridObj = $(\"#userNameInput\"),\r\n");
      out.write("\t\t\t$passwdObj = $(\"#userPwdInput\"),\r\n");
      out.write("\t\t\t$logonBtn = $(\"#logonBtn\"),\r\n");
      out.write("\t\t\tlogonMode = '");
      out.print(logonMode);
      out.write("',\r\n");
      out.write("\t\t\treadUkey = null;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\tvar loginName = CookieUtil.getCookie(\"loginName\");\r\n");
      out.write("\t\t\tvar password = CookieUtil.getCookie(\"password\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$useridObj.attr(\"readonly\",\"readonly\")\r\n");
      out.write("\t\t\t$useridObj.css({\r\n");
      out.write("\t\t\t\t\"background\" : \"#BEBEBE\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$logonBtn.bind(\"click\", function(){\r\n");
      out.write("\t\t\t\tonLogin();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(loginName) {\r\n");
      out.write("\t\t\t\t$useridObj.val(loginName);\r\n");
      out.write("\t\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tif(logonMode != \"0\") {\r\n");
      out.write("\t\t\t\tvar __ukeyValue = getUkeyValue();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(__ukeyValue == $useridObj.val() && password) {\r\n");
      out.write("\t\t\t\t\tlogin(__ukeyValue, password, \"1\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//每隔固定时间读取ukey信息\r\n");
      out.write("\t\t\t\treadUkey = setInterval(function(){\r\n");
      out.write("\t\t\t\t\t__ukeyValue = getUkeyValue();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(__ukeyValue) {\r\n");
      out.write("\t\t\t\t\t\tif(__ukeyValue == $useridObj.val()) {\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(__ukeyValue != loginName) {\r\n");
      out.write("\t\t\t\t\t\t\tMsgBox.show(\"您插入的ukey是\"+__ukeyValue+\"的ueky,请更换为\"+loginName+\"的ukey!\");\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}else {\r\n");
      out.write("\t\t\t\t\t\tMsgBox.show(\"登录请插入\"+loginName+\"的UKEY!\");\r\n");
      out.write("\t\t\t\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\t\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},500); \r\n");
      out.write("\t\t\t}else {\r\n");
      out.write("\t\t\t\tif(loginName && password) {\r\n");
      out.write("\t\t\t\t\tlogin(loginName, password, \"1\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction onLogin() {\r\n");
      out.write("\t\t\tvar useridObj = document.getElementById(\"userNameInput\");\r\n");
      out.write("\t\t\tvar passwdObj = document.getElementById(\"userPwdInput\");\r\n");
      out.write("\t\t\tpasswdObj.value = $.md5(passwdObj.value);\r\n");
      out.write("\t\t\tpasswdObj.value = $.md5(passwdObj.value);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(logonMode != \"0\") {\r\n");
      out.write("\t\t\t\tif(getUkeyValue() == useridObj.value) {\r\n");
      out.write("\t\t\t\t\tlogin(useridObj.value, passwdObj.value, \"0\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else {\r\n");
      out.write("\t\t\t\tlogin(useridObj.value, passwdObj.value, \"0\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t * 登录方法\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\tfunction login(loginName, password, passWordLogSign) {\r\n");
      out.write("\t\t\ttry{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar url = new URL(\"logon.do?method=doLogon\");\r\n");
      out.write("\t\t\t\turl.addPara(\"userid\", loginName);\r\n");
      out.write("\t\t\t\turl.addPara(\"passwd\", password);\r\n");
      out.write("\t\t\t\turl.addPara(\"passWordLogSign\", passWordLogSign);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar msg = AjaxUtil.ajaxRequest(url.getURLString());\r\n");
      out.write("\t\t\t\tif(!AjaxUtil.checkException(msg)){\r\n");
      out.write("\t\t\t\t\tAjaxUtil.showException(msg);\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\ttry{\r\n");
      out.write("\t\t\t\t\tvar result  = JSON.parse(msg);\r\n");
      out.write("\t\t\t\t}catch(oE) {\r\n");
      out.write("\t\t\t\t\tMsgBox.show(msg);\r\n");
      out.write("\t\t\t\t\tCookieUtil.delCookie(\"password\");\r\n");
      out.write("\t\t\t\t\t$passwdObj.val(\"\");\r\n");
      out.write("\t\t\t\t\t$useridObj.val(loginName);\r\n");
      out.write("\t\t\t\t\t$passwdObj.focus();\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tGlobalNames.setUserSessionUuid(result.__usersession_uuid);\r\n");
      out.write("\t\t\t\tclearInterval(readUkey); \r\n");
      out.write("\t\t\t\tlocation.href = GlobalNames.compileURL(\"mainFrame.jsp\");\r\n");
      out.write("\t\t\t}catch(oE){\r\n");
      out.write("\t\t\t\talert(oE.message);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.onkeydown = function(){\r\n");
      out.write("\t\t\tif (13 == getEvent().keyCode) {\r\n");
      out.write("\t\t\t\tonLogin();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t}());\r\n");
      out.write("\t\r\n");
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
