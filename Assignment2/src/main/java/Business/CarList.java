/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.FileInputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author zhaoxi
 */
public class CarList {
    
    private ArrayList<Car> carList;

    public CarList(){
        this.carList = new ArrayList<Car>();
    }
    
    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    public Car searchBrand(String brand){
        for(Car car : carList){
            if(car.getBrand().equals(brand)){
                return car;
            }
        }
        return null;
    }
    
    public Car searchModel(String model){
        for(Car car : carList){
            if(car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }
    
    public Car searchPlate(String platenumber){
        for(Car car : carList){
            if(car.getPlatenumber().equals(platenumber)){
                return car;
            }
        }
        return null;
    }
    
    public Car searchSeats(int seat){
        for(Car car : carList){
            if(car.getSeat()==seat){
                return car;
            }
        }
        return null;
    }
    
    public Car searchAvaliableTime(String time){
        for(Car car : carList){
            if(car.getAvaliableTime().equals(time)){
                return car;
            }
        }
        return null;
    }
    
    public Car searchLocation(String location){
        for(Car car : carList){
            if(car.getLocation().equals(location)){
                return car;
            }
        }
        return null;
    }
    
    public Car searchSerialNumber(String number){
        for(Car car : carList){
            if(car.getSerialnumber().equals(number)){
                return car;
            }
        }
        return null;
    }
    
    public Car searchYear(int number){
        for(Car car : carList){
            if(car.getManufactureYear() == number){
                return car;
            }
        }
        return null;
    }
    
    public Car searchMaintenance(String s){
        for(Car car : carList){
            if(car.getMaintenanceCertification().equals(s)){
                return car;
            }
        }
        return null;
    }
    
    public Car searchCatalogTime(String s){
        for(Car car : carList){
            if(car.getFleetcatalog().equals(s)){
                return car;
            }
        }
        return null;
    }
}
