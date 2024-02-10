import java.util.InputMismatchException;
import java.util.Scanner;

public class Temp {
    

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    for(int i =0;i<5;i++){
    
    System.out.println("enter the number1 : ");
    try{
    int a = sc.nextInt();
    System.out.println("enter the second number : ");
    int b = sc. nextInt();


    int caluclate = a/b;

    System.out.println("the vlaue is : " + caluclate);}
    catch(InputMismatchException Exception ){
        System.out.println("please provide required input!");
        sc.next();

    }
    catch(ArithmeticException Exception){
        System.out.println("oops you divdied it by zero!");
    }

    }
}

}