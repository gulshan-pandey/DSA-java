import java.util.Scanner;

public class ArrayUtility {

    // here we dumped all the methods static means that we will be able to access those methods without making the object of the arrayUtility class ,we can call it just by writing the name of this class followed by . and write the name of the name of the methods


    // these are the type of the procedural programming in which it is shared between the classes,so dont use it too much in OOPs

    //just like we call this utility class in another classes without making the object of this utility class the  JVM does this too to run our all programs  calling it like { class's name.main}!!!
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();

        int[] arey = new int[size];

        for (int i = 0; i < arey.length; i++) {
            System.out.println("enter the element " + (i + 1) + " : ");
            arey[i] = sc.nextInt();

        }

        return arey;
    }

    public static void displayArray(int[] numArray) {
        int z = 0;
        while (z < numArray.length) {
            System.out.print(numArray[z] + " ");
            z++;
        }

    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows  : ");
        int rows = sc.nextInt();
        System.out.println("enter the no. of columns  : ");
        int columns = sc.nextInt();

        int[][] arey = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("enter the element rows " + " , column: ");

                arey[i][j] = sc.nextInt();
            }

        }
        display2DArray(arey);
        return arey;
    }

    public static void display2DArray(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); // Move to the next line for a new row
        }
    }

    public static void main(String[] args) {

    }
}
