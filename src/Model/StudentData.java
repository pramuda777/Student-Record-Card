/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.DBConnection.conn;
import View.StudentRegistration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pramuda Heshan
 */
public class StudentData {
    Statement stmt;
 
    public void registration(String fullName, String username, String gender, java.util.Date birthday, String parentName, String parentNIC, String parentPhone, String password) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            stmt = DBConnection.getStatementConnection();
            // SQL query for the first table
            String sql1 = "INSERT INTO std_reg_tb (fullName, username, gender, birthday, parentName, parentNIC, parentPhone, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = conn.prepareStatement(sql1);
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, gender);
            java.sql.Date sqlDate = new java.sql.Date(birthday.getTime());
            preparedStatement.setDate(4, sqlDate);
            preparedStatement.setString(5, parentName);
            preparedStatement.setString(6, parentNIC);
            preparedStatement.setString(7, parentPhone);
            preparedStatement.setString(8, password);
            preparedStatement.executeUpdate();

            // SQL query for the second table
            String sql2 = "INSERT INTO std_tb (std_fullName, name, std_gender, std_birthday, prt_nicNo, password) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = conn.prepareStatement(sql2);
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, gender);
            
            preparedStatement.setDate(4, sqlDate);
            preparedStatement.setString(5, parentNIC);
            preparedStatement.setString(6, password);
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println("Data insertion failed! Check output console");
            e.printStackTrace();
            throw e;
        } finally {
            // Closing resources in the finally block
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    public DefaultTableModel populateStudentData() throws SQLException {
        DefaultTableModel model = null;
        try {
            stmt = DBConnection.getStatementConnection();
            String sql = "SELECT std_id AS 'Student ID', std_fullName AS 'Student Name', name AS 'Username', std_gender AS 'Gender', std_birthday AS 'Birthday' FROM std_tb";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Manually set the column names
            String[] columnNames = {"Student ID", "Student Name", "Username", "Gender", "Birthday"};
            model = new DefaultTableModel(columnNames, 0);

            // Populate table model with data from the ResultSet
            while (resultSet.next()) {
                Object[] row = new Object[columnNames.length];
                row[0] = resultSet.getString("Student ID");
                row[1] = resultSet.getString("Student Name");
                row[2] = resultSet.getString("Username");
                row[3] = resultSet.getString("Gender");
                row[4] = resultSet.getString("Birthday");
                model.addRow(row);
            }

            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void deleteStudentRecord(int selectedRow) {
    PreparedStatement statement = null;
    
    try {
        // Get the model populated with student data
        DefaultTableModel model = populateStudentData();

        // Get the studentID from the model using the selectedRow
        String studentID = model.getValueAt(selectedRow, 0).toString();
        
        // Prepare the delete query
        stmt = DBConnection.getStatementConnection();
        String sql = "DELETE FROM std_tb WHERE std_id = ?";
        statement = conn.prepareStatement(sql);
        statement.setString(1, studentID);
        int rowsAffected = statement.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Student record deleted successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete student record");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        // Close PreparedStatement and Connection
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public boolean updateStudentRecord(String studentID, String updatedName, String updatedGender, java.util.Date updatedBirthday, String updatedParentName, String updatedParentNIC, String updatedParentPhone, String updatedPassword) throws SQLException {
        PreparedStatement preparedStatement = null;
        boolean success = false;
        try {
            stmt = DBConnection.getStatementConnection();
            
            // SQL query to update the student record
            String sql = "UPDATE std_tb SET std_fullName=?, name=?, std_gender=?, std_birthday=?, prt_nicNo=?, password=? WHERE std_id=?";
            preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setString(1, updatedName);
            preparedStatement.setString(2, updatedName); // Assuming 'name' needs to be updated too
            preparedStatement.setString(3, updatedGender);
            preparedStatement.setDate(4, new java.sql.Date(updatedBirthday.getTime()));
            preparedStatement.setString(5, updatedParentNIC);
            preparedStatement.setString(6, updatedPassword);
            preparedStatement.setString(7, studentID); // Assuming studentID is the primary key
            
            // Execute the update query
            int rowsAffected = preparedStatement.executeUpdate();
            
            success = rowsAffected > 0; // Update success if rows were affected
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            // Closing resources in the finally block
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return success;
    }
    }    
    
    
    
    

    

