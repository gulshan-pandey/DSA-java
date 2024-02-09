abstract class father {
    public father() {
        System.out.println("hey I am constructor");
    }

    public void hello() {
        System.out.println("we are studying abstract classes and methods");
    }

    abstract void greeting(); //if a method is declare abstract then the whole class will be abstracted
    abstract void play();
    
}

class child extends father { // this class must define the parent's abstract method to be a concrete class otherwise it will also become abstract class
    @Override
    public void greeting() { // here we defind the abstract method of its parent class
        System.out.println("good night");
    }

    @Override
    public void play(){ //remember that all the abstract methods must be in this class or else this class itself must be an abstract class
        System.out.println("lets play cricket");
    }
}

abstract class child3 extends father{ //it must have the father's greeting and play method //or it must be an abstract class
    public void printMe(){
        System.out.println("printed");
    }

}




abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Squaree extends Shape {
    double side;

    public Squaree(double side) {
        this.side = side;
    }

    double calculateArea() {
        return Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }
}


public class AbstractAndInterfaces {
    public static void main(String[] args) {
        
    
//abstract class is something ...jiski help lekr orr class banegi

//jbtk saare abstract methods implement nhi kroge tbtk concrete class bnegi nhi...orr jbtk concrete class nhi bnegi tbtk object nhi bna paoge!!!!


// father ft = new father(); --error //this will give error bcz it is an abstract class 
child ch = new child(); // this is only possible bcs its a concrete class and addressing all the abstract methods of its parent class
// child2 cd =new child2();  -- error  //abstracted class cannot have object
ch.greeting();


System.out.println("\n\n\n");



Circle circle = new Circle(77);
Squaree square = new Squaree(57);

System.out.printf("The radius of the circle is: %6.2f \n " ,circle.getRadius());
System.out.printf("The area of the circle is: %6.2f \n" ,circle.calculateArea());

System.out.printf("the side fo the square is : %5.2f \n " ,square.getSide()); 
System.out.printf("The area of the square is: %6.2f \n" ,square.calculateArea());

}
}
