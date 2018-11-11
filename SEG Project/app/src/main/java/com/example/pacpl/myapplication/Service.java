package com.example.pacpl.myapplication;

public class Service {
    String nameofService;
    int hourlyprice;

    public Service(String nameofService, int hourlyprice){
        this.nameofService=nameofService;
        this.hourlyprice=hourlyprice;
    }
    public void setNameofService(String nameofService){
        this.nameofService=nameofService;
    }
    public void sethourlyprice(int price){
        this.hourlyprice=price;
    }
    public int getprice(){
        return hourlyprice;
    }
    public String getNameofService(){
        return nameofService;
    }
}
