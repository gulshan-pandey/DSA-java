
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Executor service is a framework use to manage and execute threads without manually managing the thread lifecycle 

class Executor implements Runnable {
    private String sign;

    public Executor(String n) {
        this.sign = n;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j <= i; j++) {
                try {
                    Thread.sleep(50);
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
        // ExecutorService single = Executors.newSingleThreadExecutor(); //initializing
        // only single thread to print the pattern correctly
        // single.submit(work);
        // single.submit(work2);
        // single.submit(work3);
        // single.shutdown();

        // for multiple threads---------

        // ExecutorService single = Executors.newFixedThreadPool(3); //3 threads this
        // multithreading leads to the randomization of patterns
        // single.submit(work);
        // single.submit(work2);
        // single.submit(work3);
        // single.shutdown();
        // single.shutdown();

        // double starttim= System.currentTimeMillis();

        // ExecutorService multiple = Executors.newFixedThreadPool(10); //initialized
        // threadpool
        // for(int i= 0;i<10;i++){
        // Executor work = new Executor((i+"a"));
        // multiple.submit(work);
        // }

        // multiple.shutdown();

        // multiple.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS); // this
        // code is used as Thread.join() in exector's sense, it basically means that
        // wait for long.Max_VALUE millisecond and let the executor service execute the
        // program

        // double etim= System.currentTimeMillis();

        // System.out.println("total time taken by the program : " + (etim-starttim));

        // suppose we want all task to be done in specific period of time and othervise
        // shutdown anyway

        // if(!multiple.awaitTermination(2, TimeUnit.SECONDS)){
        // multiple.shutdownNow();
        // System.out.println("time-out hogya ji");
        // double etim= System.currentTimeMillis();

        // System.out.println(etim-stim);

        // InvokeAll() method is used to submit a collection of tasks to the executor
        // service and wait for all of them to complete.
        /*
         * - invokeAll() → Executes all submitted tasks and returns results of all
         * tasks.
         * - invokeAny() → Executes submitted tasks and returns the result of one
         * successfully completed task (the first successful completion).
         * 
         */

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(

                () -> {
                    Thread.sleep(2000);
                    return "User details fetched";
                },

                () -> {
                    Thread.sleep(3000);
                    return "Product details fetched";
                },

                () -> {
                    Thread.sleep(1000);
                    return "Order details fetched";
                });

        System.out.println("Submitting all tasks...");

        // List<Future<String>> results = executor.invokeAll(tasks);
        List<Future<String>> results = executor.invokeAll(tasks, 2, TimeUnit.SECONDS);
        System.out.println("Timed wait finished; unfinished tasks may be cancelled.");

        for (Future<String> future : results) {
            try {
                System.out.println(future.get());
            } catch (java.util.concurrent.CancellationException e) {
                System.out.println("Task was cancelled");
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        // executor.shutdown();

        /*
         * Now imagine three servers providing the same information.
         * - Server 1 takes 5 seconds.
         * - Server 2 takes 2 seconds.
         * - Server 3 takes 3 seconds.
         * You only need the result from one server. You don't need to wait for all
         * three.
         * 
         * This is where invokeAny() becomes useful.
         */

        // ExecutorService executor = Executors.newFixedThreadPool(3); // I will use the same executor service as above... reusablity😇

        List<Callable<String>> tasks2 = Arrays.asList(

                () -> {
                    Thread.sleep(2000);
                    return "Response from Server 2";
                },
                () -> {
                    Thread.sleep(5000);
                    return "Response from Server 1";
                },

                () -> {
                    Thread.sleep(3000);
                    return "Response from Server 3";
                });

        System.out.println("Sending requests to servers Using invokeAny()...");

        String result = null;
        try {
            // result = executor.invokeAny(tasks2);
            result = executor.invokeAny(tasks2, 3, TimeUnit.SECONDS);
            System.out.println("First successful result: " + result);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }
}




// A dummy Industry standard code for implementing threadPool

/* 

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExample {

    public static void main(String[] args) {

        ThreadFactory threadFactory = new ThreadFactory() {

            private final AtomicInteger counter = new AtomicInteger(1);

            @Override
            public Thread newThread(Runnable task) {
                return new Thread(
                    task,
                    "worker-" + counter.getAndIncrement()
                );
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            4,                              // Core pool size
            8,                              // Maximum pool size
            60,                             // Keep alive time
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(200),  // Bounded task queue
            threadFactory,
            new ThreadPoolExecutor.AbortPolicy()
        );

        try {
            // Submit tasks
            for (int i = 1; i <= 10; i++) {

                final int taskId = i;

                Future<?> future = executor.submit(() -> {

                    System.out.println(
                        "Executing task " + taskId +
                        " on " + Thread.currentThread().getName()
                    );

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    System.out.println("Task " + taskId + " completed");
                });
            }

            // Pool monitoring
            System.out.println("Active threads: " +
                    executor.getActiveCount());

            System.out.println("Pool size: " +
                    executor.getPoolSize());

            System.out.println("Queued tasks: " +
                    executor.getQueue().size());

            System.out.println("Completed tasks: " +
                    executor.getCompletedTaskCount());

        } catch (RejectedExecutionException e) {
            System.err.println("Task rejected: " + e.getMessage());

        } finally {

            // Graceful shutdown
            executor.shutdown();

            try {
                if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }

            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }
}



*/