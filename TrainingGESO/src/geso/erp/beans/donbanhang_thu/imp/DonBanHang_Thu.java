package geso.erp.beans.donbanhang_thu.imp;

import geso.dms.center.util.Phan_Trang;
import geso.erp.beans.donbanhang_thu.IChiTietDonHang_Thu;
import geso.erp.beans.donbanhang_thu.IDonBanHangList_Thu;
import geso.erp.beans.donbanhang_thu.IDonBanHang_Thu;
import geso.erp.beans.sanpham_thu.ISanPham_Thu;
import geso.erp.beans.sanpham_thu.imp.SanPham_Thu;
import geso.erp.beans.sanpham_vy.ISanPham_Vy;
import geso.erp.db.sql.dbutils;

import java.sql.Date;
import java.sql.ResultSet;
import java.text.DateFormat;

import java.util.ArrayList;
import java.util.List;

public class DonBanHang_Thu implements IDonBanHang_Thu {

	String userId;
	private String maDonHang;
	private String trangThai;
	private String maKhachHang;
	private String tenKhachHang;
	private String ngayChungTu;
	private String msg;
	private dbutils db;
	private ResultSet rsBanHang;
	private ResultSet rsKhachHang;
	float tongTien;
	
	List<IChiTietDonHang_Thu> danhSachSanPham;

	

	public List<IChiTietDonHang_Thu> getDanhSachSanPham() {
		return danhSachSanPham;
	}

	public void setDanhSachSanPham(List<IChiTietDonHang_Thu> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}

