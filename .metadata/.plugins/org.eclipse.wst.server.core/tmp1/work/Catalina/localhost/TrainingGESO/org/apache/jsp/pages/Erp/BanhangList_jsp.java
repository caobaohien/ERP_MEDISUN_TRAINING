package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.beans.banhang.IBanhangList;
import geso.dms.center.util.Utility;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import geso.erp.beans.banhang.*;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class BanhangList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");  	
	String sum = (String) session.getAttribute("sum");
	Utility util = (Utility) session.getAttribute("util");
	  
      out.write('\r');
      out.write('\n');
 IBanhangList obj = (IBanhangList)session.getAttribute("obj"); 
      out.write("\r\n");
      out.write("\r\n");
  ResultSet dmhList = (ResultSet)obj.getDmhList();  
 NumberFormat formatter = new DecimalFormat("#,###,###");
 NumberFormat formatter1 = new DecimalFormat("#,###,###.##"); 
 
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
      out.write("\t    if(confirm(\"B???n c?? mu???n ????ng xu???t?\"))\r\n");
      out.write("\t    {\r\n");
      out.write("\t\t\ttop.location.href = \"home.jsp\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    return\r\n");
      out.write("\t }\r\n");
      out.write("\t function submitform()\r\n");
      out.write("\t {  \r\n");
      out.write("\t\t document.forms[\"erpDmhForm\"].action.value = \"timkiem\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t function newform()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\tdocument.forms[\"erpDmhForm\"].action.value = \"Tao moi\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t function print_pdf()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\tdocument.forms[\"erpDmhForm\"].action.value = \"print\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t function clearform()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t View('erpDmhForm', 1, 'view');\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].tungay.value = \"\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].trangthai.value = \"\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].sochungtu.value = \"\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].denngay.value = \"\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].khachangid.value = \"\";\r\n");
      out.write("\t    \r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t } \r\n");
      out.write("\t function thongbao()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var tt = document.forms[\"erpDmhForm\"].msg.value;\r\n");
      out.write("\t \t if(tt.length>0)\r\n");
      out.write("\t     \talert(document.forms[\"erpDmhForm\"].msg.value);\r\n");
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
      out.write("\t\tdocument.forms[\"erpDmhForm\"].action.value=\"hoantatphieu\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.forms[\"erpDmhForm\"].lydohoantat_.value =lydo;\r\n");
      out.write("\t\tdocument.forms[\"erpDmhForm\"].idhoantat_.value =id;\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write(" \t }\r\n");
      out.write("\t \r\n");
      out.write("\t</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"erpDmhForm\" method=\"post\" action=\"../../BanhangSvl\">\r\n");
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
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"lydohoantat_\" value=\"\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"idhoantat_\" value=\"\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"msg\" value='");
      out.print( obj.getmsg() );
      out.write("'>\r\n");
      out.write("\t\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("    thongbao();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%; padding-left: 2px\">\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"header\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 70%; padding: 5px; float: left\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbnavigation\">B???ng k?? b??n h??ng</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tCh??o m???ng B???n\r\n");
      out.write("\t\t\t\t\t");
      out.print( userTen );
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"cotent\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div align=\"left\" id=\"button\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border: 1; width: 100%; height: 32px; padding: 1px; float: none\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbdarkrow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<TABLE border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<TR class=\"tbdarkrow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TD width=\"40px\" align=\"left\"><span id=\"btnthem\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"javascript:newform()\"> <IMG src=\"../images/add32.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"Th??m m???i\" alt=\"Luu lai\" border=\"1px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"border-style: outset\"></A>\r\n");
      out.write("\t\t\t\t\t\t\t</span></TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TD width=\"30px\" align=\"left\"><span id=\"btnUndo\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"javascript:clearform()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/convert.gif\" title=\"Undo\" alt=\"Undo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tborder=\"1px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"border-style: outset; width: 30px; height: 30px\"></A>\r\n");
      out.write("\t\t\t\t\t\t\t</span></TD>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30px\" align=\"left\"><A\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:submitform()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/timkiem_e.png\" title=\"T??m ki???m\" alt=\"T??m ki???m\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"1px\" style=\"border-style: outset\"></A></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30px\" align=\"left\"><A\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:print_pdf()\"> <IMG src=\"../images/pdf.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"In b??o c??o\" alt=\"In b??o c??o\" border=\"1px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-style: outset; width: 30px; height: 30px\"></A>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div align=\"left\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; float: none; clear: left; font-size: 0.7em\">\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"legendtitle\"> ????n h??ng </span>&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<TR class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <TH align=\"center\" width=\"4%\">S??? ????? ngh??? mua h??ng</TH> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"7%\">M?? ??H</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"300px\">Ng??y</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"12%\">Kh??ch h??ng</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"7%\">Tr???ng th??i</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"7%\">T???ng ti???n</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"7%\">Ng??y t???o</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Ng?????i t???o</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"9%\">T??c v???</TH>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"><input value=\"");
      out.print(obj.getSochungtu());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"sochungtu\" type=\"text\" style=\"width: 100px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"><input style=\"width: 100px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"days\" id=\"tungay\" name=\"tungay\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print( obj.getTungay() );
      out.write("\" maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" /> <input style=\"width: 100px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"days\" id=\"denngay\" name=\"denngay\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print( obj.getDenngay() );
      out.write("\" maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"><input type=\"text\" name=\"khachangid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 200px\" onchange=\"submitform()\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                            String mang[] =new String[]{"0","1","2"};
                    		String mangten[] =new String[]{"Ch??a ch???t","???? ch???t","???? x??a"};
                    	
      out.write(" <select name=\"trangthai\" onchange=\"submitform()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 100px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                    	for(int j=0;j<mang.length;j++){
							 if(obj.getTrangthai().trim().equals(mang[j])){
							 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"");
      out.print(mang[j]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(mangten[j] );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

							 }else{
							 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(mang[j]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(mangten[j] );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 
							 }
						 }
                    	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

					int m = 0;
	                    
                   		if(dmhList != null)
                   		{
                   		
                   			while(dmhList.next())
                   			{  		
                   				String style="";
                   				 
                   				
                   				if((m % 2 ) == 0) { 
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
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\">");
      out.print( dmhList.getString("SOCHUNGTU") );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\">");
      out.print( dmhList.getString("NGAYCHUNGTU") );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\">");
      out.print( dmhList.getString("ten") );
      out.write("</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
String tt = dmhList.getString("trangthai");
				                   		 if( !tt.equals("2")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\" style=\"color: red\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
				                    		 String trangthai="";
					                    		if(tt.equals("0"))
					                    		{
					                    			trangthai = "Ch??a ch???t ";
					                    		 	 
					                    		}
					                    		else  if(tt.equals("1"))
					                    				trangthai = "???? ch???t";
												else   if(tt.equals("2")){
					                    						trangthai = "???? x??a";
					                    				}
				                    		 
				                    	
      out.write(' ');
      out.print( trangthai );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"right\">");
      out.print( formatter.format(dmhList.getDouble("tongtien")));
      out.write("</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\">");
      out.print( dmhList.getString("ngaytao") );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"left\">");
      out.print( dmhList.getString("nguoitao") );
      out.write("</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\"><A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../BanhangUpdateSvl?userId=");
      out.print(userId);
      out.write("&display=");
      out.print( dmhList.getString("sochungtu") );
      out.write("\"><IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/Display20.png\" alt=\"Hi???n th???\" title=\"Hi???n th???\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tborder=0></A>&nbsp; ");
 if(tt.equals("0")){ 
      out.write(" <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../BanhangUpdateSvl?userId=");
      out.print(userId);
      out.write("&update=");
      out.print( dmhList.getString("sochungtu"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/edit32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"Cap nhat\" title=\"C???p nh???t\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; <A id='chotphieu");
      out.print(dmhList.getString("sochungtu"));
      out.write("'\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"\"><img src=\"../images/Chot.png\" alt=\"Ch???t\" width=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\theight=\"20\" title=\"Ch???t\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"if(!confirm('B???n c?? mu???n ch???t ????n h??ng n??y?')) {return false ;}else{ processing('");
      out.print("chotphieu"+dmhList.getString("sochungtu"));
      out.write("' , '../../BanhangSvl?userId=");
      out.print(userId);
      out.write("&chot=");
      out.print( dmhList.getString("sochungtu"));
      out.write("');}\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</A> <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../BanhangSvl?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print( dmhList.getString("sochungtu") );
      out.write("\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/DeleteRed_32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tborder=0 alt=\"X??a Qu???n l?? mua h??ng\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"X??a Qu???n l?? mua h??ng\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"if(!confirm('B???n c?? mu???n x??a ????n mua h??ng n??y?')) return false;\"></A>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} 
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t");
 m++; } dmhList.close(); } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"tbfooter\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\" valign=\"middle\" colspan=\"13\" class=\"tbfooter\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if(obj.getNxtApprSplitting() >1) {
      out.write(" <img alt=\"Trang Dau\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/first.gif\" style=\"cursor: pointer;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"View('erpDmhForm', 1, 'view')\"> &nbsp; ");
}else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"Trang Dau\" src=\"../images/first.gif\"> &nbsp; ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if(obj.getNxtApprSplitting() > 1){ 
      out.write(" <img alt=\"Trang Truoc\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/prev.gif\" style=\"cursor: pointer;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"Prev('erpDmhForm', 'prev')\"> &nbsp; ");
}else{ 
      out.write(" <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"Trang Truoc\" src=\"../images/prev_d.gif\"> &nbsp; ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

								int[] listPage = obj.getNextSplittings();
								for(int i = 0; i < listPage.length; i++){
							
      out.write(' ');
 							
							
							if(listPage[i] == obj.getNxtApprSplitting()){ 
      out.write(" <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: white;\">");
      out.print( listPage[i] );
      out.write('/');
      out.write(' ');
      out.print(obj.getTheLastSplitting() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}else{ 
      out.write(" <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"javascript:View('erpDmhForm', ");
      out.print( listPage[i] );
      out.write(", 'view')\">");
      out.print( listPage[i] );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} 
      out.write(" <input type=\"hidden\" name=\"list\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print( listPage[i] );
      out.write("\" /> &nbsp; ");
} 
      out.write(' ');
 if(obj.getNxtApprSplitting() < obj.getTheLastSplitting()){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp; <img alt=\"Trang Tiep\" src=\"../images/next.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"cursor: pointer;\" onclick=\"Next('erpDmhForm', 'next')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp; ");
}else{ 
      out.write(" &nbsp; <img alt=\"Trang Tiep\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/next_d.gif\"> &nbsp; ");
} 
      out.write(' ');
if(obj.getNxtApprSplitting() == obj.getTheLastSplitting()) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"Trang Cuoi\" src=\"../images/last.gif\"> &nbsp; ");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"Trang Cuoi\" src=\"../images/last.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"cursor: pointer;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"View('erpDmhForm', -1, 'view')\"> &nbsp; ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
