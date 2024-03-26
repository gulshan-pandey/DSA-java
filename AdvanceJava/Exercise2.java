package AdvanceJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@FunctionalInterface
interface calculation{
    boolean var(int n);
}


public class Exercise2 {

    public static void main(String[] args) {
        
        //Question:- Create your own fnal interface with a single abstract method that accepts an integer and returns a boolean.Implement it using a lambda that checks if the numebr is prime



        
        calculation calculate = num ->{
            for(int i =2;i<num;i++){
                if(num % i==0){
                    return false;
                }
            }

            return true;
        };
        System.out.println(calculate.var(71));
        


        
        //applying the method of functional interface
        
        List <Integer> listt = List.of(2,3,4,5,6,78,47,9);  //initializing the list of numbers
       List <Integer> newList= listt.stream().filter(calculate::var).collect(Collectors.toList());

       System.out.println("filtered list is : "+ newList);









       //WAP to find the factorial using functional programming and by procedural programming

       int number = 9;

        System.out.println("\n\nthe factorial of 9 using procedural programming is : " +fact(number));

        
        //factorial using functional proggramming

        System.out.println("\n\nfactorial using functional programming:-- ");
        IntStream.rangeClosed(2,number).reduce((a,b) -> a*b).ifPresent(System.out::print);       //here we didnt provided the default value so the value will be of Optional class type's and hence we called ifPresent method of the Optional class


        // IntStream :used to perform operations on sequences of integer values
        IntStream stream1 = IntStream.of(1, 2, 3, 4, 5);
        IntStream stream2 = IntStream.range(1, 6); // Stream of 1, 2, 3, 4, 5

    

    
    }
//factorial calculator
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
    }
}
