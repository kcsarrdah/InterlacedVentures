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
public class RentalOrderDirectory {
    private static ArrayList<RentalOrder> RentalOrderDir;
    private static RentalOrderDirectory mInstance;
    
        private RentalOrderDirectory() {
        this.RentalOrderDir = new ArrayList();
        }
        
        public ArrayList<RentalOrder> getRentalOrdersDir() {
            return RentalOrderDir;
    }
    
    public void addRentalOrder(RentalOrder RentalOrder){
        RentalOrderDir.add(RentalOrder);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO RentalOrders" + " VALUES(?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(RentalOrder.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, RentalOrder.getOrderedBy());
            pst.setString(2, RentalOrder.getRequestTo());
            pst.setString(3, RentalOrder.getItem());
            pst.setDate(4, sqlDate);
            pst.setInt(5, RentalOrder.getItemId());
            pst.setString(6, RentalOrder.getStatus());
            pst.setFloat(7, RentalOrder.getAmount());
            

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getRentalOrdersData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from RentalOrders";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               RentalOrder ro = new RentalOrder(
                       rs.getString("OrderedBy"),
                       rs.getString("RequestTo"),
                       rs.getString("Item"),
                       rs.getDate("Date"),
                       rs.getInt("ItemId"),
                       rs.getString("Status"),
                       rs.getFloat("Amount"));
                
                RentalOrderDir.add(ro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void updateRentalOrder(RentalOrder ro,int i) {
        RentalOrderDir.set(i,ro);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update RentalOrders" + " set Status=? where ItemId=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, ro.getStatus());
            pst.setInt(2,ro.getItemId());
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
    
    public static RentalOrderDirectory getInstance() {
        if(mInstance == null)
            mInstance = new RentalOrderDirectory();
        return mInstance;
    }
}
