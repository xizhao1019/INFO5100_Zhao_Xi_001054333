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
public class MasterOrderCatalog {
    private ArrayList<Order> orderCatalog;
    
    public MasterOrderCatalog(){
<<<<<<< HEAD
        
        orderCatalog = new ArrayList<Order>();
=======
        orderCatalog = new ArrayList<Order>();
        
>>>>>>> master
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
<<<<<<< HEAD
    public Order addOrder(Order o){
        
        orderCatalog.add(o);
        return o;
    }
    
=======
    public Order addOrder(Order o ){
        orderCatalog.add(o);
        return o;
    }
>>>>>>> master
}
