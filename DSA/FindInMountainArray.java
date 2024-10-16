package DSA;
public class FindInMountainArray {
    
    /**
     * (This problem is an interactive problem.)

        You may recall that an array arr is a mountain array if and only if: arr.length >= 3

        There exists some i with 0 < i < arr.length - 1 such that:
        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

        You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

        MountainArray.get(k) returns the element of the array at index k (0-indexed).
        MountainArray.length() returns the length of the array.
        Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

        

        Example 1:

        Input: array = [1,2,3,4,5,3,1], target = 3
        Output: 2
        Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.


        Example 2:

        Input: array = [0,1,2,4,2,1], target = 3
        Output: -1
        Explanation: 3 does not exist in the array, so we return -1.
     * 
     */
}





/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

 // the intution is to find the peak index of the mountain array
 // then we can apply binary search on the left and right half of the peak index
 


 
// class Solution {
//     public int findInMountainArray(int target, MountainArray m) {
//         int low=0;
//         int high = m.length()-1;
//         int idx=-1;
//         while(low<=high){
//             int mid=low +(high-low)/2;
            
//             if(mid!=0 && m.get(mid-1)>m.get(mid)){
//                 high=mid-1;
//             }else{
//                 low = mid+1;
//             }
//         }
//         int peak =high;

        

//         low = 0;
//         high =peak;
//          while(low<=high){
//             int mid=low +(high-low)/2;
//             if(m.get(mid)== target){
//                 return mid;
//             }else if(target<m.get(mid)){
//                 high =mid-1;
//             }else{
//                 low = mid+1;
//             }
//         }
//         if(idx!= -1) return idx;
//         else{

//             low = peak;
//             high =m.length()-1;
//             while(low<=high){
//                 int mid=low +(high-low)/2;
//                 if(m.get(mid)== target){
//                 return mid;
//                 }else if(target>m.get(mid)){
//                     high =mid-1;
//                 }else{
//                     low = mid+1;
//             }
//         }

//         return -1;
//         }
//     }
// }






// In terms of functions

class Solution {
   public int findInMountainArray(int target, MountainArray mountainArr) {
       int n = mountainArr.length();
       int peakIndex = findPeakIndex(mountainArr, 0, n - 1);
       
       // Search in the left half (ascending)
       int leftResult = binarySearch(mountainArr, target, 0, peakIndex, true);
       if (leftResult != -1) return leftResult;
       
       // Search in the right half (descending)
       return binarySearch(mountainArr, target, peakIndex, n - 1, false);
   }
   
   private int findPeakIndex(MountainArray mountainArr, int low, int high) {
       while (low < high) {
           int mid = low + (high - low) / 2;
           if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
               low = mid + 1;
           } else {
               high = mid;
           }
       }
       return low;
   }
   
   private int binarySearch(MountainArray mountainArr, int target, int low, int high, boolean ascending) {
       while (low <= high) {
           int mid = low + (high - low) / 2;
           int midVal = mountainArr.get(mid);
           
           if (midVal == target) return mid;
           
           if (ascending) {
               if (midVal < target) low = mid + 1;
               else high = mid - 1;
           } else {
               if (midVal > target) low = mid + 1;
               else high = mid - 1;
           }
       }
       return -1;
   }
}