package org.apache.jsp.jsp.workflow.component.material.scan.pub;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dareway.apps.process.component.material.MaterialNames;

public final class scanPhotoPluginInstall_jsp extends org.apache.jasper.runtime.HttpJspBase
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

   String isUseMaterial = MaterialNames.USE_MATERIAL;
   if("true".equals(isUseMaterial)){
	String exeList = MaterialNames.USEEXENOTCAB;
	int hasReadFileAndBase64 = -1;
	int hasDWScannerTwain = -1;
	int hasDWDXCapture = -1;
	int hasHTScanCtrl = -1;
	int hasSealCapNtWeb = -1;
	int hasCaptureVideo = -1;
	if(exeList!=null&&!"".equals(exeList)){
		hasReadFileAndBase64 = (","+exeList+",").indexOf(",ReadFileAndBase64,");
		hasDWScannerTwain = (","+exeList+",").indexOf(",DWScannerTwain,");
		hasDWDXCapture = (","+exeList+",").indexOf(",DWDXCapture,");
		hasHTScanCtrl = (","+exeList+",").indexOf(",HTScanCtrl,");
		hasSealCapNtWeb = (","+exeList+",").indexOf(",SealCapNtWeb,");
		hasCaptureVideo = (","+exeList+",").indexOf(",CaptureVideo,");
	}
	String scaner_type = MaterialNames.SCANER_TYPE;
	if(scaner_type!=null&&!"".equals(scaner_type)){
		Cookie[] cookie = request.getCookies();
		String yxzgpysb = "";
		for (int i = 0; i < cookie.length; i++) {
			Cookie cook = cookie[i];
			if (cook.getName().equalsIgnoreCase("yxzgpysb")) {
				yxzgpysb = cook.getValue().toString();
			}
		}
		String gpylx = yxzgpysb;
		if(gpylx==null||"".equals(gpylx)){
			String[] scanerArr = scaner_type.split(",");
			if(scanerArr.length>0){
				gpylx = scanerArr[0];
			}
		}
		if(gpylx!=null&&!"".equals(gpylx)){

      out.write("\r\n");
      out.write("\t\t\t<div style='width:0;height:0;overflow:hidden;' id='scanPhotoDivParent' >\r\n");
      out.write("\t\t\t\t<div id = \"scanPhotoDiv\" style=\"height:100%;\">\r\n");
      out.write("\t\t\t\t\t");

						if ("duoyipai".equals(gpylx)) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input id = \"scaner_type\" value=\"duoyipai\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t<div id=\"VideoChannelDivUnder\" style=\"display: block;height: 100%;\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<object classid='clsid:E34D8477-D713-4421-AB86-8C86C03EDF06' TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tHEIGHT=99% WIDTH=100% align=\"middle\" id='VideoChannelUnder'> </OBJECT>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"VideoChannelDivUpper\" style=\"display: block;height: 100%;\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<object classid='clsid:E34D8477-D713-4421-AB86-8C86C03EDF06' TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tHEIGHT=99% WIDTH=100% align=\"middle\" id='VideoChannelUpper'> </OBJECT>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"DXCaptureDiv\" style=\"display: none;height: 100%;\" align=\"center\">\r\n");
      out.write("\t\t\t\t");
 
					if(hasDWDXCapture == -1){ 
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<OBJECT ID=\"DXCapture\" TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tCLASSID=\"CLSID:49329BA5-E2E3-4959-B35B-BE2D60387478\"\r\n");
      out.write("\t\t\t\t\t\t\tCODEBASE=\"scanCab/DWDXCapture.cab#version=1,1,0,0\" HEIGHT=0 WIDTH=0>\r\n");
      out.write("\t\t\t\t\t\t</OBJECT>\r\n");
      out.write("\t\t\t\t");
 
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<OBJECT ID=\"DXCapture\" TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tCLASSID=\"CLSID:49329BA5-E2E3-4959-B35B-BE2D60387478\" HEIGHT=0 WIDTH=0>\r\n");
      out.write("\t\t\t\t\t\t</OBJECT>\r\n");
      out.write("\t\t\t\t");
 
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t");

			} else if ("nantianxb".equals(gpylx)) {
		
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input id = \"scaner_type\" value=\"nantianxb\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t<div id=\"NTXBScanCtrlDiv\" style=\"height: 100%;overflow:hidden; \" >\r\n");
      out.write("\t\t\t\t");
 
					if(hasSealCapNtWeb == -1){ 
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:1C68DF21-EFEC-4623-85E5-0C369B95F15E\" HEIGHT=60% WIDTH=99% \r\n");
      out.write("\t\t\t\t\t\t\tid=\"NTXBScanCtrl\" TYPE=\"application/x-qt-plugin\" \r\n");
      out.write("\t\t\t\t\t\t\tcodebase=\"scanCab/SealCapNtWeb.cab#version=1,8,0,0\"> </object>\r\n");
      out.write("\t\t\t\t");
 
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:1C68DF21-EFEC-4623-85E5-0C369B95F15E\" HEIGHT=60% WIDTH=99%\r\n");
      out.write("\t\t\t\t\t\t\tTYPE=\"application/x-qt-plugin\" id=\"NTXBScanCtrl\"> </object>\r\n");
      out.write("\t\t\t\t");
 
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t");

			} else if ("nantian".equals(gpylx)) {
		
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input id = \"scaner_type\" value=\"nantian\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t<div id=\"NTScanCtrlDiv\" style=\"height: 100%;overflow:hidden; \" >\r\n");
      out.write("\t\t\t\t");
 
					if(hasSealCapNtWeb == -1){ 
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:1C68DF21-EFEC-4623-85E5-0C369B95F15E\" HEIGHT=99% WIDTH=170% \r\n");
      out.write("\t\t\t\t\t\t\tid=\"NTScanCtrl\" TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tcodebase=\"scanCab/SealCapNtWeb.cab#version=1,8,0,0\"> </object>\r\n");
      out.write("\t\t\t\t");
 
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:1C68DF21-EFEC-4623-85E5-0C369B95F15E\" HEIGHT=99% WIDTH=170%\r\n");
      out.write("\t\t\t\t\t\t\tTYPE=\"application/x-qt-plugin\" id=\"NTScanCtrl\"> </object>\r\n");
      out.write("\t\t\t\t");
 
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						} else if ("hantu".equals(gpylx)) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input id = \"scaner_type\" value=\"hantu\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t<div id=\"HTScanCtrlDiv\" style=\"margin-top: 0px; margin-left: 5px; margin-right: 8px; height: 100%;\">\r\n");
      out.write("\t\t\t\t");
 
					if(hasHTScanCtrl == -1){ 
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:090457CB-DF21-41EB-84BB-39AAFC9E271A\" \r\n");
      out.write("\t\t\t\t\t\t\tid=\"HTScanCtrl\" HEIGHT=99% WIDTH=100%  TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tcodebase=\"scanCab/HTScanCtrl.cab#version=2,0,0,4\"></object>\r\n");
      out.write("\t\t\t\t");
 
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:090457CB-DF21-41EB-84BB-39AAFC9E271A\"  TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"HTScanCtrl\" HEIGHT=99% WIDTH=100% ></object>\t\r\n");
      out.write("\t\t\t\t");
 
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						} else if ("zhelin".equals(gpylx)) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input id = \"scaner_type\" value=\"zhelin\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t<div id=\"ZLScanCtrlDiv\" style=\"margin-top: 0px; margin-left: 5px; margin-right: 8px; height: 100%;\">\r\n");
      out.write("\t\t\t\t");
 
					if(hasCaptureVideo == -1){ 
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:9A73DB73-2CA3-478D-9A3F-7E9D6A8D327C\" \r\n");
      out.write("\t\t\t\t\t\t\tid=\"ZLScanCtrl\" HEIGHT=99% WIDTH=100%  TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tcodebase=\"scanCab/CaptureVideo.cab#version=1,8,19,0\"></object>\r\n");
      out.write("\t\t\t\t");
 
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:9A73DB73-2CA3-478D-9A3F-7E9D6A8D327C\"  TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"ZLScanCtrl\" HEIGHT=99% WIDTH=100% ></object>\t\r\n");
      out.write("\t\t\t\t");
 
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						} else if ("zitu".equals(gpylx)) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input id = \"scaner_type\" value=\"zitu\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t<div id=\"ZTScanCtrlDiv\" style=\"margin-top: 0px; margin-left: 5px; margin-right: 8px; height: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:3CA842C5-9B56-4329-A7CA-35CA77C7128D\" \r\n");
      out.write("\t\t\t\t\t\t\tid=\"ZTScanCtrl\" HEIGHT=99% WIDTH=100% TYPE=\"application/x-qt-plugin\"></object>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						} else if ("zitu_2".equals(gpylx)) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input id = \"scaner_type\" value=\"zitu_2\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t<div id=\"ZTScanCtrlDiv\" style=\"margin-top: 0px; margin-left: 5px; margin-right: 8px; height: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t<object classid=\"clsid:3CA842C5-9B56-4329-A7CA-35CA77C7128D\" TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"ZTScanCtrl\" HEIGHT=99% WIDTH=100%></object>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						}else if ("duoyipai588".equals(gpylx)) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input id = \"scaner_type\" value=\"duoyipai588\" style='display: none'/>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"VideoChannelDivUpper588\" style=\"display: block;height: 100%;\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<object classid='CLSID:30516390-004F-40B9-9FC6-C9096B59262E' TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\t\t\t\t\tHEIGHT=99% WIDTH=100% align=\"middle\" id='VideoChannelUpper588'> </OBJECT>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"display: none\" id=\"scanPhotoListdivParent\">\r\n");
      out.write("\t\t\t\t<div id = \"scanPhotoListdiv\">\r\n");
      out.write("\t\t\t\t\t<select id=\"scanPhotoList\" onchange=\"JSEManager.doJSInNewJSE(changeSXT)\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"display: none;position: absolute; left: 260px; top: 5px;width:118px;height:20px\">\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" defer=\"defer\">\r\n");
      out.write("\t\tvar yxzgpysb = \"");
      out.print(gpylx);
      out.write("\";\r\n");
      out.write("\t\tCookieUtil.setCookie(\"yxzgpysb\", yxzgpysb, 3600);\r\n");
      out.write("\t</script>\r\n");
  	}
	}
