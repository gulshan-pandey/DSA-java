package DSA;

public class duplicateNumbersXOR {
    
//     You are given an array nums, where each number in the array appears either once or twice.
// Return the bitwise XOR of all the numbers that appear twice in the array, or 0 if no number appears twice.

//  
}




// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
        
//         Set<Integer> set = new HashSet<>();
//         int ans =0;
//         for(int i =0; i<nums.length; i++){
//             if(!set.add(nums[i])){
//                 ans= (ans ^ nums[i]);
//             }
//         }
//         return ans;
//     }
// }





// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
//         Arrays.sort(nums);
//         int ans = 0;
      
//         if (nums.length == 1) {
//             return 0;
//         }
      
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 ans ^= nums[i];
//                 i++;
//             }
//         }
        
//         return ans;
//     }
// }
