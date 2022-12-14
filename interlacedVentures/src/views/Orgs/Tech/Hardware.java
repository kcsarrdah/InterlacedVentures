/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.Orgs.Tech;

import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import models.EmployeeDirectory;
import views.dashBoards.TechAdminDashboard;
import views.forms.employeeRegistrationForm;

/**
 *
 * @author kcsar
 */
public class Hardware extends javax.swing.JFrame {

    /**
     * Creates new form Hardware
     */
    public Hardware() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(empTable);

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Arduino UNO ", "150 Transistors", "2,000"},
                {"BeagleBoard X15 ", "100 capacitors", "50"},
                {"Arduino Nano ", "25 resistors", "30"},
                {"Feather boards ", "2KB RAM", "20"},
                {"Seeduino", "ATmga328P MCU ", "50"},
                {"Pocketbeagle ", "512MB RAM", "30"},
                {"NodeMCU v2 ", "128kb RAM", "50"},
                {"Argon Wifi Development Board ", "4mb RAM", "70"}
            },
            new String [] {
                "Services and Goods", "Requirements", "Cost (in USD)"
            }
        ));
        jScrollPane2.setViewportView(prodTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnView))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        TechAdminDashboard tad = new TechAdminDashboard();
        tad.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        this.hide();
     
     DefaultTableModel tableModel = (DefaultTableModel) empTable.getModel();
     String UserName = tableModel.getValueAt(empTable.getSelectedRow(), 2).toString();
        if(empTable.getSelectedRowCount() == 1){
            employeeRegistrationForm erf = new employeeRegistrationForm();
            erf.show();
            for(int i = 0; i < EmployeeDirectory.getInstance().getEmployeeDir().size(); i++){
                if(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getUsername().equals(UserName)){
                    erf.pwdField.hide();
                    erf.txtFName.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getFirstName());
                    erf.txtFName.setEditable(false);
                    erf.txtLName.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLastName());
                    erf.txtLName.setEditable(false);
                    erf.txtEmail.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getEmail());
                    erf.txtEmail.setEditable(false);
                    erf.pwdField.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getPassword());
                    erf.pwdField.setEditable(false);
                    erf.txtAge.setText(Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getAge()));
                    erf.txtAge.setEditable(false);
                    erf.txtUName.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getUsername());
                    erf.txtUName.setEditable(false);
                    erf.comboGender.setSelectedItem(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getGender());
                    erf.comboGender.setEditable(false);
                    erf.txtPhone.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getPhoneNumber());
                    erf.txtPhone.setEditable(false);
                    erf.txtLoc.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLocation());
                    erf.txtLoc.setEditable(false);
                    Format formatter = new SimpleDateFormat("MM/dd/yyyy");
                    String s = formatter.format(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getDateOfJoining());
                    erf.comboOrg.setSelectedItem(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getOrganisation());
                    erf.comboOrg.setEditable(false);
                    erf.txtSalary.setText(Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getSalary()));
                    erf.txtSalary.setEditable(false);
                    erf.comboRole.setSelectedItem(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getRole());
                    erf.comboRole.setEditable(false);
                    erf.txtSkills.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getSkills());
                    erf.txtSkills.setEditable(false);
                    erf.txtWorkExp.setText(Integer.toString(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getWorkEx()));
                    erf.txtWorkExp.setEditable(false);
                    erf.txtLatestWork.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLatestWork());
                    erf.txtLatestWork.setEditable(false);
                    //erf.txtLatestWork.setText(EmployeeDirectory.getInstance().getEmployeeDir().get(i).getLatestWork());
                    
                          
                    erf.btnApply.setVisible(false);
                  }
                }
            erf.show();
            }

     
    }//GEN-LAST:event_btnViewActionPerformed

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
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hardware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    public javax.swing.JTable empTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
