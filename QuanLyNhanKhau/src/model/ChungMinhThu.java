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
public class ChungMinhThu {
    private int ID;
    private int idhNhanKhau;
    private String soCMT;
    private Date ngayCap;
    private String noiCap;

    public int getID() {
        return ID;
    }

    public int getIdhNhanKhau() {
        return idhNhanKhau;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIdhNhanKhau(int idhNhanKhau) {
        this.idhNhanKhau = idhNhanKhau;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    
    
}
