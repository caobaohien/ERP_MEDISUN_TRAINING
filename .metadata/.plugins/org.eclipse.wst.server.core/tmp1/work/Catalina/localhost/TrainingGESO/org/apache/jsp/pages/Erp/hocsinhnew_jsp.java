package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.training.bean.hocsinh.IHocSinh;
import java.sql.ResultSet;

public final class hocsinhnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	IHocSinh obj = (IHocSinh)session.getAttribute("hocsinh");
	String userId = (String)session.getAttribute("userId");
	String userTen = (String)session.getAttribute("userTen");
// lay danh sach lop
	ResultSet RsLop = obj.getRsLop();
	//ResultSet RsHocSinhList = obj.getRsHocSinhList();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>SalesUp - Project</title>\r\n");
      out.write("\t<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../scripts/jquery.min.js\"></script>\r\n");
      out.write("\t<link href=\"../css/select2.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\t<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() { $(\"select\").select2(); });\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--<LINK rel=\"stylesheet\" type=\"text/css\" media=\"print\" href=\"../css/impression.css\">\r\n");
      out.write("    <LINK rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("   <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/mybutton.css\">\r\n");
      out.write("   \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../scripts/jquery.min.1.7.js\"></script>\r\n");
      out.write("    <link href=\"../css/jquery-ui.css\" rel=\"stylesheet\" type=\"text.css\" />\r\n");
      out.write("\t<script src=\"../scripts/ui/jquery.ui.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"../scripts/ui/jquery.ui.core.widget.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"../scripts/ui/jquery.ui.core.datepicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<link href=\"../css/select2.js\" rel=\"stylesheet\"/>\r\n");
      out.write("\t<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$(\".days\").datepicker({\r\n");
      out.write("\t\t\t\tchangeMonth: true, changeYear:true\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() { \r\n");
      out.write("\t\t\t$(\"select:not(.notuseselect2)\").select2({width:'resolve'});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>-->\r\n");
      out.write("\t\r\n");
      out.write("\t<Script type=\"text/javascript\">\r\n");
      out.write("\tfunction saveform(){\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].action.value = \"luumoi\";\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t</Script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"hocsinhlist\" method=\"post\" action=\"../../HocsinhUpdatesvl\">\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"1\"/>\r\n");
      out.write("<div id=\"main\" style=\"width:99%; padding-left:2px\">\r\n");
      out.write("  <div align=\"left\" id=\"header\" style=\"width:100%; float:none\">\r\n");
      out.write("\t<div style=\"width:100%; padding:5px; float:left\" class=\"tbnavigation\">\r\n");
      out.write("\t\tQuản lý học sinh\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div align=\"right\" style=\"width:100%; padding:5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\tHello guys ");
      out.print(userTen);
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      out.write(" </div>\r\n");
      out.write("<div id=\"cotent\" style=\"width:100%; float:none\">\r\n");
      out.write("\t<div align=\"left\" style=\"width:100%; float:none; clear:left; font-size:0.7em\">\r\n");
      out.write("\t<fieldset>\r\n");
      out.write("\t<LEGEND class=\"legendtitle\">Tiêu chí tìm kiếm &nbsp;</LEGEND>\r\n");
      out.write("\t<a href=\"javascript:saveform()\">\r\n");
      out.write("\t<img src=\"../images/1455966997_save.png\" title=\"Save\" alt=\"Save\" border=\"1px\" style=\"border-style:outset\">\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<TABLE width=\"100%\" cellpadding=\"6\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<TD class=\"plainlabel\">Tên lớp </TD>\r\n");
      out.write("\t\t\t<TD class=\"plainlabel\">\r\n");
      out.write("\t\t\t<select name=\"lop\" id=\"lop\" style=\"width:206px\">\r\n");
      out.write("\t\t\t\t<option value=\"\">Chọn Lớp</option>\r\n");
      out.write("\t\t\t");

			  if(RsLop!=null){
				  while(RsLop.next()){
					  if(obj.getMaLop().equals(RsLop.getString("PK_SEQ")))
					  {
					  
      out.write("\r\n");
      out.write("\t\t\t\t\t   <option selected = \"selected\" value=\"");
      out.print(RsLop.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t   ");
      out.print(RsLop.getString("TENLOP"));
      out.write("\r\n");
      out.write("\t\t\t\t\t   </option>\r\n");
      out.write("\t\t\t\t\t  ");

					  }
					  else
					  {
						  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"");
      out.print(RsLop.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t  ");
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
      out.write("\t   <tr style=\"font-size:10px\">\r\n");
      out.write("\t   \t\t<td class=\"plainlabel\"> Tên học sinh </td>\r\n");
      out.write("\t   \t\t<td class=\"plainlabel\">\r\n");
      out.write("\t   \t\t<input type=\"text\"name=\"tenhocsinh\"id=\"tenhocsinh\"style=\"width:200px\"value=\"");
      out.print(obj.getTenHS());
      out.write("\">\r\n");
      out.write("\t   \t\t</td>\r\n");
      out.write("\t   </tr>\r\n");
      out.write("\t   \r\n");
      out.write("\t   <tr style=\"font-size:10px\">\r\n");
      out.write("\t   \t\t<td class=\"plainlabel\"> Mã học sinh </td>\r\n");
      out.write("\t   \t\t<td class=\"plainlabel\">\r\n");
      out.write("\t   \t\t<input type=\"text\"name=\"mahocsinh\"id=\"mahocsinh\"style=\"width:200px\"value=\"");
      out.print(obj.getMaHS());
      out.write("\">\r\n");
      out.write("\t   \t\t</td>\r\n");
      out.write("\t   </tr>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</fieldset>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
 obj.DBClose(); 
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
