package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.beans.donmuahang_tan.*;
import geso.erp.beans.sanpham_tan.IThongtinsanpham;
import geso.erp.beans.nhacungcap.INhacungcap;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import geso.dms.center.util.Utility;
import java.sql.ResultSet;
import java.util.Hashtable;
import java.util.List;

public final class DonmuahangNew_005ftan_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	IDonmuahangNew_tan obj = (IDonmuahangNew_tan) session.getAttribute("obj");
	String userId = (String) session.getAttribute("userId");
	String userTen = (String) session.getAttribute("userTen");
	Utility util = (Utility) session.getAttribute("util");
	List<ISanpham_tan> listsp =obj.getListSp();
	ResultSet dataListNCC=obj.getRsncc();

	String readonly="readonly";
	if(obj.getIsCapNhat().equals("1") ){
		readonly="";
	}
	
	String disabled="disabled";
	if(obj.getIsCapNhat().equals("1") ){
		disabled="";
	}
	NumberFormat formatter = new DecimalFormat("#,###,###.###");

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\tfilter: progid:       DXImageTransform.Microsoft.Shadow(       color=\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t gray, direction=       135);\r\n");
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
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t function saveform()\r\n");
      out.write("\t {\t\r\n");
      out.write("\t \t document.forms['dmhForm'].action.value='save';\r\n");
      out.write("\t     document.forms['dmhForm'].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\r\n");
      out.write("\t function print_pdf(){\r\n");
      out.write("\t\t document.forms[\"erpDmhForm\"].action.value = \"print\";\r\n");
      out.write("\t\t document.forms[\"erpDmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t function checkSanPham()\r\n");
      out.write("\t {\r\n");
      out.write("\t\t var masp = document.getElementsByName(\"txtMasp\");\r\n");
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
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t function savenhacungcap()\r\n");
      out.write("\t { \t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].action.value='savenhacungcap';\r\n");
      out.write("\t\t document.forms['dmhForm'].IsCapNhat.value='0';\r\n");
      out.write("\t     document.forms[\"dmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t function Chinhsua()\r\n");
      out.write("\t { \t\t\r\n");
      out.write("\t\t document.forms['dmhForm'].action.value='chinhsua';\r\n");
      out.write("\t\t document.forms['dmhForm'].IsCapNhat.value='0';\r\n");
      out.write("\t\t var  id_dh= document.forms['dmhForm'].id_dh.value;\r\n");
      out.write("\t\t if(id_dh==\"\"){\r\n");
      out.write("\t\t\t alert('Không xác định số chứng từ sửa,vui lòng kiểm tra lại');\r\n");
      out.write("\t\t\t return;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t \r\n");
      out.write("\t     document.forms[\"dmhForm\"].submit();\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write(" \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write(" \r\n");
      out.write("\t function goBack()\r\n");
      out.write("\t {\r\n");
      out.write("\t  \twindow.history.back();\r\n");
      out.write("\t }\r\n");
      out.write("\t function replaces()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t// lay mot mang\r\n");
      out.write("\t\t\tvar idsp = document.getElementsByName(\"idsp\");\r\n");
      out.write("\t\t\tvar masp = document.getElementsByName(\"txtMasp\");\r\n");
      out.write("\t\t\tvar tensp = document.getElementsByName(\"txtTensp\");\r\n");
      out.write("\t\t\tvar donvitinh = document.getElementsByName(\"txtDvt\");\r\n");
      out.write("\t\t\tvar soluong = document.getElementsByName(\"txtSoluong\");\r\n");
      out.write("\t\t\tvar dongia = document.getElementsByName(\"txtDongia\");\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\tvar thanhtien = document.getElementsByName(\"txtThanhtien\");\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\tvar sodong =  masp.length;\r\n");
      out.write("\t\t\tconsole.log(sodong);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar i;\r\n");
      out.write("\t\t\tfor(i = 0; i < sodong; i++)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif(  masp.item(i).value != \"\"    )\r\n");
      out.write("\t\t\t\t{ \r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\tvar sp = masp.item(i).value;\r\n");
      out.write("\t\t\t\t\tvar pos = parseInt(sp.indexOf(\" -- \"));\r\n");
      out.write("\t\t\t\t\tvar slg = soluong.item(i).value.replace(/,/g,\"\"); \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(pos > 0)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tconsole.log(pos);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tmasp.item(i).value = sp.substring(0, pos);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t// substr ham nay truyen vao vi tri bat dau lay cua chuoi toi het chuoi\r\n");
      out.write("\t\t\t\t\t\t//vd  ( VT10 -- VIETTEL10 [] [20,000] [0] [100010] )   lay tu vi tri 7: VIETTEL10 [] [20,000] [0] [100010]\r\n");
      out.write("\t\t\t\t\t\tsp = sp.substr(parseInt(sp.indexOf(\" -- \")) + 3);\r\n");
      out.write("\t\t\t\t\t\ttensp.item(i).value = sp.substring(0, parseInt(sp.indexOf(\" [\")));\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tsp = sp.substr(parseInt(sp.indexOf(\" [\")) + 2);\r\n");
      out.write("\t\t\t\t\t\tdonvitinh.item(i).value = sp.substring(0, parseInt(sp.indexOf(\"] [\")));\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tsp = sp.substr(parseInt(sp.indexOf(\"] [\")) + 3);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tdongia.item(i).value = sp.substring(0, parseInt(sp.indexOf(\"] [\")));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tsp = sp.substr(parseInt(sp.indexOf(\"] [\")) + 3);\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\tsp = sp.substr(parseInt(sp.indexOf(\"] [\")) + 3);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tidsp.item(i).value = sp.substring(0, parseInt(sp.indexOf(\"]\")));\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tsoluong.item(i).focus();\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(soluong.item(i).value != \"\"){\r\n");
      out.write("\t\t\t\t\t\tif(dongia.item(i).value != \"\"){\r\n");
      out.write("\t\t\t\t\t\t\tvar dgia = dongia.item(i).value.replace(/,/g,\"\"); \r\n");
      out.write("\t\t\t\t\t\t\tvar tt = parseFloat(slg) *  parseFloat(dgia)  ;\r\n");
      out.write("\t\t\t\t\t\t\tthanhtien.item(i).value =  tt ;\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t \t\t\r\n");
      out.write("\t\t\t\t\t\t\tidsp.item(i).value = \"\";\r\n");
      out.write("\t\t\t\t\t\t\ttensp.item(i).value = \"\";\r\n");
      out.write("\t\t\t\t\t\t\tdonvitinh.item(i).value = \"\";\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\tsoluong.item(i).value = \"\";\r\n");
      out.write("\t\t\t\t\t\t\tdongia.item(i).value = \"\";\r\n");
      out.write("\t\t\t\t\t\t\tthanhtien.item(i).value = \"\";\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\tTinhTien();\r\n");
      out.write("\t\t\tsetTimeout(replaces, 500);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction TinhTien()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar soluong = document.getElementsByName(\"txtSoluong\");\r\n");
      out.write("\t\t\tvar dongia = document.getElementsByName(\"txtDongia\");\r\n");
      out.write("\t\t\tvar thanhtien = document.getElementsByName(\"txtThanhtien\");\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar tongtien = 0;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(var i = 0; i < thanhtien.length; i++){\r\n");
      out.write("\t\t\t\t//alert('TT: ' + thanhtien.item(i).value);\r\n");
      out.write("\t\t\t\tif( thanhtien.item(i).value != \"\" ){\r\n");
      out.write("\t\t\t\t\tvar thanh_tien = thanhtien.item(i).value.replace(/,/g,\"\");\r\n");
      out.write("\t\t\t\t\ttongtien = parseFloat(tongtien) +  parseFloat(thanh_tien);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtTongtien\").value = DinhDangTien(Math.round(tongtien)); \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//------------------------\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction DinhDangTien(num) \r\n");
      out.write("\t {\r\n");
      out.write("\t    num = num.toString().replace(/$|\\,/g,'');\r\n");
      out.write("\t    if(isNaN(num))\r\n");
      out.write("\t    num = \"0\";\r\n");
      out.write("\t    sign = (num == (num = Math.abs(num)));\r\n");
      out.write("\t    num = Math.floor(num*100);\r\n");
      out.write("\t    num = Math.floor(num/100).toString();\r\n");
      out.write("\t    for (var i = 0; i < Math.floor((num.length-(1+i))/3); i++)\r\n");
      out.write("\t    num = num.substring(0,num.length-(4*i+3))+','+\r\n");
      out.write("\t    num.substring(num.length-(4*i+3));\r\n");
      out.write("\t    return (((sign)?'':'-') + num);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction FormatNumber(e)\r\n");
      out.write("\t{\r\n");
      out.write("\t\te.value = DinhDangDonGia(e.value);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction roundNumber(num, dec) \r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar result = Math.round(num*Math.pow(10,dec))/Math.pow(10,dec);\r\n");
      out.write("\t\treturn result;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction DinhDangDonGia(num) \r\n");
      out.write("\t{\r\n");
      out.write("\t\tnum = num.toString().replace(/$|\\,/g,'');\r\n");
      out.write("\t\t \r\n");
      out.write("\t\tvar sole = '';\r\n");
      out.write("\t\tif(num.indexOf(\".\") >= 0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tsole = num.substring(num.indexOf('.'));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(isNaN(num))\r\n");
      out.write("\t\tnum = \"0\";\r\n");
      out.write("\t\tsign = (num == (num = Math.abs(num)));\r\n");
      out.write("\t\tnum = Math.floor(num*100);\r\n");
      out.write("\t\tnum = Math.floor(num/100).toString();\r\n");
      out.write("\t\tfor (var i = 0; i < Math.floor((num.length-(1+i))/3); i++)\r\n");
      out.write("\t\tnum = num.substring(0,num.length-(4*i+3)) + ',' + num.substring(num.length-(4*i+3));\r\n");
      out.write("\r\n");
      out.write("\t\tvar kq;\r\n");
      out.write("\t\tif(sole.length >= 0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tkq = (((sign)?'':'-') + num) + sole;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tkq = (((sign)?'':'-') + num);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//alert(kq);\r\n");
      out.write("\t\treturn kq;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction keypress(e) //Hàm dùng để ngăn người dùng nhập các kí tự khác ký tự số vào TextBox\r\n");
      out.write("\t{    \r\n");
      out.write("\t\tvar keypressed = null;\r\n");
      out.write("\t\tif (window.event)\r\n");
      out.write("\t\t\tkeypressed = window.event.keyCode; //IE\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tkeypressed = e.which; //NON-IE, Standard\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (keypressed < 48 || keypressed > 57)\r\n");
      out.write("\t\t{ \r\n");
      out.write("\t\t\tif (keypressed == 8 || keypressed == 127 || keypressed == 37 || keypressed == 39 || keypressed == 0 || keypressed == 46)\r\n");
      out.write("\t\t\t{//Phím Delete và Phím Back\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//--------------\r\n");
      out.write("\t\t\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<BODY leftmargin=\"0\" bottommargin=\"0\" topmargin=\"0\" rightmargin=\"0\">\r\n");
      out.write("\t<form name=\"dmhForm\" method=\"post\" action=\"../../DonmuahangNewSvl_tan\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"userId\" value='");
      out.print(userId);
      out.write("'> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"action\" value=\"1\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\tname=\"id_dh\" value='");
      out.print(obj.getId());
      out.write("'> <input type=\"hidden\"\r\n");
      out.write("\t\t\tid=\"IsCapNhat\" name=\"IsCapNhat\" value='");
      out.print(obj.getIsCapNhat());
      out.write("'>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%; padding-left: 2px\">\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"header\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 60%; padding: 5px; float: left\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbnavigation\">THÔNG TIN ĐƠN MUA HÀNG</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tChào mừng bạn\r\n");
      out.write("\t\t\t\t\t");
      out.print(userTen);
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"button\"\r\n");
      out.write("\t\t\t\tstyle=\"border: 1; width: 100%; height: 32px; padding: 1px; float: none\"\r\n");
      out.write("\t\t\t\tclass=\"tbdarkrow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TABLE border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<TR class=\"tbdarkrow\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"30px\" align=\"left\"><A href=\"javascript:saveform()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<IMG src=\"../images/1455966997_save.png\" title=\"Save\" alt=\"Save\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=\"1px\" style=\"border-style: outset\">\r\n");
      out.write("\t\t\t\t\t\t</A></TD>\r\n");
      out.write("\t\t\t\t\t\t");
