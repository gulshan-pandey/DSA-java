interface InterfaceA {
    default void display() {
        System.out.println("InterfaceA display");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("InterfaceB display");
    }
}

class AmbiguityClass implements InterfaceA, InterfaceB {
    // This will cause a compile-time error
    // The class must override the display() method to resolve ambiguity
    @Override
    public void display() {
        // Optionally, we can choose one of the interface's default methods
        InterfaceA.super.display();  // Resolves ambiguity
    }
}

public class Ambiguity {
    public static void main(String[] args) {
        AmbiguityClass obj = new AmbiguityClass();
        obj.display();  // Ambiguity: Which default display() method to invoke?






    }
}


