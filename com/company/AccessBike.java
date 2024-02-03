package com.company;

public class AccessBike {
    
    public static void main(String[] args) {
        
        Bike bike = new Bike();

        bike.color= "green";
        bike.tyres = 2;
        bike.model=123;

        System.out.println(bike);


        Bike bmw = new Bike("blue" ,2 ,786,2,999);
        
        System.out.println(bmw);
    }
}
