package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.beans.sanpham_thu.imp.*;
import geso.erp.beans.sanpham_thu.*;
import geso.dms.center.util.Utility;
import java.sql.ResultSet;
import java.util.Hashtable;
import java.util.List;

public final class SanPhamNew_005fThu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	ISanPham_Thu obj = (ISanPham_Thu) session.getAttribute("obj");
	String userId = (String) session.getAttribute("userId");
	String userTen = (String) session.getAttribute("userTen");
	ResultSet rsDonvi = obj.getRsDonVi();
	ResultSet rsSanPham = obj.getRsSanPham();
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<TITLE>SalesUp - Project</TITLE>\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" media=\"print\"\r\n");
      out.write("\thref=\"../css/impression.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/mybutton.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#mainContainer {\r\n");
      out.write("\twidth: 660px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tborder-left: 3px double #000;\r\n");
      out.write("\tborder-right: 3px double #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#formContent {\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("}\r\n");
      out.write("/* END CSS ONLY NEEDED IN DEMO */\r\n");
      out.write("\r\n");
      out.write("/* Big box with list of options */\r\n");
      out.write("#ajax_listOfOptions {\r\n");
      out.write("\tposition: absolute; /* Never change this one */\r\n");
      out.write("\twidth: auto; /* Width of box */\r\n");
      out.write("\theight: 200px; /* Height of box */\r\n");
      out.write("\toverflow: auto; /* Scrolling features */\r\n");
      out.write("\tborder: 1px solid #317082; /* Dark green border */\r\n");
      out.write("\tbackground-color: #C5E8CD; /* White background color */\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont-size: 1.0em;\r\n");
      out.write("\tz-index: 100;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions div {re\r\n");
      out.write("\t/* General rule for both .optionDiv and .optionDivSelected */ margin:1px;\r\n");
      out.write("\tpadding: 1px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfont-size: 1.0em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions .optionDiv { /* Div for each item in list */\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions .optionDivSelected { /* Selected item in the list */\r\n");
      out.write("\tbackground-color: #317082; /*mau khi di chuyen */\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions_iframe {\r\n");
      out.write("\tbackground-color: #F00;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#dhtmltooltip {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: -300px;\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tpadding: 2px;\r\n");
      out.write("\tbackground-color: lightyellow;\r\n");
      out.write("\tvisibility: hidden;\r\n");
      out.write("\tz-index: 100;\r\n");
      out.write("\t/*Remove below line to remove shadow. Below line should always appear last within this CSS*/\r\n");
      out.write("\tfilter: progid: DXImageTransform.Microsoft.Shadow( color= gray,\r\n");
      out.write("\t\tdirection= 135);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#dhtmlpointer {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: -300px;\r\n");
      out.write("\tz-index: 101;\r\n");
      out.write("\tvisibility: hidden;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/speechbubbles.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/speechbubbles.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(function($){ \r\n");
      out.write("\t\t $('.addspeech').speechbubble();});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"../css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.widget.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.datepicker.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\t\t\r\n");
      out.write("\t\t$( \".days\" ).datepicker({\t\t\t    \r\n");
      out.write("\t\t\t\tchangeMonth: true,\r\n");
      out.write("\t\t\t\tchangeYear: true\t\t\t\t\r\n");
      out.write("\t\t});            \r\n");
      out.write("\t});\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/ajax.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/erp-spList.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/dropdowncontent.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/cool_DHTML_tootip.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.autocomplete.js\"></script>\r\n");
      out.write("<link href=\"../css/select2.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("     $(document).ready(function() { $(\"select\").select2();  });\r\n");
      out.write("     \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t function saveform()\r\n");
      out.write("\t {\t\r\n");
      out.write("\t \t document.forms['dmhForm'].action.value='save';\r\n");
      out.write("\t     document.forms['dmhForm'].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\r\n");
      out.write("\t function checkSanPham()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var masp = document.getElementsByName(\"masp\");\r\n");
      out.write("\t\t for(var hh = 0; hh < masp.length; hh++)\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\tif(masp.item(hh).value != \"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t return false;\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function submitform()\r\n");
      out.write("\t { \t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].action.value='submit';\r\n");
      out.write("\t     document.forms[\"dmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function themmoi()\r\n");
      out.write("\t { \t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].action.value='themmoi';\r\n");
      out.write("\t\t document.forms['dmhForm'].IsCapNhat.value='1';\r\n");
      out.write("\t     document.forms[\"dmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function quaylaiInit()\r\n");
      out.write("\t { \t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].action.value='quaylaiInit';\r\n");
      out.write("\t\t document.forms['dmhForm'].IsCapNhat.value='0';\r\n");
      out.write("\t     document.forms[\"dmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t function savesanpham()\r\n");
      out.write("\t { \t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].action.value='savesanpham';\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].IsCapNhat.value='0';\r\n");
      out.write("\t     document.forms[\"dmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t  \r\n");
      out.write("\t function Chinhsua()\r\n");
      out.write("\t { \t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].action.value='chinhsua';\r\n");
      out.write("\t\t document.forms['dmhForm'].IsCapNhat.value='0';\r\n");
      out.write("\t\t var  id_dh= document.forms['dmhForm'].id_dh.value;\r\n");
      out.write("\t\t if(id_dh==\"\"){\r\n");
      out.write("\t\t\t alert('Kh??ng x??c ?????nh s??? ch???ng t??? s???a, vui l??ng ki???m tra l???i');\r\n");
      out.write("\t\t\t return;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t \r\n");
      out.write("\t     document.forms[\"dmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\r\n");
      out.write("\t function goBack()\r\n");
      out.write("\t {\r\n");
      out.write("\t  \twindow.history.back();\r\n");
      out.write("\t }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<BODY leftmargin=\"0\" bottommargin=\"0\" topmargin=\"0\" rightmargin=\"0\">\r\n");
      out.write("\t<!-- chuy???n t???i trang svl new -->\r\n");
      out.write("\t<form name=\"dmhForm\" method=\"post\" action=\"../../SanPhamNewSvl_Thu\">\r\n");
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"userId\" value='");
      out.print(userId);
      out.write("'> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"action\" value=\"1\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\tname=\"maSanPham\" value='");
      out.print(obj.getMaSanPham());
      out.write("'>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%; padding-left: 2px\">\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"header\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 60%; padding: 5px; float: left\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbnavigation\">Th??ng Tin S???n Ph???m</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tCh??o m???ng b???n\r\n");
      out.write("\t\t\t\t\t");
      out.print(userTen);
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"button\"\r\n");
      out.write("\t\t\t\tstyle=\"border: 1; width: 100%; height: 32px; padding: 1px; float: none\"\r\n");
      out.write("\t\t\t\tclass=\"tbdarkrow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TABLE border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<TR class=\"tbdarkrow\">\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"30px\" align=\"left\"><A href=\"javascript:saveform()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<IMG src=\"../images/1455966997_save.png\" title=\"Save\" alt=\"Save\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=\"1px\" style=\"border-style: outset\">\r\n");
      out.write("\t\t\t\t\t\t</A></TD>\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"30px\" align=\"left\"><span id=\"btnUndo\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"../../SanPhamSvl_Thu?userId=");
      out.print(userId);
      out.write("\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/Back_undo.png\" title=\"Undo\" alt=\"Undo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"1px\" style=\"border-style: outset\">\r\n");
      out.write("\t\t\t\t\t\t\t</A>\r\n");
      out.write("\t\t\t\t\t\t</span></TD>\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"left\" style=\"width: 100%; float: none; clear: left\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend class=\"legendtitle\"> Th??ng b??o</legend>\r\n");
      out.write("\t\t\t\t\t<textarea name=\"dataerror\" id=\"Msg\" rows=\"1\" readonly=\"readonly\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 50px; width: 100%\">");
      out.print(obj.getMsg());
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"left\" style=\"width: 100%; float: none; clear: left\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend class=\"legendtitle\"> Th??m S???n Ph???m </legend>\r\n");
      out.write("\t\t\t\t\t<div style=\"float: none; width: 100%\" align=\"left\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"4\" cellspacing=\"0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">T??n S???n Ph???m</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" name=\"tenSanPham\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getTenSanPham());
      out.write("\" placeholder=\"EX: t??n s???n ph???m\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- CH???N ????N V??? T??NH -->\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">????n V??? T??nh:</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><select name=\"maDonVi\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

										if (rsDonvi != null) {
											while (rsDonvi.next()) {
										if (rsDonvi.getString("MADONVI").equals(obj.getMaDoVi())) {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rsDonvi.getString("MADONVI"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tselected=\"selected\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rsDonvi.getString("TENDONVI"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											} else {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rsDonvi.getString("MADONVI"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rsDonvi.getString("TENDONVI"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
												}
											}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- CH???N S??? L?????NG S???N PH???M -->\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">S??? L?????ng:</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"number\" name=\"soLuong\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getSoL????ng());
      out.write("\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- CH???N GI?? B??N -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">G??a B??n:</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"number\" name=\"giaBan\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getGiaBan());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

			obj.DBclose();
		
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("</BODY>\r\n");
      out.write("</html>");
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
