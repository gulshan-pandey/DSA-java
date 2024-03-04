import java.util.*;
 
//this is the utility class to print all the elements to the specified collection and can be used by any class

public class CollectionUtility {
    
    public static <E> void print(Collection <E> collection){  //here E is generic
       System.out.print("the Collection is : ");
        for (E obj : collection) {
            System.out.print(obj + " ");
        }
        System.out.println("\n");
    }

    
    public static void main(String[] args) {
          
        
        // Collection<String> names = Arrays.asList("Alice", "Bob", "Charlie");       //this method is used to convert an array into a fixed-size list

        // System.out.println("class name is : "  + names.getClass());  //ArrayList
        // Collection<Integer> ages = Set.of(25, 30, 35);

        // CollectionUtility.print(names);  // Output: Alice Bob Charlie
        // CollectionUtility.print(ages);

        // Queue<Integer> queue = new LinkedList<>();

        // queue.add(1);
        // queue.offer(2);
        // queue.offer(3);
        // queue.offer(4);
        // queue.offer(5);


        // CollectionUtility.print(queue);


    }


   
}

