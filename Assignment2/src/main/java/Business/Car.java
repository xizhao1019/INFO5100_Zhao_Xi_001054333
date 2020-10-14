/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author zhaoxi
 */
public class Car {
    
    private String brand;
    private String model;
    private int manufactureYear;
    private String platenumber;
    private String serialnumber;
    private int seat;
    
    private String location;
    private String avaliableTime;
    private String maintenanceCertification;
    private String fleetcatalog;
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvaliableTime() {
        return avaliableTime;
    }

    public void setAvaliableTime(String avaliableTime) {
        this.avaliableTime = avaliableTime;
    }

    public String getMaintenanceCertification() {
        return maintenanceCertification;
    }

    public void setMaintenanceCertification(String maintenanceCertification) {
        this.maintenanceCertification = maintenanceCertification;
    }

    public String getFleetcatalog() {
        return fleetcatalog;
    }

    public void setFleetcatalog(String fleetcatalog) {
        this.fleetcatalog = fleetcatalog;
    }
    
    public String toString(){
        return brand;
    }
    
}
