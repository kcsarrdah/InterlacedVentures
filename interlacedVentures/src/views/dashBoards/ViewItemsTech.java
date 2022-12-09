/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import models.BillsDirectory;
import models.EmployeeDirectory;
import models.OrdersDirectory;
import models.bills;
import models.orders;

/**
 *
 * @author shreyasisodiya
 */
public class ViewItemsTech extends javax.swing.JFrame {

    /**
     * Creates new form ViewItemsTech
     */
    public ViewItemsTech() {
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
        buttonTableBack = new javax.swing.JButton();
        labelRequest = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTechReq = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonTableBack.setText("BACK");
        buttonTableBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTableBackActionPerformed(evt);
            }
        });

        labelRequest.setText("jLabel1");

        tblTechReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ordered By", "Organisation", "Service"
            }
        ));
        jScrollPane1.setViewportView(tblTechReq);

        jButton1.setText("Assign To Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Disapprove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(labelRequest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(buttonTableBack)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelRequest)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTableBack)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnView))
                .addGap(35, 35, 35))
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

    private void buttonTableBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTableBackActionPerformed
        // TODO add your handling code here:
        this.hide();
        TechAdminDashboard tad = new TechAdminDashboard();
        tad.show();
    }//GEN-LAST:event_buttonTableBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel) tblTechReq.getModel();
        String role = tableModel.getValueAt(tblTechReq.getSelectedRow(), 2).toString();
        System.out.println(role);
        String name = tblTechReq.getValueAt(tblTechReq.getSelectedRow(), 0).toString();
        String Desc = tblTechReq.getValueAt(tblTechReq.getSelectedRow(), 4).toString();
        
          for(int i = 0; i < OrdersDirectory.getInstance().getOrdersDir().size(); i++){
            if(OrdersDirectory.getInstance().getOrdersDir().get(i).getDetails().equals(Desc))
                //for loop to find a relevant employee and add him on the job order object is updated here.
                for(int j = 0;  j < EmployeeDirectory.getInstance().getEmployeeDir().size(); j++){
                    
                    if(EmployeeDirectory.getInstance().getEmployeeDir().get(j).getRole().equals(role)){
                        orders order = new orders(
                                role,
                                EmployeeDirectory.getInstance().getEmployeeDir().get(j).getFirstName(),
                                tblTechReq.getValueAt(tblTechReq.getSelectedRow(), 3).toString(),
                                name,
                                tblTechReq.getValueAt(tblTechReq.getSelectedRow(), 1).toString(),
                                "Assigned",
                                new Date(), 
                                OrdersDirectory.getInstance().getOrdersDir().get(i).getAmount(),
                                Desc
                        );
                        OrdersDirectory.getInstance().updateOrder(order, i);

                    }
                        
                        //tableModel.removeRow(tblTechReq.getSelectedRow());
                
                }
            }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ViewItemsTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewItemsTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewItemsTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewItemsTech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewItemsTech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnView;
    private javax.swing.JButton buttonTableBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelRequest;
    public javax.swing.JTable tblTechReq;
    // End of variables declaration//GEN-END:variables
}
