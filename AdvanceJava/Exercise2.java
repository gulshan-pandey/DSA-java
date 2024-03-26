package AdvanceJava;

import java.util.List;
import java.util.stream.Collectors;

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


    

    
    }
}
