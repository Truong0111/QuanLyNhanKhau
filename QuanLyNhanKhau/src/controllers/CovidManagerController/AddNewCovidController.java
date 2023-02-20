/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.CovidManagerController;

import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import models.CovidModel;
import services.MysqlConnection;

/**
 *
 * @author Administrator
 */
public class AddNewCovidController {
    public int checkCMT(String cmt){
        try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            String query = "SELECT * FROM nhan_khau LEFT JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE soCMT = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, cmt);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getInt("ID");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra! vui lòng kiểm tra lại.", "Warning!!", JOptionPane.WARNING_MESSAGE);
        }
        return -1;
    }
    
    public boolean addNew(CovidModel covidModel) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "INSERT INTO nguoi_bi_covid(idNhanKhauCovid, ngayKhaiBao, hoTen, bietDanh, namSinh, gioiTinh, noiSinh, nguyenQuan, noiThuongTru, diaChiHienNay, soCMT, tongSoMuiTiem, ngayTiem)"
                    + " value (?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, covidModel.getIdNhanKhauCovid());
            Date ngayKhaiBao = new Date(LocalDate.now().toEpochDay());
            preparedStatement.setDate(2, ngayKhaiBao);
            preparedStatement.setString(3, covidModel.getHoTen());
            preparedStatement.setString(4, covidModel.getBietDanh());
            preparedStatement.setString(5, covidModel.getNamSinh());
            preparedStatement.setString(6, covidModel.getGioiTinh());
            preparedStatement.setString(7, covidModel.getNoiSinh());
            preparedStatement.setString(8, covidModel.getNguyenQuan());
            preparedStatement.setString(9, covidModel.getNoiThuongTru());
            preparedStatement.setString(10, covidModel.getDiaChiHienNay());
            preparedStatement.setString(11, covidModel.getSoCMT());
            preparedStatement.setInt(12, covidModel.getTongSoMuiTiem());
            Date ngayTiem = new Date(covidModel.getNgayTiem().getTime());
            preparedStatement.setDate(13, ngayTiem);
            
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra! vui lòng kiểm tra lại.", "Warning!!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
}
