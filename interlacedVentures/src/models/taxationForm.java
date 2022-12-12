/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author shreyasisodiya
 */
public class taxationForm {
    private int formNo;
    private int annualInc;
    private int annualProfit;
    private int annualExpense;
    private String assets;
    private String Notes;

    public taxationForm(int formNo, int annualInc, int annualProfit, int annualExpense, String assets, String Notes) {
        this.annualInc = annualInc;
        this.annualProfit = annualProfit;
        this.annualExpense = annualExpense;
        this.assets = assets;
        this.Notes = Notes;
        this.formNo = formNo;
    }
    
    
    public int getFormNo() {
        return formNo;
    }

    public void setFormNo(int formNo) {
        this.formNo = formNo;
    }

    public int getAnnualInc() {
        return annualInc;
    }

    public void setAnnualInc(int annualInc) {
        this.annualInc = annualInc;
    }

    public int getAnnualProfit() {
        return annualProfit;
    }

    public void setAnnualProfit(int annualProfit) {
        this.annualProfit = annualProfit;
    }

    public int getAnnualExpense() {
        return annualExpense;
    }

    public void setAnnualExpense(int annualExpense) {
        this.annualExpense = annualExpense;
    }

    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
}
