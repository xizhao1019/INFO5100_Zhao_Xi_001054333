/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Area;

import Business.CityRestaurant.CityRestaurantList;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;

/**
 *
 * @author zhaoxi
 */
public class Area {
    private String name;
    private CityRestaurantList cityRestaurantList;
    private Customer customerDir;
    private DeliveryMan deliveryManDir;
    
    public Area(){
        cityRestaurantList=new CityRestaurantList();
        customerDir = new Customer();
        deliveryManDir = new DeliveryMan();
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

    public Customer getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(Customer customerDir) {
        this.customerDir = customerDir;
    }

    public DeliveryMan getDeliveryManDirectory() {
        return deliveryManDir;
    }

    public void setDeliveryMan(DeliveryMan deliveryManDir) {
        this.deliveryManDir = deliveryManDir;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
