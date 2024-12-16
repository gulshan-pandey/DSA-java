package DSA;

public class FindTheXOROfNumbersWhichAppearTwice {
    /*
        You are given an array nums, where each number in the array appears either once or twice.
        
        Return the bitwise XOR of all the numbers that appear twice in the array, or 0 if no number appears twice.
        
         
        
        Example 1:
        
        Input: nums = [1,2,1,3]
        
        Output: 1
        
        Explanation:
        
        The only number that appears twice in nums is 1.


        
        
        Example 2:
        
        Input: nums = [1,2,3]
        
        Output: 0
        
        Explanation:
        
        No number appears twice in nums.


        
        
        Example 3:
        
        Input: nums = [1,2,2,1]
        
        Output: 3
        
        Explanation:
        
        Numbers 1 and 2 appeared twice. 1 XOR 2 == 3.
    */
}


// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
//         Set set = new HashSet();
//         int ans = 0;
//         List <Integer>arr = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (set.contains(nums[i])) {
//                 arr.add(nums[i]);
//             } else
//                 set.add(nums[i]);
//         }
//         if (arr.size() == 0) {
//             return 0;
//         } else {
//             for (int a : arr) {
//                 ans = (ans ^ a);
//             }
//             return ans;
//         }
//     }
// }





// short solution

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
