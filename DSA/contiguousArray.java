package DSA;

public class contiguousArray {
    /*
     * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
     * 
     * Input: nums = [0,1]
     * Output: 2
     * Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
     * 
     * 
     * Input: nums = [0,1,0]
     * Output: 2
     * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
     * 
     * 
     * 
     * 
     * Approach: the idea is to use a hashmap to store the sum of the previous subarray and its index. If we find a subarray with the same sum, we calculate the length of the subarray and update the maximum length.
     */
}




// class Solution {
//     public int findMaxLength(int[] nums) {
//         Map<Integer,Integer> map = new HashMap<>();
//         map.put(0,-1);
//         int sum=0;
//         int length =0;
//         for(int i=0; i<nums.length; i++){
//            sum += (nums[i] == 1) ? 1 : -1;

//             if(map.containsKey(sum)){
//                 length = Math.max(length,i-map.get(sum));
//             }else{
//                 map.put(sum,i);
//             }
//         }
//         return length;
//     }
// }
