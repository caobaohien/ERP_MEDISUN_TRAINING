package org.apache.jsp.pages.Center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.dms.center.util.*;

public final class leftMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String userId = (String) session.getAttribute("userId");
	String userTen = (String) session.getAttribute("userTen");
	String sum = (String) session.getAttribute("sum");
	Utility util = (Utility) session.getAttribute("util");
	if (!util.check(userId, userTen, sum)) {
		response.sendRedirect("/TrainingGESO/index.jsp");
	} else {
		//IMenu obj = (IMenu)session.getAttribute("obj");
		//int[] mang = obj.getMang(); 
		int mang[] = util.quyen_ungdung(userId);
		System.out.println("mang :" + mang[1]);
		String chuoi = (String)session.getValue("chuoi");
		if (chuoi.equals("")) {
			chuoi = "../css/style1024.css";
		}
		

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<LINK id=\"sitetheme\" rel=\"stylesheet\" href=\"");
      out.print(chuoi);
      out.write("\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: \"Times New Roman\", Georgia, Serif;\r\n");
      out.write("\tfont-size: 1em;\r\n");
      out.write("\tmargin: 1px;\r\n");
      out.write("\tbackground-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>jQuery Accordion Example</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* A few IE bug fixes */\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* html ul ul li a {\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* html ul li a {\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* html ul ul li {\r\n");
      out.write("\tmargin-bottom: -1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-left: 0em;\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#theMenu {\r\n");
      out.write("\twidth: 0px;\r\n");
      out.write("\theight: 0px;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Some list and link styling */\r\n");
      out.write("ul li {\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tline-height: 20pt;\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("\tborder-left-width: 0px;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tborder-left-color: #FFFFFF;\r\n");
      out.write("\tbackground-color: #80CB9B;\r\n");
      out.write("\tborder-bottom-style: solid;\r\n");
      out.write("\tborder-bottom-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-width: thin;\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tpadding-top: 0;\r\n");
      out.write("\tpadding-right: 0;\r\n");
      out.write("\tpadding-bottom: 0;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\ttext-indent: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul li a {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-size: 10pt;\r\n");
      out.write("\tbackground-color: #80CB9B;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground-color: #80CB9B;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul li {\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tbackground-position: left center;\r\n");
      out.write("\tline-height: 18pt;\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-bottom-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tborder-top-color: #FFFFFF;\r\n");
      out.write("\tborder-right-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-color: #FFFFFF;\r\n");
      out.write("\tborder-left-color: #FFFFFF;\r\n");
      out.write("\tbackground-color: #C5E8CD;\r\n");
      out.write("\tborder-bottom-width: thin;\r\n");
      out.write("\tpadding-left: 0;\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul li a {\r\n");
      out.write("\tdisplay: marker;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* For the xtra menu */\r\n");
      out.write("ul ul li a.selected {\r\n");
      out.write("\tdisplay: marker;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tbackground-position: left center;\r\n");
      out.write("\tline-height: 20pt;\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-bottom-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tborder-top-color: #FFFFFF;\r\n");
      out.write("\tborder-right-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-color: #FFFFFF;\r\n");
      out.write("\tborder-left-color: #FFFFFF;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-width: thin;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li a.selected {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* For the sub menu */\r\n");
      out.write("ul ul ul ul li {\r\n");
      out.write("\tborder-left: none;\r\n");
      out.write("\tborder-bottom: none;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("\tmargin-left: 5px;\r\n");
      out.write("\tbackground-color: #F4F4F0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul ul li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\tbackground-color: #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 3px 8px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul ul li a.selected {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 3px 8px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("\tmargin-top: 0em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/accordion.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tjQuery().ready(function()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tjQuery(\"a\").click(function(e){\r\n");
      out.write("\t\t\tjQuery(\"a\").css(\"color\", \"black\");\r\n");
      out.write("\t\t\tjQuery(this).css(\"color\", \"red\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// applying the settings\r\n");
      out.write("\t\tjQuery('#theMenu').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h3.selected',\r\n");
      out.write("\t\t\theader : 'h3.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tjQuery('#xtraMenu1').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu2').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu3').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu4').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu5').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu6').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu7').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu8').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu9').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu10').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#subMenu').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h6.selected',\r\n");
      out.write("\t\t\theader : 'h6.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<ul id=\"theMenu\">\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? h???c sinh</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">C?? b???n </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (mang[1]==1)
									{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCongTySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng ty</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../HocSinhsvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???c Sinh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">D??? li???u n???n </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu1\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">C?? b???n </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (mang[1] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCongTySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng ty</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCViengThamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bao Cao Vieng Tham</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DoanhSoTheoTinhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Doanh S??? Theo T???nh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCSoLuongSvl_cuong?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o s??? l?????ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n kho - Th??i</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../Donhanglistsvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n H??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[2] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dvthId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DonViThucHienSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ph??ng ban</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[3] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"cdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChucdanhSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ch???c danh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\" id=\"dlnspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">K??? to??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[4] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNganHangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ng??n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[5] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChiNhanhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi nh??nh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[7] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLoaiTaiKhoanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Lo???i t??i kho???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[7] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDoiTuongKyQuySvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">?????i t?????ng k?? qu???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[8] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TaikhoanketoanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T??i kho???n k??? to??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[8] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCauhinhchiphiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m t??i kho???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[9] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"clId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLoaiSanPhamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Lo???i s???n ph???m </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[11] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNganHangCongTySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T??i kho???n ng??n h??ng c??ng ty</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[12] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TrungTamChiPhiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Trung t??m chi ph??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[13] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChiphiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kho???n m???c chi ph??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[14] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TrungTamDoanhThuSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Trung t??m doanh thu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[15] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_MucdoanhthuSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kho???n m???c doanh thu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[15] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_KhoanmucchietkhauSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kho???n m???c chi???t kh???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

				              if (mang[16] == 1) {
				             
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhanvienSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??n vi??n c??ng ty</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dlthId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DulieutonghopSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">D??? li???u t???ng h???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[4] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCoPhieuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Danh m???c c??? phi???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\" id=\"muahangId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Mua h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[17] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nccId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLoaiNhaCungCapSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Lo???i nh?? Cung C???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[18] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nccId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhomnhacungcapcnSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m nh?? Cung C???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[19] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nccId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNhaCungCapSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh?? Cung C???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[20] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"mcpId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_mucchiphiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">M???c chi ph??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[21] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dmhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChinhsachduyetmuahangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ch??nh s??ch duy???t mua h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[22] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TienTeSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ti???n t???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[23] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TigiaSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T??? gi??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">S???n xu???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[24] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpNhamaySvl?userId=");
      out.print( userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh?? m??y</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[25] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBomSvl?userId=");
      out.print( userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Danh m???c v???t t?? ( BOM )</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[25] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDuyetbomSvl?userId=");
      out.print( userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duy???t BOM</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[26] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCongDoanSanXuatGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng ??o???n s???n xu???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[27] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKichBanSanXuatGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">K???ch b???n s???n xu???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\" id=\"khoId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Kho v???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (mang[29] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKhoTTSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khai b??o kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (mang[29] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKhuVucKhoSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khai b??o khu v???c kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[32] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dvdlspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonvidoluongSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n v??? ??o l?????ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[33] == 1) {
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ttspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ThongtinsanphamgiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n ph???m </a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[34] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhomsanphamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m s???n ph???m</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--  xem lai quyen --> ");

									if (mang[33] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"cbspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../CongbosanphamSvl?userId=");
      out.print(userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng b??? s???n ph???m </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[34] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTonkhoantoanUpdateSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T???n kho an to??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Kinh doanh </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[35] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonvikinhdoanhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n v??? Kinh doanh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[36] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../KenhbanhangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">K??nh b??n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[37] == 1) {
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../VungmienSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">V??ng mi???n</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[38] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../KhuvucSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khu v???c</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[39] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhomkhachhangTTSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m kh??ch h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[40] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LoaikhachhangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Lo???i kh??ch h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[40] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKhachHangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh??ch h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[41] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBanggiabanGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">?????nh gi?? b??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[42] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpSuagiabanGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duy???t gi?? b??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[43] == 1) {
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhanhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[44] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"clId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChungloaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ch???ng lo???i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? ch??? ti??u </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu2\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Khai b??o </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ddkdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ChitieuthangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ch??? ti??u th??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[201] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ddkdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TieuchithuongTLSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng th???c th?????ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[202] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ddkdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ChietkhauthangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi???t kh???u th????ng m???i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">B??o c??o</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DailySalesSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Th???c ?????t & ch??? ti??u NPP</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCThuongKhachHang?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Th?????ng kh??ch h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBcThuongCKThuongMai?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Th?????ng chi???t kh???u th????ng m???i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? khuy???n m???i </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Khai b??o </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[38] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhomkhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m khuy???n m??i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[39] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../nhomkhachhangkmSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m kh??ch h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[40] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DieukienkhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">??i???u ki???n khuy???n m??i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[208] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../TrakhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tr??? khuy???n m??i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[209] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../CtkhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ch????ng tr??nh khuy???n m??i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[43] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../PhanbokhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ph??n b??? khuy???n m??i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">B??o c??o</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[44] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../PromotionReportTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t khuy???n m??i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[45] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../AccumulatedPromotion?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tr??? khuy???n m??i t??ch l??y </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? cung ???ng </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">L???p k??? ho???ch </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[45] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DuBao_GiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">D??? b??o kinh doanh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[46] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../YeuCauSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Y??u\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tc???u cung ???ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[47] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLenhsanxuatdukienSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????? ngh??? s???n xu???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[48] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDenghingungsanxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????? ngh??? ng??ng s???n xu???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[51] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpXemkehoachUpdateSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ki???m tra k??? ho???ch</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[49] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLenhmuahangdukienSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????? ngh??? mua nguy??n li???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[50] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDenghihuymuaSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????? ngh??? h???y mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[52] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCanhbaothieuhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C???nh b??o thi???u h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[53] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCanhbaothieunguyenlieuSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C???nh b??o thi???u nguy??n li???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[54] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKehoachnhanNVLSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">K??? ho???ch nh???n NVL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[55] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKehoachgiaohangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">K??? ho???ch giao h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Qu???n l?? mua h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDonMuaHangSvl_Mi?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n mua h??ng Mi </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl_Mi?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Y??u c???u chuy???n kho Mi </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpReportFromStoreProcSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\"> B??o c??o Training </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDonMuaHangSvl_Sang?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n mua h??ng Sang </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDonmuahangList_GiaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n mua h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[58] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DuyetmuahangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duy???t ????n mua h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[59] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNhanhang_GiaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh???n h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[99] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKiemdinhchatluong_NhGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ki???m ?????nh ch???t l?????ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[60] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCongtytrahangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n tr??? h??ng NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[61] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpPhieuxuatkhoTSCDSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t tr??? TSC??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[186] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpPhieuThanhToanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????? ngh??? thanh to??n </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[187] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DuyetthanhtoanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duy???t ????? ngh??? thanh to??n </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[62] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuychungtuMhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???y ch???ng t??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[63] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCDonmuahangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i ????n mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[64] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TheoDoiGiaMuaNCC?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i gi?? mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Qu???n l?? b??n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 82%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanphamListSvl_kiet05?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n Ph???m (Ki???t)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamListSvl_kiet06?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n Ph???m (Ki???t 06)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonHangListSvl_Kiet02?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n H??ng (Ki???t)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenKhoListSvl_kiet02?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n Kho (Ki???t 02)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPham_HangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n Ph???m H???ng</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_HangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n b??n h??ng H???ng</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamList_TrangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n Ph???m_Trang</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_TrangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n b??n h??ng_Trang</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListSvl_cuong?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n b??n h??ng_cuong</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonHangListSvl_Vy?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n h??ng (Vy)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_ThuSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n h??ng (Th??)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamSvl_Thu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n Ph???m (Th??)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_TrinhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n b??n h??ng (Trinh)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPham_TrinhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n ph???m (Trinh)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonhangListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n Ban Hang Huy</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../MuaHangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n Mua Hang Huy</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListSvl_thai?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n b??n h??ng - Th??i</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanphamNhom2ListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??i m???u nh??m 2</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListThoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n H??ng Th???</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamDuongNguyenListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n Ph???m DuongNguyen</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonHangDuongNguyenListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n H??ng DuongNguyen</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../KhachhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh??ch h??ng</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n b??n h??ng -Hi???u</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonmuahangListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n mua h??ng -Hi???u</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanphamListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S???n ph???m</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonhangListSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n B??n H??ng_T??n</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonmuahangListSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T??N - ????N MUA H??NG</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T??N - CHUY???N KHO</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhacungcapSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh?? cung c???p</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BanhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n h??ng b??n</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

										if (mang[69] == 1) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_DuyetDonBanHangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duy???t ????n h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

										if (mang[188] == 1) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_DuyetDonBanHangGDSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">GD Duy???t ????n h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

										if (mang[70] == 1) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_dontrahangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n tr??? h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[71] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNhanhang_DonTHSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh???n h??ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[72] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpPhieuxuatkhoSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t kho </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

								if (mang[73] == 1)  {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoaDonTaiChinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t H??TC </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

								if (mang[73] == 1)  {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoaDonTaiChinhKMSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t H??KM </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[143] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoadonphelieuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t H?? kh??c</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(mang[74]==1){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoaDonTraveNccSvl?userId=");
      out.print(userId );
      out.write("&userTen=");
      out.print( userTen );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t h??a ????n tr??? v??? NCC </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

								if (mang[75] == 1)  {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHdTraHangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H??a ????n h??ng tr??? v???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(mang[185]==1){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../HuyhoadontaichinhSvl?userId=");
      out.print(userId );
      out.write("&userTen=");
      out.print( userTen );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???y h??a ????n t??i ch??nh </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[76] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuychungtuBhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???y ch???ng t??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[77] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_DonHangBanTrongKy?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????n h??ng trong k???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[78] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DailyPrimarySales?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o doanh s???(H??)</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[184] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BcdoanhthuspmSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Doanh thu (Canfoco)</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[223] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCbanhangTHSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC b??n h??ng t???ng h???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[227] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCbanhangkhachhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC b??n h??ng theo kh??ch h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[225] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCgiaohangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Giao h??ng theo H??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[79] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_TheoDoiGiaBanKH?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o theo d??i gi??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">S???n xu???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[81] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLenhsanxuatgiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">L???nh s???n xu???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[83] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX&isnhanHang=1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh???n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[85] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpNhapkhoLsxSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh???p kho </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[86] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKiemdinhchatluongSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ki???m ?????nh ch???t l?????ng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[84] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTieuhaonguyenlieugiaySvl\" target=\"content\">Ti??u\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thao nguy??n li???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[85] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../PhanBoLoHoiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ph??n b??? l?? h??i</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[179] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpHuylenhsanxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???y ch???ng t??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                                       if (mang[88] == 1) {
                                 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTinhGiaDongLucListSvl\" target=\"content\">T??nh\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tgi?? ?????ng l???c</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                                       if (mang[88] == 1) {
                                 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpGiabaoquanSvl\" target=\"content\">Gi?? b???o\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tqu???n/ c???p ????ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                                       if (mang[88] == 1) {
                                 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTinhGiaThanhSvl\" target=\"content\">T??nh\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tgi?? th??nh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[89] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BosanphamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B?? s???n ph???m</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 	if (mang[91] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCTieuHaoNL?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o ti??u hao NL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Qu???n l?? t???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenKhoListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuyen Kho Huy</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../HoSoListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Th??ng tin h???? s??</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../HoSoTuVanListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Th??ng tin t?? v????n</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCTuvanduhocSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ba??o ca??o 7</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[92] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Phi???u y??u c???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n kho_hi???u</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 	if (mang[91] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCTieuHaoNL?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o ti??u hao NL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Qu???n l?? t???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenKhoListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuyen Kho Huy</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../HocSinhListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thong tin hoc sinh</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[92] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Phi???u y??u c???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n kho_hi???u</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 	if (mang[91] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCTieuHaoNL?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o ti??u hao NL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Qu???n l?? t???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCDoanhSoTheoTinhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o doanh s??? theo t???nh - Th??i</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../TuvanthongtinhopdongdakyListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B?????c 4-t?? v???n h???p ?????ng ???? k??</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../TienhanhhopdongdakyListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B?????c 5-Ti???n h??nh h???p ?????ng ???? k??</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[93] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n nguy??n li???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[177] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Y??u c???u chuy???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");


									
							 {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n nguy??n li???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[177] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Y??u c???u chuy???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../HocSinhListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thong tin hoc sinh</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n kho_hi???u</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../HopdongSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B?????c 3</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../DinhhuongthitruongListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">?????nh h?????ng th??? tr?????ng</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t b??o c??o</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[93] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n nguy??n li???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[177] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Y??u c???u chuy???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");


									if (mang[94] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuy???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[97] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL&isnhanHang=1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh???n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[98] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL&isnhanHang=2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[180] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpHuyChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???y ch???ng t??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[95] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKiemKhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ki???m kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[96] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKiemKhoExportSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">In b???ng k?? kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[96] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKiemdinhchatluong_khoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ki???m ?????nh ch???t l?????ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[100] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DoiquycachSvl\" target=\"content\">?????i quy\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tc??ch</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[101] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDieuChinhTonKhoTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">??i???u ch???nh t???n kho TT </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[101] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDieuChinhSoLoKhoTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">??i???u ch???nh s??? l?? </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[102] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCapnhatgianhapkhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C???p nh???t gi?? nh???p kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[103] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTinhgiaxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T??nh gi?? xu???t kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[104] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKhoasothangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh??a s??? th??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">B??o c??o</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- b??o c??o th?? -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../BaoCao1_Th??Svl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Th?? B??o C??o 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[105] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTonkhotrungtamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T???n kho trung t??m</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[106] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpXuatnhaptonTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t nh???p t???n TT</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[234] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpReportFromStoreProcSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tu???i h??ng t???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[107] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCThekhoSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Th??? kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[109] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCTheodoihangnhapSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i h??ng nh???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[226] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHansudungSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC H???n s??? d???ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[108] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBcLichSuGdKhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">L???ch s??? giao d???ch kho </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[109] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangnhapSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H??ng nh???p kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[110] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H??ng xu???t kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[111] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHansudungSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???n s??? d???ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[112] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangluanchuyenSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H??ng ch???m lu??n chuy???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 	if (mang[113] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../StockAlarm?userId=");
      out.print(userId);
      out.write("\" target=\"content\">C???nh\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tb??o h??ng t???n kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[114] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpXuatnhaptonTTTHSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xu???t nh???p t???n TT t???ng h???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? c??ng n??? </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu5\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">C??ng n??? ph???i thu </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[114] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpThutienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thu ti???n </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[228] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDuyetthanhtoanhoadonSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duy???t Phi???u thu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[115] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpXoakhachhangttSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">X??a n??? kh??ch h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[191] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ButrucongnoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B?? tr??? c??ng n???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[217] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuythutienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???y ch???ng t???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">C??ng n??? ph???i tr??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[116] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTamUngSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????? ngh??? t???m ???ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[117] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCanTruCongNoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C???n tr??? c??ng n???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[118] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChiphinhapkhauSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi ph?? nh???n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[119] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpThuenhapkhauSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thu??? nh???p kh???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[120] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChiphikhacSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi ph?? kh??c</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[121] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpParkHoadonSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H??a ????n NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[230] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_GanmachiphiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">G??n m?? chi ph??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[231] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDenghithanhtoanNCCSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">????? ngh??? thanh to??n NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[123] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpThanhtoanhoadonSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Phi???u chi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[190] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpUynhiemchiSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">???y nhi???m chi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[124] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpXoaNoNCCSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">X??a n??? NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[218] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuyphieuchiSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H???y ch???ng t???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? t??i s???n </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[125] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpCongDungSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng d???ng t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[126] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_LoaiTaiSanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Lo???i t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[127] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_NhomTaiSanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[128] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_TaiSanCoDinhSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">T??i s???n </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                   if (mang[129] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpKhauhaotaisanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh???u hao t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[130] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpThanhlytaisanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Thanh l?? t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[131] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ThetaisancodinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Th??? t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[132] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../TheodoitaisancodinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[132] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../BangketaisanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">B???ng k?? t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                if (mang[132] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpBCTaiSanCoDinhTongHopSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">BC T??i s???n c??? ?????nh t???ng h???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- <ul id=\"xtraMenu10\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t                  <h4 class=\"head\" > <a href=\"\">B??o c??o </a> </h4>\r\n");
      out.write("\t\t                  <ul style=\"display: none;\">\r\n");
      out.write("\t\t                  \r\n");
      out.write("\t\t                                                                \r\n");
      out.write("\t\t                  </ul>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("            \t</ul> -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? c??ng c??? d???ng c??? </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[133] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpCongDungCCDCSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng d???ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[134] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_LoaiCCDCSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Lo???i c??ng c??? d???ng c???</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[135] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_NhomCCDCSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh??m c??ng c??? d???ng c???</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[136] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_CongCuDungCuSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng c??? d???ng c??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                if (mang[137] == 1) {
               
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpKhauhaocongcudungcuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh???u hao </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? k??? to??n </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[138] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../HopdongvaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">H???p ?????ng vay v???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[139] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../NhantienvaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Gi???i ng??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[140] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ThanhtoannovaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Thanh to??n n??? vay</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[183] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpBCVayTienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o theo d??i vay ti???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[141] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpGiamgiahangmuaSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Gi???m gi?? h??ng mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[144] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpButToanTongHopSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">B??t to??n t???ng h???p</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                if (mang[145] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_danhgiatigiaSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">????nh gi?? t??? gi??</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                if (mang[178] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpDieuchuyentienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">??i???u chuy???n ti???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[146] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../ErpKhoasothangSvl?userId=");
      out.print(userId);
      out.write("&task=kskt\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh??a s??? k??? to??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n l?? ng??n s??ch </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu6\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">D??? li???u n???n </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                           if (mang[147] == 1) {
                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLNSBanggiabanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B???ng gi?? b??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                           if (mang[148] == 1) {
                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLNSBanggianguyenlieuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B???ng gi?? nguy??n li???u</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">L???p ng??n s??ch </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[149] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../KhoitaongansachSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh???i t???o ng??n s??ch </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[150] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../DubaoNam_GiaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">D??? b??o kinh doanh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[151] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachCPUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">D??? to??n chi ph??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[152] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachTSUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">D??? to??n t??i s???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[153] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachCDvaKHTSUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh???u hao v?? ph??n b???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[154] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachDTKUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">D??? to??n doanh thu kh??c</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Theo d??i ng??n s??ch </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                             if (mang[155] == 1) {
                       
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../DuyetngansachSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duy???t ng??n s??ch</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

		             if (mang[156] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCTheoDoiNganSachChiPhi?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i chi ph??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

		             if (mang[157] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TheodoitrungtamchiphiSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i TTCP</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                    if (mang[158] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TheoDoiNganSachLaiLo?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i l??i l???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">B??o c??o qu???n tr??? </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu7\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">C??ng n??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

 								 if (mang[159] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCCongNoTongHopNCC?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC C??ng n??? t???ng h???p NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[160] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCChiTietCongNoNCC?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC C??ng n??? chi ti???t NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[161] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCCongNoTongHopKH?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng n??? t???ng h???p KH</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[162] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCChiTietCongNoKH?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??ng n??? chi ti???t KH</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[163] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCTongHopTuoiNo_MucHanNo?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tu???i n???</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[235] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCTheodoitamungNV?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo d??i t???m ???ng NV</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[233] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../BctinhhinhsudunghdSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o t??nh h??nh s??? d???ng H??</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">K??? to??n - T??i ch??nh </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[164] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCChiTietTKKeToan?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">T???ng h???p t??i kho???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[165] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BoBaoCaoTongHopSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??? b??o c??o t??i ch??nh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[166] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BangcandoiphatsinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">C??n ?????i ph??t sinh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[167] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhatkytaikhoanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nh???t k?? t??i kho???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[168] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BangchitiettaikhoanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi ti???t t??i kho???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[169] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../SoquytienmatSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S??? qu??? ti???n m???t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[170] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../SotienguinganhangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">S??? ti???n g???i ng??n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[170] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCChartSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">B??o c??o Chart</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Thu??? </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[171] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BcBangKeMuaVao?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H??a ????n mua v??o</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[172] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BcBangKeBanRa?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">H??a ????n b??n ra</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Qu???n tr??? h??? th???ng</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[173] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../DanhmucquyenSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">C???p nh???t quy???n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[174] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../CapnhatnhanvienSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">C???p nh???t nh??n vi??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[174] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../UploadPhanQuyenNvSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">UpLoad ph??n quy???n nh??n vi??n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[175] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../ErpCauHinhInHoaDonSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">C???u h??nh in h??a ????n</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[175] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../KhoasodonhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Kh??a ng??y ????n h??ng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

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
