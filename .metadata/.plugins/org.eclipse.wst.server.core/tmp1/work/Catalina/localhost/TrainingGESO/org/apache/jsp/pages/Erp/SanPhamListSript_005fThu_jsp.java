package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import geso.erp.db.sql.dbutils;
import geso.dms.center.util.*;
import java.net.URLDecoder;

public final class SanPhamListSript_005fThu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	dbutils db = new dbutils();
	try
	{
		 
		String userId = (String) session.getAttribute("userId");
		
		String command = "";
		
		request.setCharacterEncoding("UTF-8");	
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		String query = (String)request.getQueryString(); 
	 	System.out.println(query);
		String view = query;
	   	query = new String(query.substring(query.indexOf("&letters=") + 9, query.length()).getBytes("UTF-8"), "UTF-8");
	   	query = URLDecoder.decode(query, "UTF-8").replace("+", " ");
	   	// query se la cai ky tu ma nguoi dung danh vao o tim kiem
	   	Utility Ult = new Utility();
	   	query = Ult.replaceAEIOU(query);
	   	//Lay cai chu ma minh danh trong input
	   	System.out.println("query trong SanPhamERPList: " + query);
	   
	   	  command=" SELECT SP.PK_SEQ,SP.MA,SP.TEN,ISNULL(DV.TEN,'') AS DONVI,ISNULL(GIABAN,0) AS GIABAN, 0 AS CHIETKHAU "+
	   		 	  " FROM SANPHAM SP LEFT JOIN DONVI DV ON DV.PK_SEQ=SP.DONVI_FK "+
	   		 	  " WHERE SP.TIMKIEM LIKE '%"+query+"%'";
	   			NumberFormat formatter = new DecimalFormat("#,###,###.###");
				System.out.println("Lay san pham / vat tu / tai san: " + command);
				ResultSet sp = db.get(command);
				int j = 0;
				if(sp != null)
				{ 
						while(sp.next())
						{
							
							String tenSP = Ult.replaceAEIOU(sp.getString("ten"));
							String ma = Ult.replaceAEIOU(sp.getString("ma"));
							String tensp = sp.getString("ten");
							out.print("###" + sp.getString("ma") + " -- " + tensp + " [" + sp.getString("donvi") + "] [" + formatter.format(sp.getDouble("giaban"))  + "] [" + formatter.format(sp.getDouble("chietkhau")) + "] [" + sp.getString("pk_seq") + "]|"); //luu y: bat buoc phai co dau phan cach '|' o cuoi moi dong'
						}	
						sp.close();
					
				}
	    
		db.shutDown();
		
	}
	catch(Exception ex){ System.out.println("Xay ra exception roi ban..."); }

      out.write("\r\n");
      out.write("\r\n");
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
