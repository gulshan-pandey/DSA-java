

enum Color {
    RED,
    GREEN,
    YELLOW;
  }
  
  enum Grade {
    A, B, C, D, F
  }
  


  enum Day{
    MONDAY("weekday"),  //we can also say that it is the initialization of object of enum
    TUESDAY("weekday"),
    WEDNUSDAY("weekday"),
    THURSDAY("weekday"),
    FRIDAY("weekday"),
    SATURDAY("weekend"),
    SUNDAY("weekend");

   private final String ocassion ;    // make everything final as much as possible in enums

   private Day(String dayz){
     this.ocassion = dayz;
   }

   public String getDay(){
    return ocassion;
   }


  }




  public class enumsss {   //enum is very similar to class but it contains constants
 
    public static void main(String[] args) {
  
      Color cl = Color.RED; // enums can be accessed like static methods
      Color col;
      col = Color.GREEN;
  
      System.out.println("col :" + col);
  
      System.out.println(" {cl.values()} will print the hashcodes: " + cl.values()); // it willprint some hashcodes but all the values of the enum can be assessed by iterations on the .values() method
  
      System.out.println(cl + "\n \n"); // will print red
  
      for (Color c : Color.values()) {  // to print(iterate) through all the enums
        System.out.print(c + "  ");
      }
  
 


      Grade gr = Grade.B;

      System.out.println("\n Values of Grade enum:");
      for (Grade grd : Grade.values()) {
        System.out.println("the grade is " + grd);
      }

      Grade marks = Grade.valueOf("B");  // .valueOf() method is used to convert a String into an enum constant itself.
      System.out.println("marks : "+ (marks));

      Grade m = Grade.C;
      System.out.println("the grade is :    "+m);








      TrafficLight greenLight = TrafficLight.GREEN;

      System.out.println("\n\n the signal is :"+greenLight);
      String sig = greenLight.getSignal();
      System.out.println("you can  : " + sig);
      






System.out.println("\n\n printing all the days in the week");

      for (Day d: Day.values()) {    // iterate through all the days enum

        System.out.printf("%s : %s\n",d,d.getDay());  //smooth
      }

  
    }
  





    enum TrafficLight {
      RED("stop"),   //some constant to store in enum
      GREEN("go"),
      YELLOW("wait");
  
      private final String signal;
  
      TrafficLight(String str) {
        this.signal = str;
      }
  
      public String getSignal() {
        return this.signal;
      }
    }
  }