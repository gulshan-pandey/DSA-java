class met1 extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("hello and welcome ");
            try {
                Thread.sleep(400); //will stop this method inn 400 ms by using error handling
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class met2 extends Thread {

    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("bye..."); // here this.getName() is the shortcut to get the enterend string form the constructor
        }
    }
}

public class MethodsOfThreads {

    public static void main(String[] args) {

        met1 m1 = new met1();
        met2 m2 = new met2();



     

        m1.start(); 
         //here now i want to run the m1 until its done so we will have to use error handiling
        // try {  
        //     m1.join();
        // } catch (Exception e) { //catch will run inn the case of the error //here try is use to try what we want to do with pgogram,if something unexpected happens then catch will runn
            
        //     System.out.println(e);
        // }

        m2.start();

    }
}
