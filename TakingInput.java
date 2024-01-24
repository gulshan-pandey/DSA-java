import java.util.Scanner; //it is the scanner class which is used to take input by making the object of it 
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("it is working");
        System.out.println("now taking the input from the user");

        Scanner sc=new Scanner(System.in);  //here sc is the object of the class Scanner 


        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of these numbers is " +sum);

        System.out.println("enter a decimal number");
        float c= sc.nextFloat();
        System.out.println("the number is " +c);

        System.out.println("now enter the number in order to test it is int or not");
        boolean b1=sc.hasNextInt();//it returnes the boolean value
//        this is basically confirming that the number entered is int or not
//        now talking about the strings stuff
        System.out.println(b1);



        
        System.out.println("write sentence");
        sc.nextLine();
        String chacha =sc.nextLine();
        System.out.println(chacha);


        sc.nextLine(); //the purpose of writing the nextline here is that the sc objects like nextInt and nextFloat will take \n automatically as we pressed enter during input and then the \n will stored in buffer memory and then if we take another of sc.nextLine() then the\n will confilct with nextLine() and program will get teminated
        
        System.out.println("write only a word!!!");
        String str1=sc.next(); //it is used to take the word

        System.out.println(str1);
        
        sc.nextLine();
        
        String str2= sc.nextLine();
        System.out.println(str2);
        
        sc.close();

    }
}
