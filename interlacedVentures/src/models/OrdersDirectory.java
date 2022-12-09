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
public class OrdersDirectory {
    private static ArrayList<orders> ordersDir;
    private static OrdersDirectory mInstance;
    
        private OrdersDirectory() {
        this.ordersDir = new ArrayList();
        }
        
        public ArrayList<orders> getOrdersDir() {
        return ordersDir;
    }
    
    public void addOrder(orders od){
        ordersDir.add(od);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO Orders" + " VALUES(?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(od.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, od.getService());
            pst.setString(2, od.getOrderedBy());  
            pst.setString(3, od.getRequestTo());
            pst.setString(4, od.getStatus());
            pst.setFloat(5, od.getAmount());
            pst.setString(6, od.getDetails());
            pst.setDate(7, sqlDate);
            pst.setString(8, od.getAssignedTo());
                                  

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getOrderData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from Orders";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               orders order = new orders(
                       rs.getString("Assigned To"),
                       rs.getString("Services"),
                       rs.getString("Ordered By"),
                       rs.getString("Requested To"),
                       rs.getString("Status"),   
                       rs.getDate("Date"),
                       rs.getFloat("Amount"),
                       rs.getString("Details"));


                
                ordersDir.add(order);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    public void updateOrder(orders order,int i) {
        ordersDir.set(i,order);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update Orders" + " set Status=?,`Assigned To`=? where Details=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, order.getStatus());
            pst.setString(2,order.getAssignedTo());
            pst.setString(3, order.getDetails());
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
    
    public static OrdersDirectory getInstance() {
        if(mInstance == null)
            mInstance = new OrdersDirectory();
        return mInstance;
    }
}
