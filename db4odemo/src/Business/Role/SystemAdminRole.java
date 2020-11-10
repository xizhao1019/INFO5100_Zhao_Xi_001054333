/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.CityRestaurant.CityRestaurant;
import Business.EcoSystem;
import Business.Organization;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, 
            CityRestaurant restaurant, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
