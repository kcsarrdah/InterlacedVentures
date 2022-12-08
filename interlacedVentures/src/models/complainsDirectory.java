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
public class complainsDirectory {
    private static ArrayList<complains> complainsDir;
    private static complainsDirectory mInstance;
    
        private complainsDirectory() {
        this.complainsDir = new ArrayList();
        }
        
        public ArrayList<complains> getComplainsDir() {
            return complainsDir;
    }
    
    public void addComplain(complains complain){
        complainsDir.add(complain);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO Complains" + " VALUES(?,?,?,?,?,?)";
            java.sql.Date sqlDate = new java.sql.Date(complain.getDate().getTime());
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, complain.getDescription());
            pst.setString(2, complain.getDept());
            pst.setString(3, complain.getStatus());    
            pst.setString(4, complain.getFrom());
            pst.setString(5, complain.getAgainst());
            pst.setDate(6, sqlDate);
            int rs = pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"Inserted Successfully!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be Inserted");
        }
    }
    
    public void getComplainsData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from Complains";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               complains complain = new complains(
                       rs.getString("Description"),
                       rs.getString("Department"),
                       rs.getString("Status"),
                       rs.getString("From"),
                       rs.getString("Against"),
                       rs.getDate("Date"));
                
                complainsDir.add(complain);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public void updateComplain(complains complain,int i) {
        complainsDir.set(i,complain);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update Complains" + "set Status=?, where Description=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, complain.getStatus());
            pst.setString(2, complain.getDescription());
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
    
    public static complainsDirectory getInstance() {
        if(mInstance == null)
            mInstance = new complainsDirectory();
        return mInstance;
    }
}
