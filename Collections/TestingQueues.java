package Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TestingQueues {

    //First in first out

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);    //can throw exception if the queue is full
        queue.offer(2);    // cannot throw exception if the queue is full,just return false
        queue.offer(5);
        queue.offer(3);
        queue.offer(4);








        for(Integer i:queue){
            System.out.print(i +  " " );
        }
        System.out.println("\n");

        CollectionUtility.print(queue);  //A utility class to print any collection

        System.out.println(queue.peek()); //will see throught the element  at the head and cannot give exception
 
        System.out.println(queue.element());//can give exception if the queue is empty
        
        System.out.println(queue.remove()); //will remove 1 from the end(head) ,can also throw exception
        System.out.println(queue.poll()); //will remove 2 from the end and return null if empty queue
        CollectionUtility.print(queue);  //is a utility class to print collections



    }
}
