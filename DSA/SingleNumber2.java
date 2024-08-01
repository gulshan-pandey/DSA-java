package DSA;


public class SingleNumber2 {
    
//     Example 1:

// Input: nums = [2,2,3,2]
// Output: 3
// Example 2:

// Input: nums = [0,1,0,1,0,1,99]
// Output: 99

}



//optimized

// class Solution {
//     public int singleNumber(int[] nums) {
       
//        Arrays.sort(nums);
//        if(nums.length==1) return nums[0];            // edge case

//        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];      // edge case
       
//        for(int i=1; i<nums.length-1; i+=3){
//         if(nums[i]!= nums[i-1]) return nums[i-1];      
//     }
//     return -1;
//     }

// }




// another O(n) solution that uses bit manipulation

// class Solution {
//     public int singleNumber(int[] nums) {
//         int ans = 0;
//         for (int bitInd = 0; bitInd < 32; bitInd++) {
//             int count = 0; 
//             for (int j = 0; j < nums.length; j++) {
//                 if ((nums[j] & (1 << bitInd)) != 0) { 
//                     count++;
//                 }
//             }
//             if (count % 3 == 1) { 
//                 ans |= (1 << bitInd);
//             }
//         }
//         return ans;
//     }
// }