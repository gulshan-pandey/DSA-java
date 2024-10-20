package DSA;

public class SplitArrayLargestSum {
     /**
      * 
      * Similar Question GFG Allocate Minimum number of pages
      *
      *
      * Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

        Return the minimized largest sum of the split.

        A subarray is a contiguous part of the array.

        

        Example 1:

        Input: nums = [7,2,5,10,8], k = 2
        Output: 18
        Explanation: There are four ways to split nums into two subarrays.
        The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
        Example 2:

        Input: nums = [1,2,3,4,5], k = 2
        Output: 9
        Explanation: There are four ways to split nums into two subarrays.
        The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
      */
}




// Linear Search ---> TLE


// class Solution {
//     public int splitArray(int[] nums, int k) {
//         int high = 0;
//         int low = Integer.MIN_VALUE;
//         for(int i : nums){
//             high += i;
//             low = Math.max(i, low);
//         }

//         // Try each possible maximum sum starting from the minimum possible value
//         for(int maxnum = low; maxnum <= high; maxnum++){
//             int count = find(nums, maxnum);
//             if(count == k) return maxnum;  // Fixed: changed == to <=
//         }

//         return -1;
//     }

//     public int find(int[] nums, int maxnum){
//         int part = 1;
//         int temp = 0;

//         for(int i = 0; i < nums.length; i++){
//             if(temp + nums[i] <= maxnum){
//                 temp += nums[i];
//             } else {
//                 part++;
//                 temp = nums[i];
//             }
//         }
//         return part;  // Fixed: return part instead of temp
//     }
// }





// Binary Search

class Solution {
    public int splitArray(int[] nums, int k) {
        int high = 0;
        int low = Integer.MIN_VALUE;
        for(int i : nums){
            high += i;
            low = Math.max(i, low);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            int count = getcount(nums,mid);
            if(count>k){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return low;

    }

    public int getcount(int[]nums,int maxSum){
        int subarrays = 1;
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            if(temp+nums[i]<=maxSum){
                temp+=nums[i];
            }else{
                subarrays++;
                temp=nums[i];
            }
        }
        return subarrays;
    }
}