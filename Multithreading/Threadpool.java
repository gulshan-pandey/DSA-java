import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Create a thread pool of size 5
        
        for (int i = 0; i < 10; i++) { // Submit 10 tasks
            Runnable task = new MyTask(i);
            executor.submit(task); // Submit task to the executor
        }
        
        executor.shutdown(); // Shutdown the executor after all tasks are completed
    }
    
    static class MyTask implements Runnable {
        private final int taskId;
        
        MyTask(int taskId) {
            this.taskId = taskId;
        }
        
        @Override
        public void run() {
            System.out.println("Task " + taskId + " is running on thread: " + Thread.currentThread().getName());
        }
    }
}
