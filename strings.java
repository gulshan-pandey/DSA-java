
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String name ="rohan";
        String name2=new String("munna"); //another way to define string
//        System.out.print("the name is: ");
//        System.out.print(name );
        //here remember that the println is used for the printing next words with new line, but the 'print' does not include the new line and prints the next words in the same line

        //more diff ways to print things
        int m=66;
        float n=55.333f;
        System.out.printf("the values of m was %d and the value of n is %8.3f",m,n);
        //same as C lang ryt  remember that here %8.3f is mean that the number will occupy 8 digit spaces and the .3 is mean that it will upto 3 decimal point???
        //for taking the string as an input
       //greetings

        System.out.println("hello how are you");
        Scanner s=new Scanner(System.in);
        String ans = s.nextLine();
        System.out.println(ans +"  as well");


    }

}
