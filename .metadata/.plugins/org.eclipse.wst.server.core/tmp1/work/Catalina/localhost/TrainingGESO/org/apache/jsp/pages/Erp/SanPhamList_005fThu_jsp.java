package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.beans.sanpham_thu.ISanPhamList_Thu;
import geso.erp.beans.sanpham_nhom2.ISanphamList;
import geso.dms.center.util.Utility;
import java.util.Iterator;
import java.text.DecimalFormat;
import java.sql.ResultSet;
import java.text.NumberFormat;

public final class SanPhamList_005fThu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	
	ISanPhamList_Thu obj = (ISanPhamList_Thu)session.getAttribute("obj"); 
	ResultSet dataList = (ResultSet)obj.getRsSanPham();
	ResultSet rsdonvi=obj.getRsDonVi();
	obj.setNextSplittings(); 
	NumberFormat numberFormat = new DecimalFormat("#,###,###");

      out.write("\r\n");
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
      out.write("\t\t //javascrip:\r\n");
      out.write("\t\t document.forms[\"sanphamlist\"].action.value = \"timkiem\";\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t function taomoi()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t \r\n");
      out.write("\t\tdocument.forms[\"sanphamlist\"].action.value = \"taomoi\";\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t function print_pdf()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\tdocument.forms[\"sanphamlist\"].action.value = \"print\";\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t function clearform()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t document.forms[\"sanphamlist\"].action.value = \"timkiem\";\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].trangthai.value = \"\";\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].ma.value = \"\";\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].ten.value = \"\";\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].submit();\r\n");
      out.write("\t } \r\n");
      out.write("\t function thongbao()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var tt = document.forms[\"sanphamlist\"].msg.value;\r\n");
      out.write("\t \t if(tt.length>0)\r\n");
      out.write("\t     \talert(\"THONG BAO LOI\"+document.forms[\"sanphamlist\"].msg.value);\r\n");
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
      out.write("\t\tdocument.forms[\"sanphamlist\"].action.value=\"hoantatphieu\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.forms[\"sanphamlist\"].lydohoantat_.value =lydo;\r\n");
      out.write("\t\tdocument.forms[\"sanphamlist\"].idhoantat_.value =id;\r\n");
      out.write("\t    document.forms[\"sanphamlist\"].submit();\r\n");
      out.write(" \t }\r\n");
      out.write("\t \r\n");
      out.write("\t</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"sanphamlist\" method=\"post\" action=\"../../SanPhamSvl_Thu\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"userId\" value=\"");
      out.print(userId );
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"action\" value=\"\"> <input type=\"hidden\"\r\n");
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
      out.write("\t\t\t\t\tclass=\"tbnavigation\">Danh Sách Sản Phẩm</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tChào Mừng Bạn\r\n");
      out.write("\t\t\t\t\t");
      out.print( userTen );
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"button\"\r\n");
      out.write("\t\t\t\tstyle=\"border: 1; width: 100%; height: 32px; padding: 1px; float: none\"\r\n");
      out.write("\t\t\t\tclass=\"tbdarkrow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TABLE border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<TR class=\"tbdarkrow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"40px\" align=\"left\"><span id=\"btnthem\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:taomoi()\"> <IMG src=\"../images/add32.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Tìm kiếm\" alt=\"Tìm kiếm\" border=\"1px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-style: outset; width: 25px; height: 25px\"></A>\r\n");
      out.write("\t\t\t\t\t\t</span></TD>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"40px\" align=\"left\"><span id=\"btnthem\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:submitform()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/timkiem_e.png\" title=\"Tìm kiếm\" alt=\"Tìm kiếm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"1px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-style: outset; width: 25px; height: 25px\"></A>\r\n");
      out.write("\t\t\t\t\t\t</span></TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"30px\" align=\"left\"><span id=\"btnUndo\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:clearform()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/convert.gif\" title=\"Undo\" alt=\"Undo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"1px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-style: outset; width: 25px; height: 25px\"></A>\r\n");
      out.write("\t\t\t\t\t\t</span></TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div></div>\r\n");
      out.write("\t\t\t<div id=\"cotent\" style=\"width: 100%; float: none\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div align=\"left\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; float: none; clear: left; font-size: 0.7em\">\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;<span class=\"legendtitle\"> SẢN PHẨM </span>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<LEGEND class=\"legendtitle\">Các Tiêu Chí Tiềm Kiếm &nbsp;</LEGEND>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"8\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Mã Sản Phẩm :</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\" align=\"left\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"maSanPham\" style=\"width: 200px\" onchange=\"submitform()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getMaSanPham());
      out.write("\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Tên Sản Phẩm</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\" align=\"left\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"tenSanPham\" style=\"width: 200px\" onchange=\"submitform()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getTenSanPham());
      out.write("\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Đơn vị tính</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\" align=\"left\"><select name=\"tenDonVi\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Toàn bộ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 
								    				  if(rsdonvi!=null)
								    				  while(rsdonvi.next()) { 
								    				  
								    					  	if(rsdonvi.getString("MADONVI").equals(obj.getMaDoVi())){
								    					 	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(rsdonvi.getString("MADONVI"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rsdonvi.getString("TENDONVI"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
  		
								    					  	}else{
								    				  
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rsdonvi.getString("MADONVI"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rsdonvi.getString("TENDONVI"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
  }
								    		   		} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" border=\"1\" cellspacing=\"1\" cellpadding=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<TR class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <TH align=\"center\" width=\"4%\">Số đề nghị mua hàng</TH> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"3%\">Số TT</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Mã</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"25%\">Tên</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"8%\">Đơn vị</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Số Lượng</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Gía bán</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"15%\">Trạng thái</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Tác vụ</TH>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
  
				                int count=1;
				                    if(dataList!=null)
				                while(dataList.next()) {  
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
      out.write("\t\t\t\t\t\t\t\t<th align=\"center\">");
      out.print(count);
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>");
      out.print(dataList.getString("MASANPHAM") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th align=\"left\">");
      out.print(dataList.getString("TENSANPHAM") );
      out.write("</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<th align=\"center\">");
      out.print(dataList.getString("TENDONVI") );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th align=\"right\">");
      out.print(numberFormat.format(dataList.getFloat("SOLUONG")));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th align=\"right\">");
      out.print(numberFormat.format(dataList.getFloat("GIABAN")));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \txet trạng thái 1 hoạt động, 0 ngưng hoạt động -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

				                		String matrangthai=dataList.getString("TRANGTHAI");
				                		String tentrangthai="";
				                		String styletrangthai="";
				                		if(matrangthai.equals("1")){
				                			tentrangthai=" Hoạt Động" ;
				                			styletrangthai= "style=\"color: blue\"";
				                		}
				                		else{
				                			tentrangthai="Ngưng Hoạt Động";
				                			styletrangthai= "style=\"color: red\"";
				                		}	
				                		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \tgọi ra để dùng -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<th align=\"center\" ");
      out.print(styletrangthai );
      out.write('>');
      out.print(tentrangthai );
      out.write("</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- TÁC VỤ HIỂN THỊ LINK TỚI TRANG SVL NEW-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\"><A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../SanPhamNewSvl_Thu?userId=");
      out.print(userId);
      out.write("&display=");
      out.print( dataList.getString("MASANPHAM") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/Display20.png\" alt=\"Hiển thị\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"Hiển thị\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; <!-- NẾU LÀ ĐANG HOẠT ĐỘNG CÓ THỂ SỬA HOẶC XÓA (CHUYỂN CHẾ ĐỘ TRẠNG THÁI LẠI LÀ NGƯNG HOẠT ĐỘNG) -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if(matrangthai.equals("1")){
      out.write(" <!-- TÁC VỤ HIỂN THỊ LINK TỚI TRANG SVL NEW-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../SanPhamNewSvl_Thu?userId=");
      out.print(userId);
      out.write("&update=");
      out.print( dataList.getString("MASANPHAM") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/edit32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"Cap nhat\" title=\"Cập nhật\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; <!-- TÁC VỤ xóa LINK TỚI TRANG SVL TỔNG --> <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../SanPhamSvl_Thu?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print( dataList.getString("MASANPHAM"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/DeleteRed_32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"Xoa san pham\" title=\"Xóa\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");
 
				                count++;
				                } 
      out.write("\r\n");
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
							 	if(listPage!=null){
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
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
