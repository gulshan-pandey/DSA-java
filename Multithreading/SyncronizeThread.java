package Multithreading;
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    // by using syncronized : helps to make precise calculations and ensures that only one thread can execute a block o code at a time

    public int getCount() {
        return count;
    }
}

class Runcounter extends Thread {

    private Counter counter;

    public Runcounter(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class SyncronizeThread {
    public static void main(String[] args) throws InterruptedException {

        double startTime = System.currentTimeMillis();
        Counter c1 = new Counter();

        Runcounter c2 = new Runcounter(c1);
        Runcounter c3 = new Runcounter(c1);

        // c2.start(); // we can also use this method to avoid irregularities but there
        // is no benifit of multithreading here!
        // c2.join();
        // c3.start();
        // c3.join();

        c2.start();
        c3.start();

        try {

            c2.join(); // and
            c3.join(); // should be in this trycatch block

        } catch (InterruptedException e) {
            System.out.println("interrupted!!!");
        }

        double endTime = System.currentTimeMillis();

        System.out.printf("%d : time-taken  %f", c1.getCount(), (endTime - startTime));



    }

}
