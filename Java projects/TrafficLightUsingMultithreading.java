
class Traffic extends Thread{
    public final TrafficColor tr;
 
     public Traffic(TrafficColor tr){
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
 
         RED(5000) ,YELLOW(2000) ,GREEN(1000);
 
        private int tim;
 
         TrafficColor(int tim){
          this.tim = tim;
         }
 
         public int getTim(){
             return tim;
         }
 
     }
 

public class TrafficLightUsingMultithreading {


    public static void main(String[] args) throws InterruptedException {
        Traffic red = new Traffic(TrafficColor.RED);
        Traffic yellow = new Traffic(TrafficColor.YELLOW); 
        Traffic green= new Traffic(TrafficColor.GREEN); 

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
        System.out.println("now you can go");
    }
    
}
