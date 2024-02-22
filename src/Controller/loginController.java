/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Pramuda
 */

import Model.dBConnection;
import Model.dBSearch;
import View.studentDashboard;
import View.teacherDashboard;
import View.userLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class loginController {
    public static void login(String role, String usName, String pass) {
 try {
     
    String username = null; // initial value of the username
    String password = null; // initial value of the password
    
    ResultSet rs = new dBSearch().searchLogin(role,usName);
//Process the Query
    while (rs.next()) {
    username = rs.getString("name"); //assign database login name to the variable
    password = rs.getString("password"); //assign database password to the variable
 }
    if (username != null && password != null) {
        if (password.equals(pass)) {
            System.out.println("Login Successfull");
            userLogin.getFrames()[0].dispose();
            if("Teacher".equals(role)){
                new teacherDashboard().setVisible(true);
            }
            else{
                new studentDashboard().setVisible(true);
            }
        } else {
           JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
       JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    dBConnection.closeCon();
    
    } catch (SQLException ex) { 
       Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}