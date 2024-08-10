package DSA;

import java.util.*;

public class CountCompleteSubarraysInAnArray {
    
    /*
     * You are given an array nums consisting of positive integers.

        We call a subarray of an array complete if the following condition is satisfied:

        The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
        Return the number of complete subarrays.


        Example 1:

        Input: nums = [1,3,1,2,2]
        Output: 4
        Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].

        
        Example 2:

        Input: nums = [5,5,5,5]
        Output: 10
        Explanation: The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.
            */
}




//O(n^2) solution

// class Solution {
//     public int countCompleteSubarrays(int[] nums) {
//         HashSet<Integer> set  =new HashSet<>();
//         int count =0;
//         for(int i : nums){
//             set.add(i);
//         }
//         int size = set.size();

//         for(int i =0; i<nums.length;i++){
//             set.clear();
//             for( int j =i; j<nums.length;j++){
//                 set.add(nums[j]);
//                 if(set.size()== size) count++;
//             }
//         }

//     return count;
//     }
// }



//optimized way

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        int disCount = set.size();
        int ans = 0;
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        int l = 0, r = 0;
        while(r < nums.length) {
            numFreq.put(nums[r], numFreq.getOrDefault(nums[r],0)+1);
            if(numFreq.size() == disCount) {
                // System.out.println("before loop "+l);
                int leftMost = numFreq.get(nums[l]);
                while(leftMost > 1) {
                    numFreq.put(nums[l], leftMost-1);
                    l++;
                    leftMost = numFreq.get(nums[l]);
                }
                // System.out.println(l+" "+r);
                ans += l+1;
            }
            r++;
        }
        return ans;
    }
}


