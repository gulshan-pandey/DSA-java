
class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    // by using syncronized : helps to make precise calculations and ensures that only one thread can execute a block of code at a time

    public int getCount() {
        return count;
    }
}



public class ModifiedSynchronizedThread {
    public static void main(String[] args) throws InterruptedException {

        double startTime = System.currentTimeMillis();    //initial time
        
        Counter counting = new Counter();
       Thread t1 = new Thread(() -> {
         for(int i = 0; i<1000;i++){
            counting.increment();
         }
       });

       
       Thread t2 = new Thread( ()-> {
        for(int i=0;i<1000;i++){
            counting.increment();
        }
       });

       Thread t3 = new Thread( ()-> {
        for(int i=0;i<1000;i++){
            counting.increment();
        }
       });
       Thread t4 = new Thread( ()-> {
        for(int i=0;i<1000;i++){
            counting.increment();
        }
       });
       
        // t1.start(); // we can also use this method to avoid irregularities but there
        // is no benifit of multithreading here!
        // t1.join();
        // t2.start();
        // t2.join();

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {

            t1.join(); // and
            t2.join(); // should be in this trycatch block
            t3.join();
            t4.join();

        } catch (InterruptedException e) {
            System.out.println("interrupted!!!");
        }

        double endTime = System.currentTimeMillis();

        System.out.printf("%d : time-taken  %f", counting.getCount(),  (endTime - startTime));



    }

}
