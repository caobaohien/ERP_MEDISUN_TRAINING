package geso.erp.servlets.donbanhang_thu.imp;


import geso.dms.center.util.Utility;
import geso.erp.beans.donbanhang_thu.*;
import geso.erp.beans.donbanhang_thu.imp.ChiTietDonHang_Thu;
import geso.erp.beans.donbanhang_thu.imp.DonBanHangList_Thu;
import geso.erp.beans.donbanhang_thu.imp.DonBanHang_Thu;

import geso.erp.beans.sanpham_thu.ISanPham_Thu;
import geso.erp.beans.sanpham_vy.ISanPham_Vy;
import geso.erp.beans.sanpham_vy.imp.SanPham_Vy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class DonBanHangNew_ThuSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonBanHangNew_ThuSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    
	    
	    HttpSession session = request.getSession();	 
	    Utility util = new Utility();
	    
	    String querystring = request.getQueryString();
	    String userId = util.getUserId(querystring);
	    
	    if (userId.length() == 0)
	    	userId = util.antiSQLInspection(request.getParameter("userId"));
	    
	    String action = util.getAction(querystring);
	    String maDonHang = util.getId(querystring);
	    String msg = "";
	    
	    IDonBanHang_Thu obj = new DonBanHang_Thu();
	    obj.setMaDonHang(maDonHang);
	 
	    //Load gia tri da co san 
	    if(querystring.indexOf("update") >= 0){
	    	String id = request.getParameter("update");
	    	obj.init("");
	    	session.setAttribute("action", "update");
	    }
	   
	    if (action.equals("display")) {
	    	obj.init("");
			session.setAttribute("obj", obj);
			String nextJSP = "/TrainingGESO/pages/Erp/DonBanHangDisplay_Thu.jsp";
			response.sendRedirect(nextJSP);
		}
	    else{
	    //????a ?????i t?????ng v??o bi???n donhangmoi nh??? session ????a ??i ?????n jsp
	    session.setAttribute("obj", obj);
	    String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew_Thu.jsp";
		response.sendRedirect(nextJSP);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	
			//?????nh d???ng
			request.setCharacterEncoding("UTF-8");
		    response.setCharacterEncoding("UTF-8");
		    response.setContentType("text/html; charset=UTF-8");
		    
		    //t???o ????n h??ng m???i
		    IDonBanHang_Thu obj = new DonBanHang_Thu();
		   // obj.getRsKhachHang();
		    obj.layKhachHang();
		    String action = request.getParameter("action");
		    action = (action == null) ? "" : action;
		    
		    System.out.print(action);
		    
		    Utility util = new Utility();
		    
		    //g???i session
			HttpSession session = request.getSession();
			//l???y c??c thu???c t??nh g??n cho obj
			
		    String userId = util.antiSQLInspection(request.getParameter("userId"));
		    obj.setUserId(userId);
		    String msg = "";
		    
		    String maDonHang = util.antiSQLInspection(request.getParameter("maDonHang"));
		    obj.setMaDonHang(maDonHang == null ? "" : maDonHang);
		    System.out.println(maDonHang);
		  
		    String maKhachHang = util.antiSQLInspection(request.getParameter("maKhachHang"));
		    obj.setMaKhachHang(maKhachHang);
		    
		    String trangThai = util.antiSQLInspection(request.getParameter("trangThai")); 
		    obj.setTrangThai(trangThai == null ? "0" : trangThai);
		    
		    String ngayChungTu = util.antiSQLInspection(request.getParameter("ngayChungTu")); 
		    obj.setNgayChungTu(ngayChungTu == null ? "" : ngayChungTu);
		    
		    String tongTien = util.antiSQLInspection(request.getParameter("tongTien"));     
		    obj.setTongTien(Float.parseFloat(tongTien.replace(",", "")));
		    
		    obj.setMsg(msg);


		    //L???Y CHI TI???T ????N H??NG 
		    String[] PK_SEQ_sp = request.getParameterValues("PK_SEQ");
			String[] maSanPham = request.getParameterValues("maSanPham");
			String[] tenSanPham = request.getParameterValues("tenSanPham");
			String[] soLuong = request.getParameterValues("soLuong");
			String[] donViTinh = request.getParameterValues("donViTinh");
			String[] giaBan = request.getParameterValues("giaBan");
			String[] thanhtien = request.getParameterValues("thanhTien");
			
			//add v??o danhsachsanpham
			List<IChiTietDonHang_Thu> ds_sanpham=new ArrayList<IChiTietDonHang_Thu>();
		    if(maSanPham!=null){
		    	for (int i = 0; i < maSanPham.length; i++) {
		    		if(tenSanPham[i].trim().length()>0 && maSanPham[i].trim().length()>0 && soLuong[i]!="" &&thanhtien[i]!="" ){
		    			IChiTietDonHang_Thu sp=new ChiTietDonHang_Thu(
			    				PK_SEQ_sp[i], 
			    				maSanPham[i], 
			    				tenSanPham[i], 
			    				Float.parseFloat((giaBan[i]).replaceAll(",", "")),
			    				donViTinh[i], 
			    				Integer.parseInt(soLuong[i]),
			    				Float.parseFloat(thanhtien[i])
			    				);
			    		
			    		ds_sanpham.add(sp);
		    		}
		    		
				}
		    }
		    
			obj.setDanhSachSanPham(ds_sanpham);
			
			

		     if(action.equals("taomoi")) { 
		    	if(!obj.insert()){
		    			// l??u kh??ng th??nh c??ng th?? t???o ?????i t?????ng m???i chuy???n trang donhangnew
		    			//obj.getRsKhachHang();
		    			obj.layKhachHang();
		    			session.setAttribute("obj", obj);
		    			session.setAttribute("action","taomoi");
		    			//ph???i xet action ban ?????u
			    		String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew_Thu.jsp";
			    		response.sendRedirect(nextJSP);
			    		System.out.println(obj.getMsg());
		    	}else {
		    		//n???u l??u xong th?? hi???n th??? l???i trang t???ng
		    			  	IDonBanHangList_Thu obj1 = new DonBanHangList_Thu();
		    			  	obj1.init("");
		    			    // kh???i t???o ra 1 session
		    			    session.setAttribute("obj", obj1);
		    			    String nextJSP = "/TrainingGESO/pages/Erp/DonBanHang_Thu.jsp";
		    				response.sendRedirect(nextJSP);
		    		}
		    }else if(action.equals("update")){
		    	//n???u insert kh??ng th??nh
		    	if(!obj.update()){
		    		obj.layKhachHang();
	    			session.setAttribute("obj", obj);
	    			session.setAttribute("action","update");
	    			//ph???i xet action ban ?????u
		    		String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew_Thu.jsp";
		    		response.sendRedirect(nextJSP);
		    		System.out.println(obj.getMsg());
		    	}else
		    	{
		    		//n???u l??u xong th?? hi???n th??? l???i trang t???ng
		    			  	IDonBanHangList_Thu obj1 = new DonBanHangList_Thu();
		    			  	obj1.init("");
		    			    // kh???i t???o ra 1 session
		    			    session.setAttribute("obj", obj1);
		    			    String nextJSP = "/TrainingGESO/pages/Erp/DonBanHang_Thu.jsp";
		    				response.sendRedirect(nextJSP);
		    		}
		    }else{
		    	//obj.getRsKhachHang();
		    	obj.layKhachHang();
		    	session.setAttribute("obj", obj);
		    	String nextJSP = "/TrainingGESO/pages/Erp/DonHangNew_Thu.jsp";
		    }
		     
	}
}
