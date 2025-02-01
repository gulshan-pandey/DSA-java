package DSA;

public class FindMinimumInRotatedSortedArray {
    /**
     * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

        [4,5,6,7,0,1,2] if it was rotated 4 times.
        [0,1,2,4,5,6,7] if it was rotated 7 times.
        Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

        Given the sorted rotated array nums of unique elements, return the minimum element of this array.

        You must write an algorithm that runs in O(log n) time.

        

        Example 1:

        Input: nums = [3,4,5,1,2]
        Output: 1
        Explanation: The original array was [1,2,3,4,5] rotated 3 times.


        Example 2:

        Input: nums = [4,5,6,7,0,1,2]
        Output: 0
        Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.


        Example 3:

        Input: nums = [11,13,15,17]
        Output: 11
        Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
        \
     * 
     */
}



// class Solution {
//     public int findMin(int[] nums) {
//     int n=nums.length;
//     int l=0,h=n-1;
    
//     while(l<=h){
//         int mid = l +(h-l)/2;
//         if(nums[l]<=nums[h]) return nums[l];
//         int next = (mid-1 +n)%n;
//         int prev = (mid+1)%n;
//         if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
//             return nums[mid];
//         }
//         if(nums[l]<=nums[mid]){
//             l=mid+1;
//         }else{
//             h=mid-1;
//         }
//     }
//      return -1;

//     }
// }





// different approach

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l=0,h=n-1;
         if (nums[0] <= nums[h]) {
            return nums[0];
        }
        while(l<=h){
            int mid = l +(h-l)/2;
            
            if(mid<h && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>l && nums[mid]< nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid] <=nums[l]){
                h= mid-1;
            }else{
                l = mid+1;
            }
        }
        return 0;
    }
}




// Striver's approach


// class Solution {
//     public int findMin(int[] nums) {
//         int n = nums.length;
//         int l=0,h=n-1;
//         int min = Integer.MAX_VALUE;

//         if (nums[0] <= nums[h]) {
//            return nums[0];
//         }

//         while(l<= h){
//             int m =  l + (h-l)/2;
//             if(nums[l]<= nums[m]){
//                 min = Math.min(min,nums[l]);
//                 l=m+1;
//             }else{
//                 min = Math.min(min,nums[m]);
//                 h=m-1;
//             }

//         }

//         return min;

//     }
// }

