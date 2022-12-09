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
 * @author kcsar
 */
public class RawMaterialDirectory {
    private static ArrayList<RawMaterial> rawMaterialDir;
    private static RawMaterialDirectory mInstance;
    
    private RawMaterialDirectory() {
        this.rawMaterialDir = new ArrayList();
        }
        
        public ArrayList<RawMaterial> getRawMaterialDir() {
            return rawMaterialDir;
    }
    
    public void addRawMaterial(RawMaterial rawMaterial){
        rawMaterialDir.add(rawMaterial);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO RawMaterial" + " VALUES(?,?,?)";
            //java.sql.Date sqlDate = new java.sql.Date(rawMaterial.getDateOfAvailability().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, rawMaterial.getType());
            pst.setInt(2, rawMaterial.getQuantity());
            pst.setFloat(3, rawMaterial.getPrice());

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getRawMaterialData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from RawMaterial";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               RawMaterial rawMaterial = new RawMaterial(
                       rs.getString("Type"),
                       rs.getInt("Quantity"),
                       rs.getFloat("Price"));
               
                rawMaterialDir.add(rawMaterial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
//    public void updaterawMaterial(RawMaterial rawMaterial,int i) {
//        rawMaterialDir.set(i,rawMaterial);
//        Statement stmt;
//        try {
//            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
//            String query1 = "Update RawMaterial" + " set Availability=?,`Rate`=? where Description=?";
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
    
    public static RawMaterialDirectory getInstance() {
        if(mInstance == null)
            mInstance = new RawMaterialDirectory();
        return mInstance;
    }
}
