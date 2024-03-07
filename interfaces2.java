interface camera {
    void snap();

    void recordVideo();
}

interface wifi0 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

interface player0 {
    String playMusic(String song);


    private void greetings() { //declaring private method
        System.out.println("good mrng");
    }
 
    default void play() { // this default method doesnot need to implement in the concrete class
                          // introduced in java8
        greetings();
        System.out.println("playing my favourite songs");
    }
}

class myCellPhone0 {
    void callNumber(int number) {
        System.out.println("calling : " + number);
    }

    void pickCall() {
        System.out.println("connecting...");
    }
}

class SmartPhone2 extends myCellPhone0 implements camera, wifi0, player0 {

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
        return "playing  : " + song;
    }

    public void callNumber(int number) {
        System.out.println("calling the number... : " + number);
    }

    public void pickCall() {
        System.out.println("picking the phone");
    }

    // public void play(){ //however it wasnt needed to address this method ,as it was default in the interface ,but when we implement it in concrete class then the new object of that class will be running this method not the interface's code
    // System.out.println("here i was playing my favourite singer\'s song...");
    // }
}

public class Interfaces2 {
    public static void main(String[] args) {
        SmartPhone2 myPhone = new SmartPhone2();

        String[] ar = myPhone.getNetwork();

        for (String element : ar) {
            System.out.println(element);
        }
        
        // for (int i=0;i<myPhone.getNetwork().length;i++){
        //     System.out.println(ar[i]);
        // }

        // myPhone.greetings(); --error as it is private in interface
        myPhone.play(); //it is the default method in the player0 interface therefore it will runn

       System.out.println(myPhone.playMusic("die for me")); 
    }
}
