/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Area;

import Business.CityRestaurant.CityRestaurantList;

/**
 *
 * @author zhaoxi
 */
public class Area {
    private String name;
    private CityRestaurantList CityList;
    
    public Area(){
        CityList=new CityRestaurantList();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityRestaurantList getCityList() {
        return CityList;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
