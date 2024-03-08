// WAP that creates 2 threads,each thread should print "hello from Thread X".whree X is the number of the thread(1 0r 2),ten times,then terminate

class ques1 extends Thread{
    private int x;

    ques1(int x){
        this.x = x;
    }
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.printf("(%d) HELLO from Thread - %d \n",i,x);
        }
    }
}


//WAP to start the Thread and print its each state(creation,starting and termination) use Thread.sleep() to simulate long running tasks and Thread.getState to print the thread's state

class ques2 extends Thread{

public void run(){
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println("from inside the run: " + getState());


}

}



public class practiceOnThreads2 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        
      //ques1  
    //   ques1 p1 = new ques1(1);
    //   ques1 p2 = new ques1(2);
    //   p1.start();
    //   p2.start();


    //ques2
     ques2 q2 = new ques2();
     System.out.println("creation of thread : " + q2.getState());
     q2.start();
     q2.join();
     System.out.println("Thread finished : " + q2.getState());


    }
}