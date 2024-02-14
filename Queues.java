import java.util.*;

public class Queues {
    
    public static void main(String[] args) {
        
        Queue <Integer>queue = new LinkedList<>();  //Queue is an interface, LinkedList is a class

        queue.add(1); //can give error if elements cannot be added
        queue.offer(2); 

        CollectionUtility.print(queue); //calling the utility class which will print all the elements of the collection

        System.out.println(queue.peek());  // the head of the queue is 1 because 1 entered earliest  ( fist in first out)
        System.out.println(queue.element());  // peek and element both used to view the head element but  element could give Exception but peek cannot

        System.out.println(queue.remove()); //remove can throw Exception of the Queue is empty

       System.out.println("elements in queue after deletion : "  ); CollectionUtility.print(queue);

       System.out.println("deleted element : " + queue.poll());
       CollectionUtility.print(queue); //empty


       //System.out.println(queue.remove()); //throws Exception

       System.out.println(queue.poll()); //doesnot throw Exception...will print null if the que is empty!

       
     
    }
}
