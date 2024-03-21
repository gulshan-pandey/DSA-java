package Multithreading;
class RunnThread implements Runnable {
    // runnable interface me run method ko define krna hota hai
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println(" winter is here...");
        }
    }
}

class RunnThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("here we implemented the another thread in winter");
        }
    }
}

// pattern through multithreading: note:- a real multithreading will ruin the patterns

class patterns implements Runnable{
    private String name;
    public patterns(String name){
      this.name = name;
    }
      public void run(){
        for(int i=0;i<=20;i++){
        for(int j=0;j<=i;j++){
          System.out.print(name);
        }
          System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName()+ " " +" completed");
      }
  }
public class RunnableInterface {
    public static void main(String[] args) {

        RunnThread bullet1 = new RunnThread();
        RunnThread2 bullet2 = new RunnThread2();

        Thread gun1 = new Thread(bullet1,"bc");  //this is necessary
        Thread gun2 = new Thread(bullet2,"bc2"); // this is the official thread class which is to be objectified and take our implemented object as input in it then kicked to start

        gun1.setPriority(Thread.MAX_PRIORITY);
        
        gun1.start();
        gun2.start();

        // new Thread(bullet1).start();  //both the ways are fine to work
        // new Thread(bullet2).start();

        System.out.println("my first thread id is : " + gun1.getId() );
        System.out.println("my first thread name is : " + gun1.getName() );
        System.out.println("my first thread is is : " + gun2.getId() );
        System.out.println("my first thread name is : " + gun2.getName() );



        //pattern through multithreading
        patterns task1 = new patterns ("*");
        patterns task2 = new patterns ("#");

        Thread func= new Thread(task1);
        Thread func2= new Thread(task2);
        func.start();
        func2.start();


        
    }
}
