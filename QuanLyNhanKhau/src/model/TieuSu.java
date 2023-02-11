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
public class TieuSu {
    private int ID;
    private int idNhanKhau;
    private Date tuNgay;
    private Date denNgay;
    private String diaChi;
    private String ngheNghiep;
    private String noiLamViec;

    public int getID() {
        return ID;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }
    
    
}
