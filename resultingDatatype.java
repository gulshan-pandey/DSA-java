import javax.crypto.spec.PSource;
import java.util.concurrent.Callable;

public class resultingDatatype {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.4f + x; //here we should know that float+int is float
        System.out.println(b);

        //increment and decrement operator

        int i = 56;
        System.out.println("the actual value of i is " + i);
        // int b=i++; // means first b is assigned then got incremented or in other words first i will be used then get incremented
        System.out.println("by using post increment " + i++ + "  but now after the post increment the value will be increased by one");
        //this was meant that first to print the value of i and then increment on it
        System.out.println("the precedency of assignment operator is more than the post increment operator");
        System.out.println(i);
        //in this line meant that i has been incremented by one after printing its exact value on the previous step
        System.out.println("by using preincrement: " + ++i);
        //means that first the i is incremented then got assigned as the precedency of preincremeent is more then assignment operator

        //in order to get the datatype of the keyword


        //to count the sum of the digits in the number
        // String name = "kalia";
        // System.out.println(" name : " + name);
        // System.out.println("for taking the type of the name is : " + name.getClass().getSimpleName());

        // int n =sc.nextInt();
        // int z=0;
        // while(n>0){
        //     int p =n%10;
        //     z=z+p;
        //     n=n/10;
            
           
        // }
        // System.out.println(z);
    }

}
