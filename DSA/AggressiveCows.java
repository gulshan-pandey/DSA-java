package DSA;

import java.util.Arrays;

public class AggressiveCows {
    /**
     * 
     * You are given an array consisting of n integers which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
        The first line of input contains two space-separated integers n and k.
        The second line contains n space-separated integers denoting the position of the stalls.

        Example 1:

        Input:
        n=5 
        k=3
        stalls = [1 2 4 8 9]
        Output:
        3
        Explanation:
        The first cow can be placed at stalls[0], 
        the second cow can be placed at stalls[2] and 
        the third cow can be placed at stalls[3]. 
        The minimum distance between cows, in this case, is 3, 
        which also is the largest among all possible ways.


        Example 2:

        Input:
        n=5 
        k=3
        stalls = [10 1 2 7 5]
        Output:
        4
        Explanation:
        The first cow can be placed at stalls[0],
        the second cow can be placed at stalls[1] and
        the third cow can be placed at stalls[4].
        The minimum distance between cows, in this case, is 4,
        which also is the largest among all possible ways.
        Your Task:
        Complete the function int solve(), which takes integer n, k, and a vector stalls with n integers as input and returns the largest possible minimum distance between cows.

        Expected Time Complexity: O(n*log(10^9)).
        Expected Auxiliary Space: O(1).
     */
}




//    https://www.youtube.com/watch?v=R_Mfw4ew-Vo

/*
    Approach--:
 
    a) Sort the array first (to ensure we can process positions sequentially)

    b) Use Binary Search on the answer space:
    - Minimum distance possible = 0
    - Maximum distance possible = lastStall - firstStall
    
    c) For each mid value in binary search:     (Can be done by linear search too)
    - Check if it's possible to place K cows with 'mid' as minimum distance
    - If possible: 
        - This could be answer, store it
        - Try for larger distance (min = mid + 1)
    - If not possible:
        - Try smaller distance (max = mid - 1)

    d) Helper function to check if placement is possible:
    - Place first cow at first stall
    - Try placing next cow at minimum distance 'mid'
    - If K cows can be placed, return true

 */





 // Brute force approach

 class Solution {
    public static int aggresiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int maxDistance = stalls[n-1] - stalls[0];
        int result = -1;
        
        // Try every possible distance from 1 to maxDistance
        for (int distance = 1; distance <= maxDistance; distance++) {
            if (canPlaceCows(stalls, k, distance)) {
                result = distance;
            } else {
                // If we can't place cows at this distance,
                // we won't be able to place them at greater distances
                break;
            }
        }
        
        return result;
    }
    
    static boolean canPlaceCows(int[] stalls, int k, int minDistance) {
        int cowsPlaced = 1;  // Place first cow at the first stall
        int lastPosition = stalls[0];
        
        // Try to place remaining cows
        for (int i = 1; i < stalls.length; i++) {
            // If current stall is at least minDistance away from last placed cow
            if (stalls[i] - lastPosition >= minDistance) {
                cowsPlaced++;
                lastPosition = stalls[i];
            }
            
            // If we successfully placed all cows
            if (cowsPlaced >= k) {
                return true;
            }
        }
        
        // Couldn't place all cows with this minimum distance
        return false;
    }
}







// Optimal approach(binary search)
 

// class Solution {
//     public static int aggresiveCows(int[] stalls, int k) {
//         // code here
//         Arrays.sort(stalls);
//         int min=0;
//         int n = stalls.length;
//         int max =stalls[n-1] - stalls[0];
        
       
//         int minSpace=-1;
    
        
//         while(min<=max){
//             int mid = min+(max-min)/2;
//             if(canSit(mid,k,stalls)){
//                 minSpace= mid;
//                 min= mid+1;
//             }else{
//                 max = mid-1;
//             }
//         }
//         return minSpace;
//     }
    
//     static boolean canSit(int mid, int k,int[] stalls ){
//         int lastPosition = stalls[0];       
//         int cowsPlaced=1;
//         for(int i =1; i<stalls.length; i++){
            
//             if(stalls[i]-lastPosition >=mid){
//                 lastPosition = stalls[i];
//                 cowsPlaced++;
//             }
            
//             if(cowsPlaced>=k) return true;
//         }
//         return false;
//     }
    
// }
