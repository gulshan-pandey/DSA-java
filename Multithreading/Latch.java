import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



//CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of operations being performed in other threads completes. 
// COuntDownLatch is not reusable

public class Latch {
    
    public static void main(String[] args) {
        
        int NumberOfWork =3;
    
        ExecutorService executor = Executors.newFixedThreadPool(NumberOfWork);
        CountDownLatch latch = new CountDownLatch(NumberOfWork);
        executor.submit(new DependentService(latch));
        executor.submit(new DependentService(latch));
        executor.submit(new DependentService(latch));

        try {
            // latch.await();
            latch.await(4,TimeUnit.SECONDS);  //Causes the current thread to wait until the latch has counted down to zero

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All dependent services have completed their work. Proceeding with main thread execution.");
        executor.shutdown();
    }


}

class DependentService implements Callable<String>{

    private CountDownLatch latch;

    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    public String call() throws Exception {
        try{

            Thread.sleep(5000);
            System.out.println("Dependent Service " + Thread.currentThread().getName()+ "  Work Started ");
        }finally{
            latch.countDown();
        }

        return "Done";
    }
}
