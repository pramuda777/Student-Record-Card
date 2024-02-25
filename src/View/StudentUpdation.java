/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.StudentData;
import java.awt.Color;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sachi
 */
public class StudentUpdation extends javax.swing.JFrame {

    // Data of the selected student
    private String[] studentData;
    /**
     * Creates new form RegisterForm
     */
    public StudentUpdation(String[] studentData) {
        this.studentData = studentData;
        initComponents();
        populateFields();
        //center form
        this.setLocationRelativeTo(null);
        

         //create the border for the text and password field
        Border field_border=BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white);
        jTextField_username.setBorder(field_border);
        jTextField_fullname.setBorder(field_border);
        jTextField_phone.setBorder(field_border);
        jTextField_fullname.setBorder(field_border);
        jTextField_parentName.setBorder(field_border);
        jPasswordField_confirmpassword.setBorder(field_border);
        
        //create the button group for the radio buttons.
        ButtonGroup bg= new ButtonGroup();
        bg.add(jRadioButton_male);
        bg.add(jRadioButton_female);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Selection = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_studentID = new javax.swing.JLabel();
        jLabel_studentID1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_fullname = new javax.swing.JTextField();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jPasswordField_confirmpassword = new javax.swing.JPasswordField();
        jTextField_phone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton_login = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jDateChooser_birthDay = new com.toedter.calendar.JDateChooser();
        jPasswordField_password = new javax.swing.JPasswordField();
        jTextField_nic = new javax.swing.JTextField();
        jTextField_parentName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(12, 20, 25));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(153, 255, 153));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/delete_32px.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/logO.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 70));

        jLabel_Selection.setBackground(new java.awt.Color(255, 204, 255));
        jLabel_Selection.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel_Selection.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Selection.setText("Update Student");
        jPanel4.add(jLabel_Selection, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/minimum_32px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel_studentID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_studentID.setText("#");
        jPanel4.add(jLabel_studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel_studentID1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_studentID1.setText("StudentID :");
        jPanel4.add(jLabel_studentID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 150));

        jPanel3.setBackground(new java.awt.Color(22, 103, 183));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_username.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jPanel3.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 340, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 404, -1, -1));

        jTextField_fullname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jTextField_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fullnameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 340, 30));

        jRadioButton_male.setBackground(new java.awt.Color(22, 103, 183));
        jRadioButton_male.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jRadioButton_male.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_male.setText("Male");
        jRadioButton_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_maleActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jRadioButton_female.setBackground(new java.awt.Color(22, 103, 183));
        jRadioButton_female.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jRadioButton_female.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_female.setText("Female");
        jRadioButton_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_femaleActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jPasswordField_confirmpassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jPanel3.add(jPasswordField_confirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 340, 30));

        jTextField_phone.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jTextField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_phoneActionPerformed(evt);
            }
        });
        jTextField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_phoneKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 340, 30));

        jPanel2.setBackground(new java.awt.Color(33, 150, 243));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name :");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username :");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password :");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Parent Telephone No :");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender :");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Birthday :");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Parent Name :");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Parent NIC No :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel10))
                                .addComponent(jLabel5)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jLabel13)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jButton_login.setBackground(new java.awt.Color(22, 103, 183));
        jButton_login.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Clear");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_loginMouseExited(evt);
            }
        });
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 528, 110, -1));

        jButton_update.setBackground(new java.awt.Color(22, 103, 183));
        jButton_update.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update.setText("Update");
        jButton_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_updateMouseExited(evt);
            }
        });
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 528, 110, -1));
        jPanel3.add(jDateChooser_birthDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 200, 30));

        jPasswordField_password.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jPanel3.add(jPasswordField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 340, 30));

        jTextField_nic.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jPanel3.add(jTextField_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 340, 30));

        jTextField_parentName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jPanel3.add(jTextField_parentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 340, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyTyped
        // allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_phoneKeyTyped

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel11MousePressed

    private void jTextField_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fullnameActionPerformed

    private void jButton_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseEntered
        //set jbutton background
        jButton_login.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton_loginMouseEntered

    private void jButton_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseExited
        //set jbutton background
        jButton_login.setBackground(new Color(32,32,111));
    }//GEN-LAST:event_jButton_loginMouseExited

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        reset();
   
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jButton_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_updateMouseEntered

    private void jButton_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_updateMouseExited

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        if (!isFormFullyFilled()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields!");
        } else {
            try {
                if (updateStudentRecord()) {
                    JOptionPane.showMessageDialog(this, "Student record updated successfully");
                    dispose(); // Close the update form
                }
            } catch (SQLException ex) {
                Logger.getLogger(StudentUpdation.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error occurred while updating student record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    private void populateFields() {
        if (studentData != null && studentData.length >= 4) {
                 jLabel_studentID.setText(studentData[0]);
                 jTextField_fullname.setText(studentData[1]);
    }
    }
    
    private boolean updateStudentRecord() throws SQLException {
        // Retrieve the updated data from the input fields
        String updatedName = jTextField_fullname.getText();
        String updatedGender = jRadioButton_male.isSelected() ? "Male" : "Female";
        java.util.Date updatedBirthday = jDateChooser_birthDay.getDate();
        String updatedParentName = jTextField_parentName.getText();
        String updatedParentNIC = jTextField_nic.getText();
        String updatedParentPhone = jTextField_phone.getText();
        String updatedPassword = new String(jPasswordField_password.getPassword());


        // Perform validation if needed

        // Update the student record in the database (implement this)
        StudentData studentData = new StudentData();
        boolean success = studentData.updateStudentRecord(jLabel_studentID.getText(), updatedName, updatedGender, updatedBirthday, updatedParentName, updatedParentNIC, updatedParentPhone, updatedPassword);
        if (!success) {
            return false;
        }

        return true;
    }

    private boolean isFormFullyFilled() {
        return !jTextField_fullname.getText().isEmpty() &&
               !jTextField_username.getText().isEmpty() &&
               (jRadioButton_male.isSelected() || jRadioButton_female.isSelected()) &&
               jDateChooser_birthDay.getDate() != null &&
               !jTextField_parentName.getText().isEmpty() &&
               !jTextField_nic.getText().isEmpty() &&
               !jTextField_phone.getText().isEmpty() &&
               !new String(jPasswordField_password.getPassword()).isEmpty() &&
               !new String(jPasswordField_confirmpassword.getPassword()).isEmpty();
    }
    private void reset() {                                              
            // TODO add your handling code here:

           jTextField_fullname.setText("");
           jTextField_username.setText("");
           jTextField_phone.setText("");
           jTextField_parentName.setText("");
           jTextField_nic.setText("");
           jPasswordField_password.setText("");
           jPasswordField_confirmpassword.setText("");
           jDateChooser_birthDay.setDate(null); // Clear JCalendar

           ButtonGroup buttonGroup = new ButtonGroup();
           buttonGroup.add(jRadioButton_male);
           buttonGroup.add(jRadioButton_female);
           buttonGroup.clearSelection(); // Clear radio buttons


        
    }//GEN-LAST:event_jButton_updateActionPerformed
   public static boolean isValidPhoneNumber(String phoneNumber) {
        // Regular expression to match a 10-digit phone number
        String regex = "\\d{10}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher object
        Matcher matcher = pattern.matcher(phoneNumber);

        // Check if the phone number matches the regex pattern
        return matcher.matches();
    }
    private void jRadioButton_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_maleActionPerformed

    private void jRadioButton_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_femaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentUpdation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUpdation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUpdation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUpdation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String[] studentData = {"1", "John Doe", "username", "Male", "2000-01-01"};
                StudentUpdation updateForm = new StudentUpdation(studentData);
                updateForm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_update;
    private com.toedter.calendar.JDateChooser jDateChooser_birthDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Selection;
    private javax.swing.JLabel jLabel_studentID;
    private javax.swing.JLabel jLabel_studentID1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_confirmpassword;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JTextField jTextField_fullname;
    private javax.swing.JTextField jTextField_nic;
    private javax.swing.JTextField jTextField_parentName;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
