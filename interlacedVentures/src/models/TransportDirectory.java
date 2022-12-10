/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import interlacedventures.Transport;
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
public class TransportDirectory {
    private static ArrayList<Transport> transportDir;
    private static TransportDirectory mInstance;
    
    private TransportDirectory() {
        this.transportDir = new ArrayList();
        }
        
        public ArrayList<Transport> getTransportDir() {
            return transportDir;
    }
        
    public void addTransport(Transport transport){
        transportDir.add(transport);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO Transport" + " VALUES(?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(transport.getDateOfAvailability().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, transport.getType());
            pst.setFloat(2, transport.getRate());
            pst.setBoolean(3, transport.isAvailability());
            pst.setDate(4, sqlDate);
            pst.setString(5, transport.getRentedBy());
            pst.setFloat(6, transport.getPrice());
            pst.setString(7,transport.getVehicleNumber());

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getTransportData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from Transport";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               Transport transport = new Transport(
                       rs.getString("Type"),
                       rs.getFloat("Rate"),
                       rs.getBoolean("Availability"),
                       rs.getString("RentedBy"),
                       rs.getFloat("Price"),
                       rs.getDate("DateOfAvailability"),
                       rs.getString("VehicleNumber"));
        
                transportDir.add(transport);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
            System.out.println(ex);
        }
    }
    
    //    public void updateTransport(Transport transport,int i) {
//        stransportDir.set(i,transport);
//        Statement stmt;
//        try {
//            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
//            String query1 = "Update Transport" + " set Availability=?,`Rate`=? where Description=?";
//            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
//            pst.setString(1, storage.getStatus());
//            pst.setString(2,storage.getAppliedBy());
//            pst.setString(3, storage.getDescription());
//            int rs = pst.executeUpdate();
//            if(rs>0)
//            {
//                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
//        }
//    }
    
        public static TransportDirectory getInstance() {
        if(mInstance == null)
            mInstance = new TransportDirectory();
        return mInstance;
    }
}
