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

    /**
     * @param args the command line arguments
     */
    //public static HashMap<String, String> users = new HashMap<String, String>();
    public static void main(String[] args) {
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
