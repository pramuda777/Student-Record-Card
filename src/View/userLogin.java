package View;


import Controller.loginController;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sachi
 */
public class userLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login2
     */
    public userLogin() {
        initComponents();
        // center the form
        this.setLocationRelativeTo(null);
        
        //create yellow border for the jPanel_title 
        Border jPanel_title_border=BorderFactory.createMatteBorder(0, 1, 1, 1, Color.white);
        //seet the border to the jPanel_title
        //jPanel_title.setBorder(jPanel_title_border);
        
        //create an orange border for the glob panel
        Border glob_panel_Border=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        //jPanel1.setBorder(glob_panel_Border);
        
        //create the black border for the close and minimmize jlabels
        Border label_border=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        //jLabel_minimize.setBorder(label_border);
        //jLabel_close.setBorder(label_border);
        
        //create the border with the color of the parent jPanel for the icon label to remove the move
        
        Border label_icons_border=BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        //jLabel_username.setBorder(label_icons_border);
        //jLabel_password.setBorder(label_icons_border);
        
        //create the border for the username and password field
        Border field_border=BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white);
        jTextField_username.setBorder(field_border);
        jPasswordField.setBorder(field_border);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jComboBox_role = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Selection = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(22, 103, 183));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_username.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(22, 103, 183));
        jTextField_username.setText("username");
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 204, 45));

        jPasswordField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(22, 103, 183));
        jPasswordField.setText("password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel3.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 204, 49));

        jButton_login.setBackground(new java.awt.Color(22, 103, 183));
        jButton_login.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
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
        jPanel3.add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 108, -1));

        jComboBox_role.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jComboBox_role.setForeground(new java.awt.Color(22, 103, 183));
        jComboBox_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher", "Parent", "Student" }));
        jPanel3.add(jComboBox_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 145, 41));

        jPanel2.setBackground(new java.awt.Color(33, 150, 243));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-password-40.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-username-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 350));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 530, 310));

        jPanel4.setBackground(new java.awt.Color(12, 20, 25));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(153, 255, 153));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/delete_32px.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/logO.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 70));

        jLabel_Selection.setBackground(new java.awt.Color(255, 204, 255));
        jLabel_Selection.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel_Selection.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Selection.setText("HI! Please Select Who You Are");
        jPanel4.add(jLabel_Selection, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseExited
        //set jbutton background
        jButton_login.setBackground(new Color(32,32,111));
    }//GEN-LAST:event_jButton_loginMouseExited

    private void jButton_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseEntered
        //set jbutton background
        jButton_login.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton_loginMouseEntered

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost

        //if the password  field is equel to password or empty
        // we will set the "password" text in the field
        // on focus lost event

        String pass =String .valueOf(jPasswordField.getPassword());
        if(pass.trim().equals("")||
            pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("password");
            jPasswordField.setForeground( new Color(153,153,153));
        }
        //create the border with the color of the parent jPanel for the icon label to remove the move

        Border label_icons_border=BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        //jLabel_password.setBorder(label_icons_border);
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained

        // clear the password field on focus if the text is"password"

        String pass=String .valueOf(jPasswordField.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
        //set yellow border to the jlabel icon

        Border jLabel_icon=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);

        //jLabel_password.setBorder(jLabel_icon);
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // clear the text field on focus if the text is"username"
        /*   if(jTextField_username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.black);
        }
        //set yellow border to the jlabel icon

        Border jLabel_icon=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        jLabel_username.setBorder(jLabel_icon);*/
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        //if the password  field is equel to username or empty
        // we will set the "username" text in the field
        // on focus lost event

        if(jTextField_username.getText().trim().equals("")||
            jTextField_username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_username.setText("username");
            jTextField_username.setForeground( new Color(153,153,153));
        }
        //create the border with the color of the parent jPanel for the icon label to remove the move

        //Border label_icons_border=BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        //jLabel_username.setBorder(label_icons_border);
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained

        // clear the textfield on focus if the text is"username"

        if(jTextField_username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.black);
        }
        //set yellow border to the jlabel icon

        //Border jLabel_icon=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        //jLabel_username.setBorder(jLabel_icon);
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel10MousePressed

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        loginController.login(jComboBox_role.getSelectedItem().toString(),jTextField_username.getText(), jPasswordField.getText());
    }//GEN-LAST:event_jButton_loginActionPerformed

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
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JComboBox<String> jComboBox_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Selection;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
