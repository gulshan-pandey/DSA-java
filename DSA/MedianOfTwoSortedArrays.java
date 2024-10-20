package DSA;
public class MedianOfTwoSortedArrays {
    /**
     * 
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

        The overall run time complexity should be O(log (m+n)).

        

        Example 1:

        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.


        Example 2:

        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
     */
}



// brute force O(nlogn)

// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
//         int[] ans = new int [nums1.length +nums2.length];
//         int i=0;
//         for(int n: nums1){
//             ans[i++]=n;
//         }
//         for(int n:nums2){
//             ans[i++]=n;
//         }

//         Arrays.sort(ans);
//          int len = ans.length;
//         if(ans.length%2==0){
//             int mid = (len-1)/2;
//             return (double)(ans[mid] + ans[mid+1])/2;
//         }
//         return (double)ans[len/2];
//     }
// }





//O(n) approach

// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int i =0; int j=0;
//         int []ans = new int[nums1.length + nums2.length];
//         int idx=0;
//          while (i < nums1.length && j < nums2.length) {
//         if (nums1[i] <= nums2[j]) {
//             ans[idx++] = nums1[i];
//             i++;
//         } else {
//             ans[idx++] = nums2[j];
//             j++;
//         }
//     }

//     // Copy remaining elements, if any
//     while (i < nums1.length) {
//         ans[idx++] = nums1[i];
//         i++;
//     }
//     while (j < nums2.length) {
//         ans[idx++] = nums2[j];
//         j++;
//     }

//             int len = ans.length;
//           if(ans.length%2==0){
//             int mid = (len-1)/2;
//             return (double)(ans[mid] + ans[mid+1])/2;
//         }
//         return (double)ans[len/2];

//     }
// }






// O(n)  && O(1)


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m = nums1.length;
        int n = nums2.length;
        int size = m+n;
        
        int idx1 = (size/2)-1;
        int element1 = -1;
        
        int idx2 = size/2;
        int element2 = -1;
        
        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                if(k == idx1) {
                    element1 = nums1[i];
                }
                if(k == idx2) {
                    element2 = nums1[i];
                }
                i++;
            } else {
                if(k == idx1) {
                    element1 = nums2[j];
                }
                if(k == idx2) {
                    element2 = nums2[j];
                }
                j++;
            }
            k++;
        }
        
        while(i < m) {
            if(k == idx1) {
                element1 = nums1[i];
            }
            if(k == idx2) {
                element2 = nums1[i];
            }
            i++;
            k++;
        }
        
        while(j < n) {
            if(k == idx1) {
                element1 = nums2[j];
            }
            if(k == idx2) {
                element2 = nums2[j];
            }
            j++;
            k++;
        }

        if(size%2 == 1)
            return element2;
        
        return (element1 + element2)/2.0;
        
    }
}



