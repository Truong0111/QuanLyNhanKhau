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
public class TamTru {
    private int ID;
    private int idNhanKhau;
    private String maGiayTamTru;
    private String soDienThoaiNguoiDangKy;
    private Date tuNgay;
    private Date denNgay;
    private String lyDo;

    public int getID() {
        return ID;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public String getMaGiayTamTru() {
        return maGiayTamTru;
    }

    public String getSoDienThoaiNguoiDangKy() {
        return soDienThoaiNguoiDangKy;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public void setMaGiayTamTru(String maGiayTamTru) {
        this.maGiayTamTru = maGiayTamTru;
    }

    public void setSoDienThoaiNguoiDangKy(String soDienThoaiNguoiDangKy) {
        this.soDienThoaiNguoiDangKy = soDienThoaiNguoiDangKy;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
    
    
}
