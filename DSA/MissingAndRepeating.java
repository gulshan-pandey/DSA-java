package DSA;

public class MissingAndRepeating {
    /**
     * Given an unsorted array arr of of positive integers. One number 'A' from set {1, 2,....,n} is missing and one number 'B' occurs twice in array. Find numbers A and B.

        Examples

        Input: arr[] = [2, 2]
        Output: 2 1
        Explanation: Repeating number is 2 and smallest positive missing number is 1.

        
        Input: arr[] = [1, 3, 3] 
        Output: 3 2
        Explanation: Repeating number is 3 and smallest positive missing number is 2.

        Expected Time Complexity: O(n)
        Expected Auxiliary Space: O(1)
     */
}



// tutorial--> https://www.youtube.com/watch?v=9P7JDlQp-yo

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int[] ans =new int[2];
        for(int i=0; i<arr.length; i++){
            int element= Math.abs(arr[i]);
            if(arr[element-1]<0) ans[0]= element;
            else{
                arr[element-1]*=-1;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0) ans[1] =i+1;
        }
        
        return ans;
    }
}