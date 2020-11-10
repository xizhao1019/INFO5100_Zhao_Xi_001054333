/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.CityRestaurant.CityRestaurant;
import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class FoodDeliveryOrder extends Order {
    private CityRestaurant restaurant;
    private String comment;
    private double price;
    private ArrayList <OrderItem> itemList;

    public CityRestaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(CityRestaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public ArrayList<OrderItem> getItemList() {
        return itemList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItemList(ArrayList<OrderItem> itemList) {
        this.itemList = itemList;
    }

}
