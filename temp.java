import java.util.*;

public class temp{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("enter 1st no. : ");
        // int num1 = sc.nextInt();
        
        // System.out.println("enter 2nd no. : ");
        // int num2 = sc.nextInt();

        // System.out.println("the greater number is : " + (num1>num2? num1:num2));

        // //odd even ternary

        // System.out.println("welcome to odd even ");

        // System.out.println("enter the number 1: ");
        // int num3 = sc.nextInt();
        

        // System.out.println("enter the number 2: ");
        // int num4 = sc.nextInt();

        // System.out.println("the even number is : " + (num3%2==0?num3:num4));

       //absolut number

    //    System.out.println("enter any number for its absolute number : ");
    //    int num5 = sc.nextInt();
       
    //    System.out.println(num5>=0? num5: -num5);

    // WAP to categorize the students number in high moderate or low

    System.out.println("enter the number of student : ");
    int numb = sc.nextInt();

    System.out.println(numb>80? "High": (numb>50&&numb<80 ? "moderate": "Low") );

    }
}