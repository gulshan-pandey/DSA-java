// import org.junit.jupiter.api.ClassOrderer.ClassName;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

            Animal dog = new Animal() {     //Anonymous Inner Class for Extending a class
                @Override
                void sound() {
                    System.out.println("Dog barks");
                }
            };
            
            dog.sound();
        


//EXAMPLE 3

            ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                // actionPerformed is an abstract method in this interface
               
                System.out.println("Button clicked!");         // we need to add the button,then call .addActionListener(actionListener);
            }
            };

        }



//EXAMPLE 4

        // Thread thread = new Thread(new Runnable() {
        //     @Override 
        //     public void run() {
        //     System.out.println("Running in new thread"); 
        //     }
        // });
        
        // thread.start();
 
    
}



