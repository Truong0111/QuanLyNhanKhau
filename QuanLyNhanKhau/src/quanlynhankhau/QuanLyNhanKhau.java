/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhankhau;

import javax.swing.UIManager;
import view.LoginUI;

/**
 *
 * @author Administrator
 */
public class QuanLyNhanKhau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
//        MainFrame mainFrame = new MainFrame();
//        mainFrame.setLocationRelativeTo(null);
//        mainFrame.setResizable(false);
//        mainFrame.setVisible(true);
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true); 
    }
    
}
