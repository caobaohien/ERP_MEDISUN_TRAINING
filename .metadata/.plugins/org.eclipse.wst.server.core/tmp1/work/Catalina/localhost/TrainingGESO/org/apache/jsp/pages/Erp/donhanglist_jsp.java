package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import geso.training.bean.donhang.IDonHangList;
import geso.training.bean.donhang.imp.DonHangList;
import java.sql.ResultSet;

public final class donhanglist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	//lay gia tri session
	IDonHangList ob =(IDonHangList)session.getAttribute("ob");
	String userId=(String)session.getAttribute("userId");
	String userTen=(String)session.getAttribute("userTen");
	//lay danh sach khach hang va don hang
	ResultSet khRs=ob.getKhRs();
	ResultSet dhRs=ob.getDhRs();
	//String userId=obj.getUserId();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Best-Project</title>\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/speechbubbles.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/dropdowncontent.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.autocomplete.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<LINK rel=\"stylesheet\"type=\"text/css\" media=\"print\" href=\"../css/impression.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\"type=\"text/css\" href=\"../css/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\"type=\"text/css\" href=\"../css/mybutton.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"..scripts/jquery-1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.min.1.7.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"type=\"text/css\" href=\"../css/jquery-ui.css\">\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.widget.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.datepicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\".days\").datepicker({\r\n");
      out.write("\t\t\tchangeMonth:true,\r\n");
      out.write("\t\t\tchangeYear:true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/select2.css\">\r\n");
      out.write("<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"select\").select2();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
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
      out.write("<script language=\"javascript\"type=\"text/javascript\">\r\n");
      out.write("\tfunction submitform()\r\n");
      out.write("\t{  \r\n");
      out.write("\t\tdocument.forms[\"donhanglist\"].action.value = \"timkiem\";\r\n");
      out.write("\t   \tdocument.forms[\"donhanglist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction searchform()\r\n");
      out.write("\t{  \r\n");
      out.write("\t\tdocument.forms[\"donhanglist\"].action.value = \"search\";\r\n");
      out.write("\t   \tdocument.forms[\"donhanglist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction newform(){\r\n");
      out.write("\t\tdocument.forms[\"donhanglist\"].action.value=\"moi\";\r\n");
      out.write("\t\tdocument.forms[\"donhanglist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction clearform()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t/* View('donhanglist', 1, 'view');  */\r\n");
      out.write("\t\t//View('donhanglist', 1, 'view');\r\n");
      out.write("\t\t\r\n");
      out.write("\t   \r\n");
      out.write("\t    document.forms[\"donhanglist\"].sodonhang.value = \"\";\r\n");
      out.write("\t    //document.forms[\"donhanglist\"].khId.value = \"\";\r\n");
      out.write("\t    document.forms[\"donhanglist\"].submit();\r\n");
      out.write("\t } \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"donhanglist\" method=\"post\" action=\"../../Donhanglistsvl\">\r\n");
      out.write("<input type=\"hidden\" name=\"userId\" value=\"");
      out.print( userId );
      out.write("\"> \r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"1\">\r\n");
      out.write("\t<table width=\"100%\"height=\"100%\"cellspacing=\"0\"cellpadding=\"0\"border=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"4\"align='left'valign='top'bgcolor=\"#FFFFFF\"><!-- begin body Dossier-->\r\n");
      out.write("\t\t\t<table width=\"100%\" cellpadding=\"0\"border=\"0\">\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"left\"class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\"cellpadding=\"0\"cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"left\"class=\"tbnavigation\">&nbsp;Xử lý đơn hàng > Đơn hàng bán\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<LEGEND class=\"legendtitle\">&nbsp;Tiêu chí tìm kiếm</LEGEND>\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\"cellpadding=\"6\"cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">Từ ngày</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\"class=\"days\"size=\"11\"id=\"tungay\"name=\"tungay\"maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\t\treadonly/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">Đến ngày</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\"class=\"days\"size=\"11\"id=\"denngay\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"denngay\"maxlength=\"10\"readonly/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">Mã đơn hàng</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\"name=\"sodonhang\"value=\"");
      out.print(ob.getMadh());
      out.write("\"size=\"11\"placeholder=\"Ex: 100000\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">Mã/tên khách hàng</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select onchange=\"submitform()\"name=\"khId\"id=\"khId\"style=\"width:206px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\">Toàn bộ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if(khRs!=null){
										try{while(khRs.next()){
											if(khRs.getString("PK_SEQ").equals(ob.getKhachhang())){
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(khRs.getString("PK_SEQ"));
      out.write('"');
      out.write('>');
      out.print(khRs.getString("TEN") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    ");

										}else{
									
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(khRs.getString("PK_SEQ"));
      out.write('"');
      out.write('>');
      out.print(khRs.getString("TEN"));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

										}
										}
										}catch(SQLException e){
											e.printStackTrace();
										}
									}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"plainlabel\"colspan=\"3\">&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button2\" href=\"javascript:searchform()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img style=\"top:-4px;\"src=\"../images/Search30.png\"alt=\"\">Tìm kiếm</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button2\" href=\"javascript:clearform()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img style=\"top:-4px;\"src=\"../images/button.png\"title=\"Undo\"alt=\"Undo\">Nhập lại</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<LEGEND class=\"legendtitle\">Đơn hàng bán&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<a class=\"button3\" onclick=\"newform()\">\r\n");
      out.write("\t\t\t\t\t<img style=\"top:-4px;\" src=\"../images/New.png\" alt=\"\">Tạo mới</a>\r\n");
      out.write("\t\t\t\t\t</LEGEND>\r\n");
      out.write("\t\t\t\t\t\t<table class=\"\"width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"98%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100%\" cellspacing=\"1px\" cellpadding=\"4px\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"6%\" align=\"center\">Mã DH</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Khách hàng</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Tổng tiền</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"9%\" align=\"center\">Trạng thái</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Ngày đơn hàng</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"8%\" align=\"center\">Ngày tạo</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Người tạo</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"8%\" align=\"center\">Ngày sửa</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"15%\" align=\"center\">Người sửa</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Tác vụ</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											if(dhRs!=null){
												while(dhRs.next()){
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr style=\"font-size:14px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("PK_SEQ"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("TEN"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("TONGGIATRI"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
 String trangthai="";
													if(dhRs.getString("TRANGTHAI").equals("0"))
														trangthai="Chưa chốt";
													else if(dhRs.getString("TRANGTHAI").equals("1"))
														trangthai="Đã chốt";
													else
														trangthai="Đã hủy";
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(trangthai);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("NGAYNHAP"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("NGAYTAO"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("NGUOITAO"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("NGAYSUA"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(dhRs.getString("NGUOISUA"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"../../DonhangUpdatesvl?userId=");
      out.print(userId);
      out.write("&display=");
      out.print(dhRs.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Display20.png\"width=\"25\"height=\"25\"alt=\"Hien thi\"title=\"hien thi\"border=0></a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonhangUpdatesvl?userId=");
      out.print(userId);
      out.write("&update=");
      out.print(
													dhRs.getString("PK_SEQ"));
      out.write("\"><img src=\"../images/Edit20.png\"width=\"25\"height=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"Cập nhật\"title=\"Cập nhật\"border=\"0\"></a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonhangUpdatesvl?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print(dhRs.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Delete20.png\"width=\"25\"height=\"25\"alt=\"Xóa\"title=\"Xóa\"border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"if(!confirm('Bạn có muốn xóa đơn hàng này không?'))return false;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

												}
											}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\t\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
 
if(khRs!=null)
	khRs.close();
if(dhRs!=null)
	dhRs.close();
session.setAttribute("ob", null);
ob.DBClose(); 

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
