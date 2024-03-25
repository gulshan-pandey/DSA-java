package AdvanceJava;

interface Operation {            //defined interface
    int operate(int a, int b);  //abstracted method
}


public class LambdaAsVariable {

    //doing calculation using lambda expressions(by the help of functional interfaces)
    public static void main(String[] args) {
        // Passing a lambda expression as a variable
        Operation addition = (a, b) -> a + b;    //variable of the functional interface for performing operation
        Operation multiplication = (a, b) -> a * b;

        int result1 = performOperation(5, 3, addition);
        int result2 = performOperation(5, 3, multiplication);

        System.out.println("Result 1: " + result1); // Output: Result 1: 8
        System.out.println("Result 2: " + result2); // Output: Result 2: 15
    }

    public static int performOperation(int a, int b, Operation op) {
        return op.operate(a, b);
    }
}