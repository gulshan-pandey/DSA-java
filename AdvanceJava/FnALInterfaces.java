package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FnALInterfaces {
    //functional interfaces has only one abstracted metjod,however it can have static or default methods in them ...example  runnable,callable,BinaryOperator,comparator,Consumer  interfaces,Function

    public static void main(String[] args) {

        //runnable interface

        Runnable runnable = ()->{    //initializing variable1 for multithreading  
      
            for(int i=0;i<10;i++){
                System.out.println(i);
            
           }
         };

         Runnable runnable2 = ()->{    //initializing variable1 for multithreading 
          
            for(int j=90;j<100;j++){
                System.out.println(j);
            
           }
         };
    
         Thread thread = new Thread(runnable);
         thread.start();
         Thread thread2 = new Thread(runnable2);
         thread2.start();
    



 
        //Callable interface

          Callable<Integer> callable = () -> {
            int sum = 0;
            Thread.sleep(1000);
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            return sum;
        };

        try {
            int result = callable.call();
            System.out.println("Sum using callable is  : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }



        //BinaryOperator
        BinaryOperator<Integer> add = (a, b) -> a + b;          //we can make the variable of the BinaryOperator and indulge the lambda expression on it
    
        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        int result1 = add.apply(5, 3);
        int result2 = multiply.apply(5, 3);

        System.out.println("Addition: " + result1);
        System.out.println("Multiplication: " + result2);



        //function functional interface
        Function<Integer, Integer> square = n -> n * n;           //functional interface Function takes 2 generics <T, R> uses apply method and same as Binary Operator
        int result = square.apply(5);
        System.out.println(result);



        //consumer interface(which is used in forEach)
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        names.forEach(name -> System.out.println("Hello, " + name));



        //Comparator
         List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Chrry");
        fruits.add("Orange");

        Comparator<String> lengthComparator = (str1, str2) -> str1.length() - str2.length();

        fruits.sort(lengthComparator);    //inserting the variable of Comparator into sort method

        System.out.println("Sorted fruits: " + fruits);



        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("cherry");
        strings.add("date");

        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));   //using Collections methods

        System.out.println(strings);


        
    }
}
