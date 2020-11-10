package Business;

import Business.Employee.Employee;
import Business.Area.Area;
import Business.CityRestaurant.CityRestaurant;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.RestaurantAdminRole;
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
        
        Employee employee0 = system.getEmployeeDirectory().createEmployee("Xi");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee0, new SystemAdminRole());
        
        //create a restaurant
        CityRestaurant restaurant = area.getCityRestaurantList().createAndAddCityRestaurant("Sushi", CityRestaurant.CityName.Boston);
        //create a restaurant admin
        Employee employee1 = restaurant.getEmployeeDirectory().createEmployee("Emma");
        UserAccount rua =  restaurant.getUserAccountDirectory().createUserAccount("sushiadmin", "sushiadmin", employee1, new RestaurantAdminRole());
        
        //create a customer acocunt
        Customer customer = area.getCustomerDir();
        Employee employee2 = customer.getEmployeeDirectory().createEmployee("Allen");
        UserAccount cua = customer.getUserAccountDirectory().createUserAccount("xz", "123ABC", employee2, new CustomerRole());
        
        //create a deliveryman account
        DeliveryMan dm = area.getDeliveryManDirectory();
        Employee employee3 = dm.getEmployeeDirectory().createEmployee("Kevin");
        UserAccount dmua = dm.getUserAccountDirectory().createUserAccount("kl", "123ABC", employee3, new DeliverManRole());
    
        return system;
    }
    
}
