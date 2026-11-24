import java.util.concurrent.atomic.AtomicInteger;

class SharedObj {

    /* Notes
     - Every thread keeps a local copy of all the variables in its Cache And every thread has its own cache For performance reasons . Whenever a thread sees a variable, it store its state in its cache.
    */

    private volatile boolean flag = false;          // We need to make this variable volatile Otherwise The reader thread Will have the older copy of this And will not update its value unless it is volatile

    public void  setFlagTrue() {

        System.out.println("writer thread made the flag true");
        flag = true;
    }

    public void printIfFlagTrue() {

        while (!flag) {
            // do nothing (busy waiting)
        }

        System.out.println("Flag is true!");
    }




    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

public class VolatileAndAtomicExample {

    public static void main(String[] args) throws Exception {

        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(() ->
                sharedObj.printIfFlagTrue()
        );

        writerThread.start();
        readerThread.start();




        // Atomic
        /*
        Provide atomic, thread-safe operations.
        Commonly use CAS (Compare-And-Set).
        No explicit lock required for individual atomic operations
        */



        SharedObj resource = new SharedObj();

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                resource.increment();
            }

        });

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                resource.increment();
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + resource.getCount());
    }
}
 






