import java.util.Scanner;

public class BankProject {
    
    Scanner sc = new Scanner(System.in);

    long accountNumber;
    String accountHolder;
    private long balance;

    public void deposit() {
        System.out.println("enter the amount you want to deposit: ");
        long money= sc.nextLong();
        if (money <= 0) {
            System.out.println("invalid deposit! ");
        } else {
            balance = balance + money;
            System.out.println(money + " rupees deposited successfully!");
        }
    }


    public void withdraw() {
        System.out.println("enter the money you want to withdraw : ");
        long money = sc.nextLong();
        if (balance < money) {
            money = balance;
            balance =0;
            System.out.println("due to issuficient balance "+ money + "  could withdrawn and balance = " + balance);
        } else if(money<=0){
            System.out.println("invalid withdraw!!");
        } else{
            balance = balance - money;
            System.out.println(money + " withdrawn successfully!"+" \n balance = : "+ balance);
        }
    }


    public long viewBalance() {
        return balance;
    }

    public BankProject(String accountHolder, long accountNumber){
          balance = 1000;
          this.accountNumber= accountNumber;
          this.accountHolder = accountHolder;
    }

    public static void main(String[] args) {
        
        BankProject account  = new BankProject( "naresh ",123456789);
 
         account .deposit();
         
         System.out.println( account.accountHolder +   "\'s money is : " + account .balance);
         
         account .deposit();
         System.out.println(account.accountHolder + "  \'s money is : " + account .balance);

         account .withdraw();
         System.out.println("account balance : " + account.balance);

         



     }

}
