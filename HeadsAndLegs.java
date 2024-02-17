import java.util.Scanner;

public class HeadsAndLegs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of legs: ");
        int legs = sc.nextInt();
        System.out.println("Enter the number of heads: ");
        int heads = sc.nextInt();

        count(heads, legs);
    }

    public static void count(int heads, int legs) {

        int Rhead;
        int Chead;

        for (Rhead = 0; Rhead <= heads; Rhead++) {
            Chead = heads - Rhead;
            if (((Rhead * 4) + (Chead * 2) == legs) && (Rhead + Chead == heads)) {
                System.out.println("Chicken head count: " + Chead);
                System.out.println("Rabbit head count: " + Rhead);
                return; // exit the method once the solution is found
            }
        }
        System.out.println("No solution found.");
    }
}
