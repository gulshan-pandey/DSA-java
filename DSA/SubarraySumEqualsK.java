package DSA;

public class SubarraySumEqualsK {
    /*
     * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
     */

    //  examples

    // Input: nums = [1,1,1], k = 2
    // Output: 2


    // Input: nums = [1,2,3], k = 3
    // Output: 2
}





//brute force

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {

//                 sum += nums[j];
//                 if (sum == k) {
//                     count++;

//                 }

//             }

//         }
//         return count;
//     }
// }




//optimized----The approach uses a cumulative sum and a hashmap to find subarrays that sum to ( k) by tracking the frequency of sums encountered so far and checking if the difference between the current sum and ( k ) has occurred before.



// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int sum =0; 
//         int count =0;
//         Map<Integer,Integer> map = new HashMap<>();
//         map.put(0,1);

//         for(int i =0; i<nums.length; i++){
//             sum+=nums[i];

//             if(map.containsKey(sum-k)){
//                 count+= map.get(sum-k);      // // we are adding the number of occureneces of the sum which is present in the hashmap! <if there is multiple frequencies of the sum in the hashmap ,so will be the count increased by!>
//             }

//             map.put(sum,map.getOrDefault(sum,0)+1);
//         }
//         return count;
//     }

// }