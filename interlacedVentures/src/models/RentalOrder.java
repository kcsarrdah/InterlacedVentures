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
public class RentalOrder {
    private String OrderedBy;
    private String RequestTo;
    private String Item;
    private Date date;
    private int ItemId;
    private String Status;
    private float Amount;

    public RentalOrder(String OrderedBy, String RequestTo, String Item, Date date, int ItemId, String Status, float Amount) {
        this.OrderedBy = OrderedBy;
        this.RequestTo = RequestTo;
        this.Item = Item;
        this.date = date;
        this.ItemId = ItemId;
        this.Status = Status;
        this.Amount = Amount;
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

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }


    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int ItemId) {
        this.ItemId = ItemId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
