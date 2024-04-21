class Student { // this is my own custom class
    int id;
    String name;
    int roll;
    int salary;

    public void details() {
        System.out.println("my id is : " + id);
        System.out.println("and  my name is : " + name);
        System.out.println("and my roll no is : " + roll);
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

class CellPhone {
    public void ring() {
        System.out.println("ringing...");
    }

    public void vibrate() {
        System.out.println("vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling pootoo...");
    }
}

class Square {
    int side;

    public int perimeter() {
        return 4 * side;
    }

    public int area() {
        return side * side;
    }

}

class Swordigo {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("RUnning away from the enemy");
    }
}

public class CreateClass {
    public static void main(String[] args) {
        System.out.println("creating class");

        Student manoj = new Student(); // Instantiating a new Student object
        Student john = new Student(); // Instantiating a new Student object
        Student harry = new Student();

        // Setting arrtibutes
        manoj.id = 512;
        manoj.name = "gulshan_pandey";
        manoj.roll = 123;

        john.id = 13;
        john.name = "john kumar";
        john.salary = 12;

        harry.setName("codeWithHarry");

        // printing the attributes
        // System.out.println(manoj.id);
        // System.out.println(manoj.name);
        manoj.details();
        john.details();
        System.out.println(john.getSalary());
        System.out.println(harry.getName());

        System.out.println(" \n creating new class samsuung");

        CellPhone samsuung = new CellPhone();

        samsuung.ring();
        samsuung.callFriend();
        samsuung.vibrate();

        Square sq = new Square();

        sq.side = 6;

        System.out.println("the perimeter of square is : " + sq.perimeter());
        System.out.println("the area of square is  : " + sq.area());

        Swordigo player1 = new Swordigo();
        player1.run();
        player1.hit();


    }
}
