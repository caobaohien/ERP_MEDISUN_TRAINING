package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.beans.report.Ireport;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public final class DoanhSoTheoTinh_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Ireport obj = (Ireport)session.getAttribute("obj"); 
      out.write("\r\n");
      out.write("\r\n");
 String userId = (String) session.getAttribute("userId");  
      out.write('\r');
      out.write('\n');
 String userTen = (String) session.getAttribute("userTen");  
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Diageo - Project</title>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"../scripts/dropdowncontent.js\"></script>\r\n");
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
      out.write("\t { \r\n");
      out.write("\t\t document.forms[\"erpDmhForm\"].action.value = \"submit\";\r\n");
      out.write("\t     document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function locsanpham()\r\n");
      out.write("\t {   \r\n");
      out.write("\t\t document.forms[\"erpDmhForm\"].action.value = \"search\";\r\n");
      out.write("\t     document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("\t function thongbao()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var tt = document.forms[\"erpDmhForm\"].msg.value;\r\n");
      out.write("\t \t if(tt.length>0)\r\n");
      out.write("\t     \talert(document.forms[\"erpDmhForm\"].msg.value);\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function sellectAll()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var chkAll = document.getElementById(\"chkAll\");\r\n");
      out.write("\t\t var spIds = document.getElementsByName(\"spIds\");\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t if(chkAll.checked)\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\t for(i = 0; i < spIds.length; i++)\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t spIds.item(i).checked = true;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t else\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\t for(i = 0; i < spIds.length; i++)\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t spIds.item(i).checked = false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function sellectAll2()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var chkAll = document.getElementById(\"chkAll2\");\r\n");
      out.write("\t\t var spIds = document.getElementsByName(\"clIds\");\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t if(chkAll.checked)\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\t for(i = 0; i < spIds.length; i++)\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t spIds.item(i).checked = true;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t else\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\t for(i = 0; i < spIds.length; i++)\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t spIds.item(i).checked = false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t }\r\n");
      out.write("\t function sellectAll3()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var chkAll = document.getElementById(\"chkAll3\");\r\n");
      out.write("\t\t var spIds = document.getElementsByName(\"ndxIds\");\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t if(chkAll.checked)\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\t for(i = 0; i < spIds.length; i++)\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t spIds.item(i).checked = true;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t else\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\t for(i = 0; i < spIds.length; i++)\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t\t spIds.item(i).checked = false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t }\r\n");
      out.write("\t</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"erpDmhForm\" method=\"post\" action=\"../../DoanhSoTheoTinhSvl\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"userId\" value=\"");
      out.print( userId );
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"userTen\" value=\"");
      out.print( userTen );
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"action\" value=\"1\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\tname=\"khoTen\" id=\"khoTen\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%; padding-left: 2px\">\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"header\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 60%; padding: 5px; float: left\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbnavigation\">Quản lý cung ứng > Báo cáo > Hàng xuất\r\n");
      out.write("\t\t\t\t\tkho</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tChào mừng Bạn\r\n");
      out.write("\t\t\t\t\t");
      out.print( userTen );
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"left\" style=\"width: 100%; float: none; clear: left\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend class=\"legendtitle\"> Thông báo</legend>\r\n");
      out.write("\t\t\t\t\t<textarea name=\"dataerror\" style=\"width: 100%; color: red\"\r\n");
      out.write("\t\t\t\t\t\treadonly=\"readonly\" rows=\"1\" readonly=\"readonly\">");
      out.print( obj.getMsg() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t");
 obj.setMsg(""); 
      out.write("\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"cotent\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div align=\"left\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; float: none; clear: left; font-size: 0.7em\">\r\n");
      out.write("\t\t\t\t\t<fieldset style=\"margin-top: 5px\">\r\n");
      out.write("\t\t\t\t\t\t<legend class=\"legendtitle\"> Tiêu chí tìm kiếm</legend>\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"6px\" cellspacing=\"0px\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin-top: 5px\">\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\" width=\"15%\">Từ ngày</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" class=\"days\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"tungay\" name=\"tungay\" value=\"");
      out.print( obj.gettungay());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmaxlength=\"10\" /></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\" width=\"15%\">Đến ngày</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" class=\"days\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"denngay\" name=\"denngay\" value=\"");
      out.print( obj.getdenngay() );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmaxlength=\"10\" /></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\" class=\"plainlabel\"><a class=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"javascript:submitform();\"> <img style=\"top: -4px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/button.png\" alt=\"\"> Tạo báo cáo\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tdropdowncontent.init('spId', \"right-bottom\", 300, \"click\");\r\n");
      out.write("\tdropdowncontent.init('clId', \"right-bottom\", 300, \"click\");\r\n");
      out.write("\tdropdowncontent.init('ndxId', \"right-bottom\", 300, \"click\");\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");


try{
 
 
	session.setAttribute("obj", null) ; 
}catch(Exception er){
	
}
finally{
 
}


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
