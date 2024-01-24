import java.util.*;

public class temp {
   
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
      int[] arr = new int[size];
        System.out.println("enter the elements of the array : ");
        for(int i=0; i<size;i++){
            arr[i]= sc.nextInt();
        }

      int sum =0;
      for(int i=0;i<arr.length;i++){
        sum +=arr[i];
      }
    System.out.println("the sum of all the lements of the array is : "  + sum);


     float avg = (float) sum/arr.length;
     System.out.println("and the avg is : " + avg);


    }
}
