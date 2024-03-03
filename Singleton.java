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