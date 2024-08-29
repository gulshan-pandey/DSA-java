package DSA;

import java.util.Stack;

public class SumOfSubarrayRanges {
    /*
     * You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.

            Return the sum of all subarray ranges of nums.

            A subarray is a contiguous non-empty sequence of elements within an array.

            

            Example 1:

            Input: nums = [1,2,3]
            Output: 4
            Explanation: The 6 subarrays of nums are the following:
            [1], range = largest - smallest = 1 - 1 = 0 
            [2], range = 2 - 2 = 0
            [3], range = 3 - 3 = 0
            [1,2], range = 2 - 1 = 1
            [2,3], range = 3 - 2 = 1
            [1,2,3], range = 3 - 1 = 2
            So the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.
            Example 2:

            Input: nums = [1,3,3]
            Output: 4
            Explanation: The 6 subarrays of nums are the following:
            [1], range = largest - smallest = 1 - 1 = 0
            [3], range = 3 - 3 = 0
            [3], range = 3 - 3 = 0
            [1,3], range = 3 - 1 = 2
            [3,3], range = 3 - 3 = 0
            [1,3,3], range = 3 - 1 = 2
            So the sum of all ranges is 0 + 0 + 0 + 2 + 0 + 2 = 4.
            Example 3:

            Input: nums = [4,-2,-3,4,1]
            Output: 59
            Explanation: The sum of all subarray ranges of nums is 59.
     */
}






// brute force

// class Solution {
//     public long subArrayRanges(int[] nums) {
//         int ans =0;
//         for(int i =0; i<nums.length; i++){
//             int max = Integer.MIN_VALUE;
//             int min = Integer.MAX_VALUE;
//             for(int j =i; j<nums.length; j++){
//                 min = Math.min(min,nums[j]);
//                 max = Math.max(max,nums[j]);
//                 ans+=(max-min);
//             }
//         }
//         return ans;
//     }
// }


    
    // This code calculates the difference between the sum of maximum and minimum values 
    // across all subarrays. It first finds the contribution of each element as the minimum
    // and maximum in all subarrays by calculating distances to the previous and next 
    // smaller/greater elements. The final result is the difference between these two sums, 
    // revealing the range between subarray extremes. Key operations are based on monotonic 
    // stacks to efficiently determine these boundaries.


// note ---> first solve the Sum of subarray minimums----> https://leetcode.com/problems/sum-of-subarray-minimums/description/
// tutorial---->   https://youtu.be/gIrMptNPf5M?si=99mD4J-TMMmmiZMj

class Solution {

    public long sumOfSubarrayMinimums(int[] arr){

        int n = arr.length;
        long result=0;          // for larger values
        var stack = new Stack<Integer>();
        int [] nsl = new int[arr.length];   // Previous smaller element (left boundary)
        int [] nsr = new int[arr.length];   // Next smaller element (right boundary)


        // Calculate nsl (previous smaller element)
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){ 
                stack.pop();            
            }
            nsl[i] = stack.isEmpty()? -1:stack.peek();
            stack.push(i);
        }
        // System.out.println(Arrays.toString(nsl));

        stack.clear();

        // Calculate nsr (next smaller element)
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){                     
                stack.pop();
            }
            nsr[i] = stack.isEmpty()? n:stack.peek();
            stack.push(i);
        }
        
        // System.out.println(Arrays.toString(nsr));

        for(int i =0; i<n; i++){
            int left = i - nsl[i];  // distance to the left
            int right = nsr[i] - i; // distance to the right
            result = (result + (long)arr[i] * left * right) ;
        }


        return result;


    }



    public long sumOfSubarrayMaxs(int[] arr) {
        int n = arr.length;
        long result = 0;
        var stack = new Stack<Integer>();
        int[] ngl = new int[arr.length];   // Previous greater element (left boundary)
        int[] ngr = new int[arr.length];   // Next greater element (right boundary)

        // Calculate ngl (previous greater element)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            ngl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Calculate ngr (next greater element)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            ngr[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            int left = i - ngl[i];  // distance from the previous greater element
            int right = ngr[i] - i; // distance to the next greater element
            result += (long) arr[i] * (left) * (right);  // Sum for each element as max in subarrays
        }

        return result;
}





    public long subArrayRanges(int[] nums) {            // main function starts here

        long max =sumOfSubarrayMaxs(nums);
        long min =sumOfSubarrayMinimums(nums);




      return max-min;  
    }


}


