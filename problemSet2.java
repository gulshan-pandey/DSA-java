
import java.util.Scanner;

public class problemSet2 {
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







    }
}
