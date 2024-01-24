
import harry1.gym.zzz2;

class use extends zzz2{ //sub class
    void me(){
        System.out.println(x);
        System.out.println(y); //protected
        // System.out.println(z); //default it wont run in subclass
}

}
public class dem {
    
    public static void main(String[] args) {
        System.out.println("hii");
        System.out.println("these files will not run until u put these files in there respective package");
        
        use nw =new use();
        
      nw.me();


      zzz2 nww = new zzz2();
       
      System.out.println(nww.x);
     // System.out.println(nww.y); //wont run in another world cuz it is protected
     // System.out.println(nww.z); //wont run in world cuz it is default
    }
}
