public class FinalizeGC {
 String name ;
 int roll;
@Override
protected void finalize() throws Throwable {
    System.out.println("the memory was cleared by Garbage collection!");
}
    
public static void main(String[] args) {
    
  FinalizeGC obj;
  for(int i =0;i<1000000;i++){
    obj = new FinalizeGC();
  }

   
}
}
