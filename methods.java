import java.util.*;
public class methods {
    
    //1st fn
    static int logic(int x,int y){ //it works as a function in java also static is used for sarvjanik function else we will have to create the new object to access this function
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y) *5;
        }
        return z;
    }
    // 2nd fn
    static void telljoke(){
        System.out.println("🥲I dont have any...");
    }
    //3rd fn
    static void change(int i){
        i=100;
    }
    //4th fn
    static void change2(int [] arr){
        arr[1]=555;
    }
    //5th fn
    static void hurr(){
        System.out.println("love you ");
    }
    static void hurr( int a){
        System.out.println(" love you " + a);
    }
    static void hurr(int a,int b){ // perameters are just the placeholders
        System.out.println(" love you  " + a +" " + b);
    }
    

    
    //VARARGS---- it is used to get the n number of arguments in it to perform the operation 
    
    static int sum1(int a ,int b){
        return a+b;
    }
    
    static int sum2(int a, int b , int c){
        return a+b+c;
    }

    
    //suppose if we dont know the number of parameters for operation 
    
    static int sum(int x ,int ...arr){ //this is varargs
        //available as int [] arr; and it needs atleast one argument compulsorily
        int result =0;
        for(int a : arr){
            result+=a;
        }
        return result;
    }
    


    //program to sum all the digits of the numbers
    
    public static int sumOfDigits(int i){
        int sum=0;
        while(i!=0){
            sum=sum+i%10;
            i/=10;
            
        }
        return sum;
    }
    


    
    //wap to print the LCM of 2 numbers
    
    static void LCM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int num = sc.nextInt();
        System.out.println("enter the second number :");
        int num2 = sc.nextInt();
        int value=1;
        while(true){
            if((value%num==0) && (value%num2==0)){
                
                System.out.println(value);
                break;
            }
            value++;
        }

        //alternatively by using table method means table of first number gives the lcm of both numbers

        // int i=1;
        // while(true){
        //     int value =num*i;
        //     if(value% num2==0){
    
        //         System.out.println(value);
        //         break;
        //     }
        //     i++;
        // }
        sc.close();

}




//WAP to find the GCD of two numbers


static void GCD(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number :");
    int num = sc.nextInt();
    System.out.println("enter the second number :");
    int num2 = sc.nextInt();
    int value = num;
    while(true){

        if(num2%value ==0 && num%value==0){
            System.out.println(value);
            break;
        }
         value--;
    }

    sc.close();
}



//wap to find weather the input number is prime or not


public static void primeNumber(){

    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the number in order to check prime: ");
    int number = sc.nextInt();
    boolean isprime = true;
    for(int i=2;i<number;i++){
        if(number%i==0){
          isprime =false;
            break;
        } 
    
}
if(isprime){
    System.out.println(number + " is prime");
} else System.out.println(number+ " is not prime");

}



//WAP to reverese the number you enter


public static void reverseNumber(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to reverse it : ");
    int numb =sc.nextInt();
 
    int reversed=0;
    while(numb>0){
     reversed = (reversed*10) + numb%10;
     numb/=10;
    }
    System.out.println("your number is : "+ reversed);
    sc.close();
  }




    public static void fibonnac(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number upto which you want the fibonnac series");
        int nmbr = input.nextInt();
        int first =0;
        int second = 1;
        if(nmbr==0) return;
        System.out.print(0 + " ");
        if(nmbr==1) return;
        System.out.print(1 + " ");
        while(first+second<=nmbr){
         int temp = first+ second;
         System.out.print(temp + " ");
         first= second;
         second= temp;

        }
        input.close();
    }



    //WAP to check the armstrong numbers ie 153,370...

    public static void isArmstrong() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to find armstrong");
        int nmbr = input.nextInt();
        int originalNumber= nmbr;
        int digit = 0;
        double sum = 0;

        while (nmbr > 0) {
            digit = nmbr % 10;
            nmbr = nmbr / 10;
            sum = sum + Math.pow(digit, counting(originalNumber));
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an armstrong number");
        } else
            System.out.println("it is not armstrong number");

            input.close();
    }

    public static int counting(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }




// WAP to check the input number is palindrome or not 

public static void palindrome(){  //equalize the number with its reverse number is called palindrome
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number in order to check it is palindrome or not ");
    int num= sc.nextInt();
    int ognum= num;  //copy number
    int rev= 0;
    while(ognum>0){
        rev= (rev*10) + ognum%10;
        ognum/=10;

    }
    if(rev==num){
        System.out.println(num + " is an palindrome number " );
    } else System.out.println(num + " is not a plaindrome");

    sc.close();
}


//check if the array is sorted or not



public static void sorted(int[] arr) {
    boolean isAscending = true;
    boolean isDecending = true;

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            isAscending = false; 
        }
        if(arr[i] < arr[i + 1]){
          isDecending=false;
        }
    }
    sort(isAscending,isDecending);

}

public static void sort(boolean a,boolean b){
    if(a ||b ){
        System.out.println("your array is sorted !");
    } else System.out.println("your array is not sorted !");
}





    public static void main(String[] args) {
        int a= 5;
        int b= 3;
        int c= logic(a,b);
        // methods obj = new methods(); //here we are creating the new class of the method so that we can access the function 
        // int c = obj.logic(a,b);

        int a1= 4;
        int b1 = 9;
        int c1= logic(a1,b1);
        // int c1 = obj.logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);
        telljoke();

        //CASE 1 trying to change the integer value
        int x= 45;
        change(x);
        System.out.println("the value of the x is : " + x); // here you can see copy of the x was went in the function and the actual value is always the same
         
        //CASE 2 Trying to chnage the Array value throungh function
        int [] arr ={22,33,44,55};

        change2(arr); //this will copy the refrence/address of the array which also dipicts the same array so any change will lead to the chnage in the actual values of array
        System.out.println("the value of arr[1] is : " + arr[1]);


        //Method overloading
        hurr();
        hurr(3000);
        hurr(3000,6000); //arguments are the actuals

       //varargs
        System.out.println("the sum of 5 and 6 is : " + sum1(5,6));
        System.out.println("the sum of 2,3,4 is : " + sum2(2,3,4));

        System.out.print("using varargs(int ...arr) sum of n numbers are : ");
        System.out.println(sum(2,52,5,3,7,8,13));
        // System.out.println(sum()); //remember this is zero as array will be an empty array if we dont add any compulsory peramenter!
        
        System.out.println("the sum of 12345 by using sum of digits method: " + sumOfDigits(12345));


        LCM(); //😎😎😎
    
        GCD();

         
        primeNumber();


        reverseNumber();


        fibonnac();


        isArmstrong();


        palindrome();//😎😎😎😎😎😎😎


        int[] isSortedArray = arrayUtility.inputArray();
        sorted(isSortedArray);



    }
}
