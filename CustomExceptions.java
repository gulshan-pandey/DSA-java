import java.util.Scanner;

class myException extends Exception { // here i created my own exception class by extending Exception class
    
    @Override
    public String toString() { // now overriding the methods to show when the exception occurs :if we dont override the toString,it will just print the class name
        return super.toString() + "i am toString()";  // it just prints the class name
    }
    
    @Override
    public String getMessage() { //if we dont override the getMessage then null will be printed, indicates you havent properly defined your custom exception class! 
        return super.getMessage() + " this is get messsage"; //it will print the message on the console
    }
    
}
 




class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public String getMessage() {   //if we dont override the getMessage then null will be printed which indicatesthat you havent properly defined your custom exception class! 
        return "age cannot be less than 0 or greater than 125!!!";
    }
}



class MaxRetriesException extends Exception{

    @Override
    public String toString() {
        return "\n MaxRetriesException error : "+ getMessage();
    }

    @Override
    public String getMessage() {
        return "you exeeded maximum tries!";
    }
}



public class CustomExceptions {
public static void main(String[] args) {

    
    //  System.out.println("Enter the number");
    //  Scanner sc = new Scanner( System.in);
    //  int a = sc.nextInt();
    //  if(a<9){
    //     try {
    //         throw new myException();  //throw keyword is used to throw an exception explicitly by the programmer
    //     } 
    //     catch (Exception e) {
    //         System.out.println(e);
    //        System.out.println(e.getMessage()); 
    //        System.out.println(e.toString()); 
    //        e.printStackTrace();
    //        System.out.println("done");
    //     }
    //  }


  
    //Suppose i am making the project which evaluates the maximum age of the human ,so in that case age must in 1-125 and if somebody enter it incorrectly then the exception must be thrown 

     System.out.println("Enter the  age");
     Scanner sc = new Scanner( System.in);
     int age = sc.nextInt();

     if(age>125 || age<1){
        try{
       throw new MaxAgeException();   //throw keyword is used to throw an exception explicitly by the programmer and this is done by maiking customException's object
     }catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
     }finally{
        System.out.println(" \n \n finally block is always executed regardless of any try catch block ecxcuted or not,further more finally is generally used for closing resource like files or database ");
     }

    }


    
    
 //WAP to keep enter the index from the user and if it is incorrect 5 times ,the program exits





 int[] arr = new int[4];
        // 
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
             i++;
         }
     } catch (Exception e) {
         System.out.println("other exception occured level 1 " + e);
         i++;
         sc.next(); //it prevents the infinite loop 
         
     }
     if(i>=5){
        try{
         throw new MaxRetriesException ();
        }catch(MaxRetriesException  e){
            System.out.println(e);
        }
     }
    }
    System.out.println("thanks for coding");
}


}

