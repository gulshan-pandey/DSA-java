
 


 

/*
 * 
 * Compile-Time Polymorphism (Static Polymorphism): Decisions about which method to call are made during compilation. This primarily happens through method overloading. 
 * Method Overloading: You define multiple methods in the same class with the same name but different parameters (number or types). The compiler determines the correct method to call based on the arguments you provide.
 * 
 * 
 * Runtime Polymorphism (Dynamic Polymorphism): The decision about which method to execute is made at runtime. This is achieved through method overriding.
 * Method Overriding: You provide a specific implementation of a method that is already defined in a superclass. This allows subclasses to provide specialized behavior.
 *
 * 
 */

 interface camera {
    void snap(); //we cannot define the method in interface

    void recordVideo();
}

interface wifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

interface player {
    String playMusic(String song);

    private void greetings() { //declaring private method and cannot be accessible by any class
        System.out.println("good mrng");
    }

    default void play() { // this default method doesnot need to implemented in the concrete class but if u want then you can...introduced in java8
        greetings(); //here we are calling the private mathod 
        System.out.println("playing my favourite songs");
    }
}

class myCellPhone {           //parent class
    void callNumber(int number) {
        System.out.println("calling ... " + number);
    }

    void pickCall() {
        System.out.println("connecting...");
    }
}

class SmartPhone1 extends myCellPhone implements camera, wifi, player { //child class which inherits parent which implements all the interfaces and it will have to define all the methods of interfaces

    public void snap() {
        System.out.println("taking snap!!!");
    }

    public void recordVideo() {
        System.out.println("now recording the video!");
    }

    public String[] getNetwork() {
        System.out.println("connecting to the networks");
        String[] networks = { "golu", "molu", "doggy" };
        return networks;
    }

    public void connectToNetwork(String nw) {
        System.out.println("connecting to : " + nw);
    }

    public String playMusic(String song) {
        return song;
    }

    public void playStore(){ //Smartphone's own method
        System.out.println("opening playstore");
    }


   // public void play(){ //however it wasnt needed to address this method ,as it was default in the interface ,but when we implement it in concrete class then the new object of that class will be running this method not the interface's code!!
  //  System.out.println("here i was playing my favourite singer\'s song...");
  //  }
}




public class Polymorphism {
    public static void main(String[] args) {
        camera cam = new SmartPhone1(); //This is a smartphone but,use it as a camera...otherwise u will get the error
        // cam.getNetwork(); --> not allowed
        // cam.playStore(); -> nowt allowed
        cam.recordVideo(); //now the new smartphone is being used as camera 
        cam.snap();
        System.out.println(cam.getClass().getName());    //-----SmartPhone1


        SmartPhone1 sm = new SmartPhone1();         //objects are made at runtime
        sm.playStore();
        sm.callNumber(817820134);
        sm.getNetwork();
    }
}