if(obj.getId().length()>0){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"50px\" align=\"left\"><A\r\n");
      out.write("\t\t\t\t\t\t\thref=\"../../DonmuahangInExcelSvl_tan?userId=");
      out.print(userId );
      out.write("&excel=");
      out.print( obj.getId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<IMG src=\"../images/Excel2013.png\" title=\"Xuất file Excel\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Xuất file Excel\" border=\"1px\" style=\"border-style: outset\">\r\n");
      out.write("\t\t\t\t\t\t</A></TD>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30px\" align=\"left\"><A\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:print_pdf()\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"../images/pdf2013.png\" title=\"In báo cáo PDF\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"In báo cáo PDF\" border=\"1px\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"border-style: outset; width: 30px; height: 30px\">\r\n");
      out.write("\t\t\t\t\t\t</A></td>\r\n");
      out.write("\t\t\t\t\t\t<TD width=\"30px\" align=\"left\"><span id=\"btnUndo\"> <A\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"../../DonmuahangListSvl_tan?userId=");
      out.print(userId);
      out.write("\"> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"../images/Back_undo.png\" title=\"Undo\" alt=\"Undo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"1px\" style=\"border-style: outset\">\r\n");
      out.write("\t\t\t\t\t\t\t</A>\r\n");
      out.write("\t\t\t\t\t\t</span></TD>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"left\" style=\"width: 100%; float: none; clear: left\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend class=\"legendtitle\"> Thông báo</legend>\r\n");
      out.write("\t\t\t\t\t<textarea name=\"dataerror\" id=\"Msg\" rows=\"1\" readonly=\"readonly\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 100%\">");
      out.print(obj.getMsg());
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"left\" style=\"width: 100%; float: none; clear: left\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend class=\"legendtitle\"> THÊM HÓA ĐƠN MUA HÀNG </legend>\r\n");
      out.write("\t\t\t\t\t<div style=\"float: none; width: 100%\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"4\" cellspacing=\"0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Tổng tiền</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"txtTongtien\" id=\"txtTongtien\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(formatter.format(obj.getTongtien()));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"text-align: right; font-size: 14px; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Ngày chứng từ</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" class=\"days\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"txtNgaychungtu\" value=\"");
      out.print(obj.getNgaychungtu());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Tên nhà cung cấp</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><select name=\"cbNhacungcap\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											if (dataListNCC != null) {
												while (dataListNCC.next()) {
													if (dataListNCC.getString("pk_seq").equals(obj.getNhacungcap())) {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(dataListNCC.getString("pk_seq"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tselected=\"selected\">");
      out.print(dataListNCC.getString("TEN"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											} else {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(dataListNCC.getString("pk_seq"));
      out.write('"');
      out.write('>');
      out.print(dataListNCC.getString("TEN"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
												}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" style=\"width: 100%; float: none; clear: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t<TABLE class=\"tabledetail\" width=\"100%\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tcellpadding=\"2\" cellspacing=\"2\" style=\"font-size: 14px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"2%\">STT</TH>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Mã sản phẩm</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"15%\">Tên sản phẩm</TH>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"5%\">ĐVT</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"5%\">Số lượng</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Đơn giá</TH>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"10%\">Thành tiền</TH>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 
							
							int i=0 ;
							for(  i=0;i<listsp.size();i++) {
								ISanpham_tan sp=listsp.get(i);
								
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\">");
      out.print(i);
      out.write("</Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"10%\"><input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"idsp\" value=\"");
      out.print(sp.getId());
      out.write("\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"txtMasp\" value=\"");
      out.print(sp.getMasanpham());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonkeyup=\"ajax_showOptions(this,'donmuahang',event)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAUTOCOMPLETE=\"off\" ");
      out.print(readonly);
      out.write("></Td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"15%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtTensp\" value=\"");
      out.print(sp.getTensanpham());
      out.write("\"></Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"5%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtDvt\" value=\"");
      out.print(sp.getDonvitinh());
      out.write("\"></Td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"5%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtSoluong\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(formatter.format(sp.getSoluong()));
      out.write("\"></Td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"10%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtDongia\" value=\"");
      out.print(formatter.format(sp.getDongia()));
      out.write("\"></Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"10%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtThanhtien\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(formatter.format(sp.getThanhtien()));
      out.write("\"></Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								}
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- trường hợp list không có danh sách thì khởi tạo 1 list trống -->\r\n");
      out.write("\t\t\t\t\t\t\t\t");

							 
							 for(i=listsp.size();i<listsp.size()+20 ;i++) {
								 
								
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"30px\">");
      out.print(i );
      out.write("</Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"10%\"><input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"idsp\" value=\"\"> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtMasp\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonkeyup=\"ajax_showOptions(this,'donmuahang',event)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAUTOCOMPLETE=\"off\"></Td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"15%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtTensp\" value=\"\"></Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"5%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtDvt\" value=\"\"></Td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"5%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtSoluong\" value=\"\"></Td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"10%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtDongia\" value=\"\"></Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Td align=\"center\" width=\"10%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtThanhtien\" value=\"\"></Td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								}
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");

			obj.DBclose();
		
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\treplaces();\r\n");
      out.write("\t\t</script>\r\n");
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
