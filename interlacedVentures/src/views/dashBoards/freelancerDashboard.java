/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import models.EmployeeDirectory;
import models.FreelanceDirectory;
import models.JobsDirectory;
import views.Freelancer.findJobsDashboard;
import views.forms.freelancerRegistrationForm;
import views.loginPage;

/**
 *
 * @author kcsar
 */
public class freelancerDashboard extends javax.swing.JFrame {

    /**
     * Creates new form freelancerDashboard
     */
    public freelancerDashboard() {
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
        jButton2 = new javax.swing.JButton();
        labelFreelancer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnViewProf = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 400, 90, 24);

        labelFreelancer.setFont(new java.awt.Font("Bai Jamjuree", 1, 18)); // NOI18N
        labelFreelancer.setText("       FREELANCER");
        jPanel1.add(labelFreelancer);
        labelFreelancer.setBounds(240, 10, 220, 80);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        jButton1.setText("WORK HISTORY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 320, 130, 60);

        btnViewProf.setBackground(new java.awt.Color(255, 255, 204));
        btnViewProf.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnViewProf.setText("VIEW PROFILE");
        btnViewProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewProf);
        btnViewProf.setBounds(50, 210, 130, 60);

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        jButton4.setText("FIND JOBS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(50, 100, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/freelancer.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 680, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfActionPerformed
        // TODO add your handling code here:
        this.hide();
        
//        THERE WILL BE CODE HERE TO TAKE THE FREELANCER TO HIS OWN PROFILE
        
        freelancerRegistrationForm frf = new freelancerRegistrationForm();
        frf.show();
        String UserName = labelFreelancer.getText();
        
        for(int i = 0; i < FreelanceDirectory.getInstance().getFreeLancerDir().size(); i++){
           if(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getUsername().equals(UserName)){
               
                frf.txtFName.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getFirstName());      
                frf.txtFName.setEditable(false);
                frf.txtLName.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLastName()); 
                frf.txtLName.setEditable(false);
                frf.txtUName.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getUsername()); 
                frf.txtUName.setEditable(false);
                frf.txtAge.setText(Integer.toString(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getAge()));
                frf.txtAge.setEditable(false);
                frf.comboGender.setSelectedItem(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getGender());
                frf.comboGender.setEditable(false);
                frf.txtPhone.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getPhoneNumber());
                frf.txtPhone.setEditable(false);
                frf.txtLoc.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLocation());
                frf.txtLoc.setEditable(false);
                frf.txtPortfolio.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLocation());
                frf.txtPortfolio.setEditable(false);
                frf.txtWorkExp.setText(Integer.toString(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getWorkEx()));
                frf.txtWorkExp.setEditable(false);
                frf.txtLatestWork.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLatestWork());
                frf.txtLatestWork.setEditable(false);
                frf.comboEducation.setSelectedItem(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getEducation());
                frf.comboEducation.setEditable(false);
                frf.jcSkills.setSelectedItem(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getSkills());
                frf.jcSkills.setEditable(false);
                frf.txtLoc.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getLocation());
                frf.txtLoc.setEditable(false);
                frf.txtHourlyRate.setText(Integer.toString(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getHourlyRate()));
                frf.txtHourlyRate.setEditable(false);
                frf.pwdField.setText(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getPassword());
                frf.pwdField.setEditable(false);
            }
        }

    }//GEN-LAST:event_btnViewProfActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here
        
        findJobsDashboard fjb = new findJobsDashboard();
        String role = "";
        
        
        
        for(int i=0; i < FreelanceDirectory.getInstance().getFreeLancerDir().size(); i++){
            if(FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getFirstName().equals(labelFreelancer.getText())){
                role = FreelanceDirectory.getInstance().getFreeLancerDir().get(i).getSkills();
            }
        }
        
        
        String[][] rows = new String[EmployeeDirectory.getInstance().getEmployeeDir().size()][3];
        String[] columnNames = {"Description", "Listed By", "Date of Listing"};
        int j = 0;
        for(int i=0; i < JobsDirectory.getInstance().getJobsDir().size(); i++){
            if(JobsDirectory.getInstance().getJobsDir().get(i).getRole().equals(role) && JobsDirectory.getInstance().getJobsDir().get(i).getStatus().equals("Posted")) {
                rows[j][0] = JobsDirectory.getInstance().getJobsDir().get(i).getDescription();
                rows[j][1] = JobsDirectory.getInstance().getJobsDir().get(i).getListedBy();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(JobsDirectory.getInstance().getJobsDir().get(i).getDateOfListing());
                rows[j][2] = s;
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        
        fjb.jobsTable.setModel(model);
        fjb.show();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(freelancerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(freelancerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(freelancerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(freelancerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new freelancerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewProf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labelFreelancer;
    // End of variables declaration//GEN-END:variables
}
