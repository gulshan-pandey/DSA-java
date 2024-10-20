package DSA;

public class SearchInRotatedSortedArray {
    
    /**
     * 
     * There is an integer array nums sorted in ascending order (with distinct values).

        Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

        Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

        You must write an algorithm with O(log n) runtime complexity.

        

        Example 1:

        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4


        Example 2:

        Input: nums = [4,5,6,7,0,1,2], target = 3
        Output: -1


        Example 3:

        Input: nums = [1], target = 0
        Output: -1
     */
}


class Solution {
    public int search(int[] a, int key) {
        int low =0;
        int high =a.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(a[mid]==key) return mid;
            if(a[low]<=a[mid]){
                if(key>=a[low] && key<a[mid]){
                    high=mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(key>a[mid] && key<=a[high]){
                    low= mid+1;
                }else{
                    high= mid-1;
                }
            }
        }
        return -1;
    }
}






//using peak element


// class Solution {
//     public int search(int[] a, int key) {
//         if (a == null || a.length == 0) return -1;
        
//         int n = a.length - 1;
//         int low = 0, high = a.length - 1;
        
//         // Check if array is not rotated
//         if (a[low] <= a[high]) {
//             return binary(a, key, 0, high);
//         }
        
//         // Find peak element
//         int peak = -1;
//         while (low < high) {
//             int mid = low + (high - low) / 2;
            
//             if (a[mid] > a[mid + 1]) {
//                 peak = mid;
//                 break;
//             }
            
//             if (a[low] <= a[mid]) {
//                 // Left half is sorted, pivot must be in right half
//                 if (a[low] > a[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             } else {
//                 // Right half is sorted, pivot must be in left half
//                 high = mid;
//             }
//         }
        
//         if (peak == -1) peak = low;
        
//         // If key is the peak element
//         if (key == a[peak]) return peak;
        
//         // If key is greater than or equal to first element, search in left half
//         if (key >= a[0]) {
//             return binary(a, key, 0, peak - 1);
//         }
        
//         // Otherwise, search in right half
//         return binary(a, key, peak + 1, n);
//     }
    
//     private int binary(int[] a, int target, int low, int high) {
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (a[mid] == target) {
//                 return mid;
//             }
            
//             if (target < a[mid]) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return -1;
//     }
// }
