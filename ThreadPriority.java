class prior extends Thread{
   
    public prior(String name){ //constructor
        super(name);
        

    }

    public void run(){
        for(int i =0 ; i<200;i++){

            System.out.printf("%d%s  " ,i, this.getName()); //here this.getName() is the shortcut to get the enterend string form the constructor
        }
       
         System.out.printf("\n\n %s Task Done \n\n",this.getName());
    }
}


public class ThreadPriority{
    public static void main(String[] args) throws InterruptedException {
        
        prior h1 = new prior("*");
        prior h2 = new prior("#");
        prior h3 = new prior("$");
        prior h4 = new prior("^"); //most important 
        prior h5 = new prior("&");
        prior h6 = new prior("@");

        h4.setPriority(Thread.MAX_PRIORITY);
        h1.setPriority(Thread.MIN_PRIORITY);
        h2.setPriority(Thread.MIN_PRIORITY);
        h3.setPriority(Thread.MIN_PRIORITY);
        h5.setPriority(Thread.MIN_PRIORITY);
        h6.setPriority(Thread.MIN_PRIORITY);


        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h5.join(2000); //here it means that the main thread will wait for 2 sec till the t5 completes executing
        
        h5.sleep(5000); //main thread will wait for 2 secs
        h6.start();


    }


}