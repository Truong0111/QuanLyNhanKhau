/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author Ai làm thì diền tên vào
 */
public class HoKhauManageForm extends javax.swing.JPanel {
    
    private JFrame parentFrame;
//    private HoKhauPanelController controller;
    /**
     * Creates new form HoKhauManagePanel
     */
    public HoKhauManageForm(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
//        controller = new HoKhauPanelController(jtfSearch, tableJpn);
//        controller.setParentJFrame(parentFrame);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        themMoiBtn = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        tachHoKhauBtn = new javax.swing.JButton();
        chuyenDiBtn = new javax.swing.JButton();
        tableJpn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 588));

        themMoiBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        themMoiBtn.setText("Thêm mới");
        themMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themMoiBtnActionPerformed(evt);
            }
        });

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        tachHoKhauBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tachHoKhauBtn.setText("Tách HK");
        tachHoKhauBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tachHoKhauBtnActionPerformed(evt);
            }
        });

        chuyenDiBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chuyenDiBtn.setText("Chuyển đi");
        chuyenDiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuyenDiBtnActionPerformed(evt);
            }
        });

        tableJpn.setPreferredSize(new java.awt.Dimension(858, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout tableJpnLayout = new javax.swing.GroupLayout(tableJpn);
        tableJpn.setLayout(tableJpnLayout);
        tableJpnLayout.setHorizontalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        tableJpnLayout.setVerticalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableJpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tachHoKhauBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chuyenDiBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tachHoKhauBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chuyenDiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(326, Short.MAX_VALUE))
                    .addComponent(tableJpn, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void chuyenDiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuyenDiBtnActionPerformed
//        ChuyenDiNoiKhac chuyenDiNoiKhac = new ChuyenDiNoiKhac(this.parentFrame);
//        chuyenDiNoiKhac.setLocationRelativeTo(null);
//        chuyenDiNoiKhac.setResizable(false);
//        chuyenDiNoiKhac.setVisible(true);
    }//GEN-LAST:event_chuyenDiBtnActionPerformed

    private void themMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themMoiBtnActionPerformed
//        ThemMoiHoKhau themMoiHoKhau = new ThemMoiHoKhau(this.parentFrame);
//        themMoiHoKhau.setLocationRelativeTo(null);
//        themMoiHoKhau.setResizable(false);
//        themMoiHoKhau.setVisible(true);
    }//GEN-LAST:event_themMoiBtnActionPerformed

    private void tachHoKhauBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tachHoKhauBtnActionPerformed
//        TachHoKhau tachHoKhau = new TachHoKhau(this.parentFrame);
//        tachHoKhau.setLocationRelativeTo(null);
//        tachHoKhau.setResizable(false);
//        tachHoKhau.setVisible(true);
    }//GEN-LAST:event_tachHoKhauBtnActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chuyenDiBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JPanel tableJpn;
    private javax.swing.JButton tachHoKhauBtn;
    private javax.swing.JButton themMoiBtn;
    // End of variables declaration//GEN-END:variables
}
