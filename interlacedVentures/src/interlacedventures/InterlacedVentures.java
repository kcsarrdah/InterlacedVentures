/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interlacedventures;

//import java.util.HashMap;
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
import models.RentalOrderDirectory;
import models.StorageDirectory;
import models.TransportDirectory;
import models.complainsDirectory;
import models.userDirectory;
import views.loginPage;

/**
 *
 * @author kcsar
 */
public class InterlacedVentures {

    public static String[][] Admins = new String[8][2];
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
//        HospitalAdminDirectory.getInstance().getHospAdminData();
//        HospitalDirectory.getInstance().getHospitalData();
//        AmbulanceDirectory.getInstance().getAmbulance();
        
        
//        users.put("albert", "1");
//        users.put("alberto","1");
        
        loginPage lp = new loginPage();
        lp.show();
    }
    
}
