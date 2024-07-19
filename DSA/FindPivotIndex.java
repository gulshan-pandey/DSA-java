package DSA;

public class FindPivotIndex {
    /*
     * program to find and returns the index where the sum of the elements on the left is equal to the sum of the elements on the right in an integer array. If no such index exists, it returns -1.
     * 
     * Approach: 
     * 1. Find the sum of the array
     * 2. Find the sum of the right side of the array by : sum - left - nums[i];
     * 3. Find the sum of the left side of the array : in the last line of the loop : left +=nums[i]
     */


}


// class Solution {
//     public int findMiddleIndex(int[] nums) {
//         int sum = 0;
//         for (int elem : nums) {
//             sum += elem;
//         }
//         int left = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             int right = sum - left - nums[i];

//             if (left == right) {
//                 return i;
//             }

//             left+=nums[i];

//         }
//         return -1;
//     }
// }