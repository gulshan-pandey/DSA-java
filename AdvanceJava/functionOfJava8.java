package AdvanceJava;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class functionOfJava8 {
    //functional interface acts as a type for lambda expression
    public static void main(String[] args) {
        
        Function<String,Integer> function1 = x -> x.length();
         System.out.println(function1.apply("chotabheem"));

         Function <String,String> function2 = x-> x.substring(0,3);
         System.out.println(function2.apply("chotabheem"));

         List<Student> result = new ArrayList<>();


        Function<List<Student>, List<Student>> NameStartsWithAnuPrefix = li -> {
            for(Student s : li){
                if(function2.apply(s.name).equalsIgnoreCase("anu")){
                    result.add(s);
                }
                }
            return result;
        };

        Student s1 = new Student("anurag");
        Student s2 = new Student("charag");
        Student s3 = new Student("anuradha");
        Student s4 = new Student("anurodh");
        Student s5 = new Student("anna");

        List<Student> students = List.of(s1,s2,s3,s4,s5);


        System.out.println(NameStartsWithAnuPrefix.apply(students));

        // System.out.println(students);            // will print the default toString method unless we define one
        
        

        System.out.println("\n\n");

        
        Function<String,String> function3 = s -> s.toUpperCase();
        System.out.println(function3.andThen(function2).apply("cruise"));           // makking a function madeup of two functions
        
       
    }

    }






        class Student{
           String name;
       
           Student(String name){
               this.name = name;
           }

        @Override
        public String toString() {
            return  name ;
        }
           
          
          
        }

