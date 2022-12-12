/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.forms;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import models.ApplicationBusiness;
import models.ApplicationBusinessDirectory;
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
    
    private String filepath1 = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
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
        btnViewBusi = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        jLabUploadLic = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        label_businessForm.setFont(new java.awt.Font("Baloo Bhaijaan", 1, 30)); // NOI18N
        label_businessForm.setText("REGISTER YOUR BUSINESS");
        jPanel2.add(label_businessForm);
        label_businessForm.setBounds(170, 20, 380, 60);

        Labelname.setBackground(new java.awt.Color(255, 204, 255));
        Labelname.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        Labelname.setText("NAME");
        jPanel2.add(Labelname);
        Labelname.setBounds(130, 110, 74, 32);

        LabelEmail.setBackground(new java.awt.Color(255, 204, 255));
        LabelEmail.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        LabelEmail.setText("EMAIL");
        jPanel2.add(LabelEmail);
        LabelEmail.setBounds(130, 170, 37, 18);
        jPanel2.add(txtPhNo);
        txtPhNo.setBounds(270, 220, 223, 23);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(270, 110, 223, 23);

        LabelPhNo.setBackground(new java.awt.Color(255, 204, 255));
        LabelPhNo.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        LabelPhNo.setText("PHONE NUMBER");
        jPanel2.add(LabelPhNo);
        LabelPhNo.setBounds(130, 230, 100, 18);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(270, 160, 223, 23);

        labelLocation.setBackground(new java.awt.Color(255, 204, 255));
        labelLocation.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        labelLocation.setText("LOCATION");
        jPanel2.add(labelLocation);
        labelLocation.setBounds(130, 280, 88, 18);
        jPanel2.add(txtLoc);
        txtLoc.setBounds(270, 270, 223, 23);

        ownerNameLabel.setBackground(new java.awt.Color(255, 204, 255));
        ownerNameLabel.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        ownerNameLabel.setText("OWNER NAME");
        jPanel2.add(ownerNameLabel);
        ownerNameLabel.setBounds(130, 390, 87, 18);

        webLabel.setBackground(new java.awt.Color(255, 204, 255));
        webLabel.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        webLabel.setText("WEBSITE");
        jPanel2.add(webLabel);
        webLabel.setBounds(130, 330, 88, 18);

        setPasswordLabel.setBackground(new java.awt.Color(255, 204, 255));
        setPasswordLabel.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        setPasswordLabel.setText("SET PASSWORD");
        jPanel2.add(setPasswordLabel);
        setPasswordLabel.setBounds(130, 440, 100, 18);
        jPanel2.add(txtWebsite);
        txtWebsite.setBounds(270, 330, 223, 23);
        jPanel2.add(txtOwner);
        txtOwner.setBounds(270, 380, 223, 23);

        pwdField.setText("jPasswordField1");
        jPanel2.add(pwdField);
        pwdField.setBounds(270, 440, 223, 23);

        btnReg.setBackground(new java.awt.Color(255, 255, 204));
        btnReg.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnReg.setText("Apply For Registration");
        btnReg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        jPanel2.add(btnReg);
        btnReg.setBounds(270, 550, 170, 60);

        btnViewBusi.setBackground(new java.awt.Color(255, 255, 204));
        btnViewBusi.setText("VIEW");
        btnViewBusi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewBusi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBusiActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewBusi);
        btnViewBusi.setBounds(410, 490, 110, 30);

        btnUpload.setBackground(new java.awt.Color(255, 255, 204));
        btnUpload.setFont(new java.awt.Font("InaiMathi", 1, 12)); // NOI18N
        btnUpload.setText("UPLOAD");
        btnUpload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpload);
        btnUpload.setBounds(280, 490, 120, 30);

        jLabUploadLic.setFont(new java.awt.Font("InaiMathi", 1, 13)); // NOI18N
        jLabUploadLic.setText("UPLOAD YOUR LICENSE");
        jPanel2.add(jLabUploadLic);
        jLabUploadLic.setBounds(130, 480, 140, 40);

        lblLicense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/charming-bearded-business-man-character-cartoon-modern-flat-design-charming-bearded-business-man-character-cartoon-modern-flat-130073628.jpeg"))); // NOI18N
        jPanel2.add(lblLicense);
        lblLicense.setBounds(-180, 90, 950, 1300);

        jTextField2.setText("jTextField2");
        jPanel2.add(jTextField2);
        jTextField2.setBounds(340, 540, 78, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
        
        
        ApplicationBusiness ab = new ApplicationBusiness(pwdField.getText(),
                txtName.getText(),
                txtEmail.getText(),
                txtPhNo.getText(),
                txtLoc.getText(),
                txtWebsite.getText(),
                txtOwner.getText(),
                filepath1,
                "Applied");
        
        ApplicationBusinessDirectory.getInstance().addApplicationBusiness(ab);
        
        
//        business bus= new business(pwdField.getText(),
//                txtName.getText(),
//                txtEmail.getText(),
//                txtPhNo.getText(),
//                txtLoc.getText(),
//                txtWebsite.getText(),
//                txtOwner.getText(),
//                btnViewBusi.getText());
//                
//        BusinessUsersDirectory.getInstance().addBusinessUser(bus);
//        users login = new users(txtName.getText(),pwdField.getText(),"Business User");
//        userDirectory.getInstance().addUser(login);
//        
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int selected = fileChooser.showOpenDialog(this);
        try{
            if(selected == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                filepath1 = file.getAbsolutePath();
           
            } 
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "File Not Uploaded");
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnViewBusiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBusiActionPerformed
        // TODO add your handling code here:
        try{
            File pdf1 = new File(filepath1);
            if(pdf1.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(pdf1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Desktop is not supported");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "FIle does not exist");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnViewBusiActionPerformed

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
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnViewBusi;
    private javax.swing.JLabel jLabUploadLic;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelLocation;
    private javax.swing.JLabel label_businessForm;
    private javax.swing.JLabel lblLicense;
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
