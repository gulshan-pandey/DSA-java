package DSA;
public class Find First and LastPositionOfElementInSortedArray {
    /**
     * 
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

        If target is not found in the array, return [-1, -1].

        You must write an algorithm with O(log n) runtime complexity.

        

        Example 1:

        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]
        Example 2:

        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]
        Example 3:

        Input: nums = [], target = 0
        Output: [-1,-1]
 
     */
}


/*
 * the intution is we will run binary search 2 times.
 * 1 for finding the starting index, if we find the element then we will go left of that element
 * 2 for finding the ending index,if we find the element then we will go right of that element
 */


class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int[] ans ={-1,-1};
        ans[0]= findOcc(nums,true, target);
        ans[1]= findOcc(nums,false, target);

        return ans;

    }

    public int findOcc(int[] nums,boolean findStart,int target){
           int low =0,high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(nums[mid]== target){
                ans=mid;
                if(findStart){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else if(target>nums[mid]){
                low =mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}