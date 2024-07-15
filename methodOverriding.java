class A {

    public void hello() {
        System.out.println("this is the first method of the class A");
    }

    public void meth2() {
        System.out.println("this is the second method of class A");
    }

    public class Statistic {
    }
}

class B extends A { //inheritance
    @Override // it is a good practice to write @overide as it helps for less errors
    public void meth2() { //the return type of overriden method must be the same ,and the acces level must not be restricted in any class
        System.out.println("this is the second method of class B");
    }

    public void meth3() {
        System.out.println("this is the third method of class B");
    }

}

// a real life example on overriding
// Superclass

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass
class Dog extends Animal {
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }

    // New method in subclass
    public void wagTail() {
        System.out.println("Tail is wagging");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        // method overriding --> same method name + same para + same return type(covarient)


        A a = new A();      //objects are made at runtime
        a.meth2();

        B b = new B();
        b.meth2();




        Animal animal = new Animal();           //objects are made at runtime
        animal.makeSound(); // Output: Some generic sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Bark! Bark!
        dog.wagTail(); // Output: Tail is wagging
    }
}
