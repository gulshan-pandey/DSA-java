import java.util.*;

public class Operators {
    public static void main(String[] args) {
        //precidence and associativity(if two operators have same precidence than  use left to right)
        int a=6*5-34/2;
        /*
           =30-17
           =13 this is the order that this will happen
           */
        int b=60/5-34*2;
        /*
        here the / and * has same precidence so we will make operation left to right  
         =12-68
         =-56
        */
        System.out.println(a);
        System.out.println(b);

        //practice questions
        //1
        int x=6;
        int y=1;
        int k=x*y/2; 
        System.out.println(k);
        //here the prececency will left to right

        //question 2 formula of discriminant

        int c=2;
        int d=-3;
        int e=4;
        int f= (d*d-4*c*e)/(2*c);
        System.out.println("the discriminant of 2 -3 4 is : " +f);

        //logical operators
        System.out.println(6<4 && 5>4);

        System.out.println(44>33 || 4<1);

        System.out.println(54>44);

        //leftshift operator  
        //remember this operator is generally used in DSA in order to raise the power of the perticular number 

        //program to write the power of 2 upto n times
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int numver = sc.nextInt();
         
        int result = numver <<4;
        System.out.println("ur result is " + result);

        //Similarly when we right shift the result then the number get divide in the order of powers
          



    // make a program to find the odd and even on the basis of bitwise opertor😎😎😎😎

        int num = sc.nextInt();
        if((num&1)==1){
            System.out.println(num + "is odd ");
        }
        else System.out.println(num+ " is even");
        




    }
}
