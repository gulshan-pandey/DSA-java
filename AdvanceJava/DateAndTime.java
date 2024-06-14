package AdvanceJava;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;


public class DateAndTime {

    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();      // now is a static class
        // var today = LocalDate.now();      // new feature of java

        System.out.println(today  + " \n");  // will print the current date

        int day = today.getDayOfMonth();        // will return the day
        int monthDay = today.getMonthValue();     // will return the month number
        Month mon = today.getMonth();               // will return the month class's object
        int year = today.getYear();                 // will return the year

        System.out.println(" \n\n day: " + day + "   month's number : " +  monthDay+ "  month: " +  mon+ "  year is : " + year);



/**
 * LocalDate.now kr k hum aaj ki date nikaal lete hain
 * LocalDate.of kr k hum custom date nikaal lete hain
 */




        System.out.println("for going to specific date-----------------------------------------------"); 

        LocalDate mydate = LocalDate.of(1990,2,7);   // of method is used for custom date
        System.out.println(mydate);
        System.out.println("\n the day of the month will be: "+mydate.getDayOfMonth());
        System.out.println("the length of the month will is: "+ mydate.lengthOfMonth());
        System.out.println("desired year is : "+ mydate.getYear());
        System.out.println(mydate.getMonth());   // it will return the month class's object
        String month =  mydate.getMonth().toString(); // convertng the month class object into string type
        // System.out.println(month);  




        // for going to yesterday and tomorrow's date from the current date----------------------------

        LocalDate yesterday = today.minusDays(1);
        System.out.println("\n\n the yesterday's day was: " + yesterday);

        System.out.println("previous months can be found by \" today.minusMonths(int number)\" " );
        LocalDate hundredMonthEarlier =today.minusMonths(100);
        System.out.println(" hundredMonthEarlier:  " + hundredMonthEarlier);



        // some other methods

        if(today.isAfter(hundredMonthEarlier)){
            System.out.println("haa bhai!... today is after hundredMonthEarlier");
        }


        if(today.isAfter(yesterday)){
            System.out.println("haa bhai!... today comes after yesterday");
        }


    





        System.out.println("\n\n\n");

        /**
         * LOCAL TIME
         */

        LocalTime nowDate =  LocalTime.now();  // we cannot instantiate it as it doesnot have a constructor

        System.out.println(nowDate);
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
            LocalTime lt = LocalTime.now();
            System.out.println(lt);
        }

        
    }
}