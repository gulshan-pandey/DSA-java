
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




        // handling multiple Exceptions

        // int [] marks = new int [3];
        // marks[0]=44;
        // marks[1]=44;
        // marks[2]=44;

        Scanner sc = new Scanner(System.in);
        
        // try{
        // System.out.println("enter the index of the Array : " );
        // int i=sc.nextInt();

        // System.out.println("enter the number U want to divide the value with : " );
        // int num= sc.nextInt();


        
        // System.out.println("your value is : " + marks[i]);
        // System.out.println("your divided value is : " + marks[i]/num);
        // }
     

        // catch(InputMismatchException e ){
        //     System.out.println("Input mismatch "  + e);
        //     sc.next();
        // }
        // catch(ArrayIndexOutOfBoundsException e ){
        //     System.out.println("Array out of bound  "  + e);
        // }
        // catch(Exception e){ // this it the generic exception which can collect all the exceptins
        //     System.out.println("other error occured");
        // }
    


 //WAP to keep enter the index from the user and if it is incorrect 5 times ,the program exits

        int[] arr = new int[4];
        
        arr[0] = 44;
        arr[1] = 44;
        arr[2] = 45;
        arr[3] = 90;
     
        
        boolean flag = true;
        int i=0;
        while (flag && i<5) {
            System.out.println("enter index of the array to show elements : ");
            try {
                int ind = sc.nextInt();
                System.out.println("welcome");
                try {
                    System.out.println(arr[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("exception occured " + e);
                    i++; //there are only 5 wrong inputs allowed
                }
            } catch (Exception e) {
                System.out.println("other exception occured level 1 " + e);
                i++;
                sc.next(); //it prevents the infinite loop 
                
            }
            if(i>=5){
                System.out.println("maximum limit exeeded you have entred wrong keys 5times!");
            }
        } //while loop ended
        System.out.println("thanks for coding");
    }

    
            // for(int i =0;i<5;i++){
            
            // System.out.println("enter the number1 : ");
            // try{
            // int x = sc.nextInt();
            // System.out.println("enter the second number : ");
            // int y = sc. nextInt();
        
            // int caluclate = a/b;
        
            // System.out.println("the vlaue is : " + caluclate);}
            // catch(InputMismatchException Exception ){
            //     System.out.println("please provide required input!");
            //     sc.next();
        
            // }
            // catch(ArithmeticException Exception){
            //     System.out.println("oops you divdied it by zero!");
            // }
        
            // }


        }
        
        

    