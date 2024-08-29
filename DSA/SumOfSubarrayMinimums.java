package DSA;

import java.util.Stack;

public class SumOfSubarrayMinimums {
    
    
    /**
     * NOTE: note: before doing this question please complete  the problems : Nearest Smaller Element  ---> https://www.interviewbit.com/problems/nearest-smaller-element/
     * and complete Next greater element of leetcode --> https://leetcode.com/problems/next-greater-element-i/
     * and also solve Trapping rainwater problem --> https://leetcode.com/problems/trapping-rain-water/
     * 
     * 
     * tutorial for this problem : https://youtu.be/HRQB7-D2bi0?si=7zO4DBdWVP4AYzYD
     * Find Previous Smaller Element (PSE) for each element (left boundary).
     * Find Next Smaller Element (NSE) for each element (right boundary).
     * Calculate subarray size = left * right.
     * 
     * Sum each element's min contribution = element * subarray size, modulo 10^9 + 7.
     * 
     */

    
/*
 * Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. Since the answer may be large, return the answer modulo 109 + 7.

 

    Example 1:

    Input: arr = [3,1,2,4]
    Output: 17
    Explanation: 
    Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
    Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
    Sum is 17.

    
    Example 2:

    Input: arr = [11,81,94,43,3]
    Output: 444
 */

}




// brute force ----> firstly give this solution to the interviewer

// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int ans=0;
    
//         for(int i=0; i<arr.length; i++){
//             int min=arr[i];
//             for(int j =i; j<arr.length;j++){
//                 min= Math.min(min,arr[j]);
//                 ans+=min;
//             }
//         }
//         return ans;
//     }
// }







 class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        long result=0;          // for larger values
        var stack = new Stack<Integer>();
        int [] nsl = new int[arr.length];   // Previous smaller element (left boundary)
        int [] nsr = new int[arr.length];   // Next smaller element (right boundary)


        // Calculate nsl (previous smaller element)
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){                   // >= {Edge case}  important for handling duplicates while procession        https://youtu.be/v0e8p9JCgRc?si=f0u7N4qBqzi7hcFk --> explanation at 17:15 min
                stack.pop();
            }
            nsl[i] = stack.isEmpty()? -1:stack.peek();
            stack.push(i);
        }
        // System.out.println(Arrays.toString(nsl));

        stack.clear();

        // Calculate nsr (next smaller element)
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){                        // one of the condition is have to take equality sign to handle duplicates
                stack.pop();
            }
            nsr[i] = stack.isEmpty()? n:stack.peek();
            stack.push(i);
        }
        
        // System.out.println(Arrays.toString(nsr));

        for(int i =0; i<n; i++){
            int left = i - nsl[i];  // distance to the left
            int right = nsr[i] - i; // distance to the right
            result = (result + (long)arr[i] * left * right) % MOD;
        }


        return (int)result;
    }
}

