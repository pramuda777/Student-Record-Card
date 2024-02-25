/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class ChartGenerator {
    
    public static void displayAverageMarksChart(JPanel panel) {
        // Retrieve average marks for each subject
        Map<String, Double> averageMarks = getAverageMarks();
        
        // Prepare data for the bar chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Map.Entry<String, Double> entry : averageMarks.entrySet()) {
            dataset.addValue(entry.getValue(), "Average Marks", entry.getKey());
        }
        
        // Create and customize the bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Average Marks for Each Subject", // Chart title
                "Subjects", // X-axis label
                "Average Marks", // Y-axis label
                dataset); // Dataset
        
        // Customize chart appearance
        chart.setBackgroundPaint(Color.WHITE);
        
        // Display the bar chart in the JPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.removeAll();
        panel.add(chartPanel);
        panel.revalidate();
        panel.repaint();
    }
    
    private static Map<String, Double> getAverageMarks() {
        Map<String, Double> averageMarks = new HashMap<>();
        try (Connection conn = DBConnection.getStatementConnection2();
             PreparedStatement statement = conn.prepareStatement("SELECT AVG(maths), AVG(science), AVG(history), AVG(english), AVG(religion), AVG(health) FROM student_marks");
             ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                averageMarks.put("Maths", resultSet.getDouble(1));
                averageMarks.put("Science", resultSet.getDouble(2));
                averageMarks.put("History", resultSet.getDouble(3));
                averageMarks.put("English", resultSet.getDouble(4));
                averageMarks.put("Religion", resultSet.getDouble(5));
                averageMarks.put("Health", resultSet.getDouble(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return averageMarks;
    }
}
