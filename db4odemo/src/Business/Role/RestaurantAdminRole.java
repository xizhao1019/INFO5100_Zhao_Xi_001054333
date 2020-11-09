/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.CityRestaurant.CityRestaurant;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.RestaurantAdmin;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.RestaurantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RestaurantAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, 
            CityRestaurant restaurant, EcoSystem business) {
        return new RestaurantWorkAreaJPanel(userProcessContainer,account,restaurant, business);
    }

}
