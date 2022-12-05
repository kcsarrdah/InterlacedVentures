/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shreyasisodiya
 */
public class BillsDirectory {
    private static ArrayList<bills> billsDir;
    private static BillsDirectory mInstance;
    
        private BillsDirectory() {
        this.billsDir = new ArrayList();
        }
        
        public ArrayList<bills> getBillsDir() {
            return billsDir;
    }
    
    public void addBill(bills bill){
        billsDir.add(bill);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO BusinessUsers" + " VALUES(?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(bill.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, bill.getSevices());
            pst.setString(2, bill.getOrgName());
            pst.setInt(3, bill.getReceiptNo());
            pst.setFloat(4, bill.getAmount());  
            pst.setDate(5, sqlDate);

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getBusinessUserData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from BusinessUsers";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               bills bill = new bills(
                        rs.getDate("Date"),
                        rs.getFloat("Amount"),
                        rs.getString("Services"),
                        rs.getString("OrgName"),
                       rs.getInt("Recipt Number"));
                
                billsDir.add(bill);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
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
    
    public static BillsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new BillsDirectory();
        return mInstance;
    }
}
