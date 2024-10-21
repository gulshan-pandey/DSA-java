import java.io.Serializable;
// the aim is that make this class like that only one object is to be allowed

public class Singleton {

    private Singleton(){ //now it can only be called in side this class

    }
    private static Singleton instance;

    public static Singleton getInstance(){
      
        if(instance==null){
            instance = new Singleton();
        }

        return instance;
    }
    
}



/**
 * This singleton class can be broken by below aspects
 * Multithreading
 * clonable
 * serializable
 * reflection api
 * 
 */

class template{

    public static void main(String[] args) {
        
             
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();


        System.out.println(obj);   //only one instance is being created of obj
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}



// Making full proof singleton 



 class FullSingleton implements Serializable, Cloneable {

    // private constructor to prevent instantiation from outside
    private FullSingleton() {
        // Prevent reflection from breaking FullSingleton
        if (SingletonHelper.INSTANCE != null) {
            throw new RuntimeException("Instance already exists! Use getInstance() method to get the single instance.");
        }
    }

    // Bill Pugh FullSingleton Design (Inner static helper class)
    private static class SingletonHelper {
        private static final FullSingleton INSTANCE = new FullSingleton();
    }

    // Global access point to the FullSingleton instance
    public static FullSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // To prevent creating a new instance during deserialization
    protected Object readResolve() {
        return SingletonHelper.INSTANCE;
    }

    // To prevent cloning of the Singleton instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed!");
    }
}
