package geso.training.bean.donhang;

import geso.training.bean.sanpham.ISanPham;

import java.sql.ResultSet;
import java.util.List;

public interface IDonHang {
	public String getPK_SEQ();
	public void setPK_SEQ(String pk_seq);
	public String getMsg();
	public void setMsg(String msg);
	public String getUserId();
	public void setUserId(String userid);
	public String getUserTen();
	public void setUserTen(String userten);
	public String getMadh();
	public void setMadh(String Madh);
	public String getNgaydh();
	public void setNgaydh(String ngaydh);
	public String getMakh();
	public void setMakh(String Makh);
	public String getTenkh();
	public void setTenkh(String Tenkh);
	public double getVat();
	public void setVat(double Vat);
	public double getTongtientruocVat();
	public void setTongtientruocVat(double TongtientruocVat);
	public double getTongtiensauVat();
	public void setTongtiensauVat(double TongtiensauVat);
	public ResultSet getDhRs();
	public void setDhRs(ResultSet dhrs);
	public ResultSet getKhRs();
	public void setKhRs(ResultSet khrs);
	public List<ISanPham> getListSp();
	public void setListSp(List<ISanPham> listSp);
	public List<IDonHang> getDs_sanpham();
	public void setDs_sanpham(List<IDonHang> ds_sanpham);
	public String getKhDiachi();
	public void setKhDiachi(String Diachi);
	public String getKhDienthoai();
	public void setKhDienthoai(String Dienthoai);
	public String getTrangThai();
	public void setTrangThai(String trangthai);
	public void laykhachhang();
	public void init(String search);
	public void initsp();
	public boolean insert();
	public boolean Update();
	public boolean deleteDonHang();
	public boolean Delete();
	public boolean savekhachhang();
	public void DBClose();
	
	public String getPK_SEQsp();
	public void setPK_SEQsp(String pk_seq);
	public String getMaSP();
	public void setMaSP(String MaSP);
	public String getTenSP();
	public void setTenSP(String TenSP);
	public String getDVT();
	public void setDVT(String DVT);
	public int getSoLuong();
	public void setSoLuong(int SoLuong);
	public double getDonGia();
	public void setDonGia(double DonGia);
	public double getThanhTien();
	public void setThanhTien(double ThanhTien);
	public double getChietkhau();
	public void setChietkhau(double chietkhau);
}