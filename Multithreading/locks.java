
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

public class locks {

    public static void main(String[] args) {


        // BankAccount sbi = new BankAccount();
        // Runnable task = () -> sbi.withdraw(500);

        // Thread t1 = new Thread(task, "Thread-1");
        // Thread t2 = new Thread(task, "Thread-2");
        // t1.start();
        // t2.start();

        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}

class BankAccount {

    int balance = 1000;

    Lock lock = new ReentrantLock();

    public void withdraw(int amount) {

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {// try to acquire the lock for 1 second, returns true if  lock is acquired, false otherwise
                                                          
                System.out.println(Thread.currentThread().getName() + ": attempting to lock and withdraw " + amount);
                try {
                    if (balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + ": withdrawal of " + amount + " is successful");
                        balance -= amount;
                        Thread.sleep(3000); // simulate some processing time
                        System.out.println(Thread.currentThread().getName() + ": completed transaction: remaining balance is " + balance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + ": insufficient balance");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock(); // unlock the lock in finally block to avoid deadlock
                }

            } else {
                System.out.println(Thread.currentThread().getName() + ": could not acquire lock, try again later");
            }
        } catch (InterruptedException e) {
        //    Thread.currentThread().interrupt();   
            // System.out.println(Thread.currentThread().getName() + ": was interrupted while waiting for the lock");
            e.printStackTrace();
        }
    }

}




    // there is also a method called lock.tryLock() which will try to acquire the lock and return true if it is successful, otherwise it will return false. 
    // lock.lock() will block the thread until the lock is acquired, it is same as the synchronized block.




// why reentrent lock is reentrant? because it allows the same thread to acquire the lock multiple times without deadlocking.
// you can think it as entering a house, you can enter multiple rooms in the house without getting locked out, but if you try to enter a room that is already locked, you will be locked out. 
 class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();                // since the lock is Reeantrant, lock is reentrant, so the same thread can acquire the lock multiple times without deadlocking bcz same thread holds it
        try {
            System.out.println("Inner method");
        } finally {
            lock.unlock();
        }
    }
}




// READ WRITE LOCKS--- Allows multiple threads to read resources concurrently, as long as no thread is writing to it And it also ensures exclusive access of write operations.

class ReadWriteCounter{
    private  final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final  Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();

    int count =0;

    private void increment(){
        writeLock.lock();
        try {
            count++;
        } finally {
            writeLock.unlock();
        }
    }

    private int getCount(){
        readLock.lock();
        try{
            return count;

        }finally{
            readLock.unlock();
        }
    }



    public static void main(String[] args) {
        
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = () ->{
            for(int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName() + "  Read Count: " + counter.getCount());
                // try{
                //     Thread.sleep(100);
                // }catch(InterruptedException e){
                //     Thread.currentThread().interrupt();
                //     return;
                // }
            }
        };

        Runnable writeTask = () ->{
            for(int i=0; i<10; i++){
                counter.increment();
                System.out.println(Thread.currentThread().getName() +  " Incremented Count");
                // try{
                //     Thread.sleep(100);
                // }catch(InterruptedException e){
                //     Thread.currentThread().interrupt();
                //     return;
                // }
            }
        };

        Thread readThread1 = new Thread(readTask, "Read-Thread-1");
        Thread readThread2 = new Thread(readTask, "Read-Thread-2");
        Thread writeThread = new Thread(writeTask, "Write-Thread");

        readThread1.start();
        readThread2.start();
        writeThread.start();

    }

}