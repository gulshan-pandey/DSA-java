//extending the thread class
class mythread extends Thread{

  @Override
   public void run(){  //multi threading is acheived by overriding the run method

        for(int i =0;i<400;i++){
            System.out.println("i am cooking!!!");
      
        }
      
    }
}

//making another thread
class mythread2 extends Thread{
   public void run(){  //run keyword is necessary for thread
   

        for(int i =0;i<400;i++){
            System.out.println("i am chattinggggg!!!");
     
        }
    
    }

}


public class Threadsss {
    //the threads is used for multi tasking but it does one task at a time  and then after sometime it executes another task
 public static void main(String[] args) {
    double startTime = System.currentTimeMillis();

  mythread myt =new mythread();
  
  mythread2 myth =new mythread2();

  myt.start(); //start keyword is necessary for execution

  myth.start();

  double endTime = System.currentTimeMillis();

  System.out.printf("the time taken is : %f",endTime-startTime);
 }
}
