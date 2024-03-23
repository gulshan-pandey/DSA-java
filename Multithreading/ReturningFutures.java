import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FetchName implements Callable<String>{

    private final String name;

    public FetchName(String name) {
        this.name = name;
    }



    @Override
    public String call() throws Exception {
        System.out.println("calling the server using future...to get details");
        Thread.sleep(2000);
        return name + " programmer";
    }

 }

public class ReturningFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService services = Executors.newFixedThreadPool(2);
        FetchName task1 = new FetchName("jack");
        FetchName task2 = new FetchName("dora");
        FetchName task3 = new FetchName("peter");
        FetchName task4 = new FetchName("quill");


        // Future:  represents the result of an asynchronous computation. It provides a way to obtain the result of a task that is being executed concurrently.and informaton is retrieved using the "get()" method
        Future<String> name1 =  services.submit(task1);
        Future<String> name2 =  services.submit(task2);
        Future<String> name3 =  services.submit(task3);
        Future<String> name4 =  services.submit(task4);
 
        System.out.println(name1.get());  //now the  program will stop further executing in order to get the name form the call method(or from the server)
        System.out.println(name2.get());
        System.out.println(name3.get());
        System.out.println(name4.get());

        services.shutdown();
    }
}
