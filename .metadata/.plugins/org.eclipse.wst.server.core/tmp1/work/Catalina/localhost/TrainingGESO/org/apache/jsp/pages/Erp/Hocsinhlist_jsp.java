package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.training.bean.hocsinh.IHocSinhList;
import java.sql.ResultSet;

public final class Hocsinhlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

// lay gia tri session
	IHocSinhList ob = (IHocSinhList)session.getAttribute("ob");
	String userId = (String)session.getAttribute("userId");
	String userTen =(String)session.getAttribute("userTen");
// lay danh sach lop
	ResultSet RsLop = ob.getRsLop();
	ResultSet RsHocSinhList = ob.getRsHocSinhList();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>SalesUp - Project</title>\r\n");
      out.write("\t<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/mybutton.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../scripts/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"../css/select2.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() { $(\"select\").select2(); });\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<Script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tfunction submitform(){\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].action.value = \"timkiem\";\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction newform(){\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].action.value = \"taomoi\";\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t</Script>\r\n");
      out.write("\t<!--<TITLE>Best - Project</TITLE>\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" media=\"print\" href=\"../css/impression.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/mybutton.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.min.1.7.js\"></script>\r\n");
      out.write("<link href=\"../css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.widget.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.datepicker.js\"\r\n");
      out.write("type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("$( \".days\" ).datepicker({\r\n");
      out.write("changeMonth: true,\r\n");
      out.write("changeYear: true\r\n");
      out.write("});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"../css/select2.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("$(\"select:not(.notuseselect2)\").select2({ width: 'resolve' });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<SCRIPT language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("</SCRIPT>-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"hocsinhlist\" method=\"post\" action=\"../../HocSinhsvl\">\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"1\"/>\r\n");
      out.write(" <div id=\"main\" style=\"width:99%; padding-left:2px; padding-bottom:2px\">\r\n");
      out.write("  <div align=\"left\" id=\"header\" style=\"width:100%; float:none\">\r\n");
      out.write("\t<div style=\"width:100%; padding:5px; float:left;font-size:14px\" class=\"tbnavigation\">\r\n");
      out.write("\t\tQuản lý học sinh\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div align=\"right\" style=\"width:100%; padding:5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\tHello guys ");
      out.print(userTen);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </div>\r\n");
      out.write("<div id=\"cotent\" style=\"width:100%; float:none\">\r\n");
      out.write(" <div align=\"left\" style=\"width:100%; float:none; clear:left; font-size:0.7em\">\r\n");
      out.write("<!--<TABLE width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("height=\"100%\">\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td colspan=\"4\" align='left' valign='top' bgcolor=\"#FFFFFF\">\r\n");
      out.write(" <TABLE width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td>-->\r\n");
      out.write(" <fieldset>\r\n");
      out.write("\t<LEGEND class=\"legendtitle\">Tiêu chí tìm kiếm&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class = \"button3\" onclick=\"newform()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img style=\"top:-4px;\" src=\"../images/New.png\" alt=\"\">Tạo Mới</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</LEGEND>\r\n");
      out.write("\t<TABLE class=\"\"width=\"100%\" cellpadding=\"6\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<TD class=\"plainlabel\">Tên lớp </TD>\r\n");
      out.write("\t\t\t<TD class=\"plainlabel\">\r\n");
      out.write("\t\t\t<select name=\"lop\" id=\"lop\" style=\"width:200px\" onchange=\"submitform()\">\r\n");
      out.write("\t\t\t\t<option value=\"\">Chọn Lớp</option>\r\n");
      out.write("\t\t\t");

			  if(RsLop!=null){
				  while(RsLop.next()){
					  if(ob.getMaLop().equals(RsLop.getString("PK_SEQ"))){
						  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  <option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t   value=\"");
      out.print(RsLop.getString("PK_SEQ"));
      out.write('"');
      out.write('>');
      out.print(RsLop.getString("TENLOP"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </option>\r\n");
      out.write("\t\t\t\t\t\t  ");

					  }
					  else{
						  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  <option\r\n");
      out.write("\t\t\t\t\t\t   value=\"");
      out.print(RsLop.getString("PK_SEQ"));
      out.write('"');
      out.write('>');
      out.print(RsLop.getString("TENLOP"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </option>\r\n");
      out.write("\t\t\t\t\t\t  ");

					  }
				  }
			  }
			
      out.write("\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t   </tr>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<!--</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>-->\r\n");
      out.write("<fieldset>\r\n");
      out.write("<TABLE width=\"100%\" border=\"1\" cellspacing=\"1\" cellpadding=\"4\">\r\n");
      out.write("<TR class=\"tbheader\">\r\n");
      out.write("<TH align=\"center\" width=\"20%\">Mã HS </TH>\r\n");
      out.write("<TH align=\"center\" width=\"50%\">Tên HS</TH>\r\n");
      out.write("<TH align=\"center\" width=\"10%\">Tên Lớp</TH>\r\n");
      out.write("<TH align=\"center\" width=\"20%\">Tác Vụ</TH>\r\n");
      out.write("</TR>\r\n");
      out.write("            ");

				if(RsHocSinhList!=null){
					while(RsHocSinhList.next()){
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr style=\"font-size:14px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(RsHocSinhList.getString("MAHS"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(RsHocSinhList.getString("TENHS") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(RsHocSinhList.getString("TENLOP") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../HocsinhUpdatesvl?userId=");
      out.print(userId);
      out.write("&delete=");
      out.print(RsHocSinhList.getString("MAHS"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"../images/Delete20.png\" width=\"25\" height=\"25\" alt=\"Xóa học sinh\" title=\"Xóa học sinh\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"if(!confirm('Bạn có muốn xóa học sinh này?'))return false;\" border=0/>Xóa\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../HocsinhUpdatesvl?userId=");
      out.print(userId);
      out.write("&update=");
      out.print(RsHocSinhList.getString("MAHS"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"../images/Edit20.png\" width=\"25\"height=\"25\" alt=\"cap nhat\" title=\"cập nhật\"border=0/>Sửa\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class = \"button3\" onclick=\"newform()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img style=\"top:-4px\" src=\"../images/New.png\" alt=\"\"width=\"25\"height=\"25\" border=0/>Tạo Mới\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");

					}
				}
			
      out.write("\r\n");
      out.write("</TABLE>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<!--</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</TABLE>-->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
