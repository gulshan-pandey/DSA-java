package DSA;

import java.util.Arrays;

public class DesignCircularQueue {
    

    /**
     * 
     * Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle, and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".

        One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.

        Implement the MyCircularQueue class:

        MyCircularQueue(k) Initializes the object with the size of the queue to be k.
        int Front() Gets the front item from the queue. If the queue is empty, return -1.
        int Rear() Gets the last item from the queue. If the queue is empty, return -1.
        boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
        boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
        boolean isEmpty() Checks whether the circular queue is empty or not.
        boolean isFull() Checks whether the circular queue is full or not.
        You must solve the problem without using the built-in queue data structure in your programming language. 

        

        Example 1:

        Input
        ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
        [[3], [1], [2], [3], [4], [], [], [], [4], []]
        Output
        [null, true, true, true, false, 3, true, true, true, 4]

        Explanation
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
        myCircularQueue.Rear();     // return 3
        myCircularQueue.isFull();   // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(4); // return True
        myCircularQueue.Rear();     // return 4
        

        Constraints:

        1 <= k <= 1000
        0 <= value <= 1000
        At most 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, and isFull.
     */
}



// naieve soltion is to use array and keep track of front and rear pointer, and loop into the array in almost every operation, but that will be O(n) time complexity for every operation, we can do better than that by using linked list and keep track of front and rear pointer, and loop into the linked list in almost every operation, but that will be O(n) time complexity for every operation, we can do better than that by using circular linked list and keep track of front and rear pointer, and loop into the circular linked list in almost every operation, but that will be O(1) time complexity for every operation.


class MyCircularQueue {
    int[] queue;
    int front =-1;
    int rear =-1;
    int n;
    public MyCircularQueue(int k) {
        queue = new int[k];

        Arrays.fill(queue,-1);
        n = k;
    }
    
    public boolean enQueue(int value) {
        boolean flag = false;

        for(int num : queue){
            if(num<0){
                flag = true;
            }
        } 

        if(!flag) return false;


        if(front ==-1){
            front++;
            queue[front] = value;
            rear = front;
        }else{

            rear = (rear+1)% n ;
            queue[rear]= value;
        }
            return true;


    }
    
    public boolean deQueue() {
        boolean flag = false;
        for(int num : queue){
            if(num>=0){
                flag = true;
            }
        } 

        if(!flag) return false;

        if(front == rear ){
            queue[front] = -1;
            front =-1;
            rear =-1;
        }
        else{

            queue[front]= -1;
            front = (front+1) % n;
        }
        return true;

    }
    
    public int Front() {
        
        if(front ==-1) return -1;
        return queue[front];
    }
    
    public int Rear() {

        if(rear==-1) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        for(int num : queue){
            if(num>=0){
                return false;
            }
        }
        return true;
    }
    
    public boolean isFull() {
        for(int num : queue){
           if(num<0){
            return false;
           }
        }
        return true;
    }
}




// if we introduce the size variable then it whould save us every time we have to loop through the array to check if it is full or empty, and also in enqueue and deueue operarions



// class MyCircularQueue {
//     int[] queue;
//     int front = -1;
//     int rear = -1;
//     int n;
//     int size = 0;

//     public MyCircularQueue(int k) {
//         queue = new int[k];
//         n = k;
//     }

//     public boolean enQueue(int value) {

//         if (size == n) return false;

//         if (front == -1) {
//             front = 0;
//             rear = 0;
//         } else {
//             rear = (rear + 1) % n;
//         }

//         queue[rear] = value;
//         size++;

//         return true;
//     }

//     public boolean deQueue() {

//         if (size == 0) return false;

//         if (front == rear) {
//             front = -1;
//             rear = -1;
//         } else {
//             front = (front + 1) % n;
//         }

//         size--;

//         return true;
//     }

//     public int Front() {
//         if (size == 0) return -1;
//         return queue[front];
//     }

//     public int Rear() {
//         if (size == 0) return -1;
//         return queue[rear];
//     }

//     public boolean isEmpty() {
//         return size == 0;
//     }

//     public boolean isFull() {
//         return size == n;
//     }
// }




// one another simplest approach, and redable as well



// class MyCircularQueue {
//         final int[] a;
//         int front = 0, rear = -1, len = 0;

//         public MyCircularQueue(int k) { a = new int[k];}

//         public boolean enQueue(int val) {
//             if (!isFull()) {
//                 rear = (rear + 1) % a.length;
//                 a[rear] = val;
//                 len++;
//                 return true;
//             } else return false;
//         }

//         public boolean deQueue() {
//             if (!isEmpty()) {
//                 front = (front + 1) % a.length;
//                 len--;
//                 return true;
//             } else return false;
//         }

//         public int Front() { return isEmpty() ? -1 : a[front];}

//         public int Rear() {return isEmpty() ? -1 : a[rear];}

//         public boolean isEmpty() { return len == 0;}

//         public boolean isFull() { return len == a.length;}
//     }





// Linked List solution


// class Node {
//     int val;
//     Node next;

//     public Node(int val){
//         this.val = val;
//     }
// }


// class MyCircularQueue {

//     Node front= null;
//     Node  rear = null;
//     int capacity;
//     int size=0;


   
//     public MyCircularQueue(int k) {
//         capacity=k;

//     }
    
//     public boolean enQueue(int value) {

//         if(size == capacity) return false;

//         Node newNode = new Node(value);

//         if(front == null){
//             front = newNode;
//             rear = newNode;

//             rear.next = front;
//         }else{
//             newNode.next = front;
//             rear.next = newNode;
//             rear = newNode;
//         }
//         size ++;
//         return true;
//     }
    
//     public boolean deQueue() {
//         if(size ==0){
//             return false;
//         }

//         if(front == rear){
//             front = null;
//             rear  = null;
//         }else{
//             front = front.next;
//             rear.next = front;
//         }
//         size --;
//         return true;
//     }
    
//     public int Front() {
//         if(front == null) return -1;
//         return front.val;
//     }
    
//     public int Rear() {
//         if(rear == null) return -1;
//         return rear.val;
//     }
    
//     public boolean isEmpty() {
//         return size ==0;
//     }
    
//     public boolean isFull() {
//         return size == capacity;
//     }
// }
