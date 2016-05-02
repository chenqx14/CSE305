package Beans;


import java.io.Serializable;

/**
 * @author Tian
 */
public class Person implements Serializable{
    private String ssn;
    private String lname;
    private String fname;
    private String address;
    private String zipcode;
    private String telephone;
    private String state;
    private String city;
    
    public Person(){
        
    }
    
    public void setSSN(String newSSN){ ssn = newSSN;}
    public String getSSN(){ return ssn;}
    
    public void setLName(String lname){ this.lname = lname;}
    public String getLName(){ return lname;}
    
    public void setFName(String fname){ this.fname = fname;}
    public String getFName(){ return fname;}
    
    public void setAddress(String newAdd){ address=newAdd;}
    public String getAddress(){ return address;}
    
    public void setZipCode(String zip){ zipcode=zip;}
    public String getZipCode(){ return zipcode;}
    
    public void setTelephone(String phone){ telephone=phone;}
    public String getTelephone(){ return telephone;}
    
    public void setState(String s){state = s;}
    public String getState(){return state;}
    
    public void setCity(String c){city=c; }
    public String getCity(){return city;}

   
}
