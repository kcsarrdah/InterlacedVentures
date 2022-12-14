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
public class employee extends person{
    
    private String Role;
    private int WorkEx;
    private int salary;
    private String LatestWork;
    private String education;
    private String skills;
    private String Username;
    private String password;
    private Date DateOfJoining;
    private String location;
    private String Organisation;
    private String imagePath;
    private String resPath;
    private String idPath;
    private boolean status;

    public employee(
            String Organisation, 
            String location, 
            Date DateOfJoining, 
            String Password, 
            String Role, 
            int WorkEx, 
            int salary, 
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
            boolean status) {
        super(firstName, lastName, age, gender, phoneNumber, Email);
        this.Role = Role;
        this.WorkEx = WorkEx;
        this.salary = salary;
        this.LatestWork = LatestWork;
        this.education = education;
        this.skills = skills;
        this.Username = Username;
        this.password = Password;
        this.DateOfJoining = DateOfJoining;
        this.location = location;
        this.Organisation = Organisation;
        this.imagePath = imagePath;
        this.resPath = resPath;
        this.idPath = idPath;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getResPath() {
        return resPath;
    }

    public void setResPath(String resPath) {
        this.resPath = resPath;
    }

    public String getIdPath() {
        return idPath;
    }

    public void setIdPath(String idPath) {
        this.idPath = idPath;
    }

    public String getOrganisation() {
        return Organisation;
    }

    public void setOrganisation(String Organisation) {
        this.Organisation = Organisation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateOfJoining() {
        return DateOfJoining;
    }

    public void setDateOfJoining(Date DateOfJoining) {
        this.DateOfJoining = DateOfJoining;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public int getWorkEx() {
        return WorkEx;
    }

    public void setWorkEx(int WorkEx) {
        this.WorkEx = WorkEx;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
    
    
}
