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

