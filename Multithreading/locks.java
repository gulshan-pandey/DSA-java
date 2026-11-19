
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class locks {

    public static void main(String[] args) {


        BankAccount sbi = new BankAccount();
        Runnable task = () -> sbi.withdraw(500);

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();
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
    