package DSA;

public class SubarraySumsDivisiblebyK {
    
    /*
     * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
     * 
     * Input: nums = [4,5,0,-2,-3,1], k = 5
     * Output: 7
     * Explanation: There are 7 subarrays with a sum divisible by k = 5:  
     * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

     * 
     * 
     * Input: nums = [5], k = 9
     * Output: 0
     */
}






// class Solution {             // brute force --- exceeds time
//     public int subarraysDivByK(int[] nums, int k) {
//         int count=0;
//         for(int i =0; i<nums.length; i++){
//             int sum =0;
//             for(int j =i; j<nums.length; j++){
//                 sum+= nums[j];
//                 if(sum%k==0){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }



/* Approach: is to take a (modulo, frequency)map, and make the prefix sum form the start and find the modulo with k at every iteration , save in the hashmap as the key and its frequency as the value, 
    on another occurrence of that modulo, add the existing value of the key tot he count, and return the count
    */



// class Solution {                     // optimized
//     public int subarraysDivByK(int[] nums, int k) {
        
//         Map <Integer, Integer> map = new HashMap<>();
//         map.put(0,1);
//         int sum =0;
//         int rem =0;
//         int count =0;
//         for(int i =0; i< nums.length; i++){
//             sum+= nums[i];
//             rem = sum%k;
//             if(rem<0){
//                 rem+=k;
//             }
//             if(map.containsKey(rem)){
//                 count+=map.get(rem);
//                 map.put(rem,map.get(rem)+1);
//             }else map.put(rem, 1);
//         }
//         return count;
//     }
// }
