package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingReduce {
    

    public static void main(String[] args) {
        
        List<Integer> number = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println("number: "+ number);


        // int sum =0;                  //traditional way to sum
        // for (int num: number) {
        //     sum+=num;
        // }
        // System.out.println(sum);




        //using lambda

       int sum = number.stream().reduce(0,(a,b)->a+b);
       System.out.println("sum using reduce is: " + sum);

       //---------------OR -------------------------------------

    //    System.out.println(number.stream().reduce(0,(a,b)->a+b));








    List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

    strings.stream()
    .filter(s -> s.length() > 3)
    .map(String::toUpperCase)
    .reduce((s1, s2) -> s1 + ", " + s2)
    .ifPresent(System.out::println);

        



        
        
        
    }
}
