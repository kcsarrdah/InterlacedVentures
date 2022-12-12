/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author shreyasisodiya
 */
public class ApplicationFreelancer extends freelancer {
    private String appStatus;

    public ApplicationFreelancer(String location, 
            String password, 
            Date dateOfJoining, 
            int HourlyRate, 
            String Portfolio,
            int WorkEx, 
            String LatestWork, 
            String education,
            String skills, 
            String Username, 
            String firstName, 
            String lastName, 
            int age, 
            String gender, 
            String phoneNumber,
            String Email, 
            String imagePath, 
            String resPath, 
            String idPath, 
            String appStatus) {
        super(location, password, dateOfJoining, HourlyRate, Portfolio, WorkEx, LatestWork, education, skills, Username, firstName, lastName, age, gender, phoneNumber, Email, imagePath, resPath, idPath);
    this.appStatus = appStatus;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }
    
    
}
