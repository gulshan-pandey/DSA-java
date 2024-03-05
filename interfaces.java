interface Bicycle {
    int a = 99; // We can create properties in interfaces
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Bike {
    int y = 0; // Remember they all are already public by default
    void applyDiskBrake();
    void Accelerate();
}

// We can implement 2 or more interfaces in a class
class Ranger implements Bicycle, Bike {

    // int a = 999; // We can sort of modify the variables of interfaces indeed but should not overwrite them
    void blowHorn() {
        System.out.println("pee peeee...");
    }

    // Defining all the methods of interface
    public void applyBrake(int decrement) {
        System.out.println("applying brakes by: " + decrement);
    }

    public void speedUp(int increment) {
        System.out.println("speeding up by: " + increment);
    }

    public void applyDiskBrake() {
        System.out.println("applying disk brake...");
    }

    public void Accelerate() {
        System.out.println("pulling the accelerator!");
    }
}





public class Interfaces {
    public static void main(String[] args) {

        Ranger myBicycle = new Ranger();
        myBicycle.applyBrake(6);
        myBicycle.speedUp(9); 

        System.out.println(myBicycle.a); // We can access properties in Interfaces

        // We cannot modify the properties in Interfaces as they are final
        // myBicycle.a = 1; ---error

        myBicycle.applyDiskBrake();
        myBicycle.Accelerate();

      


    }
}
