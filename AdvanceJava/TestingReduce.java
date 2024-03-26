package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingReduce {
    
    //Reduce itself is a Terminal method

    public static void main(String[] args) {
        
        List<Integer> number = new ArrayList<>(List.of(1,2,3,4,5,99,6,7,9));       // this list.of() method under the ArrayList() makes the list mutable 

        System.out.println("number: "+ number);


        // int sum =0;                  //traditional way to sum
        // for (int num: number) {
        //     sum+=num;
        // }
        // System.out.println(sum);




        //using lambda

       int sum = number.stream().reduce(0,(a,b)->a+b);    //means ki numbers ki stream bnana ,usko reduce krna fir everytime saare elements ko a+b krte jana fir final result return krna... ps: is a default value it is used to store the temporary returned value and in the end this default value will be returned
       System.out.println("\nsum using reduce is: " + sum);

       //---------------OR -------------------------------------

    //    System.out.println(number.stream().reduce(0,(a,b)->a+b));


       int max = number.stream().reduce((Integer.MIN_VALUE),(a,b)->(a>b? a :b) );

       System.out.println("\n the maximum element using reduce is : " + max + " \n");







    List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

    strings.stream()
    .filter(s -> s.length() > 3)
    .map(String::toUpperCase)                              //this line means this   .map(s -> s.toUpperCase())
    .reduce((s1, s2) -> s1 + ", " + s2)
    .ifPresent(System.out::println);

        



        
        
        
    }
}
