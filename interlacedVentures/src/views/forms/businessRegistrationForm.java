/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.forms;

import models.BusinessUsersDirectory;
import models.business;
import models.userDirectory;
import models.users;
import views.loginPage;

/**
 *
 * @author trishaguharoy
 */
public class businessRegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form businessRegistrationForm
     */
    public businessRegistrationForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        label_businessForm = new javax.swing.JLabel();
        Labelname = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        txtPhNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        LabelPhNo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelLocation = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        ownerNameLabel = new javax.swing.JLabel();
        webLabel = new javax.swing.JLabel();
        setPasswordLabel = new javax.swing.JLabel();
        txtWebsite = new javax.swing.JTextField();
        txtOwner = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        btnReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().setLayout(null);

        label_businessForm.setFont(new java.awt.Font("Baloo Bhaijaan", 1, 24)); // NOI18N
        label_businessForm.setText("REGISTER YOUR BUSINESS");
        getContentPane().add(label_businessForm);
        label_businessForm.setBounds(160, 0, 341, 58);

        Labelname.setBackground(new java.awt.Color(255, 204, 255));
        Labelname.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        Labelname.setText("NAME");
        getContentPane().add(Labelname);
        Labelname.setBounds(94, 86, 74, 32);

        LabelEmail.setBackground(new java.awt.Color(255, 204, 255));
        LabelEmail.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        LabelEmail.setText("EMAIL");
        getContentPane().add(LabelEmail);
        LabelEmail.setBounds(94, 152, 37, 18);

        txtPhNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhNo);
        txtPhNo.setBounds(239, 201, 223, 23);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(242, 89, 223, 23);

        LabelPhNo.setBackground(new java.awt.Color(255, 204, 255));
        LabelPhNo.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        LabelPhNo.setText("PHONE NUMBER");
        getContentPane().add(LabelPhNo);
        LabelPhNo.setBounds(94, 205, 100, 18);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(239, 148, 223, 23);

        labelLocation.setBackground(new java.awt.Color(255, 204, 255));
        labelLocation.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        labelLocation.setText("LOCATION");
        getContentPane().add(labelLocation);
        labelLocation.setBounds(94, 255, 88, 18);
        getContentPane().add(txtLoc);
        txtLoc.setBounds(239, 251, 223, 23);

        ownerNameLabel.setBackground(new java.awt.Color(255, 204, 255));
        ownerNameLabel.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        ownerNameLabel.setText("OWNER NAME");
        getContentPane().add(ownerNameLabel);
        ownerNameLabel.setBounds(94, 366, 87, 18);

        webLabel.setBackground(new java.awt.Color(255, 204, 255));
        webLabel.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        webLabel.setText("WEBSITE");
        getContentPane().add(webLabel);
        webLabel.setBounds(94, 309, 88, 18);

        setPasswordLabel.setBackground(new java.awt.Color(255, 204, 255));
        setPasswordLabel.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        setPasswordLabel.setText("SET PASSWORD");
        getContentPane().add(setPasswordLabel);
        setPasswordLabel.setBounds(94, 419, 100, 18);
        getContentPane().add(txtWebsite);
        txtWebsite.setBounds(239, 305, 223, 23);
        getContentPane().add(txtOwner);
        txtOwner.setBounds(239, 362, 223, 23);

        pwdField.setText("jPasswordField1");
        getContentPane().add(pwdField);
        pwdField.setBounds(239, 415, 223, 23);

        btnReg.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnReg.setText("REGISTER");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(239, 512, 91, 24);

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/businessregistraionForm.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 670, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
        business bus= new business(pwdField.getText(),
                txtName.getText(),
                txtEmail.getText(),
                txtPhNo.getText(),
                txtLoc.getText(),
                txtWebsite.getText(),
                txtOwner.getText());
        BusinessUsersDirectory.getInstance().addBusinessUser(bus);
        users login = new users(txtName.getText(),pwdField.getText(),"Business User");
        userDirectory.getInstance().addUser(login);
        
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_btnRegActionPerformed

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
            java.util.logging.Logger.getLogger(businessRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(businessRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(businessRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(businessRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new businessRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelPhNo;
    private javax.swing.JLabel Labelname;
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelLocation;
    private javax.swing.JLabel label_businessForm;
    private javax.swing.JLabel ownerNameLabel;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JLabel setPasswordLabel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOwner;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtWebsite;
    private javax.swing.JLabel webLabel;
    // End of variables declaration//GEN-END:variables
}
