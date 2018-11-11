package com.example.pacpl.myapplication;

import java.util.ArrayList;

public class Admin extends Person {
    String nameofservice;
    double hourlyrate;
    public Admin(String username, String password){
        this.username=username;
        this.password=password;
       // this.hourlyrate=hourlyrate;
        //this.nameofservice=nameofservice;
    }
    public double getHourlyrate() {
        return hourlyrate;
    }
    public String getNameofservice() {
        return nameofservice;
    }
    public void setNameofservice(String nameofservice){
        this.nameofservice=nameofservice;
    }
    public void setHourlyrate(double hourlyrate){
        this.hourlyrate=hourlyrate;
    }


}