/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interlacedventures;

//import java.util.HashMap;
import models.EmployeeDirectory;
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
        
        Admins[0][0] = "SystemAdmin";
        Admins[0][1] = "Password";
        Admins[1][0] = "TechnicalAdmin";
        Admins[1][1] = "Password";
        Admins[2][0] = "OperationsAdmin";
        Admins[2][1] = "Password";        
        
        
        // TODO code application logic here
        EmployeeDirectory.getInstance().getEmployeeData();
        userDirectory.getInstance().getUsers();
//        AppointmentSlotsDirectory.getInstance().getslotsData();
//        HospitalAdminDirectory.getInstance().getHospAdminData();
//        HospitalDirectory.getInstance().getHospitalData();
//        AmbulanceDirectory.getInstance().getAmbulance();
        System.out.println("test print");
        
        
//        users.put("albert", "1");
//        users.put("alberto","1");
        
        loginPage lp = new loginPage();
        lp.show();
    }
    
}
