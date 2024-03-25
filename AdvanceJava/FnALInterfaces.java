package AdvanceJava;

public class FnALInterfaces {
    

    public static void main(String[] args) {
        Runnable runnable = () -> {            // using lambda expression in runnable interface
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, World!");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();




    }
}
