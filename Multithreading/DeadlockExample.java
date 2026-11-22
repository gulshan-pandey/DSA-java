public class DeadlockExample {

    public static void main(String[] args) {

        Object pen = new Object();
        Object paper = new Object();

        // Student 1
        Thread student1 = new Thread(() -> {

            synchronized (pen) {
                System.out.println("Student 1 acquired the Pen");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Student 1 is waiting for Paper");

                synchronized (paper) {
                    System.out.println("Student 1 acquired the Paper");
                }
            }
        });

        // Student 2
        Thread student2 = new Thread(() -> {

            synchronized (paper) {
                System.out.println("Student 2 acquired the Paper");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Student 2 is waiting for Pen");

                synchronized (pen) {
                    System.out.println("Student 2 acquired the Pen");
                }
            }
        });

        student1.start();
        student2.start();
    }
}





// fixed deadlock 

/**
 
public class DeadlockExample {

    public static void main(String[] args) {

        Object pen = new Object();
        Object paper = new Object();

        // Student 1
        Thread student1 = new Thread(() -> {

            synchronized (pen) {
                System.out.println("Student 1 acquired the Pen");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Student 1 is waiting for Paper");

                synchronized (paper) {
                    System.out.println("Student 1 acquired the Paper");
                }
            }
        });

        // Student 2
        Thread student2 = new Thread(() -> {

            synchronized (pen) {  // Changed: acquire Pen first
                System.out.println("Student 2 acquired the Pen");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Student 2 is waiting for Paper");

                synchronized (paper) {  // Then acquire Paper
                    System.out.println("Student 2 acquired the Paper");
                }
            }
        });

        student1.start();
        student2.start();
    }
}

 */


/*
 Earlier code has this problem:
- Student 1: Pen → Paper
- Student 2: Paper → Pen

now In the fixed version:
- Student 1: Pen → Paper
- Student 2: Pen → Paper

*/