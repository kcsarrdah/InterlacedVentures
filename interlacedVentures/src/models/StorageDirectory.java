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
public class StorageDirectory {
    private static ArrayList<Storage> storageDir;
    private static StorageDirectory mInstance;
    
    private StorageDirectory() {
        this.storageDir = new ArrayList();
        }
        
        public ArrayList<Storage> getStorageDir() {
            return storageDir;
    }
    
    public void addStorage(Storage storage){
        storageDir.add(storage);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO Storage" + " VALUES(?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(storage.getDateOfAvailability().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, storage.getType());
            pst.setFloat(2, storage.getRate());
            pst.setBoolean(3, storage.isAvailability());
            pst.setDate(4, sqlDate);
            pst.setString(5, storage.getRentedBy());
            pst.setFloat(6, storage.getPrice());
            pst.setString(7, storage.getType());

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getStorageData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from Storage";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               Storage storage = new Storage(
                       rs.getString("Size"),
                       rs.getString("Type"),
                       rs.getFloat("Rate"),
                       rs.getBoolean("Availability"),
                       rs.getString("RentedBy"),
                       rs.getFloat("Price"),
                       rs.getDate("DateOfAvailability"));
                
                storageDir.add(storage);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
            System.out.println(ex);
        }
    }
    
//    public void updateStorage(Storage storage,int i) {
//        storageDir.set(i,storage);
//        Statement stmt;
//        try {
//            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
//            String query1 = "Update Storage" + " set Availability=?,`Rate`=? where Description=?";
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
    
    public static StorageDirectory getInstance() {
        if(mInstance == null)
            mInstance = new StorageDirectory();
        return mInstance;
    }
}
