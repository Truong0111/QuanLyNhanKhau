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
public class HoKhau {
    private int id;
    private String maHoKhau;
    private int idChuHo;
    private String maKhuVuc;
    private String diaChi;
    private Date ngayLap;
    private Date ngayChuyenDi;
    private String lyDoChuyen;
    private int nguoiThucHien;

    public int getId() {
        return id;
    }

    public String getMaHoKhau() {
        return maHoKhau;
    }

    public int getIdChuHo() {
        return idChuHo;
    }

    public String getMaKhuVuc() {
        return maKhuVuc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public Date getNgayChuyenDi() {
        return ngayChuyenDi;
    }

    public String getLyDoChuyen() {
        return lyDoChuyen;
    }

    public int getNguoiThucHien() {
        return nguoiThucHien;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaHoKhau(String maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public void setIdChuHo(int idChuHo) {
        this.idChuHo = idChuHo;
    }

    public void setMaKhuVuc(String maKhuVuc) {
        this.maKhuVuc = maKhuVuc;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setNgayChuyenDi(Date ngayChuyenDi) {
        this.ngayChuyenDi = ngayChuyenDi;
    }

    public void setLyDoChuyen(String lyDoChuyen) {
        this.lyDoChuyen = lyDoChuyen;
    }

    public void setNguoiThucHien(int nguoiThucHien) {
        this.nguoiThucHien = nguoiThucHien;
    }
    
    
}
