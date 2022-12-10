/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

/**
 *
 * @author kcsar
 */
public class SupplyAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form SupplyAdminDashboard
     */
    public SupplyAdminDashboard() {
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

        jPanSupplyAdmin = new javax.swing.JPanel();
        jLabelSupplyAdmin = new javax.swing.JLabel();
        ordersSuppAdm = new javax.swing.JButton();
        regIssueSuppAdmi = new javax.swing.JButton();
        inventorySuppAdm = new javax.swing.JButton();
        placeOrderSupAdm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSupplyAdmin.setText("                  SUPPLY ADMIN");

        ordersSuppAdm.setText("Orders");

        regIssueSuppAdmi.setText("Register Issue");

        inventorySuppAdm.setText("Inventory");
        inventorySuppAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventorySuppAdmActionPerformed(evt);
            }
        });

        placeOrderSupAdm.setText("Place Order");

        javax.swing.GroupLayout jPanSupplyAdminLayout = new javax.swing.GroupLayout(jPanSupplyAdmin);
        jPanSupplyAdmin.setLayout(jPanSupplyAdminLayout);
        jPanSupplyAdminLayout.setHorizontalGroup(
            jPanSupplyAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanSupplyAdminLayout.createSequentialGroup()
                .addGroup(jPanSupplyAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanSupplyAdminLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(jPanSupplyAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placeOrderSupAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inventorySuppAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ordersSuppAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanSupplyAdminLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(regIssueSuppAdmi)))
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(jPanSupplyAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanSupplyAdminLayout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(jLabelSupplyAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );
        jPanSupplyAdminLayout.setVerticalGroup(
            jPanSupplyAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanSupplyAdminLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(ordersSuppAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inventorySuppAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(placeOrderSupAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(regIssueSuppAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanSupplyAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanSupplyAdminLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabelSupplyAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanSupplyAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanSupplyAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventorySuppAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventorySuppAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventorySuppAdmActionPerformed

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
            java.util.logging.Logger.getLogger(SupplyAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplyAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplyAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplyAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplyAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inventorySuppAdm;
    private javax.swing.JLabel jLabelSupplyAdmin;
    private javax.swing.JPanel jPanSupplyAdmin;
    private javax.swing.JButton ordersSuppAdm;
    private javax.swing.JButton placeOrderSupAdm;
    private javax.swing.JButton regIssueSuppAdmi;
    // End of variables declaration//GEN-END:variables
}
