public class FinalizeGC {
 String name ;
 int roll;
@Override
protected void finalize() throws Throwable {             //not that ...this finalize method runs automatically by the system whenever it need to garbge collection,also it can be done forcefully by calling System.gc() {depricated method in java 9}
    System.out.println("the memory was cleared by Garbage collection!");
}
    
public static void main(String[] args) {
    
  FinalizeGC obj;
  for(int i =0;i<1000000;i++){
    obj = new FinalizeGC();
    // obj = null;               // makin the object unrefrenced ,this is optional to do
  }

  // System.gc();    // the method to forcefully run the garbage collection , this is also optional to do bcz jvm do this automatically

   
}
}
