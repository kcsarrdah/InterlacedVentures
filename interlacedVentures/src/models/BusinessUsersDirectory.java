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
public class BusinessUsersDirectory {
    private static ArrayList<business> businessUsersDir;
    private static BusinessUsersDirectory mInstance;
    
        private BusinessUsersDirectory() {
        this.businessUsersDir = new ArrayList();
        }
        
        public ArrayList<business> getBusinessUsersDir() {
            return businessUsersDir;
    }
    
    public void addBusinessUser(business bs){
        businessUsersDir.add(bs);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO BusinessUsers" + " VALUES(?,?,?,?,?,?,?,?)";
//            java.sql.Date sqlDate = new java.sql.Date(bs.getDateOfJoining().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, bs.getName());
            pst.setString(2, bs.getEmail());
            pst.setString(3, bs.getNumber());
            pst.setString(4, bs.getAddress());
            pst.setString(5, bs.getWebsite());
            pst.setString(6, bs.getOwnerName());  
            pst.setString(7, bs.getPassword());
            pst.setString(8, bs.getLicensePath());

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
               business bs = new business(
                       rs.getString("Password"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("PhoneNumber"),
                        rs.getString("Location"),
                        rs.getString("Website"),
                        rs.getString("OwnerName"),
                        rs.getString("LicensePath"));
                businessUsersDir.add(bs);
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
    
    public static BusinessUsersDirectory getInstance() {
        if(mInstance == null)
            mInstance = new BusinessUsersDirectory();
        return mInstance;
    }
}
