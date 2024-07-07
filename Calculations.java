
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        //result of float a= 7/4*0/2
        float a=7/4*9/2;
        System.out.println(a);
        //here the answer will be 4 bcz the 7 and 4  are written in int format so the result of them will be come and converted into int format and then the final answer will converted into float


        // question 2  encrypt and decrypt the grade u have got and add it by 8 so that ur friend can decrypt it
    char grade='B';
    grade=(char)(grade+8);
        System.out.println(grade);

        //now decryption
        grade=(char)(grade-8); // the decryptor will substract 8 from the sent grade to him and then convert it into char
        System.out.println(grade);


        //program to use comparison operator to find out weather a given number is greater than the user entered number or not
        System.out.println("enter a number");
        Scanner s= new Scanner(System.in);
        int zzz= s.nextInt();
        System.out.println(zzz<55);






        //interview question

       
                int i = 11;    // Initial value of i
                i = i++ + ++i; // i++ returns 11, then i becomes 12
                              // ++i increments 12 to 13 and returns 13
                              // So the expression becomes 11 + 13
                              // The result is 24
                System.out.println(i); // Output is 24
            
                System.out.println("\n\n");
        
                int j=11, k=22, l;
                l= j+k + j++ + k++ + ++j + ++k;
                System.out.println(l);
                System.out.println(j);
                System.out.println(k);






    }
}
