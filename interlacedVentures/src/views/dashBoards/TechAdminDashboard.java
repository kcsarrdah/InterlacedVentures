/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import javax.swing.table.DefaultTableModel;
import models.EmployeeDirectory;
import views.Orgs.Tech.Cloud;
import views.Orgs.Tech.Hardware;
import views.Orgs.Tech.Software;

/**
 *
 * @author kcsar
 */
public class TechAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form TechAdminDashboard
     */
    public TechAdminDashboard() {
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

        btnHardWare = new javax.swing.JButton();
        btnCloud = new javax.swing.JButton();
        btnSoftware = new javax.swing.JButton();
        bttnLogOut = new javax.swing.JButton();
        bttnServReq = new javax.swing.JButton();
        bttnInterReq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHardWare.setText("Hardware Department");
        btnHardWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardWareActionPerformed(evt);
            }
        });

        btnCloud.setText("Cloud Department");
        btnCloud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloudActionPerformed(evt);
            }
        });

        btnSoftware.setText("Software Department");
        btnSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoftwareActionPerformed(evt);
            }
        });

        bttnLogOut.setText("Log Out");

        bttnServReq.setText("Service Requests");

        bttnInterReq.setText("Interview Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(bttnLogOut)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHardWare)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnServReq, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnInterReq, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCloud, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(btnHardWare)
                .addGap(18, 18, 18)
                .addComponent(btnCloud, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnInterReq)
                .addGap(17, 17, 17)
                .addComponent(bttnServReq)
                .addGap(16, 16, 16)
                .addComponent(bttnLogOut)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHardWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardWareActionPerformed
        // TODO add your handling code here:
        this.hide();
        Hardware hd = new Hardware();
        String[][] rows = new String[EmployeeDirectory.getInstance().getEmployeeDir().size()][4];
        String[] columnNames = {"First Name", "Last Name", "Role", "Salary"};
        int j = 0;
        for(int i=0; i < EmployeeDirectory.getInstance().getEmployeeDir().size(); i++){
            if(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getOrganisation().equals("Hardware")) {
                rows[j][0] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getFirstName();
                rows[j][1] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLastName();
                rows[j][2] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getRole();
                rows[j][3] = Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getSalary()); 
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        hd.empTable.setModel(model);
        hd.show();
    }//GEN-LAST:event_btnHardWareActionPerformed

    private void btnCloudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloudActionPerformed
        // TODO add your handling code here:
        this.hide();
        Cloud cl = new Cloud();
        String[][] rows = new String[EmployeeDirectory.getInstance().getEmployeeDir().size()][4];
        String[] columnNames = {"First Name", "Last Name", "Role", "Salary"};
        int j = 0;
        for(int i=0; i < EmployeeDirectory.getInstance().getEmployeeDir().size(); i++){
            if(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getOrganisation().equals("Cloud")) {
                rows[j][0] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getFirstName();
                rows[j][1] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLastName();
                rows[j][2] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getRole();
                rows[j][3] = Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getSalary()); 
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        cl.empTable.setModel(model);
        cl.show();
    }//GEN-LAST:event_btnCloudActionPerformed

    private void btnSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoftwareActionPerformed
        // TODO add your handling code here:
        this.hide();
        Software sd = new Software();
        String[][] rows = new String[EmployeeDirectory.getInstance().getEmployeeDir().size()][5];
        String[] columnNames = {"First Name", "Last Name", "UserName", "Role", "Salary"};
        int j = 0;
        for(int i=0; i < EmployeeDirectory.getInstance().getEmployeeDir().size(); i++){
            if(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getOrganisation().equals("Software")) {
                rows[j][0] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getFirstName();
                rows[j][1] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLastName();
                rows[j][2] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getUsername();           
                rows[j][3] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getRole();
                rows[j][4] = Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getSalary()); 
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        sd.empTable.setModel(model);
        sd.show();
    }//GEN-LAST:event_btnSoftwareActionPerformed

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
            java.util.logging.Logger.getLogger(TechAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloud;
    private javax.swing.JButton btnHardWare;
    private javax.swing.JButton btnSoftware;
    private javax.swing.JButton bttnInterReq;
    private javax.swing.JButton bttnLogOut;
    private javax.swing.JButton bttnServReq;
    // End of variables declaration//GEN-END:variables
}



        
        
        
