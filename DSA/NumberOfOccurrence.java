package DSA;
public class NumberOfOccurrence {
    /**
     * 
     * Input:
        N = 7, X = 2
        Arr[] = {1, 1, 2, 2, 2, 2, 3}
        Output: 4
        Explanation: x = 2 occurs 4 times in the given array so the output is 4.
        Example 2:

        Input:
        N = 7, X = 4
        Arr[] = {1, 1, 2, 2, 2, 2, 3}
        Output: 0
        Explanation: X = 4 is not present in the given array so the output is 0.

       

        Expected Time Complexity: O(logN)
        Expected Auxiliary Space: O(1)


     * 
     */
}


class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int first = -1;
        int last =-1;
        
        
        int l=0;
        int r=n-1;
        
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(arr[mid]==x){
                first =mid;
                r=mid-1;
                continue;
            }else if(arr[mid]>x){
                r=mid-1;
            }else{
                l = mid+1;
            }
        }
        
        l=0;
        r=n-1;
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(arr[mid]==x){
                last =mid;
                l=mid+1;
                continue;
            }else if(arr[mid]>x){
                r =mid-1;
            }else{
                l = mid+1;
            }
        }
        if(first==-1 &&last==-1) return 0;
        return last- first+1;
    }
}




// More Optimized and enhanced redablity------ BUT THE IDEA IS SAME(REDUCED REDUNDENCY BY MAKING FUNCTION)




class Solution {
    int count(int[] arr, int n, int x) {
        int first = findOccurrence(arr, n, x, true);
        if (first == -1) return 0; // x not found in array
        
        int last = findOccurrence(arr, n, x, false);
        
        return last - first + 1;
    }

    int findOccurrence(int[] arr, int n, int x, boolean findFirst) {
        int result = -1;
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == x) {
                result = mid;
                if (findFirst) {
                    right = mid - 1; // Move left to find first occurrence
                } else {
                    left = mid + 1;  // Move right to find last occurrence
                }
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}
