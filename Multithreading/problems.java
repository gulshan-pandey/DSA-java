
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


 
//Wap create a fixed thred pool with a specified number of threads using fixedThread,submit multiple tasks to the executor,where each task should print the current thread's name and sleep for a random time between 100 and 500 millisec.

class que2 implements Runnable{
private int number;

  public que2(int number) {
    this.number = number;
}

public void run(){

    for(int i = 1;i<=10;i++){
            try {
                Thread.sleep((long)(Math.random()*400)+100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + number);
        }
}



}





public class problems{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        que2 q1 = new que2(1);
        que2 q12= new que2(2);
        que2 q13 = new que2(3);
        que2 q14 = new que2(4);
        que2 q15 = new que2(5);
            executor.submit(q1);
            executor.submit(q12);
            executor.submit(q13);
            executor.submit(q14);
            executor.submit(q15);
             //this is wrapped in try with resoucess in which twe dont need to shutdown the executor ...try with resourse will take care of this
        }
    }
