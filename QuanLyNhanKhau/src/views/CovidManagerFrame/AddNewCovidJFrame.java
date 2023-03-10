/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.CovidManagerFrame;

import Bean.NhanKhauBean;
import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import controllers.CovidManagerController.AddNewCovidController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.CovidModel;

/**
 *
 * @author Administrator
 */
public class AddNewCovidJFrame extends javax.swing.JFrame {
    
    private CovidModel covidModel;
    private AddNewCovidController controller;
    private JFrame parentFrame;
    /**
     * Creates new form AddNew
     */
    public AddNewCovidJFrame() {
        initComponents();
    }
    
    public AddNewCovidJFrame(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
        this.controller = new AddNewCovidController();
        this.covidModel = new CovidModel();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Thêm mới covid");
        parentFrame.setEnabled(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }
            
        });
    }
    
    void close() {
        if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "Are you sure to close?", "Warning!!", JOptionPane.YES_NO_OPTION)) {
            this.parentFrame.setEnabled(true);
            dispose();
        }
    }
    
    private boolean checkCMT(String cmt) {
        if (cmt.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số CMT", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            try {
                long temp = Long.parseLong(cmt);
                if (cmt.trim().length() != 9 && cmt.trim().length() != 12) {
                    throw new Exception("Sai dinh dang");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số CMT!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        return true;
    }
    
    /**
     *
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        soCmtJtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soMuiJtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        availableIcon = new javax.swing.JLabel();
        ngayTiemDc = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        soCmtJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Số CMT:");

        checkBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkBtn.setText("Check");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("(*)");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Số mũi");

        soMuiJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        soMuiJtf.setEnabled(false);
        soMuiJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soMuiJtfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("(*)");

        acceptBtn.setText("Xác nhận");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Hủy");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        availableIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/checked.png"))); // NOI18N
        availableIcon.setEnabled(false);

        ngayTiemDc.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("(*)");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Ngày tiêm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soCmtJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(checkBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(availableIcon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngayTiemDc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soMuiJtf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availableIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(soCmtJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soMuiJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ngayTiemDc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        if (checkCMT(soCmtJtf.getText())) {
            int idNhanKhau = this.controller.checkCMT(soCmtJtf.getText());
            if (idNhanKhau > 0) {
                this.covidModel.setIdNhanKhauCovid(idNhanKhau);
                availableIcon.setEnabled(true);
                soMuiJtf.setEnabled(true);
                ngayTiemDc.setEnabled(true);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Không tìm thấy người có số CMT: " + soCmtJtf.getText() + ". Thêm mới?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    AddNewCovidJFrame addNewCovid = new AddNewCovidJFrame(this);
                    addNewCovid.setLocationRelativeTo(null);
                    addNewCovid.setResizable(false);
                    addNewCovid.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_checkBtnActionPerformed

    private void soMuiJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soMuiJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soMuiJtfActionPerformed

    private boolean validateForm() {
        return !(soMuiJtf.getText().trim().isEmpty()||ngayTiemDc.getDateFormatString().isEmpty());
    }
    
    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        if (validateForm()) {
            try {
            Class.forName(MySQLConstand.CLASS_NAME);
            Connection conn = getJDBCConnection();
            Statement st = conn.createStatement();

            String soCMT = soCmtJtf.getText();
            String sql = "select * from nhan_khau LEFT JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE soCMT = " + soCMT;
            
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idNhanKhauCovid = rs.getInt("maNhanKhau");
                String hoTen = rs.getString("hoTen");
                int tongSoMuiTiem = Integer.getInteger(soMuiJtf.getText().trim());
                String soMui = String.valueOf(rs.getInt("tongSoMuiTiem"));
                String bietDanh = String.valueOf(rs.getString("bietDanh"));
                String namSinh = String.valueOf(rs.getString("namSinh"));
                String gioiTinh = String.valueOf(rs.getString("gioiTinh"));
                String noiSinh = String.valueOf(rs.getString("noiSinh"));
                String nguyenQuan = String.valueOf(rs.getString("nguyenQuan"));
                String noiThuongTru = String.valueOf(rs.getString("noiThuongTru"));
                String diaChiHienNay = String.valueOf(rs.getString("diaChiHienNay"));
                
                this.covidModel.setIdNhanKhauCovid(idNhanKhauCovid);
                this.covidModel.setTongSoMuiTiem(tongSoMuiTiem);
                this.covidModel.setHoTen(hoTen);
                this.covidModel.setBietDanh(bietDanh);
                this.covidModel.setNamSinh(namSinh);
                this.covidModel.setGioiTinh(gioiTinh);
                this.covidModel.setNoiSinh(noiSinh);
                this.covidModel.setNguyenQuan(nguyenQuan);
                this.covidModel.setNoiThuongTru(noiThuongTru);
                this.covidModel.setDiaChiHienNay(diaChiHienNay);
            }
                this.covidModel.setSoCMT(soCMT);
                this.covidModel.setNgayTiem(ngayTiemDc.getDate());
            conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            if (this.controller.addNew(this.covidModel)) {
                this.parentFrame.setEnabled(true);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập hết các trường bắt buộc!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        close();
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewCovidJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewCovidJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewCovidJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewCovidJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewCovidJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JLabel availableIcon;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton checkBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser ngayTiemDc;
    private javax.swing.JTextField soCmtJtf;
    private javax.swing.JTextField soMuiJtf;
    // End of variables declaration//GEN-END:variables
}
