package Multithreading;
//WAP to print goodmorning and welcome continuously using Thread
//Add a sleep method in welcome thread of q1 to delay its execution for 200ms
//use getPriority and setPriority
//get its state by using setState() method that we have studied in theory
//how  do you get the refrence to the curren thread in java


class gm extends Thread{
    public void run(){
        for(int i= 0;i<200;i++){

            System.out.println("good morning!");
        }
    }
}

class wlcm extends Thread {

  public void run(){
      for(int i= 0;i<200;i++){
      System.out.println("welcome");
      }
  }


}

class que2 extends Thread{

    public void run(){ 
        int i =0;
        while(true){
            try{
                Thread.sleep(400); // just to  delay the output of this 
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("gooooood morningggggg");
           i++;
        }
    }
}

class que21 extends Thread{

    public void run(){
         int j=0;
        while(true){
            try{
                Thread.sleep(200); // just to  delay the output of this 
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("bad luck !");
          j++;
        }
    }
}


public class PracticeOnThreads {
    public static void main(String[] args) {
        
        gm g = new gm();

        wlcm w = new wlcm();

        // g.start();
        // w.start();


        //que2

         que2 q2= new que2();
         que21 q21= new que21();
         
         q21.start();
         q2.start();
        System.out.println( q2.getState()); //this will tell the state of the porgram as we discussed in theory part
        System.out.println( q21.currentThread()); //gives the current info of the current thread 
        
         
         System.out.println(q2.getPriority()); //the normal priority is 5 for every thread
         System.out.println(q21.getPriority());

         
         q2.setPriority(Thread.MAX_PRIORITY);
         q21.setPriority(10);
    }
}
