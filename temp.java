import java.util.*;

public class temp {

  public static long factorial(long num) {
    if (num == 1) {
      return 1;
    } else {
     
      num = num * factorial(num - 1);
      return num;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number you want the factorial of !");
    int fac = sc.nextInt();
    long total = factorial(fac);
    System.out.println(total);

  }

}
