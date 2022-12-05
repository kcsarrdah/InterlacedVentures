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
public class orders{
    private String Service;
    private String OrderedBy;
    private String RequestTo;
    private String Status;
    private Date Date;
    private float Amount;
    private String Details;
    
    public orders(String Service, String OrderedBy, String RequestTo, String Status, Date Date, float Amount, String Details) {
        this.Service = Service;
        this.OrderedBy = OrderedBy;
        this.RequestTo = RequestTo;
        this.Status = Status;
        this.Date = Date;
        this.Amount = Amount;
        this.Details = Details;
    }

    public String getService() {
        return Service;
    }

    public void setService(String Service) {
        this.Service = Service;
    }

    public String getOrderedBy() {
        return OrderedBy;
    }

    public void setOrderedBy(String OrderedBy) {
        this.OrderedBy = OrderedBy;
    }

    public String getRequestTo() {
        return RequestTo;
    }

    public void setRequestTo(String RequestTo) {
        this.RequestTo = RequestTo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }
    
    
    
}
