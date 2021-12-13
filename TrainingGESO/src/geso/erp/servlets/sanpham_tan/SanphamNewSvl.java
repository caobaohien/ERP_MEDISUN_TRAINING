package geso.erp.servlets.sanpham_tan;

import geso.dms.center.util.Utility;
import geso.erp.beans.khachhang.IKhachhangList;
import geso.erp.beans.khachhang.imp.KhachhangList;
import geso.erp.beans.nhacungcap.INhacungcap;
import geso.erp.beans.nhacungcap.INhacungcapList;
import geso.erp.beans.nhacungcap.imp.Nhacungcap;
import geso.erp.beans.nhacungcap.imp.NhacungcapList;
import geso.erp.beans.sanpham_tan.ISanpham;
import geso.erp.beans.sanpham_tan.IThongtinsanpham;
import geso.erp.beans.sanpham_tan.imp.Sanpham;
import geso.erp.beans.sanpham_tan.imp.Thongtinsanpham;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NhacungcapNewSvl
 */
@WebServlet("/NhacungcapNewSvl")
public class SanphamNewSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SanphamNewSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// dùng để lấy dữ liệu
		request.setCharacterEncoding("UTF-8");
		
		// dung để điều hướng 
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    
	    HttpSession session = request.getSession();	 
	    Utility util = new Utility();
	    
	    String querystring = request.getQueryString();
	    String userId = util.getUserId(querystring);
	    
	    if (userId.length()==0)
	    	userId = util.antiSQLInspection(request.getParameter("userId"));
	    
	    String action = util.getAction(querystring);
	    
	    
	    String Id = util.getId(querystring);
	    
	    String msg = "";
	    
	    IThongtinsanpham ncc=new Thongtinsanpham();
	    ncc.setId(Id);
	    ncc.init();
	    ncc.CreateRs();
	     
	    session.setAttribute("obj", ncc);
	    String nextJSP = "/TrainingGESO/pages/Erp/sanphamnew.jsp";
		response.sendRedirect(nextJSP);
	     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		IThongtinsanpham obj=new Thongtinsanpham();
		
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    
	    String action = request.getParameter("action");
	    if (action == null){
	    	action = "";
	    }
	    
	    Utility util = new Utility();
	    
		HttpSession session = request.getSession();
	    String userId = util.antiSQLInspection(request.getParameter("userId"));
	    obj.setUserId(userId);
	    String id = util.antiSQLInspection(request.getParameter("id"));
	    
	    obj.setId(id==null?"":id);
	    String ma = util.antiSQLInspection(request.getParameter("ma"));
	    System.out.println("ma : "+ma);
	    obj.setMa(ma==null?"":ma);
	    String ten = util.antiSQLInspection(request.getParameter("ten"));
	     obj.setTen(ten==null?"":ten);
	     
	     String tinhtrang = util.antiSQLInspection(request.getParameter("tinhtrang")); 
	     obj.setTrangthai(tinhtrang==null?"0":tinhtrang);
	     
	     
	     String donvi = util.antiSQLInspection(request.getParameter("donvi")); 
	     obj.setDvt(donvi==null?"":donvi);
	     
	      
	     
	     
	     System.out.println("actiong: "+action);
	    	if(action.equals("save")) 
	    	{ 
	    		if(!obj.save()){
	    			// lưu không thành công
	    			session.setAttribute("obj", obj);
			    	response.sendRedirect("/TrainingGESO/pages/Erp/sanphamnew.jsp");
	    		}else{
	    				ISanpham sp=new Sanpham();
	    			    sp.init(""); 
	    			    // khởi tạo ra 1 session
	    			    
	    			    session.setAttribute("obj", sp);
	    			    String nextJSP = "/TrainingGESO/pages/Erp/Sanphamlist.jsp";
	    				response.sendRedirect(nextJSP);
	    		}
	    		
	    	}else{
	    		 
		    	
	    		session.setAttribute("obj", obj);
		    	response.sendRedirect("/TrainingGESO/pages/Erp/Sanphamlist.jsp");	
	    	}
	
	     
	    
	
		
	}
	
 
}
