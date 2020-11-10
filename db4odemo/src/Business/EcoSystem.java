/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;



import Business.Area.Area;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author zhaoxi
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Area> areaList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Area createAndAddArea(){
        Area region=new Area();
        areaList.add(region);
        return region;
    }

    public ArrayList<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(ArrayList<Area> regionList) {
        this.areaList = regionList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    public EcoSystem(){
        super(null);
        areaList = new ArrayList<Area>();
    }

    public boolean checkIfUserIsUnique(String userName){
       if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
}
