class pri extends Thread{
   
    public pri(String name){
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
        
        pri h1 = new pri("nonu1");
        pri h2 = new pri("nonu2");
        pri h3 = new pri("nonu3");
        pri h4 = new pri("nonu4 (most Important)");
        pri h5 = new pri("nonu5");
        pri h6 = new pri("nonu6");

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