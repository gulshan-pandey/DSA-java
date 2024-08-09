package DSA;
public class LongestNiceSubarray {
    
    /*
     * 
     * We call a subarray of nums nice if the bitwise AND of every pair of elements that are in different positions in the subarray is equal to 0.

        Return the length of the longest nice subarray.
        
        Example 1:

        Input: nums = [1,3,8,48,10]
        Output: 3
        Explanation: The longest nice subarray is [3,8,48]. This subarray satisfies the conditions:
        - 3 AND 8 = 0.
        - 3 AND 48 = 0.
        - 8 AND 48 = 0.
        It can be proven that no longer nice subarray can be obtained, so we return 3.


        Example 2:

        Input: nums = [3,1,5,11,13]
        Output: 1
        Explanation: The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.
     */
}





// the approach is that we cannot find each and every pair's AND operation in the subarray(it will be too lengthy) so we will make the OR operation of all the elements(union) in the subarray and take AND with the next element , 
// taking union of elements makes easy will do the same as we do AND with all the pairs in the subarray, 
//also if the next element is not in the subarray then we will keep removing the elements form the left by using xor operation on the union(xor operation will remove the occurence of the left element as it makes the bits 0 of duplicate number)


// for further explanation check tutorial : https://www.youtube.com/watch?v=DrRuCsxb6CI


class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0;
        int max = 1;  // Initialize with 1 since any single element is a valid subarray
        int union = 0;  // To keep track of the AND of the current subarray by taking the union of all of them and taking and with the next element
        
        for (int r = 0; r < nums.length; r++) {
            while ((union & nums[r]) != 0) {
                union ^= nums[l];  // Remove the influence of nums[l] from union
                l++;  // Move the left pointer to the right
            }
            union |= nums[r];  // Add the influence of nums[r] to union
            max = Math.max(max, r - l + 1);  // Update the max length
        }
        return max;
    }
}


 