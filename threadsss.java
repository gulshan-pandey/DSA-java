//extending the thread class
class mythread extends Thread{
  
   public void run(){

        for(int i =0;i<4000;i++){
            System.out.println("i am cooking!!!");
      
        }
      
    }
}

//making another thread
class mythread2 extends Thread{
   public void run(){  //run keyword is necessary for thread
   

        for(int i =0;i<4000;i++){
            System.out.println("i am chattinggggg!!!");
     
        }
    
    }

}


public class threadsss {
    //the threads is used for multi tasking but it does one task at a time  and then after sometime it executes another task
 public static void main(String[] args) {
    

  mythread myt =new mythread();
  
  mythread2 myth =new mythread2();

  myt.start(); //start keyword is necessary for execution

  myth.start();

 }
}
