package DSA;

public class CountNumberofNiceSubarrays {
    
    /*
     * 
     * Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

        Return the number of nice sub-arrays.

        

        Example 1:

        Input: nums = [1,1,2,1,1], k = 3
        Output: 2
        Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
        Example 2:

        Input: nums = [2,4,6], k = 1
        Output: 0
        Explanation: There are no odd numbers in the array.
        Example 3:

        Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
        Output: 16
     */
}





// class Solution {    // sliding window approach (most efficient).
//     public int numberOfSubarrays(int[] nums, int k) {
//         int count = 0;
//         int left = 0;
//         int oddCount = 0;

//         for (int right = 0; right < nums.length; right++) {
//             if (nums[right] % 2 != 0) {
//                 oddCount++;
//             }

//             while (oddCount > k) {
//                 if (nums[left] % 2 != 0) {
//                     oddCount--;
//                 }
//                 left++;
//             }

//             if (oddCount == k) {
//                 int tempLeft = left;
//                 while (tempLeft <= right && nums[tempLeft] % 2 == 0) {
//                     tempLeft++;
//                 }
//                 count += (tempLeft - left + 1);
//             }
//         }

//         return count;
//     }
// }



//prifix sum approach

// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int count = 0;
//         int odds = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0, 1);

//         for (int num : nums) {
//             odds+=num%2;        //number of odds

//             count+=map.getOrDefault(odds-k,0);
        
//             map.put(odds,map.getOrDefault(odds,0)+1);

           
//         }

//         return count;
//     }
// }


//example
/*
1,1,2,1,1  --> og array
1,2,2,3,4  --> count of odds
*/ 