package DSA;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    /**
     * 
     * You are given an integer array nums and an integer k.

        In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

        Return the maximum number of operations you can perform on the array.

        

        Example 1:

        Input: nums = [1,2,3,4], k = 5
        Output: 2
        Explanation: Starting with nums = [1,2,3,4]:
        - Remove numbers 1 and 4, then nums = [2,3]
        - Remove numbers 2 and 3, then nums = []
        There are no more pairs that sum up to 5, hence a total of 2 operations.



        Example 2:
        Input: nums = [3,1,3,4,3], k = 6
        Output: 1
        Explanation: Starting with nums = [3,1,3,4,3]:
        - Remove the first two 3's, then nums = [1,4,3]
        There are no more pairs that sum up to 6, hence a total of 1 operation.
 
     */
}




// Naive approach 

// class Solution {
//     public int maxOperations(int[] nums, int k) {
        
//         var map = new HashMap<Integer, Integer>();

//         int sum =0;
//         int count = 0;
//         for(int i =0; i<nums.length ; i++){

//             if(map.containsKey(k-nums[i])){
//                 count++;
//                 map.put(k-nums[i],map.get(k-nums[i])-1);
//                 if(map.get(k-nums[i])==0) map.remove(k-nums[i]);
//                 continue;      
//             }

//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }

//         return count;
//     }
// }



// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         var map = new HashMap<Integer, Integer>();
//         int count = 0;

//         for (int num : nums) {
//             if (map.getOrDefault(k - num, 0) > 0) {
//                 count++;
//                 map.put(k - num, map.get(k - num) - 1);
//             } else {
//                 map.put(num, map.getOrDefault(num, 0) + 1);
//             }
//         }

//         return count;
//     }
// }





/**
 * Efficient approach:
 * 1. Sort the array.
 * 2. Use the two-pointer approach:
 *    - Start with two pointers, one at the beginning (`l`) and one at the end (`r`) of the array.
 *    - If the sum of elements at `l` and `r` is equal to `k`, increment the count and move both pointers inward.
 *    - If the sum is less than `k`, increment the left pointer (`l`) to increase the sum.
 *    - If the sum is greater than `k`, decrement the right pointer (`r`) to decrease the sum.
 * 3. Continue until the two pointers meet.
 *
 * Time Complexity: O(n log n) (due to sorting) + O(n) (two-pointer traversal), which is overall O(n log n).
 * Space Complexity: O(1), as the approach does not require extra space apart from the input array.
 */


class Solution {
    public int maxOperations(int[] nums, int k) {
        int count =0;
        Arrays.sort(nums);
        int l =0;
        int r = nums.length -1;
       while(l<r){
            if(nums[l]+nums[r]==k) {
                count++;
                l++;
                r--;
            }

            if(nums[l]+nums[r]<k) l++;
            if(nums[l]+nums[r]>k) r--;

        }
        return count;
        
    }
}