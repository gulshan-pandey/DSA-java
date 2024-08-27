import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    /**
     * Regular expressions in Java are powerful tools for pattern matching within strings.
     * 
     * Pattern: Represents a compiled regex pattern.
     * Matcher: Used to search, find, and manipulate text using a Pattern.
     * 
     */

    public static void main(String[] args) {
        
       // String regix = "a*b";     // this is a regular expression
        
       String input = "aaaaaabbbbbb";
        
        Pattern pattern = Pattern.compile("a*b*");

        Matcher matcher = pattern.matcher(input);

        boolean isMatching = matcher.matches();
        System.out.println("aaaaaabbbbbb -"+isMatching);


        System.out.println("------------------------------------------------");

        Pattern pattern2 = Pattern.compile("a+b*");                 // atleast 1 a and 0 or more b
        Matcher matcher3 = pattern2.matcher("a");     
        Matcher matcher4 = pattern2.matcher("abbbbbbbbbbbbb");     
        Matcher matcher5 = pattern2.matcher("b");   
        
        System.out.println("a -" + matcher3.matches());
        System.out.println( "abbbbbbbbbbbbb -" + matcher4.matches());
        System.out.println("b -" +matcher5.matches());


        /**
         * 
         * [a-z] - a to z single character
         * [a-z0-9] - a to z and 0 to 9 single character
         * [a-z0-9A-Z] - a to z and 0 to 9 and A to Z
         * [a-zA-Z]+ - a to z and A to Z ---one or more chars
         * [a-zA-Z]* - a to z and A to Z ---zero or more chars
         * [a-zA-Z0-9#]* - a to z and A to Z  and # ---zero or more chars
         * [0-9]{10} - 10 digits  ex -mobile number
         * ^[a-zA-z1-9$-_]+@[a-z]+\.[a-z]{2,}$ - email
         * ^[a-zA-z@$]+$ - for chars with @ and $ only 
         */

        




        while(true){

            System.out.println("enter the Regular Expression :");
            Scanner sc = new Scanner(System.in);
    
            String regix = sc.nextLine();
            
            System.out.println("enter your String :");
    
            String inputt = sc.nextLine();
    
            checkStrWithRE(regix, inputt);

            System.out.println("want to exit (y/n) :");
            String exit = sc.nextLine();
            if(exit.equalsIgnoreCase("y")) break;
        }

    }





    public static void checkStrWithRE(String regix, String input) {
        Pattern pattern = Pattern.compile(regix);

        Matcher matcher = pattern.matcher(input);
        boolean isMatching = matcher.matches();
        System.out.println(isMatching);
    }
}
