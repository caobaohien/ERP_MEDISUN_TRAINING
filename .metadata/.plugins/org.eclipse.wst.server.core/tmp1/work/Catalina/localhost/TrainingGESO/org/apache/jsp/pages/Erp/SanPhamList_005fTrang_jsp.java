package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.beans.sanpham_trang.ISanPhamList_Trang;
import geso.erp.beans.sanpham_trang.*;
import geso.dms.center.util.Utility;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import geso.erp.beans.sanpham_trang.*;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class SanPhamList_005fTrang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

	//Lay user va ten thong qua cac session
	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");  	
	ISanPhamList_Trang obj = (ISanPhamList_Trang) session.getAttribute("obj"); //doi tuong truyen vao phai giong voi doi tuong ben
	ResultSet dataList = (ResultSet)obj.getRsDataList();
	ResultSet rsDonViTinh = (ResultSet) obj.getRsDonvi();

	obj.setNextSplittings(); 
	
	NumberFormat numberFormat = new DecimalFormat("#,###,###đ");

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
      out.write("\t \r\n");
      out.write("\t function submitform()\r\n");
      out.write("\t {  \r\n");
      out.write("\t\tdocument.forms[\"erpDmhForm\"].action.value = \"timkiem\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function taomoi()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t \r\n");
      out.write("\t\tdocument.forms[\"erpDmhForm\"].action.value = \"taomoi\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t function clearform()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t/* View('erpDmhForm', 1, 'view');  */\r\n");
      out.write("\t\tView('erpDmhForm', 1, 'timkiem');\r\n");
      out.write("\t\t\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].maDonHang.value = \"\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].trangThai.value = \"\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].khachHang.value = \"\";\r\n");
      out.write("\t    document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t } \r\n");
      out.write("\t \r\n");
      out.write("\t function thongbao()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var tt = document.forms[\"erpDmhForm\"].msg.value;\r\n");
      out.write("\t \t if(tt.length>0)\r\n");
      out.write("\t     \talert(document.forms[\"erpDmhForm\"].msg.value);\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function processing(id,chuoi)\r\n");
      out.write("\t {\r\n");
      out.write("\t \r\n");
      out.write(" \t    document.getElementById(id).innerHTML = \"<a href='#'><img src='../images/waiting.gif' width = '20' height = '20' title='cho thuc hien..' border='0' longdesc='cho thuc hien..' style='border-style:outset'> Proc...</a>\"; \t\t  \r\n");
      out.write(" \t \tdocument.getElementById(id).href=chuoi;\r\n");
      out.write(" \t }\r\n");
      out.write("\t \r\n");
      out.write("\t</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"erpDmhForm\" method=\"post\"\r\n");
      out.write("\t\taction=\"../../SanPhamList_TrangSvl\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"userId\" value=\"");
      out.print( userId );
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"action\" value=\"\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\tname=\"crrApprSplitting\" value=\"");
      out.print( obj.getCrrApprSplitting() );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"nxtApprSplitting\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.print( obj.getNxtApprSplitting() );
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"msg\" value='");
      out.print( obj.getMsg() );
      out.write("'>\r\n");
      out.write("\t\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("    thongbao();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%; padding-left: 2px\">\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"header\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 70%; padding: 5px; float: left\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbnavigation\">Danh sách đơn bán hàng</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tChào mừng Bạn\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Tạo mới\" alt=\"Tạo mới\" border=\"1px\"\r\n");
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
      out.write("\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"legendtitle\">Mã đơn hàng</span>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t\t<LEGEND class=\"legendtitle\">Tìm kiếm &nbsp;</LEGEND>\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"6\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Mã sản phẩm</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" name=\"maSanPham\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" value=\"");
      out.print(obj.getMaSanPham());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Ex: 100000\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Tên sản phẩm</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" name=\"tenSanPham\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" value=\"");
      out.print(obj.getTenSanPham());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Ex: 100000\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- lay du lieu tu method getDataDonVi() -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Đơn Vị Tính</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><select name=\"donViTinh\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonchange=\"submitform()\" style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Toàn bộ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

				                        while(rsDonViTinh.next()){
				                        	if(rsDonViTinh.getString("PK_SEQ").equals(obj.getDonViTinh())){
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(rsDonViTinh.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rsDonViTinh.getString("TEN") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

												}else{
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rsDonViTinh.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rsDonViTinh.getString("TEN"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

				                        	   }
											}
				                    	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"border: 2px solid green;\">\r\n");
      out.write("\t\t\t\t\t\t\t<TR class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <TH align=\"center\" width=\"4%\">Số đề nghị mua hàng</TH> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"2%\">STT</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"8%\">Mã Sản Phẩm</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"8%\">Tên Sản Phẩm</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"13%\">Đơn Vị</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"7%\">Số lượng</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"5%\">Giá bán</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"7%\">Trạng thái</TH>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"left\" width=\"9%\">Tác Vụ</TH>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t");

						int countRow = 0;
						
                   		if(dataList != null) {
                   			while(dataList.next()) {
                   				String style="";
                   				if((countRow % 2 ) == 0) { 
                   	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TR class='tbdarkrow'>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
	}
                   				else { 
                   			
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<TR class='tblightrow'>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

		                    	} 
		                    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"right\">");
      out.print( (countRow+1) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"left\">");
      out.print( dataList.getString("MASANPHAM") );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"left\">");
      out.print( dataList.getString("TENSANPHAM") );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"left\">");
      out.print( dataList.getString("DONVI") );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"right\">");
      out.print( numberFormat.format(dataList.getFloat("SOLUONG")) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"right\">");
      out.print( numberFormat.format(dataList.getFloat("GIABAN")) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

					                    String maTrangThai = dataList.getString("TRANGTHAI");
					                    String tenTrangThai = "";
					                    String styleTrangThai = "";
		                    		 	if (maTrangThai.equals("1")) {
		                    		 		tenTrangThai = "hoạt động";
		                    		 	}	 		
		                    		 	else {		
		                    		 		tenTrangThai = "không hoạt động";
		                    		 		styleTrangThai = "style=\"color: blue\"";
		                    		 	}
		                    		 	
				                   	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"left\" ");
      out.print( styleTrangThai );
      out.write('>');
      out.print( tenTrangThai );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=\"center\"><A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../SanPham_TrangSvl?userId=");
      out.print(userId);
      out.write("&display=");
      out.print( dataList.getString("MASANPHAM") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/Display20.png\" alt=\"Hiển thị\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"Hiển thị\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp; ");
 if (maTrangThai.equals("1")) {
      out.write(" <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../SanPham_TrangSvl?userId=");
      out.print(userId);
      out.write("&update=");
      out.print( dataList.getString("MASANPHAM") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/edit32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"Cap nhat\" title=\"Cập nhật\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A> <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../SanPhamList_TrangSvl?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print( dataList.getString("MASANPHAM"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<IMG src=\"../images/DeleteRed_32.png\" width=\"20\" height=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talt=\"Xoa don hang\" title=\"Xóa\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t</A> ");
 } 
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t");
 
		                	countRow++; } 
                   			dataList.close(); } 
		            
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

	obj.closedb();

      out.write('\r');
      out.write('\n');
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
