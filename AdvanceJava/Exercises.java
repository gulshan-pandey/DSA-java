 package AdvanceJava;

import java.util.function.BinaryOperator;

public class Exercises {

    public static void main(String[] args) {
        
// Que:- Write lambda expression that takes two integers and returns there multiplication.Then,apply this lambda to a pair of numbers.

    //method 1
    BinaryOperator<Integer> prod = (a,b)->a*b;    //generally we dont do these kind of programs and storing the function in variable
    int answer = prod.apply(22,2);
    System.out.println("\nthe product of 22,2 is : " + answer);


// ---------------------------OR-----------------------------------
 //method 2 by using functional interfaces
    MultiplierLambda multiplier = (a, b) -> a * b;

    int result = multiplier.multiply(4, 6);     //variable.builtinMethods() <is a by default notion> ,,,here we are doing the same using interfaces ==> Interface'sVariable.InterfaceMethod()==>result
    System.out.println("The result of 4 * 6 is: " + result);




    // Que2: Convert an array of Strings into a Stream.Then,use the stream to print each string to the console

    
















    }



















    @FunctionalInterface      // functional interface is an interface that contains exactly one abstract method. These interfaces are used to represent functional concepts, similar to what lambda expressions can express.
    interface MultiplierLambda {
        int multiply(int a, int b);   //one abstracted method
    }

}
