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
public class taxationFormDirectory {
    private static ArrayList<taxationForm> taxationFormdir;
    private static taxationFormDirectory mInstance;
    
    private taxationFormDirectory() {
        this.taxationFormdir = new ArrayList();
        }
        
    public ArrayList<taxationForm> getTaxationFormDir() {
        return taxationFormdir;
    }
    
    public void addTaxationForm(taxationForm ao){
        taxationFormdir.add(ao);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO TaxationForm" + " VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setInt(1, ao.getFormNo());
            pst.setInt(2, ao.getAnnualInc());  
            pst.setInt(3, ao.getAnnualProfit());
            pst.setInt(4, ao.getAnnualExpense());
            pst.setString(5, ao.getAssets());
            pst.setString(6, ao.getNotes());

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
    
    public void getTaxationFormData() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from taxationForm";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
               taxationForm audit = new taxationForm(
                       rs.getInt("Form No"),
                       rs.getInt("Annual Income"),
                       rs.getInt("Annual Profit"),
                       rs.getInt("Annual Expense"),
                       rs.getString("Assets"),
                       rs.getString("Notes")
               );

                taxationFormdir.add(audit);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    public void updateTaxationForm(taxationForm audit,int i) {
        taxationFormdir.set(i,audit);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "Update TaxationForm" + " set Notes=? where `Form No`=?";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, audit.getNotes());
            pst.setInt(2,audit.getFormNo());
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
    
    public static taxationFormDirectory getInstance() {
        if(mInstance == null)
            mInstance = new taxationFormDirectory();
        return mInstance;
    }
}
