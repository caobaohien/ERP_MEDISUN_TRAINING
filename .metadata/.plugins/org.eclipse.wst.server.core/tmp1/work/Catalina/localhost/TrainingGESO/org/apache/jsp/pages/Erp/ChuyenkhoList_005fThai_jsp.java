package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.beans.chuyenkho_thai.IChuyenkhoList;
import geso.dms.center.util.Utility;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import geso.erp.beans.chuyenkho_thai.*;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class ChuyenkhoList_005fThai_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String userId = (String) session.getAttribute("userId"); 
	String userTen = (String) session.getAttribute("userTen"); 
 
	  
      out.write('\r');
      out.write('\n');
 IChuyenkhoList obj = (IChuyenkhoList)session.getAttribute("chuyenkho"); 
      out.write("\r\n");
      out.write("\r\n");

	ResultSet dataList = (ResultSet)obj.getDataList();
	ResultSet getListKC = (ResultSet) obj.getListKC();
	ResultSet getListKN = (ResultSet) obj.getListKN(); 
	ResultSet rstrangthai = obj.rstrangthai();

      out.write('\r');
      out.write('\n');
 obj.setNextSplittings(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>SalesUp - Project</title>\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" media=\"print\"\r\n");
      out.write("\thref=\"../css/impression.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"../css/datepicker.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\" src=\"../scripts/datepicker.js\"></script>\r\n");
      out.write("<link href=\"../css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/Timepicker/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../scripts/Timepicker/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/phanTrang.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/speechbubbles.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/dropdowncontent.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.autocomplete.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.min.1.7.js\"></script>\r\n");
      out.write("<link href=\"../css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.widget.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.datepicker.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\t\t\r\n");
      out.write("\t\t\t\t$( \".days\" ).datepicker({\t\t\t    \r\n");
      out.write("\t\t\t\t\t\tchangeMonth: true,\r\n");
      out.write("\t\t\t\t\t\tchangeYear: true\t\t\t\t\r\n");
      out.write("\t\t\t\t});            \r\n");
      out.write("\t        }); \t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"..scripts/jquery-1.js\"></script>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/mybutton.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            $(\".button\").hover(function(){\r\n");
      out.write("                $(\".button img\")\r\n");
      out.write("                .animate({top:\"-10px\"}, 200).animate({top:\"-4px\"}, 200) // first jump\r\n");
      out.write("                .animate({top:\"-7px\"}, 100).animate({top:\"-4px\"}, 100) // second jump\r\n");
      out.write("                .animate({top:\"-6px\"}, 100).animate({top:\"-4px\"}, 100); // the last jump\r\n");
      out.write("            });\r\n");
      out.write("        }); \r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("            $(\".button2\").hover(function(){\r\n");
      out.write("                $(\".button2 img\")\r\n");
      out.write("                .animate({top:\"-10px\"}, 200).animate({top:\"-4px\"}, 200) // first jump\r\n");
      out.write("                .animate({top:\"-7px\"}, 100).animate({top:\"-4px\"}, 100) // second jump\r\n");
      out.write("                .animate({top:\"-6px\"}, 100).animate({top:\"-4px\"}, 100); // the last jump\r\n");
      out.write("            });\r\n");
      out.write("        }); \r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("            $(\".button3\").hover(function(){\r\n");
      out.write("                $(\".button3 img\")\r\n");
      out.write("                .animate({top:\"-10px\"}, 200).animate({top:\"-4px\"}, 200) // first jump\r\n");
      out.write("                .animate({top:\"-7px\"}, 100).animate({top:\"-4px\"}, 100) // second jump\r\n");
      out.write("                .animate({top:\"-6px\"}, 100).animate({top:\"-4px\"}, 100); // the last jump\r\n");
      out.write("            });\r\n");
      out.write("        }); \r\n");
      out.write("    </script>\r\n");
      out.write("<link href=\"../css/select2.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t     $(document).ready(function() { $(\"select\").select2();  });\t     \r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t function confirmLogout()\r\n");
      out.write("\t {\r\n");
      out.write("\t    if(confirm(\"Bạn có muốn đăng xuất?\"))\r\n");
      out.write("\t    {\r\n");
      out.write("\t\t\ttop.location.href = \"home.jsp\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    return\r\n");
      out.write("\t }\r\n");
      out.write("\t function submitform()\r\n");
      out.write("\t {  \r\n");
      out.write("\t\t document.forms[\"chuyenkho\"].action.value = \"timkiem\";\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t function taomoi()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t \r\n");
      out.write("\t\tdocument.forms[\"chuyenkho\"].action.value = \"taomoi\";\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t function print_pdf()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\tdocument.forms[\"chuyenkho\"].action.value = \"print\";\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t function clearform()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t View('chuyenkho', 1, 'refresh');\r\n");
      out.write("\t   \r\n");
      out.write("\t    document.forms[\"chuyenkho\"].trangthai.value = \"\";\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].ma.value = \"\";\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].khochuyen.value = \"\";\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].khonhan.value = \"\";\r\n");
      out.write("\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].submit();\r\n");
      out.write("\t } \r\n");
      out.write("\t function thongbao()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var tt = document.forms[\"chuyenkho\"].msg.value;\r\n");
      out.write("\t \t if(tt.length>0)\r\n");
      out.write("\t     \talert(document.forms[\"chuyenkho\"].msg.value);\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\r\n");
      out.write("\t function processing(id,chuoi)\r\n");
      out.write("\t {\r\n");
      out.write("\t \r\n");
      out.write(" \t    document.getElementById(id).innerHTML = \"<a href='#'><img src='../images/waiting.gif' width = '20' height = '20' title='cho thuc hien..' border='0' longdesc='cho thuc hien..' style='border-style:outset'> Proc...</a>\"; \t\t  \r\n");
      out.write(" \t \tdocument.getElementById(id).href=chuoi;\r\n");
      out.write(" \t }\r\n");
      out.write("\t \r\n");
      out.write("\t function processing_hoantat(id,id_lydo)\r\n");
      out.write("\t {\r\n");
      out.write("\t\tvar lydo=document.getElementById(id_lydo).value;\r\n");
      out.write("\t\tdocument.forms[\"chuyenkho\"].action.value=\"hoantatphieu\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.forms[\"chuyenkho\"].lydohoantat_.value =lydo;\r\n");
      out.write("\t\tdocument.forms[\"chuyenkho\"].idhoantat_.value =id;\r\n");
      out.write("\t    document.forms[\"chuyenkho\"].submit();\r\n");
      out.write(" \t }\r\n");
      out.write("\t \r\n");
      out.write("\t</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"chuyenkho\" method=\"post\" action=\"../../ChuyenkhoListSvl\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"userId\" value=\"");
      out.print(userId );
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"action\" value=\"1\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\tname=\"crrApprSplitting\" value=\"");
      out.print( obj.getCrrApprSplitting() );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"nxtApprSplitting\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.print( obj.getNxtApprSplitting() );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("    thongbao();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%; padding-left: 2px\">\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"header\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 70%; padding: 5px; float: left\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbnavigation\">Chuyển kho</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tChào mừng Bạn\r\n");
      out.write("\t\t\t\t\t");
      out.print( userTen );
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- <div align=\"left\" id=\"button\" style=\" border:1;width: 100%; height: 32px; padding: 1px; float: none\"  class=\"tbdarkrow\">\r\n");
      out.write(" \t\t\t<TABLE  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR class = \"tbdarkrow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t <TD width=\"40px\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"btnthem\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<A href=\"javascript:taomoi()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/add32.png\" title=\"Tìm kiếm\" alt=\"Tìm kiếm\" border=\"1px\" style=\"border-style: outset;width: 25px;height: 25px\"></A> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD width=\"40px\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"btnthem\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<A href=\"javascript:submitform()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/timkiem_e.png\" title=\"Tìm kiếm\" alt=\"Tìm kiếm\" border=\"1px\" style=\"border-style: outset;width: 25px;height: 25px\"></A> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD width=\"30px\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"btnUndo\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <A href=\"javascript:clearform()\"> <IMG  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  src=\"../images/convert.gif\" title=\"Undo\" alt=\"Undo\" border=\"1px\" style=\"border-style: outset;width: 25px;height: 25px\"></A>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t   \t\t\t\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t<div id=\"cotent\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div align=\"left\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; float: none; clear: left; font-size: 0.7em\">\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<LEGEND class=\"legendtitle\">Tiêu chí tìm kiếm &nbsp;</LEGEND>\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"6\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Mã</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" name=\"ma\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 200px\" onchange=\"submitform()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getMa());
      out.write("\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">Kho chuyển</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\"><select name=\"khochuyen\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(getListKC != null)
											  	while(getListKC.next()){
											  		if(obj.getKhochuyen().equals(getListKC.getString("Khochuyen"))){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(getListKC.getString("Khochuyen"));
      out.write('"');
      out.write('>');
      out.print(getListKC.getString("TENKHO") );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(getListKC.getString("Khochuyen"));
      out.write('"');
      out.write('>');
      out.print(getListKC.getString("TENKHO"));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
}} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Kho nhận</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\"><select name=\"khonhan\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(getListKN!=null)
									  		  while(getListKN.next()){ 
					                        	if(obj.getKhonhan().equals(getListKN.getString("Khonhan"))){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(getListKN.getString("Khonhan"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(getListKN.getString("TENKHO") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

													}else{
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(getListKN.getString("Khonhan"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(getListKN.getString("TENKHO"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

					                        	   }
 					                           }
					                    	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Trạng thái</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><select name=\"trangthai\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if(obj.getTrangthai().equals("")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Chưa chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Đã chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Đã xóa</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
} else if(obj.getTrangthai().equals("0")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\" selected=\"selected\">Chưa chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Đã chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Đã xóa</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
}else if(obj.getTrangthai().equals("1")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Chưa chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">Đã chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Đã xóa</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
}else  if(obj.getTrangthai().equals("2"))  { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Chưa chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Đã chốt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\" selected=\"selected\">Đã xóa</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"6\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\" style=\"width: 5%\" align=\"right\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"btnUndo\"> <A href=\"javascript:clearform()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"../images/button.png\" title=\"Undo\" alt=\"Undo\"width: 35px;height: 35px\"></A>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\" style=\"width: 10%\" align=\"left\">Nhập\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlại</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\" style=\"width: 85%\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<LEGEND class=\"legendtitle\">\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" cellspacing=\"1\" cellpadding=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Chuyển kho</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><span id=\"btnUndo\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:taomoi()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"../images/New30.png\" title=\"Undo\" alt=\"Undo\"width: 35px;height: 35px\"></A>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tTạo mới\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</LEGEND>\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" border=\"1\" cellspacing=\"1\" cellpadding=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<TR class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <TH align=\"center\" width=\"4%\">Số đề nghị mua hàng</TH> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"3%\">STT</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"5%\">Mã</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"8%\">Lý do chuyển</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Người tạo</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Ngày tạo</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Người sửa</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"8%\">Ngày sửa</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Tác vụ</TH>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t");
  int count=1;
				             		if(dataList != null)
				             			while(dataList.next()){
 				                		if((count % 2 ) == 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TR class='tbdarkrow'>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<TR class='tblightrow'>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(count );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(dataList.getString("Ma") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(dataList.getString("Lydochuyen") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(dataList.getString("Nguoitao") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(dataList.getString("Ngaytao") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(dataList.getString("Nguoisua") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(dataList.getString("Ngaysua") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
String tt = dataList.getString("Trangthai");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if( tt.equals("0")){ 
      out.write(" <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ChuyenkhoSvl?userId=");
      out.print(userId);
      out.write("&update=");
      out.print( dataList.getString("Ma"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/edit32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"Cap nhat\" title=\"Cập nhật\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ChuyenkhoList_Thai?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print( dataList.getString("Ma"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/DeleteRed_32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tborder=0 alt=\"Xóa\" title=\"Xóa\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"if(!confirm('Bạn muốn xóa đơn hàng này?')) return false;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ChuyenkhoList_Thai?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print( dataList.getString("Ma") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Chot.png\" width=\"20\" height=\"20\" border=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"Chốt\" title=\"Chốt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ChuyenkhoList_ThaiuserId=");
      out.print(userId);
      out.write("&delete=");
      out.print( dataList.getString("Ma") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Display.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tborder=0 alt=\"Hiển thị\" title=\"Hiển thị\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; ");
}else if( tt.equals("1")){ 
      out.write(" <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ChuyenkhoList_Thai?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print( dataList.getString("Ma") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Display.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tborder=0 alt=\"Hiển thị\" title=\"Hiển thị\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");
 count++;
				                } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
 obj.DBclose();
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
