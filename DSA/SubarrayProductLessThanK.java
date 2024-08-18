package DSA;

public class SubarrayProductLessThanK {
    /*
     * Company Tags                : Yatra
     * 
     * Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

            

            Example 1:

            Input: nums = [10,5,2,6], k = 100
            Output: 8
            Explanation: The 8 subarrays that have product less than 100 are:
            [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
            Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
            Example 2:

            Input: nums = [1,2,3], k = 0
            Output: 0
     * 
     */
}






class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) return 0;
         int count =0;
         int l=0;
         int mul=1;
         for(int r=0; r<nums.length; r++){
            int temp = nums[r];
            mul*=temp;
            while(mul>=k && l<=r){
                mul/=nums[l];
                l++;
            }
            count+= r-l+1;
         }
         return count;
    }
}


