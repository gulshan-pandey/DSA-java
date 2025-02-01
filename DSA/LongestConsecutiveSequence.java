package DSA;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    /**
     * 
     * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

        You must write an algorithm that runs in O(n) time.

        

        Example 1:

        Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.


        Example 2:

        Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9
     */
}




// Naive approach

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if (nums.length == 0) return 0;
//         Arrays.sort(nums);
//         int count =1;
//         int max = 1;
        
//         for(int i =0; i<nums.length-1; i++){
//             if(nums[i]+1 ==nums[i+1]){
//              count++;
//              max = Math.max(count, max);
//             }
//             else if(nums[i]==nums[i+1]) continue;
//             else count =1;
//         }
//         return max;
//     }
// }






// O(n) solution


class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                max = Math.max(max, currentStreak);
            }
        }

        return max;
    }
}