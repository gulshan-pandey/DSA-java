import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


// CountDownLatch is a synchronization aid that allows one or more threads to wait
// until a set of operations being performed in other threads completes.

// CountDownLatch is not reusable.

// CountDownLatch allows multiple threads to perform independent work,
// while another thread waits for all of them to finish.

public class Latch {

    public static void main(String[] args) {

        // =====================================================
        //                  EXAMPLE 1
        //                  COUNTDOWNLATCH
        // =====================================================

        System.out.println("\n========== COUNTDOWNLATCH EXAMPLE ==========\n");

        int numberOfWorkers = 3;

        ExecutorService executor1 =
                Executors.newFixedThreadPool(numberOfWorkers);

        CountDownLatch latch = new CountDownLatch(numberOfWorkers);

        executor1.submit(new DependentService(latch, 1));
        executor1.submit(new DependentService(latch, 2));
        executor1.submit(new DependentService(latch, 3));

        System.out.println("Main Thread: Waiting for all dependent services...");

        try {
            latch.await();

            // latch.await(4, TimeUnit.SECONDS);
            // Causes the current thread to wait until the latch has counted down to zero.
            // The timed version returns false if the timeout expires before the counter reaches zero.

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nMain Thread: All dependent services have completed.");
        System.out.println("Main Thread: Proceeding with further execution.\n");

        executor1.shutdown();


        // =====================================================
        //                  EXAMPLE 2
        //                  CYCLICBARRIER WITH EXECUTOR
        // =====================================================


        // CyclicBarrier - It allows multiple threads to wait for each other
        // until all participating threads reach a common synchronization point.

        // And doesn't block the Main thread directly.
        // Only the threads calling barrier.await() get blocked.
        // Main thread can continue executing if it doesn't call barrier.await().


        System.out.println("\n========== CYCLICBARRIER WITH EXECUTOR ==========\n");

        int noOfWorkers = 3;

        ExecutorService executor2 =
                Executors.newFixedThreadPool(noOfWorkers);

        CyclicBarrier barrier = new CyclicBarrier(noOfWorkers);

        executor2.submit(new DependentService2(barrier, 1));
        executor2.submit(new DependentService2(barrier, 2));
        executor2.submit(new DependentService2(barrier, 3));

        System.out.println(
                "Main Thread: All tasks submitted. I am not waiting at the barrier."
        );

        executor2.shutdown();

        try {

            // This is different from CyclicBarrier.await().
            // Here, the Main thread waits for the ExecutorService to terminate.
            executor2.awaitTermination(10, TimeUnit.SECONDS);


            // making the main thread to print ------------ till 10 sec

            // long startTime = System.currentTimeMillis();
            // long duration = 10000; // 10 seconds

            // while (System.currentTimeMillis() - startTime < duration) {
            //     System.out.print("-"); // Print a dash
            //     try {
            //         Thread.sleep(50); // Sleep for a short duration to control printing speed
            //     } catch (InterruptedException e) {
            //         System.out.println("Main thread interrupted.");
            //     }
            // }






        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nMain Thread: All CyclicBarrier tasks have completed.\n");


        // =====================================================
        //                  EXAMPLE 3
        //                  CYCLICBARRIER WITH MANUAL THREADS
        // =====================================================


        // Another example of CyclicBarrier

        System.out.println("\n========== CYCLICBARRIER WITH MANUAL THREADS ==========\n");

        CyclicBarrier manualBarrier = new CyclicBarrier(3);

        Runnable task = () -> {

            String name = Thread.currentThread().getName();

            System.out.println(name + " started working");

            try {

                Thread.sleep(
                        (long) (Math.random() * 3000)
                );

                System.out.println(name + " reached the barrier");

                manualBarrier.await();

                System.out.println(name + " continued execution");

            } catch (InterruptedException | BrokenBarrierException e) {

                System.out.println(name + " could not pass the barrier");

                Thread.currentThread().interrupt();
            }
        };

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");
        Thread t3 = new Thread(task, "Worker-3");

        t1.start();
        t2.start();
        t3.start();

        try {

            // Main thread waits for all three manually created threads to finish.
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nMain Thread: All examples completed.");







        // ==========================================
        // EXAMPLE 4: REAL-LIFE EXAMPLE OF CYCLIC BARRIER
        // COORDINATED SYSTEM STARTUP
        // ==========================================

        System.out.println("\n========== EXAMPLE 4: SYSTEM STARTUP ==========");

        int numberOfSubsystems = 4;

        // Creating a CyclicBarrier for 4 subsystems.
        // The barrier action will execute when all 4 subsystems reach the barrier.
        CyclicBarrier startupBarrier = new CyclicBarrier(numberOfSubsystems, new Runnable() {
            @Override
            public void run() {
                System.out.println("\nAll subsystems are up and running. System startup complete.");    // This will be executed once all 4 subsystems reach the barrier.
            }
        });

        // Creating separate threads for each subsystem.
        Thread webServerThread = new Thread(
                new Subsystem("Web Server", 2000, startupBarrier));

        Thread databaseThread = new Thread(
                new Subsystem("Database", 4000, startupBarrier));

        Thread cacheThread = new Thread(
                new Subsystem("Cache", 3000, startupBarrier));

        Thread messagingServiceThread = new Thread(
                new Subsystem("Messaging Service", 3500, startupBarrier));

        // Starting all four subsystem threads.
        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();

        // Main thread waits until all four subsystem threads finish.
        // try {
        //     webServerThread.join();
        //     databaseThread.join();
        //     cacheThread.join();
        //     messagingServiceThread.join();

        //     System.out.println("\nAll subsystem threads have finished.");

        // } catch (InterruptedException e) {
        //     Thread.currentThread().interrupt();
        //     System.out.println("Main thread was interrupted.");
        // }

    }
}






class Subsystem implements Runnable {

    private String name;
    private int initializationTime;
    private CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {

        try {
            System.out.println(name + " initialization started.");

            Thread.sleep(initializationTime); // Simulate time taken to initialize

            System.out.println(name + " initialization complete.");

            // Wait until all four subsystems complete initialization.
            barrier.await();


        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();

        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}







class DependentService implements Callable<String> {

    private CountDownLatch latch;
    private int serviceId;

    public DependentService(CountDownLatch latch, int serviceId) {
        this.latch = latch;
        this.serviceId = serviceId;
    }

    public String call() throws Exception {

        try {

            System.out.println(
                    "Service " + serviceId + " | " +
                    Thread.currentThread().getName() +
                    " | Work Started"
            );

            Thread.sleep(5000);

            System.out.println(
                    "Service " + serviceId + " | " +
                    Thread.currentThread().getName() +
                    " | Work Completed"
            );

        } finally {

            // Decreases the CountDownLatch counter by 1.
            // Even if an exception occurs, this worker signals its completion.
            latch.countDown();

        }

        return "Done";
    }
}


class DependentService2 implements Callable<String> {

    private CyclicBarrier barrier;
    private int serviceId;

    public DependentService2(CyclicBarrier barrier, int serviceId) {
        this.barrier = barrier;
        this.serviceId = serviceId;
    }

    public String call() throws Exception {

        System.out.println(
                "Service " + serviceId + " | " +
                Thread.currentThread().getName() +
                " | Work Started"
        );

        Thread.sleep(1000);

        System.out.println(
                "Service " + serviceId + " | " +
                Thread.currentThread().getName() +
                " | Reached the barrier and is waiting"
        );

        barrier.await();

        System.out.println(
                "Service " + serviceId + " | " +
                Thread.currentThread().getName() +
                " | Barrier released. Continuing execution"
        );

        return "Done";
    }
}












/*



import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.atomic.AtomicInteger;

public class MatrixMultiplicationCyclicBarrier {

    static int[][] A = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    static int[][] B = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    static int[][] C = new int[4][4];

    public static void main(String[] args) throws InterruptedException {

        int numberOfWorkers = 2;
        int totalRounds = 2;

        AtomicInteger roundCounter = new AtomicInteger(0);

        // Both workers must finish their current round
        // before moving to the next round.
        CyclicBarrier barrier = new CyclicBarrier(numberOfWorkers, () -> {

            int completedRound = roundCounter.incrementAndGet();

            System.out.println(
                    "\n========== ROUND " + completedRound
                            + " COMPLETED =========="
            );
        });

        Thread worker1 = new Thread(
                new MatrixWorker(0, numberOfWorkers, totalRounds, barrier),
                "Worker-1"
        );

        Thread worker2 = new Thread(
                new MatrixWorker(1, numberOfWorkers, totalRounds, barrier),
                "Worker-2"
        );

        worker1.start();
        worker2.start();

        // Main thread waits for both workers to finish.
        worker1.join();
        worker2.join();

        System.out.println("\nFinal Result Matrix:");

        printMatrix(C);
    }

    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    static class MatrixWorker implements Runnable {

        private int workerId;
        private int numberOfWorkers;
        private int totalRounds;
        private CyclicBarrier barrier;

        public MatrixWorker(
                int workerId,
                int numberOfWorkers,
                int totalRounds,
                CyclicBarrier barrier
        ) {
            this.workerId = workerId;
            this.numberOfWorkers = numberOfWorkers;
            this.totalRounds = totalRounds;
            this.barrier = barrier;
        }

        @Override
        public void run() {

            try {

                for (int round = 0; round < totalRounds; round++) {

                    // Each worker gets a different row in each round.
                    int row = round * numberOfWorkers + workerId;

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " started calculating row " + row
                    );

                    // Calculate one complete row of the result matrix.
                    for (int col = 0; col < B[0].length; col++) {

                        int sum = 0;

                        for (int k = 0; k < B.length; k++) {

                            sum += A[row][k] * B[k][col];

                        }

                        C[row][col] = sum;
                    }

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " completed row " + row
                    );

                    // Wait until every worker completes its current round.
                    System.out.println(
                            Thread.currentThread().getName()
                                    + " waiting at CyclicBarrier..."
                    );

                    barrier.await();

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " proceeding to next round."
                    );
                }

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                e.printStackTrace();

            } catch (BrokenBarrierException e) {

                System.out.println(
                        Thread.currentThread().getName()
                                + " encountered a broken barrier."
                );
            }
        }
    }
}




*/