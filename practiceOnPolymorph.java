//create an abstract class pen with methods write() and refill() as abstract methods.

// abstract class working {
//     public working() {
//         System.out.println("it is working ");
//     }

//     abstract void writes();

//     abstract void refill();
// }

// class pen extends working {

//     public pen() {
//         System.out.println("the pen writes...");
//     }

//     public void writes() {
//         System.out.println("the pen writes ");
//     }

//     public void refill() {
//         System.out.println("the pen refills");
//     }
// }

//que 2 make the pen as abstract method and create a concrete class fontainpen with additional method changeNib()

// abstract class pen{
//     abstract void write();
//     abstract void refill();

// }

// class FountainPan extends pen{
//     public void write(){
//         System.out.println("the fountain pen can write");
//     }

//     public void refill(){
//         System.out.println("the fountain pen can refill se well");
//     }

//     public void changeNib(){
//         System.out.println("the fountain pen can change its nib aswell...");
//     }
// }

// question to create a class monkey with jump() and bite() methods. create a class HUman which inherits this monkey class and implements BasicAnimal interface with eat() and sleep() methods.

interface BasicAnimal {
    void eat();

    void sleep();

    default void move(){  // an interface can have default method
     System.out.println("they can move here and there");
    }
}

class monkey {
    public void jump() {
        System.out.println("they can jump here and there!");
    }

    public void bite() {
        System.out.println("they can bite as well!");
    }
    
}

class Human extends monkey implements BasicAnimal {
    public void eat() {
        System.out.println("they can eat");
    }

    public void sleep() {
        System.out.println("they can sleep");
    }

    public void speak() {
        System.out.println("hello Gentlemen!");
    }
}




//question create an intrface TVremote and use it to inherit another interface SmartTVremore and create a class Tv which implements that TvRemote interface


interface TvRemote{
    void Buttons();
    void shape();
}

interface SmartTVremote extends TvRemote{
    void touch();
    void sensor();
}

class TV implements SmartTVremote{

    public void Buttons(){
        System.out.println("they have buttons");
    }

    public void shape(){
         System.out.println("they have well defined shape"); 
    }
    public void touch(){
        System.out.println("they are touch screen");
    }
    public void sensor(){
        System.out.println("they have sensor");
    }
}









public class PracticeOnPolymorph {

    public static void main(String[] args) {
        
        // pen pen1= new pen();
        // pen1.writes();
        // pen1.refill();


        //new object
        // FountainPan fp =new FountainPan();
        // fp.write();
        // fp.changeNib();
        // fp.refill();


        //new object
        Human h =new Human();
         h.bite();
         h.eat();
         h.jump();
         h.sleep();
         h.speak();


         System.out.println("\n\n");


         monkey m1 =new Human(); //running polymorphism (making human as a monkey(in actuality the m1 is of monkey type))
          m1.bite();
          m1.jump();
        //   m1.speak(); --> cannot use method because the refrence is monkey which does not have speak method

        BasicAnimal keeda = new Human();
        keeda.move();
        System.out.println("\n\n\n");
        // keeda.speak(); --> it is an animal from animal class it cannot posess the human capablities;
        
        
        

        //new object of tv
        TV Tv1 =new TV();
        Tv1.sensor();
        Tv1.Buttons();
    }
}
