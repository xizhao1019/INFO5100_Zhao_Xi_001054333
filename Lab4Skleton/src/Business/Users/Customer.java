/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User{

    private CustomerDirectory directory;
    private Date dateCreated;
    
    public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
        directory = new CustomerDirectory();
        this.dateCreated = new Date();
    }

    public CustomerDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(CustomerDirectory directory) {
        this.directory = directory;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    @Override
    public String toString(){
        return getUserName();
    }
    
    @Override
    public boolean verify(String password) {
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
