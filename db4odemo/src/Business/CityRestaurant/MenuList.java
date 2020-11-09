/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CityRestaurant;

import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class MenuList {
    private ArrayList<Menu> menuList;

    public MenuList() {
        menuList = new ArrayList<Menu>();
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }
    
    public Menu addMenu(){
        Menu menu = new Menu();
        menuList.add(menu);
        return menu;
    }
    
    
}
