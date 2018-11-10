package com.example.pacpl.myapplication;

public class Person {
    String username;
    String password;
    int accounttype;//accounttype 1=admin, 2=serviceprovider 3=user

    public Person(String username, String password, int accounttype){
        this.username=username;
        this.password=password;
        this.accounttype=accounttype;
    }
    public Person(){}
    public void setUsername(String username){
        this.username=username;
    }
    public void setpassword(String password){
        this.password=password;
    }
    public void setAccounttype(int accounttype){
        this.accounttype=accounttype;
    }
    public int getAccounttype() {
        return accounttype;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
