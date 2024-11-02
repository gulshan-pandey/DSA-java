package DSA;

public class KthElementOfTwoArrays {
    /**
     * 
     * Given two sorted arrays arr1 and arr2 and an element k. The task is to find the element that would be at the kth position of the combined sorted array.

        Examples :

        Input: k = 5, arr1[] = [2, 3, 6, 7, 9], arr2[] = [1, 4, 8, 10]
        Output: 6
        Explanation: The final combined sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10. The 5th element of this array is 6.


        Input: k = 7, arr1[] = [100, 112, 256, 349, 770], arr2[] = [72, 86, 113, 119, 265, 445, 892]
        Output: 256
        Explanation: Combined sorted array is - 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892. 7th element of this array is 256.
        Expected Time Complexity: O(log(n) + log(m))
        Expected Auxiliary Space: O(log (n))
     */
}




class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;  // Counter for elements processed
        int p1 = 0; // Pointer for arr1
        int p2 = 0; // Pointer for arr2
        long lastElement = 0;
        
        
        while (i < k && p1 < n1 && p2 < n2) {
            if (arr1[p1] <= arr2[p2]) {
                lastElement = arr1[p1];
                p1++;
            } else {
                lastElement = arr2[p2];
                p2++;
            }
            i++;
        }
        
        // If elements are remaining in arr1
        while (i < k && p1 < n1) {
            lastElement = arr1[p1];
            p1++;
            i++;
        }
        
        // If elements are remaining in arr2
        while (i < k && p2 < n2) {
            lastElement = arr2[p2];
            p2++;
            i++;
        }
        
        // If k is valid, return the kth element
        if (i == k) {
            return lastElement;
        }
        
        return -1; // Invalid k
    }
}