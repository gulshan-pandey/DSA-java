package AdvanceJava;

import java.util.List;
import java.util.Optional;
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

    



        //QUE 3 - Write a function that accepts astring and returnes an Optional<String>.If the string is empty or null,return an empty Optional,otherwise,return an Optional contiaining the uppercase version of the string

        System.out.println(toOptional(null));
        
        System.out.println(toOptional(""));

        System.out.println(toOptional("mukesh"));




    
    }
//factorial calculator
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
    }




     //QUESTION 3--------------------------------------------------
     public static Optional<String> toOptional(String str){
       if(str==null ||str.isEmpty()  ){
        return Optional.empty();
       }
       return Optional.of(str.toUpperCase());
    }
}
