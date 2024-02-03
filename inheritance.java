class base { //it is superclass
    int x;

    public int getX() {
        return x;
    }

    public void setX(int n) {
        this.x = n;
    }

    public void printMe() {
        System.out.println("hey print me ");
    }

}

class derived extends base { // means inheriting the property of the base class ,and it is a subclass

    int y;
    
    public void setY(int n) {
        this.y = n;
    }
    
     public int getY() {
            return y;
        }
}


//creating animal superclass
class Animal{
    
    int ears;
    int nose;
    boolean canWalk;
    private int typesOfAnimals;
    
    public Animal(){ //constructor
        canWalk=true;
        System.out.println(canWalk + "  the animal can walk");
    }

    public void run(){
        System.out.println("they can run");
    }

    public void live(){
        System.out.println("animals live outside");
    }

    public void setEars(int v){
        this.ears=v;
    }
    public int getEars(){
        return ears;
    }

}

//creating the subclass
class dog extends Animal{
      
    boolean canBark;
    int legs;

    public dog(){ //constructor
        System.out.println("the dog can bite!!!");
    }

    public void setBark(boolean n){
        canBark=n;
    }
    public boolean getBark(){
       return canBark;
    }
     
    public void setLegs(int setLegs){
        legs = setLegs;
    }

    public int getLegs(){
        return legs;
    }

    @Override
    public void live(){
        System.out.println("dogs live outside");
    }


}


public class Inheritance {
    public static void main(String[] args) {

        // creating the object of base class
        base b = new base();
        b.setX(7);
        System.out.println(b.getX());
        b.printMe();

        System.out.println("\n now derived class inherited base class ");
        // creating the object of derived class
        derived d = new derived();

        d.setX(9); //setting x as it inherites the base
        System.out.println("in the d class the x is accessible : " + d.getX());
        d.printMe(); //is is also accessible

        d.setY(44);
        System.out.println(d.getY());

       System.out.println("\n\n\n");




        //object Animal's class
        Animal a =new Animal();
        a.setEars(2);
        System.out.println("animals ears : " + a.getEars());
        a.run();
        System.out.println("\n\n\n");

        //object of dog class which inherits the Animal object
        dog dg =new dog(); //by calling the dog the constructor of the animal will invoke and of dog as well
        dg.live();
        dg.setEars(10);
        dg.setLegs(40);
        dg.setBark(true);
        System.out.println(dg.getBark() + " : the dog barks");
        System.out.println(" no. of legs they have : " + dg.getLegs());
        System.out.println("the dogs have ears : " + dg.getEars());

    }

}
