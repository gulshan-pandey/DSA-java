
import java.util.*;

public class Recursions {

    static int fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            System.out.println("fn called for : " + x);
            return x * fact(x - 1);
        }
    }

    // iteratively

    static int factIterative(int y) {
        
            int product = 1;
            for (int i = 1; i <= y; i++) {
                product = product * i;
            }
            return product;
        
    }

    // WAP to find febonnaci series using loops

    static void febo(int n) {
        int x = 0;
        int y = 1;
        for (int i = 1; i <= n; i++) {

            int temp = x + y;
            System.out.println(x);
            x = y;
            y = temp;

        }
    }

    // finding fibonacci of n numbers using recursions

    public static int fib(int n) {
        System.out.print(".");
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


    // WAP to check the input string is palindrome or not

    // iteration method

    public static boolean isPalindromeStr(String str) {
        int l = str.length() - 1;
        for (int i = 0; i <= l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i)) {
                return false;
            }
        }
        return true;
    }

    // RECURSION METHOD

    public static boolean palinStr(String str) {

        if (str.length() <= 1) {
            return true;
        }
        int length = str.length() - 1;
        if (str.charAt(0) != str.charAt(length)) {
            return false;
        }
        String strng = str.substring(1, length);  // the length is exclusive
        System.out.print("*" + " "); //this is for checking that how many time thi recursion is called

        return palinStr(strng);

    }




    public static void star(int n) {
        if (n == 1) {
            System.out.print("* ");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            star(n - 1); 
        }
    }


    //finding the number of digits in a number
  public static int  countDig(int num){
     if(num==0) return 0;
     
     return 1 + countDig(num/10);
     
  }







    public static void main(String[] args) {

        int n = 5;
        System.out.println("the factorial is : " + fact(n));

        System.out.println("the factorial by using iterative approach is : " + factIterative(n));


        int m = 7;
        febo(m);    // 7 febonacci terms

        // iteraive approach
        System.out.println("enter the number upto which u want to get the fibonnac numbers...");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i <= count; i++) {
            System.out.println(fib(i) + " ");
        }

        // string palindrome

        System.out.println("Enter the string to check if it is a palindrome:");
        String word = sc.next();
        System.out.println((isPalindromeStr(word)) ? ("It is a palindrome") : ("It is not a palindrome"));


        //RECURSIVE APPROACH

        System.out.println(
                "weclome to String palindrome checker ! \n\n please enter the word to check if it is palindrome ");
        String wrd = sc.next();
        System.out.println("your word is " + ((palinStr(wrd)) ? " palindrome" : "not a palindrome word"));


        var num = countDig(978);
        System.out.println("\n\n the number of digits in a number is : " + num);
    }
}
