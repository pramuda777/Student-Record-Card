/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarksData {

    // Method to insert marks into the database
    public static boolean insertMarks(String studentId, int maths, int science, int history, int english, int religion, int health) {
        try (Connection conn = DBConnection.getStatementConnection2();
             PreparedStatement statement = conn.prepareStatement("INSERT INTO student_marks (std_id, maths, science, history, english, religion, health) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            statement.setString(1, studentId);
            statement.setInt(2, maths);
            statement.setInt(3, science);
            statement.setInt(4, history);
            statement.setInt(5, english);
            statement.setInt(6, religion);
            statement.setInt(7, health);
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to retrieve all student marks from the database
    public static ResultSet getAllStudentMarks1() {
        try {
            Connection conn = DBConnection.getStatementConnection2();
            String sql = "SELECT * FROM student_marks";
            PreparedStatement statement = conn.prepareStatement(sql);
            return statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to update marks for a specific subject of a student
public static boolean updateMarks(String studentId, int maths, int science, int history, int english, int religion, int health) {
    try (Connection conn = DBConnection.getStatementConnection2();
         PreparedStatement statement = conn.prepareStatement(
                 "UPDATE student_marks SET maths = ?, science = ?, history = ?, english = ?, religion = ?, health = ? WHERE std_id = ?")) {
        statement.setInt(1, maths);
        statement.setInt(2, science);
        statement.setInt(3, history);
        statement.setInt(4, english);
        statement.setInt(5, religion);
        statement.setInt(6, health);
        statement.setString(7, studentId);
        int rowsUpdated = statement.executeUpdate();
        return rowsUpdated > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    // Method to delete marks of a specific student
    public static boolean deleteMarks(String studentId) {
        try (Connection conn = DBConnection.getStatementConnection2();
             PreparedStatement statement = conn.prepareStatement("DELETE FROM student_marks WHERE std_id = ?")) {
            statement.setString(1, studentId);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to retrieve marks for a specific student
    public static ResultSet getAllStudentMarks() {
    try {
        Connection conn = DBConnection.getStatementConnection2();
        String sql = "SELECT st.std_id AS ID, st.std_fullName AS Name, " +
                     "sm.maths AS Maths, sm.science AS Science, sm.history AS History, " +
                     "sm.english AS English, sm.religion AS Religion, sm.health AS Health " +
                     "FROM std_tb st " +
                     "INNER JOIN student_marks sm ON st.std_id = sm.std_id";
        PreparedStatement statement = conn.prepareStatement(sql);
        return statement.executeQuery();
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
    }
    
    public static ResultSet getStudentMarks(String studentId) {
        try {
            Connection conn = DBConnection.getStatementConnection2();
            String sql = "SELECT * FROM student_marks WHERE std_id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, studentId);
            return statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
