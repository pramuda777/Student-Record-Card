

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class StudentChartGenerator2 {
    private JPanel jPanel_studentMarksChart;
    private String studentId;
    private JTable rSTableMetro_studentMarkTable; // Added member variable

    // Constructor to initialize jPanel_studentMarksChart and JTable
    public StudentChartGenerator2(JPanel jPanel_studentMarksChart, JTable rSTableMetro_studentMarkTable, String studentId) {
        this.jPanel_studentMarksChart = jPanel_studentMarksChart;
        this.rSTableMetro_studentMarkTable = rSTableMetro_studentMarkTable;
        this.studentId = studentId;
    }

    public void displayStudentMarks() { // Removed parameter since studentId is a class member
        try {
            // Retrieve student marks data from the database
            ResultSet resultSet = MarksData.getStudentMarks(studentId);

            // Create column names for the table
            String[] columnNames = {"Subject Name", "Marks"};

            // Create a DefaultTableModel with two columns
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            // Mapping of column indices to subject names
            HashMap<Integer, String> columnIndexToSubject = new HashMap<>();
            columnIndexToSubject.put(2, "Maths");
            columnIndexToSubject.put(3, "Science");
            columnIndexToSubject.put(4, "History");
            columnIndexToSubject.put(5, "English");
            columnIndexToSubject.put(6, "Religion");
            columnIndexToSubject.put(7, "Health");

            // Dataset for the bar chart
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            // Populate table model with data from the ResultSet
            while (resultSet.next()) {
                // Iterate through the column index to subject name mapping
                for (Map.Entry<Integer, String> entry : columnIndexToSubject.entrySet()) {
                    // Retrieve subject name and marks for each subject
                    String subjectName = entry.getValue();
                    int marks = resultSet.getInt(entry.getKey());

                    // Add subject name and marks as a row to the table model
                    model.addRow(new Object[]{subjectName, marks});

                    // Add data to the bar chart dataset
                    dataset.addValue(marks, subjectName, ""); // Assuming the category axis label is empty
                }
            }

            // Set the model for the student marks table
            rSTableMetro_studentMarkTable.setModel(model);

            // Close the ResultSet after processing
            resultSet.close();

            // Create a bar chart
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Student Marks", // Chart title
                    "Subject", // X-axis label
                    "Marks", // Y-axis label
                    dataset // Dataset
            );

            // Create a ChartPanel to display the bar chart
            ChartPanel chartPanel = new ChartPanel(barChart);

            // Add the ChartPanel to the jPanel_studentMarksChart
            jPanel_studentMarksChart.removeAll();
            jPanel_studentMarksChart.setLayout(new BorderLayout());
            jPanel_studentMarksChart.add(chartPanel, BorderLayout.CENTER);
            jPanel_studentMarksChart.validate(); // Refresh the panel
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception (e.g., display an error message)
        }
    }
}