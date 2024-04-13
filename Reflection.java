import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection{     //ReflectionApi mainly used for testing purposes
    
 
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        // reflectionApi example = new reflectionApi();
        // reflectionApi example2 = new reflectionApi();
        
        Class c1 = Class.forName("reflectionApi");   // used to load the class without creating the instance
        System.out.println("number of constructors are : " + c1.getConstructors().length);        // retruns the numbers of constructors contianed in the perticular class
        System.out.println("the class name is : "  + c1.getName());
        System.out.println("the super class name is : "  + c1.getSuperclass());

        Field[] fields = c1.getDeclaredFields();  // it gives all the fields present in the class
        System.out.println("\n Fields are:");
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    

        System.out.println("\n\nno. of fields: "+ c1.getFields());      //prints address of Field class and some hashes
        System.out.println("no. of fields: "+ c1.getDeclaredFields());  

        System.out.println("\n\nmethods are: ");
        Method[] method = c1.getMethods();          // Method class--- stores methods
        for (Method met : method) {           // applying foerEach loop to print all the methods present
            System.out.println(met);
        }

        Constructor constructors[] = c1.getConstructors();    //constructor class--- stores constructors
        System.out.println( "\nthe  constructors are : ");
        for (Constructor construct : constructors) {
            System.out.println(construct);
    }

      
}

}


class reflectionApi{
    // process of examing or modifying the run time behaviour of the class at runtime,provides many methods that can be used to get the meatadata
    // used to load the class without creating the object of that class,we have the class called "Class" and also we have tha class called "Method" and the class called "Constructor"
    // in the backend the spring boot analyse the class via reflectionApi
    String name;
    private String type;
    private int age;


    public reflectionApi(){
          this.name= "apple yadav";
          this.age = 25;
          System.out.println("I am a constructor");
    }

    public reflectionApi(String str,int i){
        this.name = str;
        this.age = i;

    }
    
    {
        System.out.println("I am normal block,and i load everytime the class instances are created");
    }

    static{
        System.out.println("hii i am static block, and i load only one per class");
    }
    String getName(){
        return name;
    }

    public  void show(){
        System.out.println("showtime");
    }

    private void wow(){
        System.out.println("come to dubai");
    }

    
    
}