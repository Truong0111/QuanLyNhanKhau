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
public class GiaDinh {
    private int ID;
    private int idNhanKhau;
    private String hoTen;
    private Date namSinh;
    private String gioiTinh;
    private String quanHeVoiNhanKhau;
    private String ngheNghiep;
    private String diaChiHienTai;

    public int getID() {
        return ID;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getQuanHeVoiNhanKhau() {
        return quanHeVoiNhanKhau;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getDiaChiHienTai() {
        return diaChiHienTai;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQuanHeVoiNhanKhau(String quanHeVoiNhanKhau) {
        this.quanHeVoiNhanKhau = quanHeVoiNhanKhau;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setDiaChiHienTai(String diaChiHienTai) {
        this.diaChiHienTai = diaChiHienTai;
    }
    
    
}
