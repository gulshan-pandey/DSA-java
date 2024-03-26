package com.company;

class Default{
int i;
}

public class AccessBike {
    
    public static void main(String[] args) {
        
        Bike bike = new Bike();

        bike.color= "green";
        bike.tyres = 2;
        bike.model=123; //default can be accessed within package
        // bike.coseOfPurchase =1; // it is private so it is not accessible
        System.out.println(bike);


        Bike bmw = new Bike("blue" ,2 ,786,2,999);
        
        System.out.println(bmw);
    }
}
