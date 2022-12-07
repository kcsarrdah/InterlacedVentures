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
import static javax.swing.UIManager.getString;

/**
 *
 * @author shreyasisodiya
 */
public class FreelanceDirectory {
    private static ArrayList<freelancer> freeLancerDir = null;
    private static FreelanceDirectory mInstance;
    
        private FreelanceDirectory() {
        this.freeLancerDir = new ArrayList();
        }
        
        public ArrayList<freelancer> getFreeLancerDir() {
        return freeLancerDir;
    }
    
    public void addFreelancer(freelancer fl){
        freeLancerDir.add(fl);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO Freelancers" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(fl.getDateOfJoining().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, fl.getFirstName());
            pst.setString(2, fl.getLastName());  
            pst.setString(3, fl.getUsername());
            pst.setString(4, fl.getPassword());
            pst.setInt(5, fl.getAge());
            pst.setString(6, fl.getGender());
            pst.setInt(7, fl.getHourlyRate());
            pst.setString(8, fl.getPhoneNumber());
            pst.setString(9, fl.getEmail());
            pst.setString(10, fl.getLatestWork());
            pst.setInt(11, fl.getWorkEx());
            pst.setString(12, fl.getPortfolio());
            pst.setString(13, fl.getLocation());
            pst.setString(14, fl.getEducation());
            pst.setString(15, fl.getSkills());
            pst.setDate(16, sqlDate);
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
    
    public void getFreelancerData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "SELECT * from Freelancers";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                freelancer fl = new freelancer(
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
                        rs.getString("Email"));
                
                freeLancerDir.add(fl);
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
    
    public static FreelanceDirectory getInstance() {
        if(mInstance == null)
            mInstance = new FreelanceDirectory();

        return mInstance;
    }
}
