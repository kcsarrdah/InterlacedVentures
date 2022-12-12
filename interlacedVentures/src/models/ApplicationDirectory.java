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
public class ApplicationDirectory {
      private static ArrayList<Application> applicationDir = null;
      private static ApplicationDirectory mInstance;
    
        private ApplicationDirectory() {
        this.applicationDir = new ArrayList();
        }
        
        public ArrayList<Application> getApplicationDir() {
        return applicationDir;
    }
    
    public void addApplication(Application app){
        applicationDir.add(app);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO EmployeeApplication" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(app.getDateOfJoining().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            
            pst.setString(1, app.getFirstName());
            pst.setString(2, app.getLastName());  
            pst.setString(3, app.getUsername());
            pst.setString(4, app.getPassword());
            pst.setInt(5, app.getAge());
            pst.setString(6, app.getGender());
            pst.setInt(7, app.getSalary());
            pst.setString(8, app.getPhoneNumber());
            pst.setString(9, app.getEmail());
            pst.setString(10, app.getLatestWork());
            pst.setInt(11, app.getWorkEx());
            pst.setString(12, app.getRole());
            pst.setString(13, app.getOrganisation());
            pst.setString(14, app.getLocation());
            pst.setString(15, app.getEducation());
            pst.setString(16, app.getSkills());
            pst.setDate(17, sqlDate);
            pst.setString(18, app.getImagePath());
            pst.setString(19, app.getResPath());
            pst.setString(20, app.getIdPath());
            pst.setBoolean(21, app.isStatus());
            pst.setString(22, app.getAppStatus());
                                  

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
    
    public void getApplicationData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from EmployeeApplication";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                
               Application app = new Application(
                        rs.getString("Organisation"),
                        rs.getString("Location"),
                        rs.getDate("DateOfJoining"),
                        rs.getString("Password"),
                        rs.getString("Role"),
                        rs.getInt("WorkExperience"),
                        rs.getInt("Salary"),
                        rs.getString("LatestWork"),
                        rs.getString("Education"),
                        rs.getString("Skills"),
                        rs.getString("UserName"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getInt("Age"),
                        rs.getString("Gender"),
                        rs.getString("PhoneNumber"),
                        rs.getString("Email"),
                        rs.getString("Image"),
                        rs.getString("Resume"),
                        rs.getString("ID"),
                        rs.getBoolean("Status"),
                        rs.getString("AppStatus"));
                       
                applicationDir.add(app);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void updateApplication(Application app,int i) {
        applicationDir.set(i,app);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update EmployeeApplication " + "set AppStatus=? where UserName=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            
            
            pst.setString(1, app.getAppStatus());
            pst.setString(2, app.getUsername());
            
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
    
    
    public static ApplicationDirectory getInstance() {
        if(mInstance == null)
            mInstance = new ApplicationDirectory();
        return mInstance;
    }
}
