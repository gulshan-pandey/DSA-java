package com.Warehouse;

import java.util.List;

import com.company.Bike;

public class collections {
    public static void main(String[] args) {
        
        Bike splender = new Bike("black", 2,555,10,999);
        
        splender.color="green"; //accessible
        splender.tyres=2; // accessible
        //splender.model = 123   //it is also not accessible because model is default and cannot be accessed by another package
        // splender.model = 234 //it is not accessible is it default and is accessible within the same package
 
        System.out.println(splender.getModel());  //getter is the only option to get the value of the default variables of different package
        
        // splender.costOfPurchase =234; // cant be accessed, it is private

        System.out.println(splender);
       

        com.company.AccessBike acc = new com.company.AccessBike(); // it is accessible 

        // com.company.Default def = new com.company.Default();  
        // it is not accessible because it is default,which is not accessible in another package...default classes are only accessible within its own package!!!
        //by the way we can access the defautl class of another package by accessing its getter 

        


    }

    public static void reverse(List<String> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }

    
}
