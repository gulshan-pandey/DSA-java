package DSA;

import java.util.Arrays;

public class SingleNumber2 {
    
//     Example 1:

// Input: nums = [2,2,3,2]
// Output: 3
// Example 2:

// Input: nums = [0,1,0,1,0,1,99]
// Output: 99

}




// class Solution {
//     public int singleNumber(int[] nums) {
       
//        Arrays.sort(nums);
//        if(nums.length==1) return nums[0];
//        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
       
//        for(int i=1; i<nums.length-1; i+=3){
//         if(nums[i]!= nums[i-1]) return nums[i-1];      
//     }
//     return -1;
//     }

// }