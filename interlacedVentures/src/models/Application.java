/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author kcsar
 */
public class Application extends employee{
    private String appStatus;

    public Application(String Organisation, String location, Date DateOfJoining, String Password, String Role, int WorkEx, int salary, String LatestWork, String education, String skills, String Username, String firstName, String lastName, int age, String gender, String phoneNumber, String Email, String imagePath, String resPath, String idPath, boolean status) {
        super(Organisation, location, DateOfJoining, Password, Role, WorkEx, salary, LatestWork, education, skills, Username, firstName, lastName, age, gender, phoneNumber, Email, imagePath, resPath, idPath, status);
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }
    
    

}
