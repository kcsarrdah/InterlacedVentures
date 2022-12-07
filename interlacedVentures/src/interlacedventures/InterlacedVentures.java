/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interlacedventures;

//import java.util.HashMap;
import models.BillsDirectory;
import models.BusinessUsersDirectory;
import models.EmployeeDirectory;
import models.FreelanceDirectory;
import models.JobsDirectory;
import models.OrdersDirectory;
import models.userDirectory;
import views.loginPage;

/**
 *
 * @author kcsar
 */
public class InterlacedVentures {

    public static String[][] Admins = new String[5][2];
    /**
     * @param args the command line arguments
     */
    //public static HashMap<String, String> users = new HashMap<String, String>();
    public static void main(String[] args) {
        
        Admins[0][0] = "SA";
        Admins[0][1] = "123";
        Admins[1][0] = "TA";
        Admins[1][1] = "123";
        Admins[2][0] = "OA";
        Admins[2][1] = "123";
        Admins[3][0] = "SA";
        Admins[3][1] = "123";
        Admins[4][0] = "";
        Admins[4][1] = "123";
        
        
        
        
        // TODO code application logic here
        EmployeeDirectory.getInstance().getEmployeeData();
        userDirectory.getInstance().getUsers();
        BusinessUsersDirectory.getInstance().getBusinessUserData();
        OrdersDirectory.getInstance().getOrderData();
        BillsDirectory.getInstance().getBillData();
        FreelanceDirectory.getInstance().getFreelancerData();
        JobsDirectory.getInstance().getJobsData();
//        HospitalAdminDirectory.getInstance().getHospAdminData();
//        HospitalDirectory.getInstance().getHospitalData();
//        AmbulanceDirectory.getInstance().getAmbulance();
        
        
//        users.put("albert", "1");
//        users.put("alberto","1");
        
        loginPage lp = new loginPage();
        lp.show();
    }
    
}
