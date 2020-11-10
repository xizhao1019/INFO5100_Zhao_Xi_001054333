/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class Order {
    
    private UserAccount customer;
    private UserAccount deliveryMan;
    private String status;
    private Date orderDate;
    private Date deliveredDate;
    private int orderNumber;
    private static int count;
    
    
    public Order(){
        orderDate = new Date();
        count++;
        orderNumber = count;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public UserAccount getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(UserAccount deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
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
    
    @Override
    public String toString(){
        return String.valueOf(orderNumber);
    }

    
    
}
