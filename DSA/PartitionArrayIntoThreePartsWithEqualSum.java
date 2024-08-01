package DSA;

public class PartitionArrayIntoThreePartsWithEqualSum {
    /*
     * 
     * Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.
     * 
     * Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
     * Output: true
     * Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
     * 
     * 
     * Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
     * Output: false
     *
     * 
     *Input: arr = [3,3,6,5,-2,2,5,1,-9,4]
     *Output: true
     *Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4

     */


}







// class Solution {
//     public boolean canThreePartsEqualSum(int[] arr) {
//         int sum = 0;
//         int currentsum= 0;
//         int partitionsum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         if (sum % 3 == 0) {
//             partitionsum = sum / 3;

//         } else return false;

//         int parts = 0;
//         for (int i = 0; i < arr.length; i++) {
//             currentsum += arr[i];
//             if (currentsum == partitionsum) {
//                 parts++;
//                 currentsum=0;
//             }
//         }

//         return parts>=3;        // parts can be greater than 3
//     }
// }