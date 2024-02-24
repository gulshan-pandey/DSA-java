import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    //First in first out

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        for(Integer i:queue){
            System.out.print(i +  " " );
        }
        System.out.println("\n");

        System.out.println(queue.peek()); //will see throught eh element  at the tail and cannot give exception
 
        System.out.println(queue.element());//can give exception if the queue is empty
        
        System.out.println(queue.remove()); //will remove 1 from the end
        System.out.println(queue.poll()); //will remove 2 from the end and return null if empty queue
        CollectionUtility.print(queue);  //is a utility class to print collections



    }
}
