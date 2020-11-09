package Business;

import Business.Employee.Employee;
import Business.Area.Area;
import Business.Customer.Customer;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        Area area = system.createAndAddArea();
        area.setName("Greater Boston Area");
        
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create customer account
        
        Employee employee0 = system.getEmployeeDirectory().createEmployee("Xi");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee0, new SystemAdminRole());
        
        return system;
    }
    
}