if(hasReadFileAndBase64 == -1){ 

      out.write(" \r\n");
      out.write("    <div style=\"height:0px;width:0px;overflow:hidden;\">\r\n");
      out.write("        <OBJECT ID=\"readFileToBase64\" WIDTH=0 HEIGHT=0 TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\tCLASSID=\"CLSID:1C07FD91-7599-47CD-B35F-D62F8AA57CED\"\r\n");
      out.write("\t\t\tcodebase=\"scanCab/ReadFileAndBase64.cab#version=1,0,2,5\">\r\n");
      out.write("\t\t</OBJECT>\r\n");
      out.write("    </div>\t\t\r\n");
 
} else {

      out.write("\r\n");
      out.write("    <div style=\"height:0px;width:0px;overflow:hidden;\">\r\n");
      out.write("\t\t<OBJECT ID=\"readFileToBase64\" WIDTH=0 HEIGHT=0 TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\tCLASSID=\"CLSID:1C07FD91-7599-47CD-B35F-D62F8AA57CED\">\r\n");
      out.write("\t\t</OBJECT>\t\r\n");
      out.write("    </div>\t\r\n");
      out.write("     ");

}

      out.write("\r\n");
      out.write("\r\n");

	String fast_scaner_type = MaterialNames.FAST_SCANER_TYPE;
	if(fast_scaner_type!=null&&!"".equals(fast_scaner_type)){

      out.write("\r\n");
      out.write("\t\t<div style=\"height:0px;width:0px;overflow:hidden;\">\r\n");
      out.write("\t");
 
		if(hasDWScannerTwain == -1){ 
	
      out.write("\r\n");
      out.write("\t\t\t<OBJECT ID=\"DWScanner\"  TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\tCLASSID=\"CLSID:384595D2-D48F-48D7-8107-BB225A229559\" \r\n");
      out.write("\t\t\t\tCODEBASE=\"scanCab/DWScannerTwain.cab#version=1,4,4,1\" WIDTH=0 HEIGHT=0 >\r\n");
      out.write("\t\t\t</OBJECT>\r\n");
      out.write("\t");
 
		} else {
	
      out.write("\r\n");
      out.write("\t\t\t<OBJECT ID=\"DWScanner\" TYPE=\"application/x-qt-plugin\"\r\n");
      out.write("\t\t\t\tCLASSID=\"CLSID:384595D2-D48F-48D7-8107-BB225A229559\" WIDTH=0 HEIGHT=0 >\r\n");
      out.write("\t\t\t</OBJECT>\t\r\n");
      out.write("\t");
 
		}
	
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\" defer=\"defer\">\r\n");
      out.write("\t\t\tvar yxzgsysb = CookieUtil.getCookie(\"yxzgsysb\");\r\n");
      out.write("\t\t\tvar fast_scaner_type = \"");
      out.print(fast_scaner_type);
      out.write("\";\r\n");
      out.write("\t\t\tvar typelist = fast_scaner_type.split(\",\");\r\n");
      out.write("\t\t\tvar firstyxzgsysb = \"\";\r\n");
      out.write("\t\t\tif (typelist.length > 0){\r\n");
      out.write("\t\t\t\tfirstyxzgsysb = typelist[0];\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (null == yxzgsysb||\"\" == yxzgsysb){\r\n");
      out.write("\t\t\t\tyxzgsysb = firstyxzgsysb\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tCookieUtil.setCookie(\"yxzgsysb\", yxzgsysb, 3600);\r\n");
      out.write("\t\t</script>\r\n");
 
	}
}

      out.write('\r');
      out.write('\n');
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
