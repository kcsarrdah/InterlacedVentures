/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import javax.swing.table.DefaultTableModel;
import models.OrdersDirectory;
import models.StorageDirectory;
import views.Orgs.Operations.RawMatDash;

import views.Orgs.Operations.StorageDash;
import views.Orgs.Operations.TransportDash;

import views.loginPage;

/**
 *
 * @author kcsar
 */
public class OperationsAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form OperationsAdminDashboard
     */
    public OperationsAdminDashboard() {
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
        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnStorage = new javax.swing.JButton();
        btnTransport = new javax.swing.JButton();
        btnRawMat = new javax.swing.JButton();
        btnInterview = new javax.swing.JButton();
        btnService = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("OPERATIONS ADMIN DASHBOARD");

        btnLogOut.setText("LOG OUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnStorage.setText("STORAGE DEPARTMENT");
        btnStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStorageActionPerformed(evt);
            }
        });

        btnTransport.setText("TRANSPORT DEPARTMENT");
        btnTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportActionPerformed(evt);
            }
        });

        btnRawMat.setText("RAW MATERIAL DEPARTMENT");
        btnRawMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawMatActionPerformed(evt);
            }
        });

        btnInterview.setText("INTERVIEW REQUESTS");

        btnService.setText("SERVICE REQUESTS");
        btnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRawMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTransport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStorage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInterview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(btnStorage)
                .addGap(45, 45, 45)
                .addComponent(btnTransport)
                .addGap(45, 45, 45)
                .addComponent(btnRawMat)
                .addGap(45, 45, 45)
                .addComponent(btnInterview)
                .addGap(45, 45, 45)
                .addComponent(btnService)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(24, 24, 24))
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

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStorageActionPerformed
        // TODO add your handling code here:
        this.hide();
        StorageDash sd = new StorageDash();
        sd.show();
    }//GEN-LAST:event_btnStorageActionPerformed

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewItemsOperation vio = new ViewItemsOperation();
        vio.lblReqOp.setText(btnService.getText());
        String[] columnNames = {"Order From", "Organisation", "Service Requested"};
        int n = OrdersDirectory.getInstance().getOrdersDir().size();
        String[][] rows = new String[n][3];
        int j=0;
        for(int i = 0;  i<n ; i++){
            if(!OrdersDirectory.getInstance().getOrdersDir().get(i).getStatus().equals("Completed") && OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo().equals("Operations")){
                rows[j][0] = OrdersDirectory.getInstance().getOrdersDir().get(i).getOrderedBy();
                rows[j][1] = OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo();
                rows[j][2] = OrdersDirectory.getInstance().getOrdersDir().get(i).getService();           
                j++;
            }
        }
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        vio.tblOpReq.setModel(dtm);
        vio.show();
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportActionPerformed
        // TODO add your handling code here:
        this.hide();
        TransportDash td = new TransportDash();
        td.show();
    }//GEN-LAST:event_btnTransportActionPerformed

    private void btnRawMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawMatActionPerformed
        // TODO add your handling code here:
        this.hide();
        RawMatDash rmd = new RawMatDash();
        rmd.show();
    }//GEN-LAST:event_btnRawMatActionPerformed

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
            java.util.logging.Logger.getLogger(OperationsAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperationsAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperationsAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperationsAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperationsAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInterview;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRawMat;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnStorage;
    private javax.swing.JButton btnTransport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
