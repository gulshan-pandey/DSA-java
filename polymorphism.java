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

    default void play() { // this default method doesnot need to implemented in the concrete class but if u want then you can
                          // introduced in java8
        greetings(); //here we are calling the private mathod for good
        System.out.println("playing my favourite songs");
    }
}

class myCellPhone { //parent class
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


   // public void play(){ //however it wasnt needed to address this method ,as it was default in the interface ,but when we implement it in concrete class then the new object of that class will be running this method not the interface's code
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


        SmartPhone1 sm = new SmartPhone1();
        sm.playStore();
        sm.callNumber(817820134);
        sm.getNetwork();
    }
}
