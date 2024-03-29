/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    static Connection conn;
    static Statement stat = null;
 
    public static Statement getStatementConnection() {
        try {
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/std_record_card";
            conn = DriverManager.getConnection(url, "root", "");
            // Create the connection
            stat = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
        return stat;
    }
    
    // Method to establish a database connection and return a Connection object
    public static Connection getStatementConnection2() throws SQLException {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/std_record_card";
            return DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException("Database Connection Failed! Check output console" + ex);
        }
    }

    // Close the connection
    public static void closeCon() throws SQLException {
        conn.close();
    }
}