package DSA;

public class MaximumAverageSubarrayI {
    /**
     * You are given an integer array nums consisting of n elements, and an integer k.
    
            Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
    
            
    
            Example 1:
    
            Input: nums = [1,12,-5,-6,50,3], k = 4
            Output: 12.75000
            Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    
    
            
            Example 2:
    
            Input: nums = [5], k = 1
            Output: 5.00000
     * 
     */
    
}



class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;

        int l = 0;
        int r=0;

        for( ;r<k; r++){
            sum+=nums[r];
        }
           double ans = (double) sum/k;

        for(; r<nums.length; r++){
            sum+= nums[r] - nums[l];
            ans = Math.max((double) sum/k, ans);

            l++;
        }
        return ans;
    }
}




// Using java 8

// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double sum = Arrays.stream(nums)
//                     .limit(k)
//                     .reduce(0, (tempSum, num) -> tempSum + num);
//         double res = sum;
        
//         for(int i = k; i < nums.length; i++) {
//             sum += nums[i] - nums[i - k];
//             res = Math.max(res, sum);
//         }
//         return res / k;            
//     }
// }