	public float getTongTien() {
		return tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMaDonHang() {
		return maDonHang;
	}

	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getNgayChungTu() {
		return ngayChungTu;
	}

	public void setNgayChungTu(String ngayChungTu) {
		this.ngayChungTu = ngayChungTu;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public dbutils getDb() {
		return db;
	}

	public void setDb(dbutils db) {
		this.db = db;
	}

	public ResultSet getRsBanHang() {
		return rsBanHang;
	}

	public void setRsBanHang(ResultSet rsBanHang) {
		this.rsBanHang = rsBanHang;
	}

	public ResultSet getRsKhachHang() {
		return rsKhachHang;
	}

	public void setRsKhachHang(ResultSet rsKhachHang) {
		this.rsKhachHang = rsKhachHang;
	}

	public DonBanHang_Thu() {
		super();
		this.userId = "";
		this.maKhachHang = "";
		this.ngayChungTu = "";
		this.msg = "";
		this.trangThai = "";
		this.db = new dbutils();
		this.danhSachSanPham = new ArrayList<IChiTietDonHang_Thu>();

	}
	
	
	@Override
	public void DBclose() {
		this.db.shutDown();
	}

	@Override
	public void init(String s) {
		String query = "";
		if (s.length() > 0) {
			query = s;
		} else {
			try {
				
				//TH???C HI???N T???O ?????I T?????NG ????N H??NG
				query = "SELECT BH.PK_SEQ AS MADONHANG, "
						+ "KH.PK_SEQ AS MAKHACHHANG, "
						+ "KH.TEN AS TENKHACHHANG, " + "BH.NGAYCHUNGTU, "
						+ "BH.TONGTIEN " + "FROM BANHANG BH "
						+ "LEFT JOIN KHACHHANG KH "
						+ "ON BH.KHACHHANG_FK = KH.PK_SEQ "
						+ "WHERE BH.PK_SEQ = " + this.maDonHang;
				ResultSet resultSet = db.get(query);
				if (resultSet.next()) {
					this.maDonHang = resultSet.getString("MADONHANG");
					this.maKhachHang = resultSet.getString("MAKHACHHANG");
					this.tenKhachHang = resultSet.getString("TENKHACHHANG");
					this.ngayChungTu = resultSet.getString("NGAYCHUNGTU");
					this.tongTien = resultSet.getFloat("TONGTIEN");

				}
				resultSet.close();
				
				//TH???C HI???N T???O CHI TI???T S???N PH???M
				String query1="SELECT CTDH.DONHANG_FK AS PK_SEQDONHANG,"+
								"CTDH.THANHTIEN AS THANHTIEN, " +
								"CTDH.SOLUONG AS SOLUONG, " +
								"SP.PK_SEQ AS PK_SEQSANPHAM, "+
								"SP.MA AS MASANPHAM, "+
								"SP.TEN AS TENSANPHAM, "+
								"SP.GIABAN AS GIABAN, "+
								"SP.DONVI_FK AS MADONVI, "+
								"DV.TEN AS TENDONVI "+
								"from ((DONHANG_SANPHAM CTDH LEFT JOIN SANPHAM SP ON CTDH.SANPHAM_FK=SP.PK_SEQ) "+
								"LEFT JOIN DONVI DV ON SP.DONVI_FK=DV.PK_SEQ) "+
								"WHERE CTDH.DONHANG_FK= "+ this.maDonHang;
				
				System.out.print("cau lenh lay ds sp: "+ query1 +"\n");
				//l??m s???ch danh s??ch
				this.danhSachSanPham.clear();
				// l???y d??? li???u ????? v??o danh s??ch (????ng l???i)
				ResultSet rsSanPham = db.get(query1);
				while(rsSanPham.next()){
						IChiTietDonHang_Thu sanpham=new ChiTietDonHang_Thu(
								rsSanPham.getString("PK_SEQSANPHAM"), 
								rsSanPham.getString("MASANPHAM"),
								rsSanPham.getString("TENSANPHAM"),
								rsSanPham.getFloat("GIABAN"),
								rsSanPham.getString("TENDONVI"),
								rsSanPham.getInt("SOLUONG"), 
								rsSanPham.getFloat("THANHTIEN"));	
						//contructor t???o ra sanphamthu
						System.out.println( "teen sap: "+rsSanPham.getString("TENSANPHAM") +"\n");
						
						sanpham.setTenSanPham(rsSanPham.getString("TENSANPHAM"));
						this.danhSachSanPham.add(sanpham);
						}
				
				
				
				rsSanPham.close();
				
				
			} catch (Exception er) {
				er.printStackTrace();
			}
		}
		layKhachHang();
	}
	


	@Override
	public boolean update() {
		
		try {
			if (tongTien <= 0.0 || maKhachHang.equals("") || this.userId.length() == 0) {
				throw new Exception();
			}
			//m??? k???t n???i
			db.getConnection().setAutoCommit(false);
			//update ????n h??ng c?? v??o db
			String query = "UPDATE BANHANG SET KHACHHANG_FK = '"+this.maKhachHang+"', " +
							"NGAYCHUNGTU = '"+this.ngayChungTu+"', " +
							"TONGTIEN = "+this.tongTien+" " +
							"WHERE PK_SEQ = '"+ this.maDonHang+"'";
			System.out.print( "lenh update: " + query);
			if (!db.update(query)) {
				//n???u kh??ng th???c hi???n ???????c insert ==>b??o l???i
				db.getConnection().rollback();
				this.msg = "Kh??ng th??? th???c hi???n d??ng l???nh ; " + query
						+ "\n";
				return false;
			}
			else {
				//???? update th??nh c??ng => x??a chi ti???t ????n h??ng, th??m chi ti???t ????n h??ng
				String delete_query="DELETE DONHANG_SANPHAM WHERE DONHANG_FK= '" + this.maDonHang+"'";
				if (!db.update(delete_query)) {
					//n???u kh??ng th???c hi???n ???????c insert ==>b??o l???i
					db.getConnection().rollback();
					this.msg = "Kh??ng th??? th???c hi???n d??ng l???nh ; " + delete_query
							+ "\n";
					return false;
				}
				else{
					for (int i = 0; i < this.danhSachSanPham.size(); i++) {
						
						IChiTietDonHang_Thu sp=danhSachSanPham.get(i);
						String query1= "insert into DONHANG_SANPHAM (DONHANG_FK,SANPHAM_FK,SOLUONG,DONGIA,THANHTIEN) "+
									  " values ('"+ this.maDonHang+ "',"+ sp.getPK_SEQ() +", "+sp.getSoLuong() +", "
									  +sp.getDonGia()+ ", " + Math.round(sp.getSoLuong()*sp.getDonGia())+")";
									  
								
						if (!db.update(query1)) {
							//n???u kh??ng th???c hi???n ???????c insert ==>b??o l???i
							db.getConnection().rollback();
							this.msg = "Kh??ng th??? th???c hi???n d??ng l???nh ; " + query1
									+ "\n";
							return false;
							}
					}
				}	
			}
				
			//????ng k???t n???i
			db.getConnection().commit();
			db.getConnection().setAutoCommit(true);

		} catch (Exception e) {
			db.update("rollback");
			this.msg += "L???i : " + e.getMessage() + "\n";
			e.printStackTrace();
					if (this.tongTien <= 0.0) {
						this.msg += "T???ng ti???n kh??ng th??? ??m ho???c b???ng kh??ng \n";
					}
					if (this.maKhachHang.equals("")) {
						this.msg += "Kh??ch h??ng kh??ng ???????c thi???u \n";
					}
					if (this.userId.length() == 0) {
						this.msg += "H???t phi??n l??m vi???c. H??y ????ng nh???p l???i \n";
					}
					return false;
			}
		return true;
	
	}
 
	public boolean insert() {
		
		try {
			if (tongTien <= 0.0 || maKhachHang.equals("") || this.userId.length() == 0) {
				throw new Exception();
			}
			//m??? k???t n???i
			db.getConnection().setAutoCommit(false);
			//th??m ????n h??ng m???i v??o db
			String query = "INSERT INTO BANHANG (KHACHHANG_FK, " + "NGUOITAO, "
					+ "NGAYTAO, " + "NGAYCHUNGTU, " + "TRANGTHAI, "
					+ "TONGTIEN) " + "VALUES " + "('" + this.maKhachHang
					+ "', " + "'" + this.userId + "', " + "SYSDATETIME(), "
					+ "'" + this.ngayChungTu + "', " + "'" + this.trangThai
					+ "', " + "'" + this.tongTien + "')";
			if (!db.update(query)) {
				//n???u kh??ng th???c hi???n ???????c insert ==>b??o l???i
				db.getConnection().rollback();
				this.msg = "Kh??ng th??? th???c hi???n d??ng l???nh ; " + query
						+ "\n";
				return false;
				}
			else {
				//insert ???????c, l???y m?? ????n h??ng m???i th??m v??o
				String PK_SEQ_new="";
				query = "SELECT SCOPE_IDENTITY() AS MADONHANG";
				ResultSet rsDhnew = db.get(query);
				if (rsDhnew.next()){
					PK_SEQ_new = rsDhnew.getString("MADONHANG");
				}
				//insert chi ti???t ????n h??ng
				for (int i = 0; i < this.danhSachSanPham.size(); i++) {
					
					IChiTietDonHang_Thu sp=danhSachSanPham.get(i);
					String query1= "insert into DONHANG_SANPHAM (DONHANG_FK,SANPHAM_FK,SOLUONG,DONGIA,THANHTIEN) "+
								  " values ('"+PK_SEQ_new+ "',"+ sp.getPK_SEQ() +", "+sp.getSoLuong()+", "
								  +sp.getDonGia()+ ", " + Math.round(sp.getSoLuong()*sp.getDonGia())+")";
								  
							
					if (!db.update(query1)) {
						//n???u kh??ng th???c hi???n ???????c insert ==>b??o l???i
						db.getConnection().rollback();
						this.msg = "Kh??ng th??? th???c hi???n d??ng l???nh ; " + query1
								+ "\n";
						return false;
						}
				}
				
			}
				
			//????ng k???t n???i
			db.getConnection().commit();
			db.getConnection().setAutoCommit(true);

		} catch (Exception e) {
			db.update("rollback");
			this.msg += "L???i : " + e.getMessage() + "\n";
			e.printStackTrace();
					if (this.tongTien <= 0.0) {
						this.msg += "T???ng ti???n kh??ng th??? ??m ho???c b???ng kh??ng \n";
					}
					if (this.maKhachHang.equals("")) {
						this.msg += "Kh??ch h??ng kh??ng ???????c thi???u \n";
					}
					if (this.userId.length() == 0) {
						this.msg += "H???t phi??n l??m vi???c. H??y ????ng nh???p l???i \n";
					}
					return false;
			}
		return true;
	}
	
	
	
	public void layKhachHang() {
		String query = "select PK_SEQ AS MAKHACHHANG,TEN AS TENKHACHHANG from KHACHHANG";
		this.rsKhachHang = this.db.get(query);
	}
	
	//l???y th??ng tin kh??ch h??ng c???a m?? ????n h??ng hi???n t???i
	public void LayKhachHangTheoMaDonHang(){
		this.rsKhachHang = db.get("Select KHACHHANG.TEN, KHACHHANG.DIACHI, KHACHHANG.DIENTHOAI " +
				"FROM KHACHHANG INNER JOIN BANHANG ON KHACHHANG.PK_SEQ = BANHANG.KHACHHANG_FK " +
				"WHERE BANHANG.PK_SEQ = " + this.maDonHang);
	}

	
	@Override
	public boolean deleteDonHang() {
		try {
			db.getConnection().setAutoCommit(false);
			String query = "UPDATE BANHANG SET TRANGTHAI='2' WHERE PK_SEQ = " + this.maDonHang;
			if (db.updateReturnInt(query) != 1) {
				db.getConnection().rollback();
				this.msg = "Kh??ng th??? c???p nh???t d??ng l???nh: " + query;
				return false;
			}

			db.getConnection().commit();
			db.getConnection().setAutoCommit(true);

			return true;
		} catch (Exception er) {
			db.update("rollback");
			er.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean chotDonHang() {
		try {
			db.getConnection().setAutoCommit(false);
			String query = "UPDATE BANHANG SET TRANGTHAI='1' WHERE PK_SEQ = " + this.maDonHang;
			if (db.updateReturnInt(query) != 1) {
				db.getConnection().rollback();
				this.msg = "Kh??ng th??? c???p nh???t d??ng l???nh: " + query;
				return false;
			}

			db.getConnection().commit();
			db.getConnection().setAutoCommit(true);

			return true;
		} catch (Exception er) {
			db.update("rollback");
			er.printStackTrace();
			return false;
		}
	}

}
