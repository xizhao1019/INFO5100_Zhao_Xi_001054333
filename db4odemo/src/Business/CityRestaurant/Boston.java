/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CityRestaurant;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class Boston extends CityRestaurant {
    
    public Boston(String name){
        super(name,CityName.Boston);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
