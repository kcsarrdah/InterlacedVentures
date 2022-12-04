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
public class EmployeeDirectory {
    private static ArrayList<employee> employeeDir = null;
    private static EmployeeDirectory mInstance;
    
        private EmployeeDirectory() {
        this.employeeDir = new ArrayList();
        }
        
        public ArrayList<employee> getEmployeeDir() {
        return employeeDir;
    }
    
    public void addEmployee(employee emp){
        employeeDir.add(emp);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO doctor" + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(emp.getDateOfJoining().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, emp.getFirstName());
            pst.setString(2, emp.getLastName());  
            pst.setString(3, emp.getUsername());
            pst.setString(4, emp.getPassword());
            pst.setInt(5, emp.getAge());
            pst.setString(6, emp.getGender());
            pst.setInt(7, emp.getHourlyRate());
            pst.setString(8, emp.getPhoneNumber());
            pst.setString(9, emp.getEmail());
            pst.setString(10, emp.getLatestWork());
            pst.setInt(11, emp.getWorkEx());
            pst.setString(12, emp.getPortfolio());
            pst.setString(13, emp.getLocation());
            pst.setString(14, emp.getEducation());
            pst.setString(15, emp.getSkills());
            pst.setDate(16, sqlDate);
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getFreelancerData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from doctor";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                freelancer fl = new freelancer(
                        rs.getString("Location"),
                        rs.getString("Password"),
                        rs.getDate("Date of Joining"),
                        rs.getInt("HourlyRate"),
                        rs.getString("Portfolio"),
                        rs.getInt("WorkEx"),
                        rs.getString("LatestWorkEx"),
                        rs.getString("Education"),
                        rs.getString("Skills"),
                        rs.getString("Username")),
                        rs.getString("FirstName")),
                        rs.getString("LastName")),
                        rs.getInt("Age")),
                        rs.getString("Gender")),
                        rs.getString("PhoneNumber")),
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
