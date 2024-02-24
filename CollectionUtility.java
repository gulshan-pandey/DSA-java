import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
 
//this is the utility class which is used to print all the elements to the specified collcetion and can be used by any class

public class CollectionUtility {
    
    public static <E> void print(Collection <E> collection){  //here E is generic
       System.out.print("the Collection is : ");
        for (E obj : collection) {
            System.out.print(obj + " ");
        }
        System.out.println("\n");
    }

    
    public static void main(String[] args) {
        
        // Collection<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Collection<Integer> ages = Set.of(25, 30, 35);

        // CollectionUtility.print(names);  // Output: Alice Bob Charlie
        // CollectionUtility.print(ages);

    

    }


   
}

