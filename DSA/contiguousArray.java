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


// BRUTE FORCE`

class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;

        // Iterate through all possible starting points
        for (int start = 0; start < nums.length; start++) {
            int count0 = 0;
            int count1 = 0;

            // Iterate through all possible ending points
            for (int end = start; end < nums.length; end++) {
                if (nums[end] == 0) {
                    count0++;
                } else {
                    count1++;
                }

                // Check if counts are equal
                if (count0 == count1) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }

        return maxLength;
    }
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
