package DSA;

import java.util.HashMap;

public class MaximumErasureValue {
    
    /*
     * You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

        Return the maximum score you can get by erasing exactly one subarray.
     * 
     * 
     * 
     * Example 1:

        Input: nums = [4,2,4,5,6]
        Output: 17
        Explanation: The optimal subarray here is [2,4,5,6].



        Example 2:

        Input: nums = [5,2,1,2,5,2,1,2,5]
        Output: 8
        Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 
     */
}



//hashmap approach

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int maxsum =0;
        int currsum=0;
        int l =0;
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int r =0; r<nums.length;r++){
            int temp = nums[r];
            if(map.containsKey(temp)){
                int newl=map.get(temp)+1;
               
                    for (int i = l; i < newl; i++) {
                    currsum -= nums[i];
                    map.remove(nums[i]);
                }
                l=newl;
                }
                
            
            map.put(temp,r);
            currsum += temp; 
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
}
}




//hashset approach


// class Solution {
//     public int maximumUniqueSubarray(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         int maxSum = 0;
//         int currentSum = 0;
//         int l = 0;

//         for (int r = 0; r < nums.length; r++) {
//             while (set.contains(nums[r])) {
//                 set.remove(nums[l]);
//                 currentSum -= nums[l];
//                 l++;
//             }
//             set.add(nums[r]);
//             currentSum += nums[r];
//             maxSum = Math.max(maxSum, currentSum);
//         }

//         return maxSum;
//     }
// }
