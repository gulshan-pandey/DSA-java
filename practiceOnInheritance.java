//create a class circle1 and use inheritance to create another class cylinder1 from it

class circle1 {
    int radius;

    public circle1() {
        System.out.println("i am circles/'s constcuctor");
    }

    public circle1(int r) {
        System.out.println("i am circle1 overloaded constructor");
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}

class cylinder1 extends circle1 {
    int height;

    public cylinder1(int r, int h) {
        super(r);
        System.out.println("i am cylinder1");
        this.height = h;
    }

    public double vol() {
        return Math.PI * radius * radius * height;
    }

}

// create a class rectangle and make its inheritance as cuboid and try to keep
// it as close to real worls as possible

class rectangle {
  private  int length;
   private int breadth;

    public rectangle() {
        System.out.println("hye I am a rectangle");
    }

    public rectangle(int l, int b) {

        System.out.println("I am a rectangle");
        this.length = l;
        this.breadth = b;
    }

    public void setLengthAndBreadth(int l, int b) { //Another way to set length and breadth other than constructor method.
        this.length = l;
        this.breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int area() {
        return length * breadth;
    }

}

public class practiceOnInheritance {
    public static void main(String[] args) {

        circle1 cc = new circle1();

        System.out.println("\n");

        circle1 cr = new circle1(7);

        System.out.println(cr.area());

        System.out.println("\n");

        // creating cylinder1 obj
        cylinder1 cl = new cylinder1(7, 10);
        // System.out.println(cl.vol());

        // new object of recctangle
        // rectangle rect= new rectangle(6,7);
        // System.out.println(rect.area()); //will give direct area without call for setters

        rectangle rc = new rectangle();
        rc.setLengthAndBreadth(6, 7);
        System.out.format("the area is %d", rc.area());

    }
}
