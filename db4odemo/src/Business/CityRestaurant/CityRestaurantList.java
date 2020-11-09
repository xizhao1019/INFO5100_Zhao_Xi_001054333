/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CityRestaurant;

import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class CityRestaurantList {
    private ArrayList<CityRestaurant> cityRestaurantList;
   

    public ArrayList<CityRestaurant> getCityRestaurantList() {
        return cityRestaurantList;
    }

    public void setCityRestaurantList(ArrayList<CityRestaurant> cityList) {
        this.cityRestaurantList = cityList;
    }
    
    public CityRestaurantList(){
        cityRestaurantList=new ArrayList<CityRestaurant>();
    }
    

    public CityRestaurant createAndAddCityRestaurant(String restaurantName,CityRestaurant.CityName type){
        CityRestaurant restaurant=null;
        if(type==CityRestaurant.CityName.Boston){
            restaurant=new BostonRestaurant(restaurantName);
            cityRestaurantList.add(restaurant);
        }
        return restaurant;
    }
}
