import java.time.LocalDate;
import java.time.Month;


public class DateAndTime {

    public static void main(String[] args) {
        
        LocalDate today =LocalDate.now();      // now is a static class
        System.out.println(today  + " \n");  // will print the current date

        int day = today.getDayOfMonth();
        int monthDay = today.getMonthValue();     
        Month mon = today.getMonth();
        int year = today.getYear();

        System.out.println(" \n\n day: " + day + "   month's number : " +  monthDay+ "  month: " +  mon+ "  year is : " + year);


        System.out.println("for going to specific date-----------------------------------------------"); 

        LocalDate mydate = LocalDate.of(1990,2,7);   // of method is used for custom date
        System.out.println(mydate);
        System.out.println("\n the day of the month will be: "+mydate.getDayOfMonth());
        System.out.println("the length of the month will is: "+ mydate.lengthOfMonth());
        System.out.println("desired year is : "+ mydate.getYear());
        System.out.println(mydate.getMonth());   // it will return the month class's object
        String month =  mydate.getMonth().toString(); // convertng the month class object into string type
        // System.out.println(month);  




        // for going to yesterday and tomorrow's date----------------------------

        LocalDate yesterday = today.minusDays(1);
        System.out.println(" the yesterday's day was: " + yesterday);

        LocalDate hundredMonthEarlier =today.minusMonths(100);
        System.out.println("previous date can be found by \" today.minusMonths(int)\" " );
        System.out.println(" hundredMonthEarlier:  " + hundredMonthEarlier);







        
    }
}