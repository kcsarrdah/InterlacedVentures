/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import models.BillsDirectory;
import models.JobsDirectory;
import models.bills;
import models.OrdersDirectory;
import views.loginPage;

/**
 *
 * @author kcsar
 */
public class businessUserDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form businessUserDashBoard
     */
    public businessUserDashBoard() {
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
        servicesbusiness = new javax.swing.JButton();
        billings = new javax.swing.JButton();
        ordersbusiness = new javax.swing.JButton();
        logoutbusi = new javax.swing.JButton();
        businessUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        servicesbusiness.setText("Services");
        servicesbusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesbusinessActionPerformed(evt);
            }
        });

        billings.setText("Billings");
        billings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingsActionPerformed(evt);
            }
        });

        ordersbusiness.setText("Orders");
        ordersbusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersbusinessActionPerformed(evt);
            }
        });

        logoutbusi.setText("Log Out");
        logoutbusi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbusiActionPerformed(evt);
            }
        });

        businessUser.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        businessUser.setText("BUSINESS USER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutbusi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(servicesbusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(billings, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(ordersbusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(businessUser, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(businessUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicesbusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billings, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordersbusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(logoutbusi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordersbusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersbusinessActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewItemsBusinessUser vibu = new ViewItemsBusinessUser();
        vibu.labelBUItem.setText("YOUR ORDERS");
    String[] columnNames = {"Services", "Organisation Involved", "Date", "Status", "Description"};
        int n = OrdersDirectory.getInstance().getOrdersDir().size() + JobsDirectory.getInstance().getJobsDir().size();
        String[][] rows = new String[n][5];
        int j=0;
        for(int i = 0;  i< OrdersDirectory.getInstance().getOrdersDir().size(); i++){
            if(OrdersDirectory.getInstance().getOrdersDir().get(i).getOrderedBy().equals(businessUser.getText())){
                rows[j][0] = OrdersDirectory.getInstance().getOrdersDir().get(i).getService();
                rows[j][1] = OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo();
                Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(OrdersDirectory.getInstance().getOrdersDir().get(i).getDate());
                rows[j][2] = s;               
                rows[j][3] = OrdersDirectory.getInstance().getOrdersDir().get(i).getStatus();
                rows[j][4] = OrdersDirectory.getInstance().getOrdersDir().get(i).getDetails();
                j++; 
            }     
        }
        j = 0;
        for(int i = 0; i< JobsDirectory.getInstance().getJobsDir().size(); i++){
            if(JobsDirectory.getInstance().getJobsDir().get(i).getListedBy().equals(businessUser.getText())){
                rows[j][0] = JobsDirectory.getInstance().getJobsDir().get(i).getRole();
                rows[j][1] = JobsDirectory.getInstance().getJobsDir().get(i).getAppliedBy();
                Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(JobsDirectory.getInstance().getJobsDir().get(i).getDateOfListing());
                rows[j][2] = s;             
                rows[j][3] = JobsDirectory.getInstance().getJobsDir().get(i).getStatus();
                rows[j][4] = JobsDirectory.getInstance().getJobsDir().get(i).getDescription();
                j++; 
            }     
        }
        
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        vibu.tableBills.setModel(dtm);
        vibu.labelName.setText(businessUser.getText());
        vibu.show();
    }//GEN-LAST:event_ordersbusinessActionPerformed

    private void billingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingsActionPerformed
        // TODO add your handling code here:
        ViewItemsBusinessUser vibu = new ViewItemsBusinessUser();
        vibu.labelName.setText(businessUser.getText());
        vibu.labelBUItem.setText("YOUR BILL");
        String[] columnNames = {"Services", "Organisation", "Receipt No.", "Amount", "Date"};
        int n = BillsDirectory.getInstance().getBillsDir().size();
        String[][] rows = new String[n][5];
        int j=0;
        for(int i = 0;  i<n ; i++){
            if(BillsDirectory.getInstance().getBillsDir().get(i).getBillFor().equals(businessUser.getText())){
                rows[j][0] = BillsDirectory.getInstance().getBillsDir().get(i).getSevices();
                rows[j][1] = BillsDirectory.getInstance().getBillsDir().get(i).getOrgName();
                rows[j][2] = Integer.toString(BillsDirectory.getInstance().getBillsDir().get(i).getReceiptNo());     
                rows[j][3] = Float.toString(BillsDirectory.getInstance().getBillsDir().get(i).getAmount()); 
                //rows[j][4] = BillsDirectory.getInstance().getBillsDir().get(i).BillsDirectory.sqlDate;     
                Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(BillsDirectory.getInstance().getBillsDir().get(i).getDate());
                rows[j][4] = s;
                j++;
            }      
        }
        
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        vibu.tableBills.setModel(dtm);
        vibu.show();
    }//GEN-LAST:event_billingsActionPerformed

    private void servicesbusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesbusinessActionPerformed
        // TODO add your handling code here:
        ServiceDashboard sd = new ServiceDashboard();
        sd.labelName.setText(this.businessUser.getText());
        sd.pnlTableDisplay.hide();
       
        sd.btnFile.hide();
        sd.btnViewFile.hide();
        sd.btnPlaceReq.hide();
        sd.btnBookApt.hide();
        
        
        sd.btnView.hide();
        sd.btnRent.hide();
        sd.btnBuyRawMats.hide();
        
        sd.show();
    }//GEN-LAST:event_servicesbusinessActionPerformed

    private void logoutbusiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbusiActionPerformed
        // TODO add your handling code here:
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_logoutbusiActionPerformed

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
            java.util.logging.Logger.getLogger(businessUserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(businessUserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(businessUserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(businessUserDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new businessUserDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billings;
    public javax.swing.JLabel businessUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutbusi;
    private javax.swing.JButton ordersbusiness;
    private javax.swing.JButton servicesbusiness;
    // End of variables declaration//GEN-END:variables
}
