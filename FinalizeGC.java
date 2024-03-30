public class FinalizeGC {
 String name ;
 int roll;
@Override
protected void finalize() throws Throwable {
    System.out.println("the memory was cleared by Garbage collection!");
}
    
public static void main(String[] args) {
    
  FinalizeGC obj;
  for(int i =0;i<10;i++){
    obj = new FinalizeGC();
    // obj = null;               // maakin the object unrefrenced ,this is optional to do
  }

  // System.gc();    // the method to forcefully run the garbage collection , this is also optional to do bcz jvm do this automatically

   
}
}
