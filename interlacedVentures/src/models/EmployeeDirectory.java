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
            String query1 = "INSERT INTO Employees" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(emp.getDateOfJoining().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            
            pst.setString(1, emp.getFirstName());
            pst.setString(2, emp.getLastName());  
            pst.setString(3, emp.getUsername());
            pst.setString(4, emp.getPassword());
            pst.setInt(5, emp.getAge());
            pst.setString(6, emp.getGender());
            pst.setInt(7, emp.getSalary());
            pst.setString(8, emp.getPhoneNumber());
            pst.setString(9, emp.getEmail());
            pst.setString(10, emp.getLatestWork());
            pst.setInt(11, emp.getWorkEx());
            pst.setString(12, emp.getRole());
            pst.setString(13, emp.getOrganisation());
            pst.setString(14, emp.getLocation());
            pst.setString(15, emp.getEducation());
            pst.setString(16, emp.getSkills());
            pst.setDate(17, sqlDate);
            pst.setString(18, emp.getImagePath());
            pst.setString(19, emp.getResPath());
            pst.setString(20, emp.getIdPath());
            pst.setBoolean(21, emp.isStatus());
                                  

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
    
    public void getEmployeeData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from Employees";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               employee emp = new employee(
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
                        rs.getBoolean("Status"));
                
                employeeDir.add(emp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void updateEmployee(employee emp,int i) {
        employeeDir.set(i,emp);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update Employees " + "set LastName=?,FirstName=?,Email=?,Gender=?,PhoneNumber=?,Location=?,Salary=? where UserName=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, emp.getLastName());
            
            pst.setString(2,emp.getFirstName());
            
            pst.setString(3, emp.getEmail());
            
            pst.setString(4, emp.getGender());
            
            pst.setString(5, emp.getPhoneNumber());
            
            pst.setString(6, emp.getLocation());
            
            pst.setInt(7,emp.getSalary());
            
            pst.setString(8, emp.getUsername());
            
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
    
    public static EmployeeDirectory getInstance() {
        if(mInstance == null)
            mInstance = new EmployeeDirectory();
        return mInstance;
    }
}
