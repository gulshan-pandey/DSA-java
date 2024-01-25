import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // there are 3 main ways to create an array in java
        // 1. Declaration and memory allocation
        // int [] marks =new int[5]; //here 5 is the array size

        // 2 declaration and then memory allocation
        // int [] marks ;
        // marks =new int[5];

        // Initialization
        // marks[0]=100;
        // marks[1]=102;
        // marks[2]=103;
        // marks[3]=104;
        // marks[4]=105;
        // System.out.println(marks[4]);

        // 3. Declaration,memory allocaton and initialization together
        int[] arr = { 22, 45, 22, 5, 3 };
        System.out.println(arr); // it will print the corresponding array to its memory address

        // float [] markss ={23.3f,45.5f,26.6f,5.5f,743.7f};
        // System.out.println("markss[4]= " + markss[4]);
        // System.out.println("length of the markss array is : " + markss.length);

        // String [] names ={"golu","molu","uday","rohan","ronak","guri"};
        // System.out.println("the element of name array is : " + names[2]); //uday
        // System.out.println("and the length of th names array is " + names.length);
        // //5

        int[] marks = { 67, 86, 80, 86, 8, 89 };
        System.out.println("marks[2]: " + marks[2]);
        System.out.println("the length of the array is : " + marks.length);

        // accessing the array
        System.out.println("  accessing the array using the forloop");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        // Print the elements of the array in reverse order
        System.out.println("\n Elements in reverse order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(i + " :" + marks[i]);
        }

        System.out.println("\nforEach loop ---------------------------------------------");

        // Print the elements of the array using forEach loop
        for (int a : marks) { // that a will iterate over each elements of the array
            System.out.print(a + " ");
        }
        System.out.println("\nArray class name: " + marks.getClass().getName());

        System.out.println("Multidimentional array ---------------------");

        int[][] flats; // 2-D array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int b = 0; b < flats.length; b++) {
            for (int c = 0; c < flats[b].length; c++) {
                System.out.print(flats[b][c]);
                System.out.print(" ");

            }
            System.out.println();

        }

        System.out.println("questions-----------------------------------");

        // //create an array of 5 floats and calclate their sum

        // float [] numbs ={11.2f,34.2f,42.6f,675.7f};
        // float sum =0;
        // for(int i=0;i<numbs.length;i++){
        // sum=sum + numbs[i];
        // }
        // System.out.println("the sum of all the floats is : " + sum);

        // using foreach loop

        float[] numbs = { 11.2f, 34.2f, 42.6f, 675.7f };
        // create an array and sum of all the elements
        float sum = 0;
        for (float elements : numbs) {
            sum = sum + elements;
        }
        System.out.println("the sum of float array is : " + sum);

        // WAP to findout weather a given integer is present in an array or not

        int[] ar = { 11, 22, 33, 44, 66, 77 };
        int numm = 44;
        boolean found = false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == numm) {
                found = true;
                break;
            }
        }
        System.out.println(found);

        // Question calculate the avg marks from an array containg marks of all
        // staudents in physics using forEach loop

        // int [] mark={8,58,68,69,76,97};
        // float sum =0;
        // for(int g: mark){ //forEach loop
        // sum=sum+ g;

        // }
        // System.out.println("the avg is : " + sum/mark.length);

        // Create a java program to add 2 matrix of sixe 2X3

        int[][] mat1 = { { 2, 7, 3 }, // 2 rows and 3 columns
                { 7, 4, 9 } };
        int[][] mat2 = { { 5, 8, 3 },
                { 9, 3, 1 } };

        int[][] result = { { 0, 0, 0 },
                { 0, 0, 0 } };

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {

                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // WAP to take the input and make them into an array

        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the size of the array : ");
        // int size = sc.nextInt();
        // int [] arey= new int[size];
        // for (int i=0; i<arey.length;i++){
        // System.out.println("enter the element of array");
        // arey[i]=sc.nextInt();

        // }
        // System.out.println("your array is : ");
        // for(int j : arey){
        // System.out.print(j + " ");

        // }

      
     // "taking input the elements of the array by using utility class: this is done by making an another utility class of array at different file and then call that class's method"

        int[] numArray = arrayUtility.inputArray();

        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }

        System.out.println("\n\n");

        // WAP to reverse an array

        // int [] ary = { 22,33,44,55,66,77,88,99};
        // for(int i= ary.length-1;i>=0;i--){
        // System.out.print(ary[i] + " ");
        // }

        // int a = Math.floor(3.8) => is 3.0
        // int a = Math.floor(5.2) => is 5.0 //this returnes the float greatest value of
        // any number

        // in b =Math.floorDiv(5,2)=> is 2 it is similar to Math.floor but it gives the
        // int value

        // WAP to reverse an array---SWAP method

        // ---------------------------IMP QUE --------------------------------

        // int [] arr ={1,2,3,4,5,6,7,8,9,10};
        // int n =Math.floorDiv(arr.length,2); //this will return the greatest integer
        // of the array.length/2 means the middle number till which the swapping will
        // happen
        // int temp; //creating the temp storage so that the data lose will not happen
        // and swapped esaily
        // int l= arr.length;
        // for(int i=0;i<=n;i++){
        // temp= arr[i];
        // arr[i]=arr[l-i-1];
        // arr[l-i-1]=temp;
        // }
        // System.out.println("the reverse of the array is : ");
        // for(int element : arr){
        // System.out.print(element + " " );
        // }

        // QUestion WAP to find the maximum element in an array

        // int [] arr={24,6,2,89,73,90};
        // int max= arr[0];

        // for(int i=0;i<arr.length;i++){
        // if(arr[i]>max){
        // max=arr[i];
        // }

        // }
        // System.out.println(max);

        // alternatively-----------------------------------------------------

        // int [] arr={24,6,2,89,73,90};
        // int max= 0;

        // for(int i: arr){ //done by using forEach loop
        // if(i>max){
        // max=i;
        // }

        // }
        // System.out.println(max);

        // for finding the smallest in array

        // int [] arr={24,6,2,89,73,90};
        // int temp= arr[0];

        // for(int i=0;i<arr.length;i++){
        // if(arr[i]<temp){
        // temp=arr[i];
        // }

        // }
        // System.out.println(temp);

        // QUE to test weather the given array is sorted of not

        int[] ary = { 24, 142, 5, 125, 36, 7, 3, 783 };
        boolean isSorted = true; // Assume the array is sorted initially

        for (int i = 0; i < ary.length - 1; i++) {
            if (ary[i] >= ary[i + 1]) {
                isSorted = false;
                break;
                // If an unsorted pair is found, no need to continue checking
            }

        }

        if (isSorted) {
            System.out.println("yes this array is sorted");
        } else {
            System.out.println("this array is not sorted");
        }

        // WAP to take the input the numbers in the aaray and reverse those numbers

        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an empty array
        int[] numbers = new int[size];

        // Input numbers into the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Reverse the numbers based on the index of the array
        for (int i = 0; i < size / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // WAP to input an array and find the number of occurences of the input element
        // in that array

        int[] occArray = arrayUtility.inputArray();

        System.out.println("now enter the number you want to find: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int occurences = 0;
        for (int element : occArray) {
            if (element == inputNumber) {
                occurences++;
            }

        }
        System.out.println("the no. of occurences of ur number is : " + occurences);


        
        //WAP for to find the minimum and the maximum elements of the array


        // int[] minMax = arrayUtility.inputArray();

        // int minEle = minMax[0];
        // int i = 0;
        // while (i < minMax.length) {
        //     if (minEle > minMax[i]) {
        //         minEle = minMax[i];
        //     }
        //     i++;
        // }
        // System.out.println("the minimum element is : " + minEle);
        
        // int maxEle = minMax[minMax.length-1];
        // int j= minMax.length-1;
        // while(j>0){

        //     if(maxEle<minMax[j]){
        //         maxEle=minMax[j];
        //     }
        //     j--;

        // }
        // System.out.println("the max element of the array is :" + maxEle);



         
    }

}
