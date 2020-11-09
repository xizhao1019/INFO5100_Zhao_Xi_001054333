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
    
    private ArrayList<CustomerOrder> orderList;

    public OrderList() {
        orderList = new ArrayList();
    }

    public ArrayList<CustomerOrder> getOrderList() {
        return orderList;
    }
    
    public CustomerOrder createOrder(){
        CustomerOrder order = new CustomerOrder();
        orderList.add(order);
        return order;
    }
    
}