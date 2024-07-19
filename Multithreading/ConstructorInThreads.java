class constr extends Thread {
    public constr(String name) {    //constructor
        super(name);        //set the name of thread
    }

    public void run() {
        String name = "john";
        System.out.println("Hi, my name is " + name);

        for (int i = 0; i < 200; i++) {
            System.out.println("I am your top supporter! " + getId());
        }

        synchronized (this) {
            notifyAll(); // Notify all waiting threads
        }
    }
}

public class ConstructorInThreads {
    public static void main(String[] args) {
        constr c = new constr("vscode");            // here we are assigning the thread name
        constr c2 = new constr("pycharm");

        synchronized (c) {
            c.start();
            try {
                c.wait(); // Wait for c to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The ID of my thread is: " + c.getId());
        System.out.println("The name of my thread is: " + c.getName());

        c2.start();

        System.out.println("The ID of c2 is: " + c2.getId());
        System.out.println("The name of my thread is: " + c2.getName());
    }
}
