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
import views.loginPage;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(null);

        btnHardWare.setBackground(new java.awt.Color(255, 255, 204));
        btnHardWare.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnHardWare.setText("Hardware Department");
        btnHardWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardWareActionPerformed(evt);
            }
        });
        getContentPane().add(btnHardWare);
        btnHardWare.setBounds(33, 92, 180, 30);

        btnCloud.setBackground(new java.awt.Color(255, 255, 204));
        btnCloud.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnCloud.setText("Cloud Department");
        btnCloud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloudActionPerformed(evt);
            }
        });
        getContentPane().add(btnCloud);
        btnCloud.setBounds(33, 133, 180, 30);

        btnSoftware.setBackground(new java.awt.Color(255, 255, 204));
        btnSoftware.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnSoftware.setText("Software Department");
        btnSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoftwareActionPerformed(evt);
            }
        });
        getContentPane().add(btnSoftware);
        btnSoftware.setBounds(33, 174, 180, 30);

        bttnLogOut.setBackground(new java.awt.Color(255, 255, 204));
        bttnLogOut.setText("Log Out");
        bttnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(bttnLogOut);
        bttnLogOut.setBounds(480, 300, 76, 23);

        bttnServReq.setBackground(new java.awt.Color(255, 255, 204));
        bttnServReq.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        bttnServReq.setText("Service Requests");
        bttnServReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnServReqActionPerformed(evt);
            }
        });
        getContentPane().add(bttnServReq);
        bttnServReq.setBounds(33, 255, 180, 30);

        bttnInterReq.setBackground(new java.awt.Color(255, 255, 204));
        bttnInterReq.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        bttnInterReq.setText("Interview Requests");
        getContentPane().add(bttnInterReq);
        bttnInterReq.setBounds(33, 215, 180, 30);

        jLabel2.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        jLabel2.setText("TECH ADMIN DASHBOARD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 20, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/trishaguharoy/Downloads/techhhhhh.jpeg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, -10, 630, 420);

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

    private void bttnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLogOutActionPerformed
        // TODO add your handling code here:
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_bttnLogOutActionPerformed

    private void bttnServReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnServReqActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bttnServReqActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}



        
        
        
