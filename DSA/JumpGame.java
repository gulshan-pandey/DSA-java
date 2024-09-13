package DSA;
public class JumpGame {
    /**
     * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

        Return true if you can reach the last index, or false otherwise.

        

        Example 1:

        Input: nums = [2,3,1,1,4]
        Output: true
        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
        Example 2:

        Input: nums = [3,2,1,0,4]
        Output: false
        Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
     */
}



class Solution {
    public boolean canJump(int[] nums) {
        if( nums.length==1 )return true;
        int max = 0;            // 0 bcz initially 0 is the furtherest you can go 
        int len =nums.length-1;
        for(int i =0; i<nums.length; i++){
            int tempmax=i+nums[i];
            max = Math.max(max,tempmax);
            if(max>=len) return true;
            if(max<i+1) return false;
        }
        return false;
    }
}



// class Solution {
//     public boolean canJump(int[] nums) {
//         int max = 0;
//         int len = nums.length - 1;

//         for (int i = 0; i <= max; i++) {
//             max = Math.max(max, i + nums[i]);
//             if (max >= len) return true;  // Early exit if we can reach the last index
//         }
//         return false;  // Return false if the loop completes without reaching the end
//     }
// }




// opposite approach

// class Solution {
//     public boolean canJump(int[] nums) {
//         int goal = nums.length - 1;

//         for (int i = nums.length - 2; i >= 0; i--) {
//             if (i + nums[i] >= goal) {
//                 goal = i;
//             }
//         }

//         return goal == 0;        
//     }
// }


