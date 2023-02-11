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
public class KhaiTu {
    private int ID;
    private String soGiayKhaiTu;
    private int idNguoiKhai;
    private int idNguoiChet;
    private Date ngayKhai;
    private Date ngayChet;
    private String lyDoChet;

    public int getID() {
        return ID;
    }

    public String getSoGiayKhaiTu() {
        return soGiayKhaiTu;
    }

    public int getIdNguoiKhai() {
        return idNguoiKhai;
    }

    public int getIdNguoiChet() {
        return idNguoiChet;
    }

    public Date getNgayKhai() {
        return ngayKhai;
    }

    public Date getNgayChet() {
        return ngayChet;
    }

    public String getLyDoChet() {
        return lyDoChet;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSoGiayKhaiTu(String soGiayKhaiTu) {
        this.soGiayKhaiTu = soGiayKhaiTu;
    }

    public void setIdNguoiKhai(int idNguoiKhai) {
        this.idNguoiKhai = idNguoiKhai;
    }

    public void setIdNguoiChet(int idNguoiChet) {
        this.idNguoiChet = idNguoiChet;
    }

    public void setNgayKhai(Date ngayKhai) {
        this.ngayKhai = ngayKhai;
    }

    public void setNgayChet(Date ngayChet) {
        this.ngayChet = ngayChet;
    }

    public void setLyDoChet(String lyDoChet) {
        this.lyDoChet = lyDoChet;
    }
    
    
}
