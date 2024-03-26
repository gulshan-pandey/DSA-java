import java.util.Scanner;
public class LoanProvider {
    public static void main(String[] args) {
        
    int AccNum;
    int salary;
    int AccBal;
    final int MAX_ACC_NUM = 1999;
    final int MIN_ACC_NUM =1000;
    final int MIN_ACCOUNT_BALANCE=1000;
    final int MAX_CAR_LOAN_AMT=100000;
    final int MAX_CAR_EMI =24;
    final int MAX_STARTUP_LOAN=200000;
    final int MAX_STARTUP_EMI=36;
    final int MAX_HOUSE_LOAN= 500000;
    final int MaxHouseEmiMAX_HOUSE_EMI = 36;
    final int MIN_SALARY = 20000;

    //checking
    Scanner sc = new Scanner(System.in);
    while(true){
    System.out.println("welcome to Loan hub");
    System.out.println("enter your Account number :");
    AccNum= sc.nextInt();
    if(AccNum>MIN_ACC_NUM&& AccNum<MAX_ACC_NUM){
    break;
    }else System.out.println("please enter the valid Account number !");
    }

    System.out.println("enter your Account balance :");
    AccBal= sc.nextInt();
    if(AccBal>MIN_ACCOUNT_BALANCE){

    }else {System.out.println("Your account balance is too low so you are not elligible for loan!");
    return;
    }

   System.out.println("enter your salary");
   salary = sc.nextInt();
   if(salary>MIN_SALARY){

   }else{
    System.out.println("your salary is too low to get the loan");
    return;
   }

    int type; int loanAmt; int Emi;
    int maxLoanAmount=0; int maxEmi=0;

    System.out.println("Enter your loan type: \n "+
                         "1. for car loan \n"+
                         "2. for Startup loan \n"+
                         "3. for House loan \n ");
    type=sc.nextInt();

    System.out.println("Enter the amount you wan to borrow ");
    loanAmt= sc.nextInt();

    System.out.println("enter how many Emis you want?");
    Emi = sc.nextInt();

   
  

    switch (type) {
        case 1:
          maxLoanAmount = MAX_CAR_LOAN_AMT;
          maxEmi= MAX_CAR_EMI;
            break;
        case 2:
           maxLoanAmount =MAX_STARTUP_LOAN;
           maxEmi= MAX_STARTUP_EMI;
           break;
        case 3:
            maxLoanAmount= MAX_HOUSE_LOAN;
            maxEmi= MaxHouseEmiMAX_HOUSE_EMI;
           break;
        default:
            System.out.println("please enter valid type");
      }
    
     if(loanAmt<maxLoanAmount && Emi<maxEmi){
        System.out.println("congrats the loan amoutnt will be credit in your Account shortly");
     }else System.out.println("sorry your criteria dont match the appropriate loan constraints");


    }

}
