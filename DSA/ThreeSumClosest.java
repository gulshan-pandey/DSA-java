public  3SumClosest{
    /**
     * 
     * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

        Return the sum of the three integers.

        You may assume that each input would have exactly one solution.

        

        Example 1:

        Input: nums = [-1,2,1,-4], target = 1
        Output: 2
        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
       
       
        Example 2:

        Input: nums = [0,0,0], target = 1
        Output: 0
        Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
     */
}




class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < n - 2; i++) {                // i<n as well
            // Skip duplicates for i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int j = i + 1;
            int k = n - 1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum == target) {
                    return sum;
                }
                
                if(Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                
                if(sum < target) {
                    j++;
                    // Skip duplicates for j
                    while(j < k && nums[j] == nums[j-1]) j++;
                } else {
                    k--;
                    // Skip duplicates for k
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        
        return closestSum;
    }
}