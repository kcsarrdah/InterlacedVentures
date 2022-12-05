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
public class userDirectory {
    private static ArrayList<users> userDir;
    private static userDirectory mInstance;
    
    private userDirectory() {
        this.userDir = new ArrayList();
    }

    public ArrayList<users> getUserDir() {
        return userDir;
    }
    
    public void addUser(users user){
        userDir.add(user);
        Statement stmt;
        try {
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String query1 = "INSERT INTO Users" + " VALUES(?,?,?)";
            PreparedStatement pst = DatabaseConnectionClass.getInstance().getCon().prepareStatement(query1);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getType());
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
    
    public void getUsers() {
        Statement stmt;
        try{
            stmt = DatabaseConnectionClass.getInstance().getCon().createStatement();
            String str = "Select * from Users";
            ResultSet rs = stmt.executeQuery(str);
            while(rs.next()) {
                users users = new users(rs.getString("UserName"), rs.getString("Password"),rs.getString("Type"));
                userDir.add(users);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot be loaded");
        }
    }
    
    public static userDirectory getInstance() {
        if(mInstance == null)
            mInstance = new userDirectory();
        return mInstance;
    }
}
