
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW;
  }
  
  enum Grade {
    A, B, C, D, F
  }
  


  enum Day{
    MONDAY("weekday"),  //we can also say that it is the initialization of oject of enum
    TUESDAY("weekday"),
    WENSDAY("weekday"),
    THURSDAY("weekday"),
    FRIDAY("weekday"),
    SATURDAY("weekend"),
    SUNDAY("weekend");

   private final String ocassion ;

   private Day(String dayz){
     this.ocassion = dayz;
   }

   public String getDay(){
    return ocassion;
   }


  }




  public class enumsss {   //enum is very similar to class
 
    public static void main(String[] args) {
  
      Color cl = Color.RED; // enums can be accessed like static methods
      Color col;
      col = Color.GREEN;
  
      System.out.println("col :" + col);
  
      System.out.println(" {cl.values()} will print the hashcodes: " + cl.values()); // it willprint some hashcodes but all the values of the enum can be assessed by iterations on the .values() method
  
      System.out.println(cl + "\n \n"); // will print red
  
      for (Color c : Color.values()) {  // to print all the enums
        System.out.print(c + "  ");
      }
  



      Grade gr = Grade.B;

      System.out.println("Values of Grade enum:");
      for (Grade grd : Grade.values()) {
        System.out.println("the grade is " + grd);
      }

      Grade marks = Grade.valueOf("B");  // .valueOf() method is used to convert a String into an enum constant itself.

      System.out.println("marks : "+ (marks));



      TrafficLight greenLight = TrafficLight.GREEN;

      String sig = greenLight.getSignal();
      System.out.println("\n\nthe signal is : " + sig);
      






System.out.println("\n\n printing all the days in the week");

      for (Day d: Day.values()) {

        System.out.printf("%s : %s\n",d,d.getDay());
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