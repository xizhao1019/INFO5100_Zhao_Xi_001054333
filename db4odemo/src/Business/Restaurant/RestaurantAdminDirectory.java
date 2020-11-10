/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantAdminDirectory {
    private ArrayList<RestaurantAdmin> restaurantAdminList;

    public RestaurantAdminDirectory() {
        restaurantAdminList = new ArrayList();
    }

    public ArrayList<RestaurantAdmin> getRestaurantList() {
        return restaurantAdminList;
    }

    public RestaurantAdmin createRestaurant(){
        RestaurantAdmin restaurant = new RestaurantAdmin();
        restaurantAdminList.add(restaurant);
        return restaurant;
    }
}
