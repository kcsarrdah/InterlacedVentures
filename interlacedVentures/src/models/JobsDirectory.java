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
public class JobsDirectory {
    private static ArrayList<jobs> jobsDir;
    private static JobsDirectory mInstance;
    
        private JobsDirectory() {
        this.jobsDir = new ArrayList();
        }
        
        public ArrayList<jobs> getJobsDir() {
            return jobsDir;
    }
    
    public void addJob(jobs job){
        jobsDir.add(job);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO Jobs" + " VALUES(?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(job.getDateOfListing().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, job.getDescription());
            pst.setString(2, job.getRole());
            pst.setString(3, job.getStatus());
            pst.setDate(4, sqlDate);
            pst.setString(5, job.getListedBy());

            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getJobsData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from Jobs";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               jobs job = new jobs(
                       rs.getString("Posted By"),
                       rs.getDate("DateOfPosting"),
                       rs.getString("Status"),
                       rs.getString("Description"),
                       rs.getString("Role"));
                
                jobsDir.add(job);
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
    
    public static JobsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new JobsDirectory();
        return mInstance;
    }
}
