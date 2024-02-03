class cylinder{
    private int height;
    private int radius;


    public cylinder(int radius,int height){ //constructor
      this.radius=radius;
      this.height=height;

    }

    public void setHeight(int n){
        height=n;
    }
    public int getHeight(){
        return height;
    }

    public void setRadius(int n){
        radius=n;
    }
    public int getRadius(){
        return radius;
    }

    public double surfaceArea(){
        return (2*Math.PI*radius*(height+radius));
    }
    
    public double area(){
        return (Math.PI*radius*radius*height);
    }

    @Override
    public String toString() {
        return "cylinder [height=" + height + ", radius=" + radius + "]";
    }
   
    
}

// class rectangle{
//     private int length;
//     private int breadth;


//     public rectangle(){ //constructor
//       length = 4;
//       breadth =5;
//     }

//     public rectangle(int length){ //constructor overloading
//       this.length = length;
//       breadth =5;
//     }

//     public rectangle(int length, int breadth){ //constructor overloading
//       this.length = length;
//       this.breadth =breadth;
//     }

//     public int getlength(){
//         return length;
//     }
//     public int getbreadth(){
//         return breadth;
//     }
// }





public class PracticeConstructors {
    public static void main(String[] args) {
        
    cylinder mycylinder =new cylinder(7,10);

    // mycylinder.setRadius(7);
   System.out.println("the radius is : " + mycylinder.getRadius());

//    mycylinder.setHeight(10);
   System.out.println("the height is :  " + mycylinder.getHeight());


   System.out.println("the area of mycylinder is : " + mycylinder.area());
   System.out.println("the surface area of the mycylinder is :  " + mycylinder.surfaceArea());

   System.out.println(mycylinder); //calling toString method automatically



    // rectangle rect1 =new rectangle();
    // System.out.println(rect1.getbreadth() + " : " + rect1.getlength());
    // rectangle rect2 =new rectangle(9);
    // System.out.println(rect2.getbreadth() + " : " + rect2.getlength());
    // rectangle rect3 =new rectangle(10,12);
    // System.out.println(rect3.getbreadth() + " : " + rect3.getlength());

    












    }
    
}
