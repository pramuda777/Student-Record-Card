/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Pramuda Heshan
 */
public class dBSearch {
    Statement stmt;
    ResultSet rs;
    
    public ResultSet searchLogin(String role,String usName) {
        try {
           stmt = dBConnection.getStatementConnection();
           String userName = usName;
           
       //Execute the Query
           if ("Teacher".equals(role)){
            rs = stmt.executeQuery("SELECT * FROM tc_tb where name='" + userName + "'");
           }
           
           else if ("Student".equals(role)){
            rs = stmt.executeQuery("SELECT * FROM std_tb where name='" + userName + "'");
           }
           
           else if ("Parent".equals(role)){
            rs = stmt.executeQuery("SELECT * FROM prt_tb where name='" + userName + "'");
           }

           
        } catch (Exception e) {
           e.printStackTrace();
        }
    return rs;
    }
   

    public ResultSet searchStudents(){
    try{
       stmt = dBConnection.getStatementConnection();
       rs = stmt.executeQuery("SELECT * FROM students");
    }catch(Exception e){
           e.printStackTrace();
    }
       return rs;
    }

    public ResultSet searchLogin(String usName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

