/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interlacedventures;

//import java.util.HashMap;
import java.util.HashMap;
import models.ApplicationBusinessDirectory;
import models.ApplicationDirectory;
import models.ApplicationFreelancerDirectory;
import models.AuditOrderDirectory;
import models.BillsDirectory;
import models.BusinessUsersDirectory;
import models.EmployeeDirectory;
import models.FreelanceDirectory;
import models.JobsDirectory;
import models.OrdersDirectory;
import models.RawMaterialDirectory;
import models.RentalOrderDirectory;
import models.StorageDirectory;
import models.TransportDirectory;
import models.complainsDirectory;
import models.taxationFormDirectory;
import models.userDirectory;
import views.loginPage;

/**
 *
 * @author kcsar
 */
public class InterlacedVentures {

    public static String[][] Admins = new String[8][2];
    public static HashMap<String, Integer> ServicePrices = new HashMap<String, Integer>();
    /**
     * @param args the command line arguments
     */
    //public static HashMap<String, String> users = new HashMap<String, String>();
    public static void main(String[] args) {
        
        Admins[0][0] = "SA";
        Admins[0][1] = "123";
        Admins[1][0] = "TA";
        Admins[1][1] = "123";
        Admins[2][0] = "FA";
        Admins[2][1] = "123";
        Admins[3][0] = "OA";
        Admins[3][1] = "123";
        Admins[4][0] = "CSR";
        Admins[4][1] = "123";
        Admins[5][0] = "VA";
        Admins[5][1] = "123";
        
        ServicePrices.put("Web Design", 500);
        ServicePrices.put("Video Game", 700);
        ServicePrices.put("Cyber-Security", 300);
        ServicePrices.put("Software Developement", 1000);
        ServicePrices.put("Mobile Developement", 1000);
        ServicePrices.put("Version Control", 250);
        ServicePrices.put("Data Analysis", 500);
        ServicePrices.put("Data Management", 500);
        ServicePrices.put("Business Intelligence", 835);
        ServicePrices.put("Aurdino UNO", 349);
        ServicePrices.put("BeagleBoard X1", 600);
        ServicePrices.put("featherboards", 500);
        ServicePrices.put("Aurdino naro", 400);
        ServicePrices.put("Seeduino", 750);
        ServicePrices.put("Pocketbeagle", 1200);
        ServicePrices.put("Saas", 1200);
        ServicePrices.put("PaaS", 1500);
        ServicePrices.put("FaaS", 600);
        ServicePrices.put("Lockers", 500);
        ServicePrices.put("WareHouse", 5000);
        ServicePrices.put("Cold Storage", 6000);
        ServicePrices.put("Fragile Items Storage", 6000);
        ServicePrices.put("Cars", 550);
        ServicePrices.put("Trucks", 950);
        ServicePrices.put("Refridgeration Transport vehicle", 1200);
        ServicePrices.put("Fragile Items Transport", 1350);
        ServicePrices.put("Auditing", 350);
        ServicePrices.put("Taxation", 600);
        ServicePrices.put("Servers", 200);
//        ServicePrices.put("Servers", 500);
//        ServicePrices.put("Servers", 500);
//        ServicePrices.put("Servers", 500);
//        ServicePrices.put("Servers", 500);
        
        
        
        
        
        // TODO code application logic here
        EmployeeDirectory.getInstance().getEmployeeData();
        userDirectory.getInstance().getUsers();
        BusinessUsersDirectory.getInstance().getBusinessUserData();
        OrdersDirectory.getInstance().getOrderData();
        BillsDirectory.getInstance().getBillData();
        FreelanceDirectory.getInstance().getFreelancerData();
        JobsDirectory.getInstance().getJobsData();
        complainsDirectory.getInstance().getComplainsData();
        StorageDirectory.getInstance().getStorageData();
        TransportDirectory.getInstance().getTransportData();
        RentalOrderDirectory.getInstance().getRentalOrdersData();
        AuditOrderDirectory.getInstance().getAuditOrderData();
        ApplicationDirectory.getInstance().getApplicationData();
        ApplicationBusinessDirectory.getInstance().getApplicationBusinessData();
        ApplicationFreelancerDirectory.getInstance().getApplicationData();
        taxationFormDirectory.getInstance().getTaxationFormData();
        RawMaterialDirectory.getInstance().getRawMaterialData();
//        HospitalAdminDirectory.getInstance().getHospAdminData();
//        HospitalDirectory.getInstance().getHospitalData();
//        AmbulanceDirectory.getInstance().getAmbulance();
        
        
//        users.put("albert", "1");
//        users.put("alberto","1");
        
        loginPage lp = new loginPage();
        lp.show();
    }
    
}
