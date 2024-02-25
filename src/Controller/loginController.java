/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import Model.StudentChartGenerator2;
import Model.StudentData;
import View.ParentDashboard;
import View.StudentDashboard;
import View.TeacherDashboard;
import View.UserLogin;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController {
    public static void login(String role, String usName, String pass) {
        try {
            String username = null; // initial value of the username
            String password = null; // initial value of the password

            ResultSet rs = new DBSearch().searchLogin(role, usName);

            // Process the Query
            while (rs.next()) {
                username = rs.getString("name"); // assign database login name to the variable
                password = rs.getString("password"); // assign database password to the variable
            }

            if (username != null && password != null) {
                if (password.equals(pass)) {
                    System.out.println("Login Successful");
                    UserLogin.getFrames()[0].dispose();

                    if ("Teacher".equals(role)) {
                        new TeacherDashboard().setVisible(true);
                    } else if ("Student".equals(role)) {
                        // Assuming the studentId is retrieved from the database
                        String studentId = new StudentData().getStudentIdFromDatabase(usName); // Replace with actual method to get studentId
                        if (studentId != null) {
                            StudentDashboard studentDashboard = new StudentDashboard();
                            studentDashboard.setVisible(true);
                            // After successful login, display student marks
                            StudentChartGenerator2 chartGenerator = new StudentChartGenerator2(studentDashboard.getJPanel_studentMarksChart(), studentDashboard.getRSTableMetro_studentMarkTable(), studentId);
                            chartGenerator.displayStudentMarks(); // Call the displayStudentMarks method
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to retrieve student ID", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if ("Parent".equals(role)) {
                        // Display marks for the associated student(s)
                        displayParentDashboard(username);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }

            DBConnection.closeCon();

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void displayParentDashboard(String parentUsername) {
        // Retrieve associated student IDs for the parent
        String[] studentIds = getStudentIdsForParent(parentUsername);

        // Display marks for each student
        for (String studentId : studentIds) {
            displayStudentMarksForParent(studentId);
        }

        // Show parent dashboard
        new ParentDashboard().setVisible(true);
    }

    private static String[] getStudentIdsForParent(String parentUsername) {
        // Retrieve associated student IDs for the parent from the database
        // You need to implement this method based on your database schema
        // Example:
        // return parentService.getStudentIdsForParent(parentUsername);
        return new String[]{"std001", "std002", "std003"}; // Placeholder for actual data retrieval
    }

    private static void displayStudentMarksForParent(String studentId) {
        // Retrieve and display marks for the specified student
        // You can reuse the existing method to display student marks
        StudentChartGenerator2 chartGenerator = new StudentChartGenerator2(null, null, studentId);
        chartGenerator.displayStudentMarks();
    }
}