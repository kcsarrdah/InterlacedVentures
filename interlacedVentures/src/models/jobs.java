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
public class jobs {
    private String Description;
    private String role;
    private String status;
    private Date dateOfListing;
    private String listedBy;
    private String appliedBy;

    
    public jobs(String appliedBy, String listedBy, Date dateOfListing, String status, String Description, String role) {
        this.Description = Description;
        this.role = role;
        this.status = status;
        this.dateOfListing = dateOfListing;
        this.listedBy = listedBy;
        this.appliedBy = appliedBy;
    }
    
    public String getAppliedBy() {
        return appliedBy;
    }

    public void setAppliedBy(String appliedBy) {
        this.appliedBy = appliedBy;
    }
    
    public String getListedBy() {
        return listedBy;
    }

    public void setListedBy(String listedBy) {
        this.listedBy = listedBy;
    }
    
    public Date getDateOfListing() {
        return dateOfListing;
    }

    public void setDateOfListing(Date dateOfListing) {
        this.dateOfListing = dateOfListing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
