// WAP that creates 2 threads,each thread should print "hello from Thread X".whree X is the number of the thread(1 0r 2),ten times,then terminate

// class ques1 extends Thread {
//     private int x;

//     ques1(int x) {
//         this.x = x;
//     }

//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.printf("(%d) HELLO from Thread - %d \n", i, x);
//         }
//     }
// }

// WAP to start the Thread and print its each state(creation,starting and termination) use Thread.sleep() to simulate long running tasks and Thread.getState to print the thread's state

// class ques2 extends Thread {

//     public void run() {
//         try {
//             Thread.sleep(3000);
//         } catch (InterruptedException e) {
//             throw new RuntimeException(e);
//         }
//         System.out.println("from inside the run: " + getState());
//     }

// }

// ques3: wap to ensure that the 2nd thread starts only after the first thread ends and the thired thread starts only aftre second thread snds using the join mehtod.Each thread should print its start and end along with its name


class ques3 extends Thread {
    public int y;

    public ques3(int y) {
        this.y = y;
    }

    public void run() {
        try {
            System.out.printf("Thread-%d starting ,inside the run: %s \n", y, getState().toString());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}


// ques4 : WAP to create 3 threads representing 3 signals RED ,GREEN,BLUE .Each signal should be for a cretain time,then switch to next signal in order.Use sleep fot timing and syncronize to kae sure only one sgnal is active at a time

class Ques4 extends Thread{
   public final TrafficColor tr; //TrafficColor is an enum type

    public Ques4(TrafficColor tr){
        this.tr = tr;
    }
    
    public synchronized void run(){
        System.out.printf("Its %s light please have some patience \n",tr );
        try {
            Thread.sleep(tr.getTim());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.printf("%s light over\n",tr);
    }

}

//initilizing enum for traffic light
    enum TrafficColor{

        RED(5000) ,YELLOW(3000) ,GREEN(2000);

       private int tim;

        TrafficColor(int tim){
         this.tim = tim;
        }

        public int getTim(){
            return tim;
        }

    }


public class practiceOnThread2 {
    public static void main(String[] args) throws InterruptedException {

        // ques1
        // ques1 p1 = new ques1(1);
        // ques1 p2 = new ques1(2);
        // p1.start();
        // p2.start();


        // ques2
        // ques2 q2 = new ques2();
        // System.out.println("creation of thread : " + q2.getState());
        // q2.start();
        // q2.join();
        // System.out.println("Thread finished : " + q2.getState());


        // ques3
        // ques3 q3 = new ques3(1);
        // ques3 q32 = new ques3(2);
        // ques3 q33 = new ques3(3);
        // System.out.printf("creation of thread-%d : %s \n" ,q3.y,q3.getState());
        // q3.start();
        // q3.join();
        // System.out.println(q3.getState());

        // System.out.printf("creation of thread-%d : %s \n" ,q32.y,q32.getState());
        // q32.start();
        // q32.join();
        // System.out.println(q3.getState() );

        // System.out.printf("creation of thread-%d : %s \n" ,q33.y,q33.getState());
        // q33.start();
        // q33.join();
        // System.out.println(q3.getState());



        // ques4
        Ques4 red = new Ques4(TrafficColor.RED);
        Ques4 yellow = new Ques4(TrafficColor.YELLOW); 
        Ques4 green= new Ques4(TrafficColor.GREEN); 

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
        System.out.println("now you can go");

        


    }
}