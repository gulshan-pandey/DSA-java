package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class FnALInterfaces {
    //functional interfaces has only one abstracted method,however it can have static or default methods in them ...example  runnable,callable,BinaryOperator,comparator,Consumer  interfaces,Function


    //functional interface ACTS AS A TYPE FOR LAMBDA EXPRESSION
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








        /*
         * filter----which uses Predicate
         */
        



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Define a Predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Use the Predicate with the filter() method
        List<Integer> evenNumbers = numbers.stream()
                                          .filter(isEven)
                                          .toList();

        System.out.println(evenNumbers); // Outputs: [2, 4, 6, 8, 10]






        
//operation on the old fashioned array 

int[] numberss = {1, 2, 3, 4, 5};

// Using forEach to print each number
Arrays.stream(numberss)
     .forEach(System.out::println);          //forEach takes a consumer which(leta h but deta kuch nhi)

System.out.println();

// Using forEach to double each number
Arrays.stream(numberss)
     .map(n -> n * 2)
     .forEach(System.out::println);
    }
}
