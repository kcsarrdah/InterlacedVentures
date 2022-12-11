/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.dashBoards;

import javax.swing.table.DefaultTableModel;
import models.EmployeeDirectory;
import models.OrdersDirectory;
import views.Orgs.FinanceAndLegal.Consultancy;
import views.loginPage;

/**
 *
 * @author kcsar
 */
public class FinAndLegalDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form FinAndLegalDashBoard
     */
    public FinAndLegalDashBoard() {
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
        bttnInterReq = new javax.swing.JButton();
        bttnServReq = new javax.swing.JButton();
        btnConsultancy = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bai Jamjuree", 1, 30)); // NOI18N
        jLabel1.setText("FINANCES AND LEGAL ADMIN DASHBOARD");

        bttnInterReq.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        bttnInterReq.setText("INTERVIEW REQUESTS");
        bttnInterReq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttnServReq.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        bttnServReq.setText("SERVICE REQUESTS");
        bttnServReq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttnServReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnServReqActionPerformed(evt);
            }
        });

        btnConsultancy.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnConsultancy.setText("CONSULTING DEPARTMENT'");
        btnConsultancy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultancyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnConsultancy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttnServReq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttnInterReq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btnConsultancy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bttnServReq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(bttnInterReq, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        btnLogOut.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        btnLogOut.setText("LOG OUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnServReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnServReqActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewItemsFinAndLegal vifl = new ViewItemsFinAndLegal();
        vifl.labelRequest.setText(bttnServReq.getText());
        String[] columnNames = {"Order From", "Organisation", "Service Requested"};
        int n = OrdersDirectory.getInstance().getOrdersDir().size();
        String[][] rows = new String[n][3];
        int j=0;
        for(int i = 0;  i<n ; i++){
            if(!OrdersDirectory.getInstance().getOrdersDir().get(i).getStatus().equals("Completed")){
                rows[j][0] = OrdersDirectory.getInstance().getOrdersDir().get(i).getOrderedBy();
                rows[j][1] = OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo();
                rows[j][2] = OrdersDirectory.getInstance().getOrdersDir().get(i).getService();           
                j++;
            }
        }
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        vifl.tabelFinReq.setModel(dtm);
        vifl.show();
    }//GEN-LAST:event_bttnServReqActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.hide();
        loginPage lp = new loginPage();
        lp.show();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnConsultancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultancyActionPerformed
        // TODO add your handling code here:
        this.hide();
        Consultancy c = new Consultancy();
        String[][] rows = new String[EmployeeDirectory.getInstance().getEmployeeDir().size()][5];
        String[] columnNames = {"First Name", "Last Name", "UserName", "Role", "Salary"};
        int j = 0;
        for(int i=0; i < EmployeeDirectory.getInstance().getEmployeeDir().size(); i++){
            if(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getOrganisation().equals("Consultancy")) {
                rows[j][0] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getFirstName();
                rows[j][1] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLastName();
                rows[j][2] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getUsername();           
                rows[j][3] = EmployeeDirectory.getInstance().getEmployeeDir().get(i).getRole();
                rows[j][4] = Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getSalary()); 
                j++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        c.tblConEmp.setModel(model);
       
        
        String[] colNames = {"Order From", "Enterprise", "Organisation", "Service Requested", "Details"};
        int n = OrdersDirectory.getInstance().getOrdersDir().size();
        String[][] rws = new String[n][5];
        int k=0;
        for(int i = 0;  i < n ; i++){
            if(!OrdersDirectory.getInstance().getOrdersDir().get(i).getStatus().equals("Completed") && OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo().equals("Finances and Legal")){
                rws[k][0] = OrdersDirectory.getInstance().getOrdersDir().get(i).getOrderedBy();
                rws[k][1] = OrdersDirectory.getInstance().getOrdersDir().get(i).getRequestTo();
                rws[k][2] = OrdersDirectory.getInstance().getOrdersDir().get(i).getRole();
                rws[k][3] = OrdersDirectory.getInstance().getOrdersDir().get(i).getService();
                rws[k][4] = OrdersDirectory.getInstance().getOrdersDir().get(i).getDetails();
                k++;
            }
        }
        DefaultTableModel dtm = new DefaultTableModel (rws, colNames);
        c.tableRequests.setModel(dtm);
        c.show();
    }//GEN-LAST:event_btnConsultancyActionPerformed

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
            java.util.logging.Logger.getLogger(FinAndLegalDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinAndLegalDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinAndLegalDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinAndLegalDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinAndLegalDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultancy;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton bttnInterReq;
    private javax.swing.JButton bttnServReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
