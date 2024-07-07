package AdvanceJava;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;


public class DateAndTime {

    public static void main(String[] args) throws InterruptedException {
        
        LocalDate today = LocalDate.now();      // now is a static class
        // var today = LocalDate.now();      // new feature of java

        System.out.println(today  + " \n");  // will print the current date

        int day = today.getDayOfMonth();        // will return the day
        int monthDay = today.getMonthValue();     // will return the month number
        Month mon = today.getMonth();               // will return the  Month is an enum 
        int year = today.getYear();                 // will return the year

        System.out.println(" \n\n day: " + day + "   month's number : " +  monthDay+ "  month: " +  mon+ "  year is : " + year);



/*
 * LocalDate.now kr k hum aaj ki date nikaal lete hain
 * LocalDate.of kr k hum custom date nikaal lete hain
 */




        System.out.println("for going to specific/custom date-----------------------------------------------"); 

        LocalDate mydate = LocalDate.of(1990,2,7);   // of method is used for custom date
        System.out.println(mydate );
        System.out.println(mydate.getClass().getName());
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
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
            LocalTime lt = LocalTime.now();
            System.out.println(lt);
        }



        LocalTime parsedTime = LocalTime.parse("12:30:30");         // to take explicit date from the use and convert it into LocalTime class, after parsing we can apply many methods on it
        
        System.out.println(parsedTime);


        LocalTime beforeOneHour = nowDate.minusHours(1);
        System.out.println("current time: " + nowDate);
        System.out.println("before one hour : " + beforeOneHour);


        if(nowDate.isAfter(beforeOneHour)){
            System.out.println("obviouslyy!");
        }





        //LocalDateTime   

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("local date and time is: " + ldt);



        LocalDate date = LocalDate.of(1990, 2, 7);
        LocalTime time = LocalTime.of(12, 30, 30);

        LocalDateTime customLocalDatetime = LocalDateTime.of(date, time);
        System.out.println(customLocalDatetime);


        LocalDateTime parsed = LocalDateTime.parse("2013-01-01T12:30:30");  //------parsing for applying operations on it

        


        /*-----------------------------ZONES--------------------------------- */

        System.out.println("\n\n\n");
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("time with zone: " + zdt);

        System.out.println("\n\n\n");

        // var availableZones = ZoneId.getAvailableZoneIds();
        Set<String> availableZones = ZoneId.getAvailableZoneIds();

        availableZones.forEach(System.out::println);              // we can use stream's operations in the set to print it

        ZonedDateTime IndiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));     // or   ZonedDateTime IndiaTime = ZonedDateTime.now();        ------ both are same
        System.out.println(" time of india  : " + IndiaTime);

        ZonedDateTime NewYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(" time of NewYork : " + NewYorkTime);

        ZonedDateTime parsedzdt = ZonedDateTime.parse("2013-01-01T12:30:30-05:00[America/New_York]");              //-------parsing for applying operations on it





        /*---------------Instant---------------- */
        System.out.println("\n\n\n");
        long currentTimeMillis = System.currentTimeMillis();        // this is the time in millisecond since 1970---- also known as epoch time
        System.out.println(currentTimeMillis);

        Instant instant = Instant.now();
        System.out.println(" Instant : " + instant);

        System.out.println(instant.atZone(ZoneId.of("Asia/Kolkata")));           // converting instant to zoned date time


    
        Instant minusSeconds = instant.minusSeconds(10);

        
        Instant minusHours = instant.minus(Duration.ofHours(2));

        System.out.println("isAfter: " + instant.isAfter(minusHours));
        System.out.println("isBefore: " + instant.isBefore(minusHours));

        

        // ---------------DURATION--------------------
        System.out.println("\n\n\n");            

        /*
         * Generally we use Durations to play with nanosecond precision, second precision, millisecond precision, etc.
         *
         * for longer durations we can use Periods class
         */



        Instant start = Instant.now();

        int sum =0;
        for(int i=0; i<10000000; i++){
            sum+=i;
        }
        Instant end = Instant.now();

        Duration duration1 = Duration.between(start, end);                  // dutration can be coverted into hours,minutes,days and can be compared    
        System.out.println("comparing the durations of start and end : " + duration1);              // the time duration passed in doing some operations

        int i = end.compareTo(start);
        System.out.println(i);




        System.out.println("\n\n\n");


        LocalDateTime a = LocalDateTime.now();
        Thread.sleep(2000);
        LocalDateTime b = LocalDateTime.now();
        Duration d2 = Duration.between(a,b);      // or Duration d2 = Duration.between(start, end)
        System.out.println(d2);



        /*----------------Periods--------------------------
         * Periods are used for longer durartions   ----> days,month, years
         */

        System.out.println("\n\n\n");



        LocalDate nowww = LocalDate.now();

        LocalDate birthday = LocalDate.of(2003, 11, 7);

        Period periodBetween = Period.between(nowww, birthday);         // used for longer durations, years, months...
        System.out.println("Period between noww and birthday: " + periodBetween);

       



        /*
         * Date Time Formatter
         * 
         * used to format the date and time by our own way
         */
        System.out.println("\n\n\n");


        String newdate = "07/11/2003";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate parseNewDate = LocalDate.parse(newdate,dateTimeFormatter);                // it is the overloaded constructor on the parse method, which takes the date and the format
        System.out.println(parseNewDate.format(dateTimeFormatter));             //   07/11/2003

    }
}
