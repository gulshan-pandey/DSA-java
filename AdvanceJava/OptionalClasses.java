package AdvanceJava;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClasses {

    //Optional object can contain either a non-null value or no value at all.used to wrap a value that may be present or absent. get(), orElse(), and orElseGet() to retrieve the value if it is present or provide a default value if it is absent.

    
    public static void main(String[] args) {
        
        List <Integer> numbers = List.of(2,1,4,8,3,7,3,9);
        Optional<Integer> res = numbers.stream().reduce((a,b)->a+b);   //here res is of Optional class(it takes a generic type in it) bcz if the answer is null then it cannot be of int type (or else provide the default int value to the reduce method if not then make it of optional class )

        System.out.println(res.getClass());     //optional class



        if(res.isPresent()){
            System.out.println(res.get());
        }else System.out.println("empty");






  
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> value = Optional.of("hello world");    //Optional.of is used to create an Optional object that is present and contains the specified value in thic case...create an Optional object that contains the value "hello world".  
        Optional<String> opNull = Optional.ofNullable(null);

        //checking for values
        if(value.isPresent()){
            System.out.println("\n\nthe value is present : " + value.get());
        } else System.out.println("it is empty");

        
        //Using orElse
        String orElseExample = optionalEmpty.orElse("default");   // it means put the value of the optionalEmpty variable into orElseExample and if it is empty then add "default" instead

        System.out.println("Using orElse: " + orElseExample);   //getting the value--- default



        


        List <Integer> numlist = List.of(31,45,34,6,3,52);

        Optional<Integer> minnum= numlist.stream().min(Integer::compareTo);
        System.out.println(minnum);         // this will be covered with optional class
        System.out.println(minnum.get());            // will print the actual value
        
        Optional<Integer> maxnum = numlist.stream().max((a,b) -> a.compareTo(b));
        maxnum.ifPresent(System.out::print);
        
        




        System.out.println("\n\n");

    Optional<String>  name = getName(2);
    System.out.println(name.isPresent() ?name.get() :"name not found");        // can throw null pointer exception but can be avoided by using Optional class
      

    name.ifPresent(x -> System.out.println(x));     // ifPresent takes the consumer which (leta hai deta kuch nhi hai)
    

        String elseName= name.orElse("chiragggg");              // for setting a default value 
        System.out.println( elseName);


        String elseGet = name.orElseGet(() -> "Selmon");         //orElseGet() method takes supplier which(deta hai, leta kuch nhi h )
        System.out.println(elseGet);

        
        // String throwExpName = name.orElseThrow(() -> new NoSuchElementException());
        // System.out.println(throwExpName);

    }

    private static Optional getName(int id){
        //get from db
        String name = null;
        String name1 = "shyam";
        // return Optional.ofNullable(name);

        return Optional.empty();        // null's case encountered
    }
}
