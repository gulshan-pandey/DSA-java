import java.util.Scanner;

public class arrayUtility {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();

        int[] arey = new int[size];
        System.out.println("enter the element of array");
        for (int i = 0; i < arey.length; i++) {
            arey[i] = sc.nextInt();

        }
        return arey;
    }

    public static void main(String[] args) {

    }
}
