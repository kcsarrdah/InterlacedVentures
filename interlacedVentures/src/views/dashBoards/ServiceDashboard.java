/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import java.util.Date;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import models.OrdersDirectory;
import models.orders;
import views.forms.FileComplainForm;
import views.forms.postAJobFormBusiness;

/**
 *
 * @author kcsar
 */
public class ServiceDashboard extends javax.swing.JFrame {

    /**
     * Creates new form ServiceDashboard
     */
    public ServiceDashboard() {
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

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel1 = new javax.swing.JPanel();
        jcEnterprise = new javax.swing.JComboBox<>();
        jcOrg = new javax.swing.JComboBox<>();
        jcService = new javax.swing.JComboBox<>();
        btnHFL = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfDetails = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUpdates = new javax.swing.JTable();
        btnComplain = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Technology", "Operations", "Finances and Legal", " " }));
        jcEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEnterpriseActionPerformed(evt);
            }
        });

        jcOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcOrgActionPerformed(evt);
            }
        });

        jcService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcServiceActionPerformed(evt);
            }
        });

        btnHFL.setText("Hire A FreeLancer");
        btnHFL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHFLActionPerformed(evt);
            }
        });

        jButton2.setText("Place An Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelName.setText("jLabel1");

        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });

        jLabel1.setText("Price");

        tfDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDetailsActionPerformed(evt);
            }
        });

        jLabel2.setText("Details");

        tblUpdates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Job Description", "Date Posted", "Contacted By"
            }
        ));
        jScrollPane1.setViewportView(tblUpdates);

        btnComplain.setText("File A Complain");
        btnComplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComplainActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcService, javax.swing.GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE)
                        .addComponent(jcOrg, javax.swing.GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE)
                        .addComponent(jcEnterprise, javax.swing.GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHFL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(btnComplain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jcEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jcOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jcService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnComplain, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHFL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEnterpriseActionPerformed
        // TODO add your handling code here:
        jcOrg.removeAllItems();
        
        if(jcEnterprise.getSelectedItem().toString().equals("Technology")){
                jcOrg.addItem("Software");
                jcOrg.addItem("Cloud");
                jcOrg.addItem("Hardware");
            }
        else if(jcEnterprise.getSelectedItem().toString().equals("Operations")){
                jcOrg.addItem("Storage");
                jcOrg.addItem("Transport");
                jcOrg.addItem("Raw Materials");
        }
        else if(jcEnterprise.getSelectedItem().toString().equals("Finances and Legal")){
                jcOrg.addItem("Consultancy");
        }
        
    }//GEN-LAST:event_jcEnterpriseActionPerformed

    private void jcServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcServiceActionPerformed

    private void jcOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcOrgActionPerformed
        // TODO add your handling code here:
        jcService.removeAllItems();
        if(jcOrg.getSelectedItem().toString().equals("Software")){
                jcService.addItem("Web Design");
                jcService.addItem("Video Game");
                jcService.addItem("Cyber-Security");
                jcService.addItem("Software Developement");
                jcService.addItem("Mobile Developement");
                jcService.addItem("Version Control");
                jcService.addItem("Data Analysis");
                jcService.addItem("Data Management");
                jcService.addItem("Business Intelligence");
                jcService.addItem("Machine Learning");
            }
        else if(jcOrg.getSelectedItem().toString().equals("Hardware")){
                jcService.addItem("Aurdino UNO");
                jcService.addItem("BeagleBoard X1");
                jcService.addItem("featherboards");
                jcService.addItem("Aurdino naro");
                jcService.addItem("Seeduino");
                jcService.addItem("Pocketbeagle");
        }
        else if(jcOrg.getSelectedItem().toString().equals("Cloud")){
                jcService.addItem("Saas");
                jcService.addItem("PaaS");
                jcService.addItem("FaaS");
                jcService.addItem("Servers");
        }
        
        else if(jcOrg.getSelectedItem().toString().equals("Storage")){
            jcService.addItem("Lockers");
            jcService.addItem("WareHouse");
            jcService.addItem("Cold Storage");
            jcService.addItem("Fragile Items Storage");
        }
        else if(jcOrg.getSelectedItem().toString().equals("Transport")){
            jcService.addItem("Cars");
            jcService.addItem("Trucks");
            jcService.addItem("Refridgeration Transport vehicle");
            jcService.addItem("Fragile Items Transport");
        }
        else if(jcOrg.getSelectedItem().toString().equals("Raw Material")){
            jcService.addItem("Metals");
            jcService.addItem("Non Metals");
            jcService.addItem("Electronics");
        }
        else if(jcOrg.getSelectedItem().toString().equals("Consultancy")){
            jcService.addItem("Auditing");
            jcService.addItem("Taxation");
        }
        
        
    }//GEN-LAST:event_jcOrgActionPerformed

    private void btnHFLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHFLActionPerformed
        // TODO add your handling code here:
        postAJobFormBusiness pj = new postAJobFormBusiness();
        pj.lbName.setText(labelName.getText());
        pj.show();
    }//GEN-LAST:event_btnHFLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        orders order = new orders(jcService.getSelectedItem().toString(), this.labelName.getText(), this.jcOrg.getSelectedItem().toString(),"Placed", new Date(), Float.parseFloat(this.tfPrice.getText()), this.tfDetails.getText());
        OrdersDirectory.getInstance().addOrder(order);
        JOptionPane.showMessageDialog(this, "Order Placed Successfully!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void tfDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnComplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComplainActionPerformed
        // TODO add your handling code here:
        FileComplainForm fcf = new FileComplainForm();
        fcf.labelFromName.setText(labelName.getText());
        fcf.jcDept.addItem("Orders");
        fcf.jcDept.addItem("Bills");
        fcf.jcDept.addItem("FreeLancers");
        fcf.show();
    }//GEN-LAST:event_btnComplainActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComplain;
    public javax.swing.JButton btnHFL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    public javax.swing.JComboBox<String> jcEnterprise;
    public javax.swing.JComboBox<String> jcOrg;
    public javax.swing.JComboBox<String> jcService;
    public javax.swing.JLabel labelName;
    private javax.swing.JTable tblUpdates;
    public javax.swing.JTextField tfDetails;
    public javax.swing.JTextField tfPrice;
    // End of variables declaration//GEN-END:variables
}


