 package AdvanceJava;

import java.util.function.BinaryOperator;

public class Exercises {

    public static void main(String[] args) {
        
    BinaryOperator<Integer> prod = (a,b)->a*b;    //generally we dont do these kind of programs and storing the function in variable
    int answer = prod.apply(22,2);
    System.out.println("\nthe product of 22,2 is : " + answer);


// ---------------------------OR-----------------------------------



    MultiplierLambda multiplier = (a, b) -> a * b;

    int result = multiplier.multiply(4, 6);
    System.out.println("The result of 4 * 6 is: " + result);

    }



    @FunctionalInterface      // functional interface is an interface that contains exactly one abstract method. These interfaces are used to represent functional concepts, similar to what lambda expressions can express.
    interface MultiplierLambda {
        int multiply(int a, int b);
    }

}
