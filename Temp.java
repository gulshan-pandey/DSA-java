import java.util.Scanner;

public class Temp {
    public static void result() {
        Scanner sc = new Scanner(System.in);
        int a = 20;

        for (int i = 0; i < 10; i++) {
            System.out.println("enter the number : ");
            int b = sc.nextInt();
            try {
                int c = a / b;
                System.out.println(c);
                break;
            } catch (Exception e) {
                System.out.println("error hogya ji");
            } finally {
                System.out.println("terminated");
            }
        }

    }

    public static void main(String[] args) {

        result();
    }

}