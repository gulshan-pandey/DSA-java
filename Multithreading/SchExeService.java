import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchExeService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> System.out.println("scheduling the task "),
                             3,
                            TimeUnit.SECONDS);

        // scheduler.shutdown();
                   



        // Schedule a task to run at a fixed rate of every 3 seconds                    
        ScheduledFuture<?> fixedRate = scheduler.scheduleAtFixedRate(() -> {
            System.out.println(" Scheduling task at every 3 second of delay");
        }, 1, 3, TimeUnit.SECONDS);


        // we need to do it because the scheduler will keep running until we shutdown it manually and also the simple scheduler.shutdown() will immediately end the program

        scheduler.schedule(() ->{
            System.out.println("initiating shutdown after 7seconds ");
            scheduler.shutdown();
        }
        , 7, TimeUnit.SECONDS);             



        // Schedule a task to run with a fixed delay of 2 seconds after the previous task completes

        ScheduledFuture<?> fixedDelay = scheduler.scheduleWithFixedDelay(()-> System.out.println("scheduleing task at fixed delay of 2 sec after every execution"), 5, 2, TimeUnit.SECONDS);


           scheduler.schedule(() -> {

            fixedRate.cancel(false);
            fixedDelay.cancel(false);

            scheduler.shutdown();

        }, 10, TimeUnit.SECONDS);



            
    /*

    Fixed-rate example

    Task duration = 5 seconds · Period = 2 seconds
    1. 0 seconds
    
    Task 1 starts.
    2. 5 seconds
    
    Task 1 finishes. Task 2 starts immediately because its scheduled start time has already passed.
    3. 10 seconds
    
    Task 2 finishes. Task 3 starts immediately.


    


    Fixed-delay example

    Task duration = 5 seconds · Delay = 2 seconds
    1. 0 seconds
    
    Task 1 starts.
    2. 5 seconds
    
    Task 1 finishes.
    3. 7 seconds
    
    Task 2 starts — 2 seconds after Task 1 finished.
    4. 12 seconds
    
    Task 2 finishes.
    5. 14 seconds
    
    Task 3 starts.

    */







    // NewCahcedThreadPool -- newCachedThreadPool() is a factory method of the Executors class that creates an ExecutorService with dynamically created and reusable worker threads.
    
    /*
    Core pool size = 0
    Maximum pool size = Integer.MAX_VALUE
    Keep-alive time = 60 seconds
    Work queue = SynchronousQueue
    Idle threads are reused.

    */
    ExecutorService executor = Executors.newCachedThreadPool();

    for (int i = 1; i <= 3; i++) {

        int taskId = i;

        executor.submit(() -> {

            System.out.println(
                "Task " + taskId +
                " executed by " + Thread.currentThread().getName()
            );

        });
    }

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }

    executor.submit(() -> {

        System.out.println(
            "New task executed by " + Thread.currentThread().getName()
        );

    });

    executor.shutdown();


    }
}





