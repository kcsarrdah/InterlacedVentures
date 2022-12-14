/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import javax.swing.table.DefaultTableModel;
import models.ApplicationBusinessDirectory;
import models.ApplicationDirectory;
import models.ApplicationFreelancerDirectory;
import models.StorageDirectory;
import views.loginPage;

/**
 *
 * @author kcsar
 */
public class verificationAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form verificationAdminDashboard
     */
    public verificationAdminDashboard() {
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

        jBackPage = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        veriBusin = new javax.swing.JButton();
        veriFreelan = new javax.swing.JButton();
        veriEmployers = new javax.swing.JButton();
        verifAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 234, 234));

        jBackPage.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setBackground(new java.awt.Color(255, 255, 248));
        backButton.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        veriBusin.setBackground(new java.awt.Color(242, 240, 240));
        veriBusin.setFont(new java.awt.Font("InaiMathi", 1, 18)); // NOI18N
        veriBusin.setText("Verify Businesses");
        veriBusin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        veriBusin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veriBusinActionPerformed(evt);
            }
        });

        veriFreelan.setBackground(new java.awt.Color(242, 240, 240));
        veriFreelan.setFont(new java.awt.Font("InaiMathi", 1, 18)); // NOI18N
        veriFreelan.setText("Verify Freelancers");
        veriFreelan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        veriFreelan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veriFreelanActionPerformed(evt);
            }
        });

        veriEmployers.setBackground(new java.awt.Color(242, 240, 240));
        veriEmployers.setFont(new java.awt.Font("InaiMathi", 1, 18)); // NOI18N
        veriEmployers.setText("Verify Employers");
        veriEmployers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        veriEmployers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veriEmployersActionPerformed(evt);
            }
        });

        verifAdmin.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        verifAdmin.setText("         VERIFIER");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Images/accmanager.jpeg"))); // NOI18N

        javax.swing.GroupLayout jBackPageLayout = new javax.swing.GroupLayout(jBackPage);
        jBackPage.setLayout(jBackPageLayout);
        jBackPageLayout.setHorizontalGroup(
            jBackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(jBackPageLayout.createSequentialGroup()
                .addGroup(jBackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackPageLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jBackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(veriFreelan, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(veriEmployers, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(veriBusin, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jBackPageLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(verifAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jBackPageLayout.setVerticalGroup(
            jBackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackPageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(verifAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBackPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackPageLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(veriEmployers, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(veriFreelan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(veriBusin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jBackPageLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veriFreelanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veriFreelanActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewItemsVerificationAdminForm vf = new ViewItemsVerificationAdminForm();
        vf.btnVLis.setVisible(false);
        vf.lblName.setText("FreeLancers");
        
        String[][] rows = new String[ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().size()][6];
        String[] columnNames = {"UserName", "FirstName", "LastName", "Skill", "Resume", "ID"};
        int j = 0;
        
        for(int i=0; i < ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().size(); i++){
            if(!ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().get(i).getAppStatus().equals("Completed")){
                rows[j][0] = ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().get(i).getUsername();
                rows[j][1] = ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().get(i).getFirstName();
                rows[j][2] = ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().get(i).getLastName();
                rows[j][3] = ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().get(i).getSkills();           
                rows[j][4] = ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().get(i).getResPath();
                rows[j][5] = ApplicationFreelancerDirectory.getInstance().getApplicationFreelancerDir().get(i).getIdPath();
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        vf.tblDisplay.setModel(model);
        
        vf.show();
    }//GEN-LAST:event_veriFreelanActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_backButtonActionPerformed

    private void veriEmployersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veriEmployersActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewItemsVerificationAdminForm vf = new ViewItemsVerificationAdminForm();
        vf.lblName.setText("Employee");
        
        String[][] rows = new String[ApplicationDirectory.getInstance().getApplicationDir().size()][6];
        String[] columnNames = {"UserName", "FirstName", "LastName", "Skill", "Resume", "ID"};
        int j = 0;
        for(int i=0; i < ApplicationDirectory.getInstance().getApplicationDir().size(); i++){
            if(!ApplicationDirectory.getInstance().getApplicationDir().get(i).getAppStatus().equals("Completed") && 
                    !ApplicationDirectory.getInstance().getApplicationDir().get(i).getAppStatus().equals("STA")){
                rows[j][0] = ApplicationDirectory.getInstance().getApplicationDir().get(i).getUsername();
                rows[j][1] = ApplicationDirectory.getInstance().getApplicationDir().get(i).getFirstName();
                rows[j][2] = ApplicationDirectory.getInstance().getApplicationDir().get(i).getLastName();
                rows[j][3] = ApplicationDirectory.getInstance().getApplicationDir().get(i).getSkills();           
                rows[j][4] = ApplicationDirectory.getInstance().getApplicationDir().get(i).getResPath();
                rows[j][5] = ApplicationDirectory.getInstance().getApplicationDir().get(i).getIdPath();
                j++;
            }

            
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        vf.tblDisplay.setModel(model);
        vf.show();
    }//GEN-LAST:event_veriEmployersActionPerformed

    private void veriBusinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veriBusinActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewItemsVerificationAdminForm vf = new ViewItemsVerificationAdminForm();
        vf.btnViewRes.setVisible(false);
        vf.btnViwId.setVisible(false);
        vf.lblName.setText("Business");
        
        System.out.println();
        
        String[][] rows = new String[ApplicationBusinessDirectory.getInstance().getApplicationBusinessDir().size()][3];
        String[] columnNames = {"Name", "Website", "Business Liscence"};
        int j = 0;
        
        for(int i = 0; i < ApplicationBusinessDirectory.getInstance().getApplicationBusinessDir().size(); i++){
            if(!ApplicationBusinessDirectory.getInstance().getApplicationBusinessDir().get(i).getAppStatus().equals("Completed")){
                
                rows[j][0] = ApplicationBusinessDirectory.getInstance().getApplicationBusinessDir().get(i).getName();
                
                rows[j][1] = ApplicationBusinessDirectory.getInstance().getApplicationBusinessDir().get(i).getWebsite();         
                rows[j][2] = ApplicationBusinessDirectory.getInstance().getApplicationBusinessDir().get(i).getLicensePath();
                j++;
            }

            
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        vf.tblDisplay.setModel(model);
        vf.show();
    }//GEN-LAST:event_veriBusinActionPerformed

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
            java.util.logging.Logger.getLogger(verificationAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verificationAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verificationAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verificationAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verificationAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jBackPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton veriBusin;
    private javax.swing.JButton veriEmployers;
    private javax.swing.JButton veriFreelan;
    private javax.swing.JLabel verifAdmin;
    // End of variables declaration//GEN-END:variables
}
