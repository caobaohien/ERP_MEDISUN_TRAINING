package geso.erp.beans.sanpham_trinh.imp;

import java.sql.ResultSet;
import java.sql.SQLException;


import geso.erp.beans.sanpham_trinh.ISanPhamList_Trinh;
import geso.erp.beans.sanpham_trinh.ISanPham_Trinh;
import geso.erp.db.sql.dbutils;

public class SanPham_Trinh implements ISanPham_Trinh {
	
	private String maSanPham;
	private String maSanPhamAo;
	private String tenSanPham;
	private String maDonVi;
	private String trangThai;
	
	private String message;
	private String UserId;
	
	private dbutils db;
	private ResultSet rsSanPham;
	private ResultSet rsDonVi;
	private Double giaBan;
	private Double soLuong;
	
	
	
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public Double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(Double soLuong) {
		this.soLuong = soLuong;
	}
	public String getMaSanPhamAo() {
		return maSanPhamAo;
	}
	public void setMaSanPhamAo(String maSanPhamAo) {
		this.maSanPhamAo = maSanPhamAo;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getMaDonVi() {
		return maDonVi;
	}
	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public dbutils getDb() {
		return db;
	}
	public void setDb(dbutils db) {
		this.db = db;
	}
	public ResultSet getRsSanPham() {
		return rsSanPham;
	}
	public void setRsSanPham(ResultSet rsSanPham) {
		this.rsSanPham = rsSanPham;
	}
	public ResultSet getRsDonVi() {
		return rsDonVi;
	}
	public void setRsDonVi(ResultSet rsDonVi) {
		this.rsDonVi = rsDonVi;
	}
	public SanPham_Trinh(String maSanPham, String tenSanPham, String maDonVi,
			String trangThai, String message, String userId, dbutils db,
			ResultSet rsSanPham, ResultSet rsDonVi) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.maDonVi = maDonVi;
		this.trangThai = trangThai;
		this.message = message;
		UserId = userId;
		this.db = db;
		this.rsSanPham = rsSanPham;
		this.rsDonVi = rsDonVi;
	}
	
	public SanPham_Trinh() {
		super();
		this.maSanPham = "";
		this.maSanPhamAo = "";
		this.tenSanPham = "";
		this.maDonVi = "";
		this.trangThai = "";
		this.message = "";
		this.soLuong = 0.0;
		this.giaBan = 0.0;
		UserId = "";
		this.db = new dbutils();
		
	}
	
	//h??m close db
	public void closeDb(){
		this.db.shutDown();
	}
	
