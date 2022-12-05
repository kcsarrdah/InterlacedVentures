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
public class freelancer extends person{
    
    private int HourlyRate;
    private String Portfolio;
    private int WorkEx;
    private String LatestWork;
    private String education;
    private String skills;
    private String Username;
    private Date dateOfJoining;
    private String password;
    private String location;


    public freelancer(String location, String password, Date dateOfJoining, int HourlyRate, String Portfolio, int WorkEx, 
            String LatestWork, String education, String skills, String Username, 
            String firstName, String lastName, int age, String gender, String phoneNumber, String Email) {
        super(firstName, lastName, age, gender, phoneNumber, Email);
        this.HourlyRate = HourlyRate;
        this.Portfolio = Portfolio;
        this.WorkEx = WorkEx;
        this.LatestWork = LatestWork;
        this.education = education;
        this.skills = skills;
        this.Username = Username;
        this.dateOfJoining = dateOfJoining;
        this.password = password;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(int HourlyRate) {
        this.HourlyRate = HourlyRate;
    }

    public String getPortfolio() {
        return Portfolio;
    }

    public void setPortfolio(String Portfolio) {
        this.Portfolio = Portfolio;
    }

    public int getWorkEx() {
        return WorkEx;
    }

    public void setWorkEx(int WorkEx) {
        this.WorkEx = WorkEx;
    }

    public String getLatestWork() {
        return LatestWork;
    }

    public void setLatestWork(String LatestWork) {
        this.LatestWork = LatestWork;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
}
