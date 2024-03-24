import java.util.List;
import java.util.function.Consumer;

public class FunctionalPrograming {
    
    public static void main(String[] args) {
        
    List <String> fruits = List.of("apple","banana","grapes","peach","orange","date");

    // for(String fruit: fruits){                   //traditional way
    //     System.out.println(fruit);
    // }


System.out.println("printing using the Streams,and redefining accept method:--");

    fruits.stream().forEach(new Consumer<String>(){    //here we defined the anonymous inner class of Consumer interface and overrided the accept method
        @Override
        public void accept(String fruit){       // accept method is used to perform any operation on the given input
            System.out.println(fruit);
        }
    });  //forEach expects the object of the consumer interface which has only one medthod called {accept()} which is a generic method



    //ALTERNATIVELY-----------------------------------------------------
   
    //the above accept() method can be used as lambda expression for simplicity
    
    System.out.println("\n printing using lambda expression within th e:");

    fruits.stream().forEach(fruit->System.out.println(fruit));
    
    
    System.out.println("\n printing using lambda expression within th e:");

    fruits.stream().forEach(fruit->System.out.println(fruit.toUpperCase()));






}
}
