import java.util.*;
public class iterations {




    public static void main(String[] args) {
       
    //while loop-------------------------------------

    // int i =0;
    // while(i<6){
    //     System.out.println(i);
    //     i++;
    // }
   
    // System.out.println("\n");

    // wap to print from 100 to 200
    // int j=100;
    // while(j<=200){
    //     System.out.println(j);
    //     j++;
    // }
       
    //do while loop --------------------------------------------
    
        //  syntax
    //  do{
    //     //code
    //  }while(condition);

    //wap to print first n natural no.using do-while loop

// System.out.print("enter no. till u want to print : ");
    Scanner sc= new Scanner(System.in);
//     int n= sc.nextInt();
//     int k=0;
//     do{
//         System.out.println(k);
//         k++;
//     }
//     while(k<n);

//for loop ----------------------------------------------------

//generally for loop is used to exectute the things for specific no. of times.
// for(int l=0;l<10;l++){
//     System.out.println(l);
// }

//wap to print first n odd no.s using for loop


// System.out.print("enter the no. how much u want to print the odd no.: ");
// int y= sc.nextInt();
// for(int z=1;z<y;z=z+1){
//     System.out.println(2*z+1);
// }

// also 2n= Even no
// and 2n+1 is odd no.

// wap to print first n natural no. in reverse order
// System.out.println("Enter the number of natural numbers you want to print in reverse order:");
// int a = sc.nextInt();
// for (; a > 0; a--) {
//     System.out.println(a);
// }


//break and continue ------------------------------------------

// for(int m =0;m<5;m++){
//     System.out.println("hiii,i am in a loop" +m);
//     if(m==3){
//         System.out.println("loop is broken");
//         break;
//     }

// }


// -----------------------------------------------------
// int p=0;
// do{
//     System.out.println("java is great " +p);
//     if(p==3){
//         System.out.println("loop is broken at 3");
//         break;
//     }
//     p++;
// }
//     while(p<5);
//     System.out.println("loop ends here");

//same work for continue but it just skips the specific step 

// ----------------------------------------------------------

//questions... wap to print star pattern reverse upto 4 rows ans 4 columns

// for(int q=1;q<=4;q++){  //q stands for row and w stands for column
//     for(int w=1;w<=q;w++){
//     System.out.print("*");
// }
// System.out.println();
// }


// System.out.println("\n\n");


// -----------------------------------------------------------------------

//wap to print reverse star pattern

// for(int f=4;f>0;f--){  //f stands for rows and j stands for column
//     for(int j=1;j<=f;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


//alternatively-----------------------------
// for (int i=1;i<=4;i++){
//     for(int j=4;j>=i;j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//using while loop -------------------------------------
//printing star ------------------------------------

// int i=1;
// while(i<=5){
    
// int j=1;
//     while(j<=i){
//         System.out.print("*");
//         j++;
//     }
//     System.out.println();
//     i++;
// }

// -------------------------------------------------------------------

//question wap to sum first n even numbers using while loop

// int n= sc.nextInt();
// int s=0;
// for(int i=1;i<=n;i++){
    
// s=s+(2*i);
// }
// System.out.println(s);

// Alternatively

//int n= sc.nextInt();
// int i=1;
// int sum=0;
// while(i<=n){
//     sum=sum+(2*i);
//     i++;
// }
// System.out.println(sum);




// ---------------------------------------------------------------
//program to print the table of given number

// int i=8;
//     for(int j=1;j<=10;j++){
//         System.out.println(i +"X" +j +"=" + i*j);
    
// }

// -------------------------------------------------------------------
//program to print the table of 10 in reverse order 

// int i=10;
// for(int j=10;j>=1;j--){
//     System.out.println(i + "X" + j + "=" + i*j);
// }

// ---------------------------------------------------------------
// program to find factorial of a given number using for loop

// int i=8;
// int fact =1;
// for(;i>0;i--){
//    fact=fact *i ; 
  
// }
// System.out.println(fact);

//alternively

// int i=8;
// int fact=1;
// while(i!=0){
//     fact =fact *i;
//     i--;
// }
// System.out.println(fact);


//Alternatively

// int n=5;
// int i=1;
// int fact =1;
// while(i<=n){
//     fact =fact*i;
//     i++;
// }
// System.out.println(fact);

// ---------------------------------------------------------------------

//wap to to calculate the sum of the numbers of the table of 8

// int i=8;
// int sum=0;
// for(int j=1;j<=10;j++){
// sum=sum+(i*j);
// }
// System.out.println(sum);
// }

// ---------------------------------------------------------------

//write a program to reverse the number
int rev =0;
System.out.println("enter the number : ");
int num=sc.nextInt();
while(num>0){
    rev = (rev*10) + num %10;
    num = num/10;
}
System.out.println("the rev is : " + rev);

// -------------------------------------------------------

  passChecker();

 }


  // password manager 
  public static void passChecker(){
           
    System.out.println("welcome to password checker !");

    System.out.println("please Set your password : ");
    Scanner sc = new Scanner(System.in);
    int pass = sc.nextInt();
    int pas;

    System.out.println("now in order to unlock ur fone ,");
    do{
      System.out.println("enter your password : ");
      pas = sc.nextInt();

      if(pas!=pass){
        System.out.println("oops you entered wrong password ! , try again");
      }
      else{
        System.out.println("fone is unlocked");
        break;
      }

    }while(true);



  }


    



    }

    

