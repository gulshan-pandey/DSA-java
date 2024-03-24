import java.util.List;
import java.util.function.Consumer;

public class FunctionalPrograming {
    
    public static void main(String[] args) {
        
    List <String> fruits = List.of("apple","banana","grapes","peach","orange","date");

    // for(String fruit: fruits){        //aam zindagi
    //     System.out.println(fruit);
    // }

    fruits.stream().forEach(new Consumer<String>(){
        public void accept(String fruit){
            System.out.println(fruit);
        }
    });  //forEach expects the object of the consumer interface which has only one medthod called {accept()} which is a generic method





}
}
