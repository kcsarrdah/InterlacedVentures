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
public class ApplicationBusinessDirectory {
    private static ArrayList<ApplicationBusiness> applicationBusinessDir = null;
      private static ApplicationBusinessDirectory mInstance;
      
      private ApplicationBusinessDirectory() {
        this.applicationBusinessDir = new ArrayList();
        }
        
        public ArrayList<ApplicationBusiness> getApplicationBusinessDir() {
        return applicationBusinessDir;
        }
        
        public void addApplicationBusiness(ApplicationBusiness ab){
        applicationBusinessDir.add(ab);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO BusinessApplication" + " VALUES(?,?,?,?,?,?,?,?,?)";
           // java.sql.Date sqlDate = new java.sql.Date(ab.getDateOfJoining().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            
            pst.setString(1, ab.getName());
            pst.setString(2, ab.getEmail());  
            pst.setString(3, ab.getNumber());
            pst.setString(4, ab.getAddress());
            pst.setString(5, ab.getWebsite());
            pst.setString(6, ab.getOwnerName());
            pst.setString(7, ab.getLicensePath());
            pst.setString(8, ab.getAppStatus());
            pst.setString(9, ab.getPassword());

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
            System.out.println(ex);
        }
    }
        
        public void getApplicationBusinessData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from BusinessApplication";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               ApplicationBusiness bs = new ApplicationBusiness(
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("Number"),
                        rs.getString("Address"),
                        rs.getString("Website"),
                        rs.getString("OwnerName"),
                        rs.getString("LicensePath"),
                        rs.getString("AppStatus"),
                       rs.getString("Password"));
                applicationBusinessDir.add(bs);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
        
        public void updateApplicationBusiness(ApplicationBusiness ab,int i) {
        applicationBusinessDir.set(i,ab);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update BusinessApplication" + " set AppStatus=? where Name=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, ab.getAppStatus());
            pst.setString(2, ab.getName());
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
        
        public static ApplicationBusinessDirectory getInstance() {
        if(mInstance == null)
            mInstance = new ApplicationBusinessDirectory();
        return mInstance;
    }
}
