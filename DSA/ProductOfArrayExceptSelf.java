package DSA;
import java.util.Arrays;


public class ProductOfArrayExceptSelf {
   /**
    * 
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

        You must write an algorithm that runs in O(n) time and without using the division operation.

        

        Example 1:

        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]



        Example 2:

        Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]
        

        Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
    * 
     */ 
}


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int z = 0;
        int mul = 1;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z = i;
                count++;
            }else{
                mul *= nums[i];
            }
            
        }

        if (count ==1) {
            Arrays.fill( ans,0);
            ans[z] = mul;
        } else if (count >= 2)
            Arrays.fill( ans,0);
        else {
            for (int i = 0; i < nums.length; i++) {
                ans[i]=mul/nums[i];
            }

        }
        return ans;
    }
}