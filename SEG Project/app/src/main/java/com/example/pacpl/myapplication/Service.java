package com.example.pacpl.myapplication;

public class Service {
    String nameofService;
    String hourlyprice;

    public Service(String nameofService, String hourlyprice){
        this.nameofService=nameofService;
        this.hourlyprice=hourlyprice;
    }
    public void setNameofService(String nameofService){
        this.nameofService=nameofService;
    }
    public void sethourlyprice(String price){
        this.hourlyprice=price;
    }
    public String getprice(){
        return hourlyprice;
    }
    public String getNameofService(){
        return nameofService;
    }
}
