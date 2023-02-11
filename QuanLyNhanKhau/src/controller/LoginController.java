/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import config.JDBCConnection;
import static config.JDBCConnection.getJDBCConnection;
import constand.MySQLConstand;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.User;

/**
 *
 * @author Administrator
 */
public class LoginController {
    public static User currentUser = new User();
    
    public boolean login(String userName, String password) throws SQLException, ClassNotFoundException{
        Class.forName(MySQLConstand.CLASS_NAME);
        Connection conn = getJDBCConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users WHERE userName = '" + userName +"'");
        if (rs == null) {
            return false;
        }
        while (rs.next()) {                
            if (rs.getString("password") == null ? password == null : rs.getString("passwd").equals(password)) {
                LoginController.currentUser.setID(rs.getInt("ID"));
                LoginController.currentUser.setUserName(rs.getString("userName"));
                return true;
            }
        }
        conn.close();
        return false;
    }
}
