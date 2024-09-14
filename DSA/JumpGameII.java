package DSA;
public class JumpGameII {
    /**
     * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

        Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

        0 <= j <= nums[i] and
        i + j < n
        Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

        

        Example 1:

        Input: nums = [2,3,1,1,4]
        Output: 2
        Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
        Example 2:

        Input: nums = [2,3,0,1,4]
        Output: 2
     */

}






// class Solution {
//     public int jump(int[] nums) {
//         int n = nums.length-1;
//         int jumps =0;
//         if(nums.length==1) return 0;

//         if(nums[0]>=n) return jumps+1;

//         int currJumpEnd = 0;
//         int furtherest=0;
//         for(int i=0;i<n; i++){
//            furtherest=Math.max(furtherest,i+nums[i]);

//            if(currJumpEnd==i){
//             jumps++;
//             currJumpEnd = furtherest;
//            }
//         }
//         return jumps;
//     }
// }







class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0; // No jumps needed if already at the last index
        
        int jumps = 0;  // Number of jumps needed
        int farthest = 0;  // The farthest we can reach with the current jump
        int endOfCurrentJump = 0;  // The point we can reach in the current jump
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);  // Update the farthest point we can reach
            
            if (i == endOfCurrentJump) {  // Time to make another jump
                jumps++;
                endOfCurrentJump = farthest;  // Set the new end of the current jump range
                
                if (endOfCurrentJump >= nums.length - 1) {
                    break;  // If we can reach the end, break early
                }
            }
        }
        
        return jumps;
    }
}

