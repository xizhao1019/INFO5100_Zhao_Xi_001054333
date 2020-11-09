/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CityRestaurant;

import Business.Organization;
import Business.OrganizationDirectory;


/**
 *
 * @author zhaoxi
 */
public abstract class CityRestaurant extends Organization{
    
    private CityName CityName;
    private MenuList menuList;
    private OrganizationDirectory orgDirectory;

    public CityRestaurant(String restaurantname,CityName cityname){
        super(restaurantname);
        this.CityName=cityname;
        orgDirectory = new OrganizationDirectory();
        menuList = new MenuList();
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return orgDirectory;
    }

    public enum CityName{
        Boston("Boston");
        
        private String value;
        
        private CityName(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public CityName getCityName() {
        return CityName;
    }

    public void setCityName(CityName enterpriseType) {
        this.CityName = enterpriseType;
    }
    

    public MenuList getMenuList() {
        return menuList;
    }

    public void setMenuList(MenuList menuList) {
        this.menuList = menuList;
    }
    
}

