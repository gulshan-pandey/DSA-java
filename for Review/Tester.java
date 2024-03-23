


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class que2 implements Runnable {
    private int number;

    public que2(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep((long) (Math.random() * 4000) + 1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
                return; // Exit the thread if interrupted
            }
            System.out.println(Thread.currentThread().getName() + number);
        }
    }
}

public class Tester {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        try {
            // Keep track of Futures for tasks
            List<Future<?>> futures = new ArrayList<>();
            for (int i = 0; i <= 5; i++) {
                que2 task = new que2(i);
                futures.add(executor.submit(task));
            }
            // Set timeout for each task
            for (Future<?> future : futures) {
                try {
                    future.get(5, TimeUnit.SECONDS);
                } catch (Exception e) {
                    // Task didn't complete in time, cancel it
                    future.cancel(true);
                    System.out.println("Task cancelled due to timeout");
                }
            }
        } finally {
            executor.shutdownNow(); // Shutdown the executor
        }
    }
}
