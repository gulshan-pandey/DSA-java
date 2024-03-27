package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercises {

        @FunctionalInterface // functional interface is an interface that contains exactly one abstract
        // method. These interfaces are used to represent functional concepts, similar
        // to what lambda expressions can express.
        interface MultiplierLambda {
                int nums(int a, int b); // one abstracted method
        }




        public static void main(String[] args) {

                // Que:- Write lambda expression that takes two integers and returns there
                // multiplication.Then,apply this lambda to a pair of numbers.

                // method 1
                BinaryOperator<Integer> prod = (a, b) -> a * b; // generally we dont do these kind of programs and storing the function in variable
                int answer = prod.apply(22, 2); // .apply() method should be remembered
                System.out.println("\nthe product of 22,2 is : " + answer);

                // ---------------------------OR-----------------------------------
                // method 2 by using functional interfaces

                MultiplierLambda multiplier = (a, b) -> a * b; // storing a lambda function to a variable
                MultiplierLambda adder = (a, b) -> a + b; // storing a lambda function to a variable

                int result = multiplier.nums(4, 6); // variable.builtinMethods() <is a by default notion> ,,,here we are doing the same using interfaces ==>Interface'sVariable.InterfaceMethod()==>result
                int result2 = adder.nums(4, 6);
                System.out.println("The result of 4 * 6 is: " + result);
                System.out.println("The result of 4 + 6 is: " + result2);
                System.out.println();






                // Que2: Convert an array of Strings into a Stream.Then,use the stream to print each string have length greater than 3 to the console

                List<String> lis = new ArrayList<>(
                                List.of("dog", "cow", "monkey", "goat", "deer", "donkey", "lion", "tiger", "leopard",
                                                "cat", "rabbit"));

                lis.stream().filter(li -> li.length() > 3).forEach(li -> System.out.println(li));






                // Que:- Given a list of strings ,use stream operation to filter out strings that have length of 10 or more and then concatinate them into new string

                List<String> list = Arrays.asList("game", "gully cricket", "marval universe", "ironman", "technology",
                                "computer science", "motorcycle", "airplane mode", "Quaintum physics", "conspiracy");
                System.out.println("the list of string is : " + list + "\n");

                String agg = list.stream().filter(li -> li.length() > 10).reduce("", (a, b) -> a + " " + b); // reduce
                                                                                                             // is a
                                                                                                             // terminal
                                                                                                             // operation!
                System.out.println("reduced string is : " + agg);

                // method 2:

                StringBuilder sb = list.stream()
                                .filter(str -> str.length() > 10)
                                .reduce(new StringBuilder(), (stringBuilder, str) -> stringBuilder.append(str),
                                                StringBuilder::append);

                System.out.println(sb.toString());

                // method 3--------------------------------------------
                String sol = list.stream().filter(str -> str.length() > 10).collect(Collectors.joining());

                System.out.println("\nusing method 3 : " + sol.toString());





                //Que: WAP given a list of integers,use stream operations to filter odd numbers and print them
                List<Integer> li = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 89, 0, 4, 3, 22, 5, 67, 23, 4));
                Set<Integer> newlist = li.stream().filter(a -> a % 2 == 1).collect(Collectors.toSet());
                System.out.println("list of odd numbers : " + newlist);
                System.out.println(newlist.getClass().getName());




                
    Men emp10= new Men("shivam",90000);
    Men emp3= new Men("ram",2500);
    Men emp1= new Men("kaka",2000);
    Men emp2= new Men("bravo",5000);
    Men emp5= new Men("krish",3000);
    Men emp7= new Men("kd",900);
    Men emp8= new Men("soni",6000);
    
    List <Men> menwage = List.of(emp1,emp3,emp2,emp5,emp10,emp7,emp8);
    
    System.out.println("\n\n list of factory workers : "+ menwage);
    
    Comparator<? super Men> comparer = (a,b)-> a.getSal() - b.getSal() ;
    
    List <Men> sortedWages = menwage.stream().sorted(comparer).collect(Collectors.toList());
    
    System.out.println("\nsorted on basis of wages : " + sortedWages);
    
    
    
    }
    
    }
    
    
    //WAP to create a list of employees with nama and salary fields,write a comparator that sorts employees by salary.then use this comparator to sort your list using the sort stream operation
    class Men{
        String name;
        int sal;
    
        public Men(String name,int sal){
          this.name = name;
          this.sal = sal;
        }
    
        public String getName() {
            return name;
        }
    
        public int getSal() {
            return sal;
        }
    
        
        @Override
        public String toString(){
         return name + " " + sal 
         + " ";}
    }
    