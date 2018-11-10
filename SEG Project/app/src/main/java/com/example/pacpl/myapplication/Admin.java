package com.example.pacpl.myapplication;

public class Admin extends Person {

    String nameofservice;
    double hourlyrate;

    public Admin(String username, String password, String nameofservice, double hourlyrate){
        this.username=username;
        this.password=password;
        this.hourlyrate=hourlyrate;
        this.nameofservice=nameofservice;
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
