class human {

    private String name;
    private int age;

    public human() { // this is constructor and it calls itself whenever the new object is and has no
                     // return type
                     // initialized
        name = "kaliaa"; // the constructors helps us to give the default values
        age = 21;
    }

    public human(String n) { // this is constructor overloading
        name = n;
    }

    public human(int a, String n) { // this is constructor overloading
        age = a;
        name = n;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class worker {
    private int salary;
    private String name;

    public worker() { // initializing constructor that takes no argument...
        salary = 12;
    }

    public int getSalary() {
        return salary;
    }
}

class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    int noOfSeats;
    float fuel;

    static int noOfCarSold; // this is static that how much car has been sold

    Car(String color) {
        this.color = color;
        noOfSeats = 5;
        noOfWheels = 4;
        fuel = 3;
        maxSpeed = 150;

    }

    Car() {
        this("Black"); // it is constructor chaining ,in which the constructor call its own version to
                       // get the work done ,and all the properties of the another constructor will be
                       // set
        fuel = 5; // default constructor caller will get 5 ltr of fuel
    }

    // the static block runs first of all !!
    // static is code block and it is called only once doesnt matter how many
    // objects u have made
    static {
        noOfCarSold = 0;
        System.out.println(" I am in static block,and run only once");
    }

    // normal codeblock will run as many times as the objects has been made
    { // normal code block
        noOfCarSold++;
        System.out.println("I am in initialization block,and i will run as many times as much objects it has");
    }

}






public class Constructors {

    public static void main(String[] args) {


        human person = new human();
        System.out.println(person.getName() + " : " + person.getAge());

        human person3 = new human("gaurav");
        System.out.println(person3.getName() + " : " + person3.getAge());

        human person2 = new human(18, "ghoda");
        System.out.println(person2.getName() + " : " + person2.getAge());

        worker empl1 = new worker();
        System.out.println("the default slary of empl1 is  : " + empl1.getSalary() + " \n\n");

        Car swift = new Car("red");
        Car thar = new Car();

        System.out.println(swift.color);
        System.out.println(thar.color + " \n\n ");



       
    }

}
