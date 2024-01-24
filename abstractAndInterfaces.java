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
    public void greeting() { // here we defint the abstract method of its parent class
        System.out.println("good night");
    }

    @Override
    public void play(){ //remember that all the abstract methods must be in this class or this class itself must be an abstract class
        System.out.println("lets play cricket");
    }
}

abstract class child3 extends father{ //it must have the father's greeting and play method //or it must be an abstract class
    public void printMe(){
        System.out.println("printed");
    }

}

public class abstractAndInterfaces {
    public static void main(String[] args) {
        
    
//abstract class is something ...jiski help lekr orr class banegi

//jbtk saare abstract methods implement nhi kroge tbtk concrete class bnegi nhi...orr jbtk concrete class nhi bnegi tbtk object nhi bna paoge!!!!


// father ft = new father(); --error //this will give error bcz it is an abstract class 
child ch = new child(); // this is only possible bcs irs a concrete class and addressing all the abstract methods of its parent class
// child2 cd =new child2();  -- error  //abstracted class cannot have object
ch.greeting();

}
}
