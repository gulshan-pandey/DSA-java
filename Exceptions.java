import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions{

    public static void main(String[] args) {
         int a = 6000;
         int b = 0;
        //without using try
        //  int c = a/b;
         

        //using try method
        try{
            int c = a/b;
            System.out.println( "the result is c : " + c);
        }
        catch(Exception e){
            System.out.println("failed");
            System.out.println(e);

        }
 
        System.out.println("program ends here");



        //handling multiple Exceptions

        int [] marks = new int [3];
        marks[0]=44;
        marks[1]=44;
        marks[2]=44;

        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("enter the index of the Array : " );
        int i=sc.nextInt();

        System.out.println("enter the number U want to divide the value with : " );
        int num= sc.nextInt();


        
        System.out.println("your value is : " + marks[i]);
        System.out.println("your divided value is : " + marks[i]/num);
        }
     

        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Array out of bound  "  + e);
        }
        catch(InputMismatchException e ){
            System.out.println("Input mismatch "  + e);
        }
        catch(Exception e){
            System.out.println("other erroe occured");
        }
    


 //WAP to keep enter the index fromt he user until get correct index
 


        int[] arr = new int[3];
        
        arr[0] = 44;
        arr[1] = 44;
        arr[2] = 45;
     
        boolean flag = true;
        while (flag) {
            System.out.println("Enter an index:");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome");
                try {
                    System.out.println(arr[ind]);
                 flag = false; // Set flag to false to exit the loop
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array out of bounds");

            }catch (InputMismatchException e) {
                System.out.println("Input mismatch occurred. Please enter an integer value.");
                // Clearing the invalid input
                sc.nextLine();}
            } catch (Exception e) {
                System.out.println("Another exception occurred");
            }
            System.out.println("Thanks");
        }
    }
}

    