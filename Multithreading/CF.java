import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CF {
    

    public static void main(String[] args) {

       CompletableFuture<String> completableFuture =  CompletableFuture.supplyAsync(() ->{                      // this will take the suppliar bydefault it is daemon, unless we do the .get methods of this

            try{
                Thread.sleep(3000);
                System.out.println("Worker ");
            }catch(Exception e){
                System.out.println(e);
            }
            return "ok";
        });
        
        System.out.println("Main thread continues ");
        
        System.out.println(completableFuture);
        // String result = completableFuture.join();       // now main thread will wait for its result, unless it is a daemon thread and the main will move on 
        
        String s = completableFuture.getNow("this is the default value");
        
        System.out.println(s);
        
        
        String s2 = null;
        try {
            s2 = completableFuture.get();       // now also the main thread wil wait for result
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        System.out.println(s2);
        
        
        CompletableFuture<String> cf2 =  CompletableFuture.supplyAsync(() ->{                     
 
             try{
                 Thread.sleep(2000);
                 System.out.println("Worker 2");
             }catch(Exception e){
                 System.out.println(e);
             }
             return "ok";
         });


         CompletableFuture <Void> f = CompletableFuture.allOf(completableFuture,cf2);        //Returns a new CompletableFuture that is completed when all of the given CompletableFutures complete

         f.join();      // the join method doesnot throws the exception but the .get() method throws, but both methods does the same thing
         
        System.out.println("All tasks completed completableFuture,cf2");

        // the runAsync method for asynchronous task does not return anything.
        CompletableFuture<Void> future =
        CompletableFuture.runAsync(() -> {

            System.out.println("Sending email...");

            System.out.println("Email sent successfully.");

        });

        future.join();




        //chainings
          
        CompletableFuture<String> cf3 =  CompletableFuture.supplyAsync(() ->{                      
 
             try{
                 Thread.sleep(2000);
                 System.out.println("Worker 2");
             }catch(Exception e){
                 System.out.println(e);
             }
             return "ok";
         }).orTimeout(1, TimeUnit.SECONDS).exceptionally(v -> "Timeout Occurred");


         System.out.println(cf3.join());





         //we can also provide your own executor

        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<Integer> future2 =
                CompletableFuture.supplyAsync(() -> 10, executor)
                        .thenApplyAsync(number -> number * 2, executor);

        System.out.println(future2.join());

        executor.shutdown();









