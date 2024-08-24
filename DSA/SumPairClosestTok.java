package DSA;

public class SumPairClosestTok {
    /*
     * 
     * Given a sorted array arr[]  and a number k, find a pair in sorted order in an array whose sum is closest to k.
            Note: If there are multiple such pairs return the pair with maximum absolute difference.

            Examples:

            Input: arr[] = [10, 22, 28, 29, 30, 40], k = 54
            Output: [22, 30]
            Explanation: As 22 + 30 = 52 is closest to 54.


            Input: arr[] = [1, 2, 3, 4, 5], k = 10
            Output: [4, 5]
            Explanation: As 4 + 5 = 9 is closest to 10.


            Expected Time Complexity: O(n)
            Expected Auxiliary Space: O(1)

     */
}



class Solution {
    int[] sumClosest(int[] arr, int target) {
        // code here
          int left = 0, right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
                result[0] = arr[left];
                result[1] = arr[right];
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
        
    }
}