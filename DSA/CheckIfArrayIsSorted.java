package DSA;
/*
 * Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
 * 
 */
public class CheckIfArrayIsSorted {
    
    // doing it using recursion
    class Solution {
        public boolean isSorted(int[] arr) {
            // code here
            return helper(arr,0);
            
        }
        public boolean helper(int[] arr, int s){
            
            if(s>=arr.length-1) return true;
            
            if(arr[s+1]<arr[s]){
                return false;
            }
            return helper(arr,s+1);
        }


        // or the helper function can be written as :
        // public boolean helper(int[] arr, int s){
        
        //     if(s>=arr.length-1) return true;
            
        //     return arr[s]<=arr[s+1] && helper(arr,s+1);
        // }
    }
}
