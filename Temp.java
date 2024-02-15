public class Temp {
 String name ;
 int roll;
@Override
protected void finalize() throws Throwable {
    System.out.println("the memory cleared by GC");
}
    
public static void main(String[] args) {
    
  Temp obj;
  for(int i =0;i<1000000;i++){
    obj = new Temp();
  }

   
}
}
