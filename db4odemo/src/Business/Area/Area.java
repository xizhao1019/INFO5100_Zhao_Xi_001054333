/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Area;

import Business.CityRestaurant.CityRestaurantList;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;

/**
 *
 * @author zhaoxi
 */
public class Area {
    private String name;
    private CityRestaurantList cityRestaurantList;
    private CustomerDirectory customerDir;
    private DeliveryManDirectory deliveryManDir;
    
    public Area(){
        cityRestaurantList=new CityRestaurantList();
        customerDir = new CustomerDirectory();
        deliveryManDir = new DeliveryManDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityRestaurantList getCityRestaurantList() {
        return cityRestaurantList;
    }

    public CustomerDirectory getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDirectory customerDir) {
        this.customerDir = customerDir;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDir;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDir) {
        this.deliveryManDir = deliveryManDir;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
