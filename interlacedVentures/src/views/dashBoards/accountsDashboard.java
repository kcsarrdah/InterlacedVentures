/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

/**
 *
 * @author kcsar
 */
public class accountsDashboard extends javax.swing.JFrame {

    /**
     * Creates new form accountsDashboard
     */
    public accountsDashboard() {
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

        jPanAcctMgr = new javax.swing.JPanel();
        labAccntsMan = new javax.swing.JLabel();
        btnReq = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        btnChckPri = new javax.swing.JButton();
        btnRegIss = new javax.swing.JButton();
        btnViewFund = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanAcctMgr.setBackground(new java.awt.Color(204, 204, 255));
        jPanAcctMgr.setLayout(null);

        labAccntsMan.setFont(new java.awt.Font("Baloo Bhaijaan", 1, 18)); // NOI18N
        labAccntsMan.setText("          ACCOUNTS MANAGER");
        jPanAcctMgr.add(labAccntsMan);
        labAccntsMan.setBounds(251, 29, 295, 57);

        btnReq.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnReq.setText("REQUESTS");
        jPanAcctMgr.add(btnReq);
        btnReq.setBounds(298, 380, 143, 52);

        btnViewOrder.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnViewOrder.setText("VIEW ORDER");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        jPanAcctMgr.add(btnViewOrder);
        btnViewOrder.setBounds(298, 197, 143, 52);

        btnChckPri.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnChckPri.setText("CHECK PRICES");
        jPanAcctMgr.add(btnChckPri);
        btnChckPri.setBounds(298, 288, 143, 52);

        btnRegIss.setText("Register Issue");
        btnRegIss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegIssActionPerformed(evt);
            }
        });
        jPanAcctMgr.add(btnRegIss);
        btnRegIss.setBounds(592, 450, 125, 43);

        btnViewFund.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnViewFund.setText("VIEW FUNDS");
        jPanAcctMgr.add(btnViewFund);
        btnViewFund.setBounds(298, 105, 143, 52);

        btnback.setText("Back");
        jPanAcctMgr.add(btnback);
        btnback.setBounds(592, 29, 125, 43);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanAcctMgr, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanAcctMgr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnRegIssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegIssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegIssActionPerformed

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
            java.util.logging.Logger.getLogger(accountsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountsDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChckPri;
    private javax.swing.JButton btnRegIss;
    private javax.swing.JButton btnReq;
    private javax.swing.JButton btnViewFund;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JButton btnback;
    private javax.swing.JPanel jPanAcctMgr;
    private javax.swing.JLabel labAccntsMan;
    // End of variables declaration//GEN-END:variables
}
