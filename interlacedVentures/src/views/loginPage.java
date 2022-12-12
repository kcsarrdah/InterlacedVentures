/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

//import com.mysql.cj.xdevapi.Statement;
//import com.sun.jdi.connect.spi.Connection;
import static interlacedventures.InterlacedVentures.Admins;
import javax.swing.JOptionPane;
import views.dashBoards.businessUserDashBoard;
import java.sql.DriverManager;  
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import views.dashBoards.SystemAdmin;
import views.dashBoards.TechAdminDashboard;
import views.dashBoards.employeeDashboard;
import views.dashBoards.freelancerDashboard;
import models.BusinessUsersDirectory;
import models.EmployeeDirectory;
import models.FreelanceDirectory;
import models.JobsDirectory;
import models.OrdersDirectory;
import models.complainsDirectory;
import models.userDirectory;
import views.dashBoards.FinAndLegalDashBoard;
import views.dashBoards.OperationsAdminDashboard;
import views.dashBoards.customerSalesRepDashboard;
import views.dashBoards.verificationAdminDashboard;

/**
 *
 * @author kcsar
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
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
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel1.setText("Interlaced Ventures");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnLogin)
                .addGap(32, 32, 32)
                .addComponent(btnRegister)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        String userName = tfUsername.getText();
        String password = pfPassword.getText();
        
        if(userName.equals(Admins[0][0]) && password.equals(Admins[0][1])){
            System.out.println("here");
            this.hide();
            SystemAdmin sa = new SystemAdmin();
            sa.show();
        }
        else if(userName.equals(Admins[1][0]) && password.equals(Admins[1][1])){
            System.out.println("hereee");
            this.hide();
            TechAdminDashboard td = new TechAdminDashboard();
            td.show();
        }
        
        
        
        else if(userName.equals(Admins[2][0]) && password.equals(Admins[2][1])){
            System.out.println("hereee");
            this.hide();
            FinAndLegalDashBoard fldb = new FinAndLegalDashBoard();
            fldb.show();
        }
        
        else if(userName.equals(Admins[3][0]) && password.equals(Admins[3][1])){
            System.out.println("hereee");
            this.hide();
            OperationsAdminDashboard fldb = new OperationsAdminDashboard();
            fldb.show();
        }
        
        
        else if(userName.equals(Admins[4][0]) && password.equals(Admins[4][1])){
        this.hide();
        customerSalesRepDashboard fldb = new customerSalesRepDashboard();
        String[] columnNames = {"Objection", "From", "Against", "Date", "Status"};
        int n = complainsDirectory.getInstance().getComplainsDir().size();
        String[][] rows = new String[n][5];
        int j=0;
        for(int i = 0;  i< n; i++){
                rows[j][0] = complainsDirectory.getInstance().getComplainsDir().get(i).getDescription();
                rows[j][1] = complainsDirectory.getInstance().getComplainsDir().get(i).getFrom();
                rows[j][2] = complainsDirectory.getInstance().getComplainsDir().get(i).getAgainst();
                Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                String s = formatter.format(complainsDirectory.getInstance().getComplainsDir().get(i).getDate());
                rows[j][3] = s;               
                rows[j][4] = complainsDirectory.getInstance().getComplainsDir().get(i).getStatus();
                j++; 
                 
        }
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        fldb.tableComplains.setModel(dtm);
        fldb.show();
        }
        
        else if(userName.equals(Admins[5][0]) && password.equals(Admins[5][1])){
            this.hide();
            verificationAdminDashboard va = new verificationAdminDashboard();
            va.show();
        }
        
          
        
        
        boolean checkPassword;
        
        for(int i=0;i<userDirectory.getInstance().getUserDir().size();i++) {
            
            checkPassword = password.equals(userDirectory.getInstance().getUserDir().get(i).getPassword());
            
            if((userDirectory.getInstance().getUserDir().get(i).getUsername().equals(userName)) && checkPassword) {
                try{
                    if(userDirectory.getInstance().getUserDir().get(i).getType().equals("Employee")) {
                        this.hide();
                        employeeDashboard edb = new employeeDashboard();
                        String empName = "";
                        String role = "";
                        
                        //for loop to get employee name
                        for(int j = 0; j < EmployeeDirectory.getInstance().getEmployeeDir().size(); j++){
                            if(EmployeeDirectory.getInstance().getEmployeeDir().get(j).getUsername().equals(userName)){
                                empName = EmployeeDirectory.getInstance().getEmployeeDir().get(j).getFirstName();
                                role = EmployeeDirectory.getInstance().getEmployeeDir().get(j).getRole();
                            }
                        }
                        edb.lblEmpName.setText(empName);
                        edb.labelRole.setText(role);
                        
                        //for loop to populate table
                                String[] columnNames = {"Description", "Date of Posting"};
                                int n = OrdersDirectory.getInstance().getOrdersDir().size();
                                String[][] rows = new String[n][2];
                                int j=0;
                                for(int k = 0;  k < n ; k++){
                                    if(OrdersDirectory.getInstance().getOrdersDir().get(k).getAssignedTo().equals(empName) && !OrdersDirectory.getInstance().getOrdersDir().get(k).getStatus().equals("Completed")){
                                    rows[j][0] = OrdersDirectory.getInstance().getOrdersDir().get(k).getDetails();
                                    Format formatter = new SimpleDateFormat("yyyy-MM-dd");
                                    String s = formatter.format(OrdersDirectory.getInstance().getOrdersDir().get(k).getDate());
                                    rows[j][1] = s;         
                                    j++;
                                    }
                                }
                                DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
                                edb.WorkTable.setModel(dtm);
                        
                        edb.show();
                    }
                    
                else if(userDirectory.getInstance().getUserDir().get(i).getType().equals("Freelancer")) {
                        this.hide();
                        freelancerDashboard fdb = new freelancerDashboard();
                        String name1 = "";
                        for(int j = 0; j < FreelanceDirectory.getInstance().getFreeLancerDir().size(); j++){
                        if(FreelanceDirectory.getInstance().getFreeLancerDir().get(j).getUsername().equals(userName)){
                        name1 = FreelanceDirectory.getInstance().getFreeLancerDir().get(j).getFirstName();
                        }
                    }
                        fdb.labelFreelancer.setText(name1);
                        fdb.show();
                        
                   }
                    
                else if(userDirectory.getInstance().getUserDir().get(i).getType().equals("Business User")) {
                        this.hide();
                        businessUserDashBoard budb = new businessUserDashBoard();
                //System.out.println("here");
                String name = "demo";
                //System.out.println(BusinessUsersDirectory.getInstance().getBusinessUsersDir().size());
                
                for(int j = 0; j < BusinessUsersDirectory.getInstance().getBusinessUsersDir().size(); j++){
                if(BusinessUsersDirectory.getInstance().getBusinessUsersDir().get(j).getName().equals(userName)){
                        name = BusinessUsersDirectory.getInstance().getBusinessUsersDir().get(j).getName();
                    }
                }
                //System.out.println(name);
                budb.businessUser.setText(name);
                budb.show();
                }
                    
                }//end of try
                catch(Exception e) {
                    System.out.println(e);
                }
            }
//            else{
//                    JOptionPane.showMessageDialog(this, "Please Enter Correct Details");
//                    tfUsername.setText("");
//                    pfPassword.setText("");
//                    break;
//                        }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        this.hide();
        RegistrationChoiceForm rcf = new RegistrationChoiceForm();
        rcf.show();
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
