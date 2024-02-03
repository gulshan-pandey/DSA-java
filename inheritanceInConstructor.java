class base1 {

    public base1() {
        System.out.println("I am a constructor");
    }

    public base1(int x) {
        System.out.println("I am an overloaded base1 contructor with the value of x is : " + x);
    }
}

class Derived1 extends base1 {

    public Derived1() {
        // super(0); //this is responsible for calling the overloaded constructor of the base class
        System.out.println("I am an derived constructoer");
    }
   
    public Derived1(int x,int y){
        super(x); //ye super me x ko lekr jaega or x wale base1 ko call krega
        System.out.println("i am a overloaded derived class constructor with he value y is " + y );
    }
}

class childOfDerived1 extends Derived1{

    public childOfDerived1(){
        System.out.println("I am the child of derived constructor");
    }

    public childOfDerived1(int x,int y,int z){
        super(x,y); //ye super x ,y ko lekr parent Derived1 ko vcall krega
        System.out.println("I am the overloaded child of derived  constructor");
    }
}

public class InheritanceInConstructor {

    public static void main(String[] args) {

        base1 b = new base1();
        System.out.println("\n\n\n");
        // Derived1 d = new Derived1();

        // Derived1 db = new Derived1(12,14);

        childOfDerived1 cd =new childOfDerived1();

        System.out.println("\n\n\n");

        childOfDerived1 cd1= new childOfDerived1(1,2,3);

    }
}
