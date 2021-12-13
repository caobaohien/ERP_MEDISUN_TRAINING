package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.erp.db.sql.dbutils;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.net.URLDecoder;

public final class khachhanglistAjax_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	try{
		dbutils db=new dbutils();
		//String smartId="";
		String khId="";
		String khTen="";
		String command="";
		//String sanpham="";
		//String masp="";
		//String tensp="";
		//String dongia="";
		//String madonhang="";
		request.setCharacterEncoding("UTF-8");
		String query=(String)request.getQueryString();
		query=new String(query.substring(query.indexOf("q=")+2, query.indexOf("&limit=")).getBytes("UTF-8"),"UTF-8");
		query=URLDecoder.decode(query, "UTF-8").replace("+", "");
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		
		command="select distinct top(30) smartid, pk_seq as khId, ten as khTen, diachi ";
		command+="from khachhang where trangthai = '1' ";
		command+="and ( smartid = '"+ query + "%' or ten like (N'%" + query + "%')) ";
		command+="order by khId, smartid, khTen";
		System.out.println("KHACHHANG : "+command);
		ResultSet kh=db.get(command);
		if(kh!=null){
			int m=0;
			String khb;
			while(kh.next()){
				khb=kh.getString("smartid");
				khId=kh.getString("khId") + "-" + khb;
				khTen=kh.getString("khTen") + "-" + kh.getString("diachi");
				if(khTen.toUpperCase().startsWith(query.toUpperCase())||khTen.toUpperCase().indexOf(query.toUpperCase())>=0
						||khId.toUpperCase().startsWith(query.toUpperCase())||khId.toUpperCase().indexOf(query.toUpperCase())>=0)
				{
					String khachhang=khId + "-->[" + khTen + "]";
					out.println(khachhang + "\n");
					m++;
					if(m>=50)
						break;
				}
			}
			kh.close();
		}
		/*
		sanpham="select distinct top(30) pk_seq, ma, ten, giaban ";
		sanpham+="from sanpham where trangthai='1' ";
		sanpham+="order by pk_seq,ma,ten,giaban";
		System.out.println("sanpham: "+sanpham);
		ResultSet sp=db.get(sanpham);
		String spId="";
		String spgia="";
		if(sp!=null){
			int n=0;
			while(sp.next()){
				spId=sp.getString("ma") +"-"+ sp.getString("pk_seq");
				spgia=sp.getString("ten") +"-"+sp.getString("giaban");
				if(spgia.toUpperCase().startsWith(query.toUpperCase())||spgia.toUpperCase().indexOf(query.toUpperCase())>=0
						||spId.toUpperCase().startsWith(query.toUpperCase())||spId.toUpperCase().indexOf(query.toUpperCase())>=0)
				{
					String SanPham=spId + "-->" + spgia;
					out.println(SanPham + "\n");
					n++;
					if(n>=50)
						break;
				}
			}
			sp.close();
		}*/
		db.shutDown();
		db=null;
	}catch(SQLException e){
		e.printStackTrace();
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Best - Project</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("</body>\r\n");
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
