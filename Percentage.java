
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        /*write a program to calculate percent of a given student in VBSE board exam .his marks from 5 subjests must be taken as input from the keyboard out of 100 marks */

      Scanner sc =new Scanner(System.in);

      System.out.println("enter your first no out of hundred");
      int a =sc.nextInt();

      System.out.println("enter your sec no out of hundred");
        int b =sc.nextInt();

        System.out.println("enter your third no out of hundred");
        int c =sc.nextInt();

        System.out.println("enter your 4th no out of hunderd");
        int d =sc.nextInt();

        System.out.println("enter your 5th no out of hunderd" );
        int e=sc.nextInt();

        float f= (float) (a+b+c+d+e)/500; //here the typecasting has been done
      System.out.println("Your percent is " + f * 100 + "%");

//      question2 wap to print hello ur name have a good day

      System.out.println("what is your name");
      Scanner sp =new Scanner(System.in);
     String name=sp.next();
      System.out.println("have a beautiful day " +name  +" see uh");


//      Qurstion 3 is the number entered int or not

      System.out.println("please enter the number");
      Scanner s=new Scanner(System.in);
      System.out.println(s.hasNextInt());





    }
}
