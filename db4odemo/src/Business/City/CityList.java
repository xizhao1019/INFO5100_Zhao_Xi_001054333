/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class CityList {
    private ArrayList<City> cityList;
   

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public CityList(){
        cityList=new ArrayList<City>();
    }
    
    //Create city
    public City createAndAddCity(String name,City.CityName type){
        City city=null;
        if(type==City.CityName.Boston){
            city=new Boston(name);
            cityList.add(city);
        }
        return city;
    }
}
