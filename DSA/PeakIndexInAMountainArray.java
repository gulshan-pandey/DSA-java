package DSA;

public class PeakIndexInAMountainArray {
    /**
     * 
     * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

        Return the index of the peak element.

        Your task is to solve it in O(log(n)) time complexity.

        

        Example 1:

        Input: arr = [0,1,0]

        Output: 1


        Example 2:

        Input: arr = [0,2,1,0]

        Output: 1


        Example 3:

        Input: arr = [0,10,5,2]

        Output: 1
     */
}

/*
 *  Tutorial ->  https://youtu.be/W9QJ8HaRvJQ?si=O6tymBqmt8l5Z-Tl&t=7673
 * 
 *  Two Approaches
 */



// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int low =0,high =arr.length-1;

//         while(low<=high){
//             int mid = low + (high-low)/2;
//             if(mid!=0 && arr[mid-1]>arr[mid]){
//                 high =mid-1;
//             }else{
//                 low =mid+1;
//             }
//         }
//         return high;
//     }
// }



class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        
        while (low < high) {                        // important to consider ans it might go into infinite loop
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // Peak is on the right side
                low = mid + 1;
            } else {
                // Peak is here or on the left side
                high = mid;
            }
        }
        return low; // or high, they're the same at this point
    }
}