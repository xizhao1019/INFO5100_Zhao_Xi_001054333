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
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
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
    
    public CityRestaurant(String restaurantname,CityName cityname){
        super(restaurantname);
        this.CityName=cityname;
        organizationDirectory=new OrganizationDirectory();
    }
}

