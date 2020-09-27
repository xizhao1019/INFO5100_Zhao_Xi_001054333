/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import javax.swing.ImageIcon;

/**
 *
 * @author zhaoxi
 */
public class Person {
    //personal information
    private String firstname;
    private String lastname;
    private String middlename;
    private String gender;
    private String dob;
    private String occupation;
    ImageIcon photo; 
    
    //social security
    private int ssn;
    private int dirverlicense;
    private int vehicleserial;
    private int plate;
    private int bankaccount;
    
    //medical and biomitic
    private int medicalrecord;
    private int healthplanbeneficiary;
    private int retinal;
    private int fingerprints;
    
    //contact information
    private String email;
    private int phone;
    private int fax;
    Address permanentaddress;
    Address currentaddress;
    Address workaddress;
    
    //social media
    private String ipaddress;
    private String linkedin;
    private String facebook;
    private String twitter;
    private String instagram;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
        
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getDirverlicense() {
        return dirverlicense;
    }

    public void setDirverlicense(int dirverlicense) {
        this.dirverlicense = dirverlicense;
    }

    public int getVehicleserial() {
        return vehicleserial;
    }

    public void setVehicleserial(int vehicleserial) {
        this.vehicleserial = vehicleserial;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int licenseplate) {
        this.plate = plate;
    }

    public int getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(int bankaccount) {
        this.bankaccount = bankaccount;
    }

    public int getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(int medicalrecord) {
        this.medicalrecord = medicalrecord;
    }

    public int getHealthplanbeneficiary() {
        return healthplanbeneficiary;
    }

    public void setHealthplanbeneficiary(int healthplanbeneficiary) {
        this.healthplanbeneficiary = healthplanbeneficiary;
    }

    public int getRetinal() {
        return retinal;
    }

    public void setRetinal(int retinal) {
        this.retinal = retinal;
    }

    public int getFingerprints() {
        return fingerprints;
    }

    public void setFingerprints(int fingerprints) {
        this.fingerprints = fingerprints;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public Address getPermanentaddress() {
        return permanentaddress;
    }

    public void setPermanentaddress(Address permanentaddress) {
        this.permanentaddress = permanentaddress;
    }

    public Address getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(Address currentaddress) {
        this.currentaddress = currentaddress;
    }

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    
    
    
}
