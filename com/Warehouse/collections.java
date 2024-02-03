package com.Warehouse;

import com.company.Bike;

public class collections {
    public static void main(String[] args) {
        
        Bike splender = new Bike("black", 2,555,10,999);
        
        splender.color="green"; //accessible
        splender.tyres=2; // accessible

        // splender.model = 234 //it is not accessible is it default and is accessible within the same package
        
        // splender.costOfPurchase =234; // cant be accessed, is is private

        System.out.println(splender);


        com.company.AccessBike acc = new com.company.AccessBike(); // it is accessible

        // com.company.Default def = new com.company.Default();  
        // it is not accessible because it is default,which is not accessible in another package...default classes are only accessible within its own package!!!


    }

    
}
