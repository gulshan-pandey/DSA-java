package DSA;
public class MaxConsecutiveOnesIII {
   
    /*
     * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
     * 
     * 
     * Example 1:

        Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
        Output: 6
        Explanation: [1,1,1,0,0,1,1,1,1,1,1]
        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


        Example 2:

        Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
        Output: 10
        Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 
     */
}

// class Solution {        // brute force   near about O(n^2)
//     public int longestOnes(int[] nums, int k) {
//         int zeros =0;
//         int maxlen=0;
//         for(int i =0; i<nums.length; i++){
//             for(int j =i; j<nums.length;j++){
//                 if(nums[j]==0){
//                     zeros++;
//                 }
//                 if(zeros<=k){
//                     int len = j-i+1;
//                     maxlen =Math.max(len,maxlen);
//                 }else {

//                     zeros=0;
//                     break;
//                 }
//             }
//         }
//         return maxlen;
//     }
// }



class Solution {            // optimal approach  by using sliding window
    public int longestOnes(int[] nums, int k) {

        int left = 0,right = 0;
        int zeros = 0;
        int length = 0;
        while(right<nums.length){
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
                

         
                length = Math.max(length, right - left + 1);
                right++;
        }

        return length;
    }
}
