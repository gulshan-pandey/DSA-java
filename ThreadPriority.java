class prior extends Thread{
   
    public prior(String name){ //constructor
        super(name);
        

    }

    public void run(){
        for(int i =0 ; i<200;i++){

            System.out.println("hello  " + this.getName()); //here this.getName() is the shortcut to get the enterend string form the constructor
        }
       

    }
}


public class ThreadPriority{
    public static void main(String[] args) {
        
        prior h1 = new prior("nonu1");
        prior h2 = new prior("nonu2");
        prior h3 = new prior("nonu3");
        prior h4 = new prior("nonu4 (most Important)"); //just named it as most important ,nothing specific done
        prior h5 = new prior("nonu5");
        prior h6 = new prior("nonu6");

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
        h6.start();


    }


}