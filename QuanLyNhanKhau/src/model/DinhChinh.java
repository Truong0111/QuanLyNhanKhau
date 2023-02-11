/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class DinhChinh {
    private int ID;
    private int idHoKhau;
    private String thongTinThayDoi;
    private String thayDoiTu;
    private String thayDoiThanh;
    private Date ngayThayDoi;
    private int idNguoiThayDoi;

    public int getID() {
        return ID;
    }

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public String getThongTinThayDoi() {
        return thongTinThayDoi;
    }

    public String getThayDoiTu() {
        return thayDoiTu;
    }

    public String getThayDoiThanh() {
        return thayDoiThanh;
    }

    public Date getNgayThayDoi() {
        return ngayThayDoi;
    }

    public int getIdNguoiThayDoi() {
        return idNguoiThayDoi;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public void setThongTinThayDoi(String thongTinThayDoi) {
        this.thongTinThayDoi = thongTinThayDoi;
    }

    public void setThayDoiTu(String thayDoiTu) {
        this.thayDoiTu = thayDoiTu;
    }

    public void setThayDoiThanh(String thayDoiThanh) {
        this.thayDoiThanh = thayDoiThanh;
    }

    public void setNgayThayDoi(Date ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public void setIdNguoiThayDoi(int idNguoiThayDoi) {
        this.idNguoiThayDoi = idNguoiThayDoi;
    }
    
    
}
