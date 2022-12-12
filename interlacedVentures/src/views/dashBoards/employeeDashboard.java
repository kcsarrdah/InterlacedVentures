/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import models.BillsDirectory;
import models.EmployeeDirectory;
import models.OrdersDirectory;
import models.bills;
import models.orders;
import views.forms.FileComplainForm;
import views.forms.employeeRegistrationForm;
import views.loginPage;

/**
 *
 * @author shreyasisodiya
 */
public class employeeDashboard extends javax.swing.JFrame {

    /**
     * Creates new form employeeDashboard
     */
    public employeeDashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblEmpName = new javax.swing.JLabel();
        btnViewProf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelRole = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WorkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(WorkTable);

        jButton1.setText("Mark as Completed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register a Complain");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Your On Going Job");

        lblEmpName.setText("Name");

        btnViewProf.setText("View Profile");
        btnViewProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfActionPerformed(evt);
            }
        });

        jLabel2.setText("Role");

        labelRole.setText("Role");

        jButton4.setText("View Documents");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewProf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelRole, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(34, 34, 34)
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEmpName, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRole, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(btnViewProf)
                    .addComponent(jButton4))
                .addGap(21, 21, 21))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        float amt = 0;
        int rctno = 0;
        DefaultTableModel tableModel = (DefaultTableModel) WorkTable.getModel();
        String description = tableModel.getValueAt(WorkTable.getSelectedRow(), 0).toString();
        
        //for loop to find the relevant selected order in tfrom the given table.
        for(int i = 0; i < OrdersDirectory.getInstance().getOrdersDir().size(); i++){
            
            if(OrdersDirectory.getInstance().getOrdersDir().get(i).getDetails().equals(description)){
                String name = OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo();
                amt = OrdersDirectory.getInstance().getOrdersDir().get(i).getAmount();
                rctno = i+2500;
                
                //for loop to find a relevant employee and add him on the job order object is updated here.
                        orders order = new orders(
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getRole(),
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getAssignedTo(),
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getService(),
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getOrderedBy(),
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo(),
                                "Completed",
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getDate(),
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getAmount(),
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getDetails()
                        );
                        OrdersDirectory.getInstance().updateOrder(order, i);
                        tableModel.removeRow(WorkTable.getSelectedRow());
                        
                        bills bill = new bills (
                    name,
                    new Date(), 
                    amt, 
                    OrdersDirectory.getInstance().getOrdersDir().get(i).getService(), 
                    name, 
                    rctno);
                    BillsDirectory.getInstance().addBill(bill);
                break;
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnViewProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfActionPerformed
        // TODO add your handling code here:
        this.hide();
        employeeRegistrationForm erf = new employeeRegistrationForm();
        
        String UserName = lblEmpName.getText();
        
        for(int i = 0; i < EmployeeDirectory.getInstance().getEmployeeDir().size(); i++){
           if(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getFirstName().equals(UserName)){
               
                erf.txtFName.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getFirstName());      
                erf.txtFName.setEditable(false);
                erf.txtLName.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLastName()); 
                erf.txtLName.setEditable(false);
                erf.txtUName.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getUsername()); 
                erf.txtUName.setEditable(false);
                erf.txtAge.setText(Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getAge()));
                erf.txtAge.setEditable(false);
                erf.comboGender.setSelectedItem(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getGender());
                erf.comboGender.setEditable(false);
                erf.txtPhone.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getPhoneNumber());
                erf.txtPhone.setEditable(false);
                erf.txtLoc.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLocation());
                erf.txtLoc.setEditable(false);
                erf.txtEmail.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getEmail());
                erf.txtEmail.setEditable(false);        
                erf.comboRole.setSelectedItem(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getRole());
                erf.comboRole.setEditable(false);
                erf.txtWorkExp.setText(Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getWorkEx()));
                erf.txtWorkExp.setEditable(false);
                erf.txtLatestWork.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLatestWork());
                erf.txtLatestWork.setEditable(false);
                erf.comboEducation.setSelectedItem(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getEducation());
                erf.comboEducation.setEditable(false);
                erf.comboOrg.setSelectedItem(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getOrganisation());
                erf.comboOrg.setEditable(false);
                erf.txtSkills.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getSkills());
                erf.txtSkills.setEditable(false);
                erf.txtLoc.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLocation());
                erf.txtLoc.setEditable(false);
               
                erf.pwdField.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getPassword());
                erf.pwdField.setEditable(false);
                erf.btnApply.setVisible(false);
                
                        erf.show();
            }
        }
    }//GEN-LAST:event_btnViewProfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FileComplainForm fcf = new FileComplainForm();
        fcf.labelFromName.setText(lblEmpName.getText());
        fcf.jcDept.addItem("Orders");
        fcf.jcDept.addItem("Bills");
        fcf.jcDept.addItem("FreeLancers");
        fcf.show();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(employeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable WorkTable;
    private javax.swing.JButton btnViewProf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelRole;
    public javax.swing.JLabel lblEmpName;
    // End of variables declaration//GEN-END:variables
}
