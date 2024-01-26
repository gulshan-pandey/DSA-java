import java.util.*;

public class temp{

    public static void main(String[] args) {
        
        System.out.println("enter 1st no. : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        System.out.println("enter 2nd no. : ");
        int num2 = sc.nextInt();

        System.out.println("the greater number is : " + (num1>num2? num1:num2));



    }
}