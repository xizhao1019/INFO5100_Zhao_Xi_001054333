/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.CityRestaurant.Menu;
import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class CustomerOrder extends Order {
    private String comment;
    private double price;
    private ArrayList <Menu> itemList;
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public ArrayList<Menu> getItemList() {
        return itemList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItemList(ArrayList<Menu> itemList) {
        this.itemList = itemList;
    }

}
