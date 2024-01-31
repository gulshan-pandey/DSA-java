import java.util.*;





public class temp{
  
  public static long factorial(long num){
    if(num==1){
        return 1;
    }
    else{
      System.out.println("fn called for : "+ num);
        num= num*factorial(num-1);
        return num;
    }

  }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want the factorial of !");
        int fac = sc.nextInt();
        long total= factorial(fac);
        System.out.println(total);
        
      
        
System.out.print("enter the no. how much u want to print the odd no.: ");
int y= sc.nextInt();
for(int z=1;z<y;z=z+2){
    System.out.println(z);
}

    


     
    }


}