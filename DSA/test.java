package DSA;


public class test{

    @Override
    protected void finalize() throws Throwable { // not that ...this finalize method runs automatically by the system whenever it need to garbge collection,also it can be done forcefully by calling System.gc() {depricated method in java 9}
      System.out.println("the memory was cleared by Garbage collection!");
    }

public static void main(String[] args) {
  
    test obj;
    for (int i = 0; i < 1000000; i++) {
      obj = new test(); // assigning new objects so that older refrences get destroyed

    }

}



}