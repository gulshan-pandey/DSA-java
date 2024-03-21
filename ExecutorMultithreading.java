import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Executor implements Runnable {
    private String sign;

    public Executor(String n) {
        this.sign = n;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j <= i; j++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(sign + " ");
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

}

public class ExecutorMultithreading {
    public static void main(String[] args) throws InterruptedException {
        // Executor work = new Executor("@");
        // Executor work2 = new Executor("/");
        // Executor work3 = new Executor("~");
        // ExecutorService single = Executors.newSingleThreadExecutor(); //initializing only single thread to print the pattern correctly
        // single.submit(work);
        // single.submit(work2);
        // single.shutdown();



        //for 3 threads------------

        // ExecutorService single = Executors.newFixedThreadPool(3);
        // single.submit(work); 
        // single.submit(work2); 
        // single.submit(work3); 
        // single.shutdown();
        // single.shutdown();

        // for multiple threads---------

        double stim= System.currentTimeMillis();
        ExecutorService multiple = Executors.newFixedThreadPool(10);
        for(int i= 0;i<10;i++){
            Executor work = new Executor((i+"a"));
            multiple.submit(work);
        }
    
        multiple.shutdown();

        // multiple.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS); // this code is used as Thread.join() in exector's sence
        // double etim= System.currentTimeMillis();   

        // System.out.println(etim-stim);



        //suppose we want all task to be done in specific period of time and othervise shutdown anyway

        if(!multiple.awaitTermination(2, TimeUnit.SECONDS)){
           multiple.shutdownNow();
           System.out.println("time-out hogya ji");
        //    double etim= System.currentTimeMillis();   

        //    System.out.println(etim-stim);
        } 




    }

}

