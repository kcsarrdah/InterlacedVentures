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
public class Storage {
    private String type;
    private float rate;
    private boolean availability;
    private String rentedBy;
    private float price;
    private Date dateOfAvailability;

    public Storage(String type, float rate, boolean availability, String rentedBy, float price, Date dateOfAvailability) {
        this.type = type;
        this.rate = rate;
        this.availability = availability;
        this.rentedBy = rentedBy;
        this.price = price;
        this.dateOfAvailability = dateOfAvailability;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getRentedBy() {
        return rentedBy;
    }

    public void setRentedBy(String rentedBy) {
        this.rentedBy = rentedBy;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDateOfAvailability() {
        return dateOfAvailability;
    }

    public void setDateOfAvailability(Date dateOfAvailability) {
        this.dateOfAvailability = dateOfAvailability;
    }
    
    
}