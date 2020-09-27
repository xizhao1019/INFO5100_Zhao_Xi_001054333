/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author zhaoxi
 */
public class Address {
    
    private String streetline;
    private int apt;
    private String city;
    private String state;
    private int zipcode;
    private String country;
    
  
    public Address(String streetline, int apt, String city, String state, int zipcode, String country){
      this.streetline = streetline;
      this.apt = apt;
      this.city = city;
      this.state = state;
      this.zipcode = zipcode;
      this.country = country; 
    }
    
    public String getStreetline() {
        return streetline;
    }

    public void setStreetline(String streetline) {
        this.streetline = streetline;
    }

    public int getApt() {
        return apt;
    }

    public void setApt(int apt) {
        this.apt = apt;
    }

    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
            
    
}
