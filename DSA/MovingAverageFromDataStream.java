package  DSA;
public class MovingAverageFromDataStream {
/**
    Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

    Implement the MovingAverage class:

    MovingAverage(int size) Initializes the object with the size of the window size.
    double next(int val) Returns the moving average of the last size values of the stream.

    
    Example 1:

    Input
    ["MovingAverage", "next", "next", "next", "next"]
    [[3], [1], [10], [3], [5]]
    Output
    [null, 1.0, 5.5, 4.66667, 6.0]
    Explanation
    MovingAverage movingAverage = new MovingAverage(3);
    movingAverage.next(1); // return 1.0 = 1 / 1
    movingAverage.next(10); // return 5.5 = (1 + 10) / 2
    movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
    movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3

 */

}

class MovingAverage {
    int[] arr ;
    int front =-1;
    int rear =-1;
    int sum =0;
    int size =0;
    public MovingAverage(int size) {
        arr = new int[size];
    }
    
    public double next(int val) {
        
        if(size== arr.length){
            sum-=arr[front];
            front = (front+1)%arr.length;
            rear = (rear+1)% arr.length;
            arr[rear] = val;
            sum+=val;
            return (double) sum/arr.length;
        }else if(front==-1){
            front++;
            arr[front]= val;
            rear ++;
            size++;
            sum+= val;
            return (double) sum/size;
        }else{
            rear = (rear+1)% arr.length;
            arr[rear]=val;
            size++;
            sum+=val;
            return (double) sum/size;
        }
        
        
    }
}