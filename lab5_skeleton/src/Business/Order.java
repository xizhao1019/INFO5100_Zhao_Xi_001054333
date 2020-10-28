/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class Order {
<<<<<<< HEAD
    
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count=0;
    
    public Order(){
        count ++;
=======
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count =0;
    
    public Order(){
        count++;
>>>>>>> master
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
    
    public OrderItem addOrderItem(Product p, int q, double price){
<<<<<<< HEAD
        
        OrderItem o = new OrderItem();
        o.setProduct(p);
            o.setQuantity(q);
            o.setSalesPrice(price);
            orderItemList.add(o);
            return o;
=======
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
>>>>>>> master
    }
    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
    
<<<<<<< HEAD
    
    
=======
>>>>>>> master
}
