/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interlacedventures;

import java.util.Date;

/**
 *
 * @author kcsar
 */
public class Transport {
    private String type;
    private float rate;
    private boolean availability;
    private String rentedBy;
    private float price;
    private Date dateOfAvailability;
    private String vehicleNumber;
    private String Category;
    private String Model;
    private String carClass;
    


    public Transport(String carClass, String Category, String Model, String type, float rate, boolean availability, String rentedBy, float price, Date dateOfAvailability, String vehicleNumber) {
        this.type = type;
        this.rate = rate;
        this.availability = availability;
        this.rentedBy = rentedBy;
        this.price = price;
        this.dateOfAvailability = dateOfAvailability;
        this.vehicleNumber = vehicleNumber;
        this.Category = Category;
        this.Model = Model;
        this.carClass = carClass;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
    
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
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

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    
    
}
