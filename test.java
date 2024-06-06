import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class test {
    

    public static void main(String[] args) {
        
    LocalDate now = LocalDate.now();
    var tim = LocalDate.now();
    System.out.println(tim);
   // System.out.println(now);    //2024-06-06
    int year = now.getYear();
    Month month = now.getMonth();
    int day = now.getDayOfMonth();

    System.out.println();


    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    



    var customDate = LocalDate.of(2028, 2 ,2);
    System.out.println("\n\n" + customDate);
    




 






    }
}

