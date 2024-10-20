public class FinalizeGC {
  String name;
  int roll;

  @Override
  protected void finalize() throws Throwable { // not that ...this finalize method runs automatically by the system whenever it need to garbge collection,also it can be done forcefully by calling System.gc() {depricated method in java 9}
    System.out.println("the memory was cleared by Garbage collection!");
  }

  public static void main(String[] args) {

    FinalizeGC obj;
    for (int i = 0; i < 1000000; i++) {
      obj = new FinalizeGC(); // assigning new objects so that older refrences get destroyed

      // obj = null; // making the object unrefrenced ,this is optional to do
    }

    // System.gc(); // the method to forcefully run the garbage collection , this is
    // also optional to do bcz jvm do this automatically




    // Another Demonstration of finalize()

    	 // Creating Resource objects
       Resource res1 = new Resource("Resource1");
       Resource res2 = new Resource("Resource2");

       // Nullifying references to make objects eligible for garbage collection
       res1 = null;
       res2 = null;

       // Suggest garbage collection
       System.gc(); // This is just a suggestion; the GC may not run immediately

       // Adding a small delay to observe finalize() output
       try {
           Thread.sleep(1000); // Sleep for 1 second
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

  }
}







class Resource {
  // Resource that needs cleanup
  private String resourceName;

  public Resource(String name) {
      this.resourceName = name;
  }

  // Overriding finalize() method
  @Override
  protected void finalize() throws Throwable {
      try {
          // Cleanup code (e.g., closing a file or releasing a resource)
          System.out.println("Cleaning up resource: " + resourceName);
      } finally {
          super.finalize(); // Call the superclass's finalize method
      }
  }
}


