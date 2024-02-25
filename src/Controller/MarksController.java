/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MarksData;

public class MarksController {
    
    public static boolean addMarks(String studentId, int maths, int science, int history, int english, int religion, int health) {
        // Call the insertMarks method from the MarksData class in the Model package
        return MarksData.insertMarks(studentId, maths, science, history, english, religion, health);
    }
    
    public static boolean updateMarks(String studentId, int maths, int science, int history, int english, int religion, int health) {
        // Call the updateMarks method from the MarksData class in the Model package
        return MarksData.updateMarks(studentId, maths, science, history, english, religion, health);
    }
    
    public static boolean deleteMarks(String studentId) {
        // Call the deleteMarks method from the MarksData class in the Model package
        return MarksData.deleteMarks(studentId);
    }
    // You can add more methods here for updating, deleting, or retrieving marks data if needed
}