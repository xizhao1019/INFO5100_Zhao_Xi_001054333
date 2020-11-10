/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrderList {
    
    private ArrayList<FoodDeliveryOrder> orderList;

    public OrderList() {
        orderList = new ArrayList();
    }

    public ArrayList<FoodDeliveryOrder> getOrderList() {
        return orderList;
    }
    
    public FoodDeliveryOrder createOrder(){
        FoodDeliveryOrder order = new FoodDeliveryOrder();
        orderList.add(order);
        return order;
    }
    
}