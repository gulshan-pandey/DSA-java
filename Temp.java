import java.util.Scanner;

class myException extends Exception { // here i created my own exception class

    @Override
    public String toString() { // now overriding the methods to show when the exception occurs
        return super.toString() + "i am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " this is get messsage";
    }

}

class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class Temp {

    public static void main(String[] args) {
    //  System.out.println("Enter the number");
    //  Scanner sc = new Scanner( System.in);
    //  int a = sc.nextInt();
    //  if(a<9){
    //     try {
    //         throw new myException();
    //     } 
    //     catch (Exception e) {
    //        System.out.println(e.getMessage()); 
    //        System.out.println(e.toString()); 
    //        e.printStackTrace();
    //        System.out.println("done");
    //     }
    //  }




     System.out.println("Enter the  age");
     Scanner sc = new Scanner( System.in);
     int age = sc.nextInt();

     if(age>125){
        try{
       throw new MaxAgeException();
     }catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
     }
    }






        
    }
}
