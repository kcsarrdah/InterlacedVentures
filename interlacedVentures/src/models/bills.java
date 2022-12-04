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
public class bills {
    private Date date;
    private float Amount;
    private String Sevices;
    private String OrgName;
    private int ReceiptNo;

    public bills(Date date, float Amount, String Sevices, String OrgName, int ReceiptNo) {
        this.date = date;
        this.Amount = Amount;
        this.Sevices = Sevices;
        this.OrgName = OrgName;
        this.ReceiptNo = ReceiptNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public String getSevices() {
        return Sevices;
    }

    public void setSevices(String Sevices) {
        this.Sevices = Sevices;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public int getReceiptNo() {
        return ReceiptNo;
    }

    public void setReceiptNo(int ReceiptNo) {
        this.ReceiptNo = ReceiptNo;
    }
    
}
