/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.BillsDirectory;
import models.EmployeeDirectory;
import models.FreelanceDirectory;
import models.JobsDirectory;
import models.bills;
import models.jobs;
import views.forms.employeeRegistrationForm;
import views.forms.freelancerRegistrationForm;

/**
 *
 * @author shreyasisodiya
 */
public class ViewItemsBusinessUser extends javax.swing.JFrame {

    /**
     * Creates new form ViewItemsBusinessUser
     */
    public ViewItemsBusinessUser() {
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
        tableBills = new javax.swing.JTable();
        labelBUItem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tableBills.setBackground(new java.awt.Color(255, 255, 204));
        tableBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SERVICES", "ORGANISATION", "RECEIPT NO.", "AMOUNT", "DATE"
            }
        ));
        jScrollPane1.setViewportView(tableBills);

        labelBUItem.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelBUItem.setText("YOUR BILL");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton2.setText("REGISTER AN ISSUE");

        labelName.setText("Name");

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        jButton4.setText("Reject");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(labelBUItem, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBUItem)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        businessUserDashBoard budb = new businessUserDashBoard();
        budb.businessUser.setText(labelName.getText());
        budb.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel) tableBills.getModel();
        String Name = tableModel.getValueAt(tableBills.getSelectedRow(), 1).toString();
        String x = labelName.getText();
        
        if(tableBills.getSelectedRowCount() == 1){
            freelancerRegistrationForm erf = new freelancerRegistrationForm();
            
            erf.tfName.setText(Name);
            erf.show();
            
            for(int i = 0; i < FreelanceDirectory.getInstance().getFreeLancerDir().size(); i++){
                if(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getFirstName().equals(Name)){
                    erf.pwdField.hide();
                    erf.txtFName.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getFirstName());
                    erf.txtFName.setEditable(false);
                    erf.txtLName.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLastName());
                    erf.txtLName.setEditable(false);
                    
                    erf.txtEmail.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getEmail());
                    erf.txtEmail.setEditable(false);
                    
                    erf.pwdField.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getPassword());
                    erf.pwdField.hide(); //setEditable(false);
                    
                    erf.txtAge.setText(Integer.toString(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getAge()));
                    erf.txtAge.setEditable(false);
                    
                    erf.txtUName.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getUsername());
                    erf.txtUName.setEditable(false);
                    
                    erf.comboGender.setSelectedItem(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getGender());
                    erf.comboGender.setEditable(false);
                    
                    erf.txtPhone.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getPhoneNumber());
                    erf.txtPhone.setEditable(false);
                    
                    erf.txtLoc.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLocation());
                    erf.txtLoc.setEditable(false);
                    
//                    Format formatter = new SimpleDateFormat("MM/dd/yyyy");
//                    String s = formatter.format(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getDateOfJoining());
                    
                    erf.dateField.setDate(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getDateOfJoining());
                    
                    erf.txtHourlyRate.setText(Integer.toString(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getHourlyRate()));
                    erf.txtHourlyRate.setEditable(false);
                    
//                    erf.comboRole.setSelectedItem(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getRole());
//                    erf.comboRole.setEditable(false);
                    erf.jcSkills.setSelectedItem(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getSkills());
                    erf.jcSkills.setEditable(false);
                    
                    erf.comboEducation.setSelectedItem(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getEducation());
                    erf.comboEducation.setEditable(false);
                    
                    erf.txtWorkExp.setText(Integer.toString(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getWorkEx()));
                    erf.txtWorkExp.setEditable(false);
                    
                    erf.txtLatestWork.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLatestWork());
                    erf.txtLatestWork.setEditable(false);
                    
                    erf.txtLatestWork.setText(x);
                    erf.txtLatestWork.setVisible(false);
                    
                          
                    erf.btnReg.setVisible(false);
                  }
                }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) tableBills.getModel();
        String Name = tableModel.getValueAt(tableBills.getSelectedRow(), 1).toString();
        String x = labelName.getText();
        String Service = tableModel.getValueAt(tableBills.getSelectedRow(), 0).toString();
        
        int recietNo = 0;
        
        if(tableBills.getSelectedRowCount() == 1){
            for(int i = 0; i < JobsDirectory.getInstance().getJobsDir().size(); i++){
                if(JobsDirectory.getInstance().getJobsDir().get(i).getAppliedBy().equals(Name)){
                    jobs job = new jobs(
                            Name,
                            JobsDirectory.getInstance().getJobsDir().get(i).getListedBy(),
                            JobsDirectory.getInstance().getJobsDir().get(i).getDateOfListing(),
                            "Closed",
                            JobsDirectory.getInstance().getJobsDir().get(i).getDescription(),
                            JobsDirectory.getInstance().getJobsDir().get(i).getRole());
                    JobsDirectory.getInstance().updateJob(job, i);
                    System.out.println(JobsDirectory.getInstance().getJobsDir().get(i).getStatus());
                    JOptionPane.showMessageDialog(this, "Candidate Selected");
                    
                    float amount = 0; 
                    for(int j = 0; j < FreelanceDirectory.getInstance().getFreeLancerDir().size(); j++){
                        if(FreelanceDirectory.getInstance().getFreeLancerDir().get(j).getFirstName().equals(Name)){
                            amount = FreelanceDirectory.getInstance().getFreeLancerDir().get(j).getHourlyRate();
                            recietNo = j + 2300;
                            break;
                        } 
                    }
                    
                    bills bill = new bills(new Date(), amount, Service, Name,recietNo);
                    BillsDirectory.getInstance().addBill(bill);
               
                }
            }
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

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
            java.util.logging.Logger.getLogger(ViewItemsBusinessUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewItemsBusinessUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewItemsBusinessUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewItemsBusinessUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewItemsBusinessUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAccept;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelBUItem;
    public javax.swing.JLabel labelName;
    public javax.swing.JTable tableBills;
    // End of variables declaration//GEN-END:variables
}
