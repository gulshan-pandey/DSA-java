// import org.junit.jupiter.api.ClassOrderer.ClassName;
interface Greeting {
    void greet();
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


public class AnonymousInnerClass {

   
        public static void main(String[] args) {

                

                        // new ClassName() {
                        //         // this is the syntax of the Anonymous inner class
                        //    };






            Greeting greeting = new Greeting() {    //Anonymous Inner Class for Interface Implementation:
                @Override
                public void greet() {
                    System.out.println("Hello, World!");
                }
            };

            greeting.greet();



//Example 2

            Animal animal = new Animal() {     //Anonymous Inner Class for Extending a class
                @Override
                void sound() {
                    System.out.println("Dog barks");
                }
            };
            
            animal.sound();
        

        }
    
}