	//h??m kh???i t???o
	public void init(String chuoi){
		String query = "";
		if(chuoi.length() > 0){
			query = chuoi;
		}
		else {
			try {
				query = "SELECT SANPHAM.PK_SEQ AS MASANPHAM, SANPHAM.MA AS MA, SANPHAM.TEN AS TENSANPHAM, " +
				"DONVI.TEN AS TENDONVI,DONVI.PK_SEQ AS MADONVI, ISNULL(SANPHAM.TRANGTHAI,'') AS TRANGTHAI, SANPHAM.SOLUONG, " +
				"NHANVIEN.TEN as TENNGUOITAO, SANPHAM.NGAYTAO as NGAYTAO, SANPHAM.GIABAN AS GIABAN " +
				"FROM SANPHAM LEFT JOIN DONVI ON SANPHAM.DONVI_FK = DONVI.PK_SEQ " +
				"LEFT JOIN NHANVIEN ON SANPHAM.NGUOITAO = NHANVIEN.PK_SEQ WHERE SANPHAM.PK_SEQ = " + this.maSanPham;
				
				ResultSet rs = db.get(query);
				
				if(rs.next()){
					this.maSanPham = rs.getString("MASANPHAM");
					this.maSanPhamAo = rs.getString("MA");
					this.tenSanPham = rs.getString("TENSANPHAM");
					this.maDonVi =  rs.getString("MADONVI");
					this.trangThai = rs.getString("TRANGTHAI");
					this.soLuong = Double.parseDouble(rs.getString("SOLUONG"));
					this.giaBan = Double.parseDouble(rs.getString("GIABAN"));
				}
				rs.close(); //nh??? l?? ph???i ?????ng db.
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.layDonVi();
	}
	
	//h??m l???y ????n v???
	public void layDonVi(){
		this.rsDonVi = db.get("SELECT DONVI.PK_SEQ AS MADONVI, DONVI.TEN AS TENDONVI FROM DONVI");
	}
	
	//h??m save gi?? tr???
	public boolean save(){
		
		try {//ki???m tra d??? li???u tr?????c khi th???c hi???n truy v???n
			if(this.tenSanPham == "" || this.tenSanPham == null || this.maDonVi == null || this.soLuong <= 0 || this.giaBan <= 0)
			{
				throw new Exception();
			}
			else{
				
				db.getConnection().setAutoCommit(false);
				String query = "";
				String truyvan = "SELECT *FROM SANPHAM WHERE SANPHAM.PK_SEQ = " + this.maSanPham;
				ResultSet rs =db.get(truyvan);
				if(rs != null){ 
					//update
					query = "UPDATE SANPHAM SET MA = '" + this.maSanPhamAo + "', TEN = '" + this.tenSanPham + "', " +
							"TRANGTHAI = '" + this.trangThai + "', DONVI_FK = '" + this.maDonVi + 
							"', NGUOISUA = '" + this.UserId + "', NGAYSUA = SYSDATETIME(), GIABAN= '" + this.giaBan + "', SOLUONG = '" + this.soLuong + "' WHERE PK_SEQ = " + this.maSanPham;
					
					
					
				}else{ //insert
					query = "INSERT INTO SANPHAM (MA, TEN, TRANGTHAI, DONVI_FK, NGAYTAO, NGUOITAO, GIABAN, SOLUONG) " +
							"VALUES ('" + this.maSanPhamAo + "', '" + this.tenSanPham + "', '" + this.trangThai + "'," +
									" '" + this.maDonVi+ "', SYSDATETIME(),'" + this.UserId + "', '" + this.giaBan + "', '" + this.soLuong + "')";
				
				}
				
				if(db.update(query) == false){
					db.getConnection().rollback();
					this.message = "Kh??ng th??? th???c hi???n d??ng l???nh : " + query;
					return false;
					
				}
				db.getConnection().commit();
				db.getConnection().setAutoCommit(true);
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			db.update("rollback");
			
			this.message ="L???i : " + e.getMessage();
			e.printStackTrace();
			
			if (this.soLuong <= 0.0) {
				this.message += "S??? l?????ng kh??ng th??? ??m ho???c b???ng kh??ng \n";
			}
			if (this.maSanPhamAo.equals("")) {
				this.message += "Kh??ch h??ng kh??ng ???????c thi???u \n";
			}
			if (this.UserId.length() == 0) {
				this.message += "H???t phi??n l??m vi???c. H??y ????ng nh???p l???i \n";
			}
			if (this.giaBan <= 0) {
				this.message += "Gi?? b??n ph???i l???n h??n 0 \n";
			}
			return false;
		}
		
		
		return true;
	}
	
	//h??m chuy???n tr???ng th??i cho s???n ph???m
	public boolean DeleteSP(){
		try {

				db.getConnection().setAutoCommit(false);
				String query = "";
					query = "UPDATE SANPHAM SET TRANGTHAI = '0', NGUOISUA = '" + this.UserId + "', NGAYSUA = SYSDATETIME() WHERE PK_SEQ = " + this.maSanPham;
				
				if(db.update(query) == false){
					db.getConnection().rollback();
					this.message = "Kh??ng th??? th???c hi???n d??ng l???nh : " + query;
					return false;
					
				}
				db.getConnection().commit();
				db.getConnection().setAutoCommit(true);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			db.update("rollback");
			
			this.message ="L???i : " + e.getMessage();
			e.printStackTrace();
			
			return false;
		}
		
		
		return true;
	}
	
	
}
