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
public class ApplicationFreelancerDirectory {
    private static ArrayList<ApplicationFreelancer> applicationFreelancerDir = null;
      private static ApplicationFreelancerDirectory mInstance;
    
        private ApplicationFreelancerDirectory() {
        this.applicationFreelancerDir = new ArrayList();
        }
        
        public ArrayList<ApplicationFreelancer> getApplicationFreelancerDir() {
        return applicationFreelancerDir;
    }
    
    public void addApplicationFreelancer(ApplicationFreelancer af){
        applicationFreelancerDir.add(af);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO FreelancerApplication" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(af.getDateOfJoining().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            
            pst.setString(1, af.getFirstName());
            pst.setString(2, af.getLastName());  
            pst.setString(3, af.getUsername());
            pst.setString(4, af.getPassword());
            pst.setInt(5, af.getAge());
            pst.setString(6, af.getGender());
            pst.setInt(7, af.getHourlyRate());
            pst.setString(8, af.getPhoneNumber());
            pst.setString(9, af.getEmail());
            pst.setString(10, af.getLatestWork());
            pst.setInt(11, af.getWorkEx());
            pst.setString(12, af.getLocation());
            pst.setString(13, af.getEducation());
            pst.setString(14, af.getSkills());
            pst.setDate(15, sqlDate);
            pst.setString(16, af.getImagePath());
            pst.setString(17, af.getResPath());
            pst.setString(18, af.getIdPath());
            pst.setString(20, af.getPortfolio());
            pst.setString(19, af.getAppStatus());
                                  

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
            String str = "Select * from FreelancerApplication";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               ApplicationFreelancer af = new ApplicationFreelancer(
                        rs.getString("Location"),
                        rs.getString("Password"),
                        rs.getDate("DateOfJoining"),
                        rs.getInt("HourlyRate"),
                        rs.getString("Portfolio"),
                        rs.getInt("WorkExperience"),
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
                        rs.getString("AppStatus"));
                       
                applicationFreelancerDir.add(af);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void updateApplicationFreelancer(ApplicationFreelancer af,int i) {
        applicationFreelancerDir.set(i,af);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update FreelancerApplication " + "set LastName=?,FirstName=?,Email=?,Gender=?,PhoneNumber=?,Location=?,Salary=? where UserName=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, af.getLastName());
            
            pst.setString(2,af.getFirstName());
            
            pst.setString(3, af.getEmail());
            
            pst.setString(4, af.getGender());
            
            pst.setString(5, af.getPhoneNumber());
            
            pst.setString(6, af.getLocation());
            
            pst.setInt(7,af.getHourlyRate());
            
            pst.setString(8, af.getUsername());
            
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
    
    public static ApplicationFreelancerDirectory getInstance() {
        if(mInstance == null)
            mInstance = new ApplicationFreelancerDirectory();
        return mInstance;
    }
}
