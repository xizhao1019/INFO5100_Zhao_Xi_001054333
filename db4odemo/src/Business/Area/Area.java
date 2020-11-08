/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Area;

import Business.City.CityList;

/**
 *
 * @author zhaoxi
 */
public class Area {
    private String name;
    private CityList CityList;
    
    public Area(){
        CityList=new CityList();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityList getCityList() {
        return CityList;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
