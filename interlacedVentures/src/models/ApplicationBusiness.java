/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author shreyasisodiya
 */
public class ApplicationBusiness extends business{
    private String appStatus;


    public ApplicationBusiness(String Password,
            String name,
            String email, 
            String number, 
            String address,
            String website, 
            String ownerName, 
            String licensePath,
            String appStatus) {

        super(Password, name, email, number, address, website, ownerName, licensePath);
        this.appStatus = appStatus;
        
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }
    
    
}
