/*
 * Click nbfs://nbhost/SystemFileSystem/Taolates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Taolates/Classes/Class.java to edit this taolate
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.AuditingOrder;
import models.DatabaseConnectionClass;

/**
 *
 * @author kcsar
 */
public class  AuditOrderDirectory{
    private static ArrayList<AuditingOrder> auditOrdersDir;
    private static AuditOrderDirectory mInstance;
    
        private AuditOrderDirectory() {
        this.auditOrdersDir = new ArrayList();
        }
        
        public ArrayList<AuditingOrder> getAuditOrderDir() {
        return auditOrdersDir;
    }
    
    public void addAuditOrder(AuditingOrder ao){
        auditOrdersDir.add(ao);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO AuditOrders" + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(ao.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, ao.getService());
            pst.setString(2, ao.getOrderedBy());  
            pst.setString(3, ao.getRequestTo());
            pst.setString(4, ao.getStatus());
            pst.setFloat(5, ao.getAmount());
            pst.setString(6, ao.getDetails());
            pst.setDate(7, sqlDate);
            pst.setString(8, ao.getAssignedTo());
            pst.setString(9, ao.getRole());
            pst.setString(10, ao.getAuditPath());

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getAuditOrderData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from AuditOrders";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               AuditingOrder audit = new AuditingOrder(
                       rs.getString("AuditPath"),
                       rs.getString("Role"),
                       rs.getString("Assigned To"),
                       rs.getString("Services"),
                       rs.getString("Ordered By"),
                       rs.getString("Requested To"),
                       rs.getString("Status"),   
                       rs.getDate("Date"),
                       rs.getFloat("Amount"),
                       rs.getString("Details"));

                auditOrdersDir.add(audit);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    public void updateAuditOrder(AuditingOrder audit,int i) {
        auditOrdersDir.set(i,audit);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update AuditOrders" + " set Status=?,`Assigned To`=? where Details=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, audit.getStatus());
            pst.setString(2,audit.getAssignedTo());
            pst.setString(3, audit.getDetails());
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
//    public void docData(int stateID) {
//        for(int j=0;j<doctorDir.size();j++) {
//            System.out.println("sdj");
//            DoctorMainFrame doc = new DoctorMainFrame();
//            if(LoginDirectory.getInstance().getLoginDir().get(j).getStateID() == DoctorDirectory.getInstance().getDoctorDir().get(j).getStateID()) {
//                doc.getDoc(DoctorDirectory.getInstance().getDoctorDir().get(j));
//            }
//        }
//    }
    
    public static AuditOrderDirectory getInstance() {
        if(mInstance == null)
            mInstance = new AuditOrderDirectory();
        return mInstance;
    }
}
