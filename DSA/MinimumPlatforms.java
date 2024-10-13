package DSA;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumPlatforms {
    
    /**
     * Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
        Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.

        Note: Time intervals are in the 24-hour format(HHMM) , where the first two characters represent hour (between 00 to 23 ) and the last two characters represent minutes (this will be <= 59 and >= 0).

        Examples:

        Input: arr[] = [0900, 0940, 0950, 1100, 1500, 1800], 
                    dep[] = [0910, 1200, 1120, 1130, 1900, 2000]
        Output: 3
        Explanation: There are three trains during the time 0940 to 1200. So we need minimum 3 platforms.
        Input: arr[] = [0900, 1235, 1100], 
                    dep[] = [1000, 1240, 1200]
        Output: 1
        Explanation: All train times are mutually exlusive. So we need only one platform
        Input: arr[] = [1000, 0935, 1100], 
                    dep[] = [1200, 1240, 1130]
        Output: 3
        Explanation: All 3 trains have to be their from 11:00 to 11:30
        Expected Time Complexity: O(nLogn)
        Expected Auxiliary Space: O(n)
     * 
     */

}



class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int [][] ans = new int[arr.length][2];
        for(int i=0; i<ans.length; i++){
            ans[i][0]=arr[i];
            ans[i][1]=dep[i];
        }
        Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> platforms = new PriorityQueue<>();
        int maxPlatforms = 0;
        
        for (int[] train : ans) {
            while (!platforms.isEmpty() && platforms.peek() < train[0]) {
                platforms.poll();
            }
            platforms.offer(train[1]);
            maxPlatforms = Math.max(maxPlatforms, platforms.size());
        }
        
        return maxPlatforms;
    }
}



// class Solution {
//     // Function to find the minimum number of platforms required at the
//     // railway station such that no train waits.
//     static int findPlatform(int arr[], int dep[]) {
        
//         int [][] ans = new int[arr.length][2];
//         for(int i=0; i<arr.length; i++){
//             ans[i][0]=arr[i];
//             ans[i][1]=dep[i];
//         }
//          int platformsNeeded = 1;
//         int maxPlatforms = 1;
//         Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));
        
//         for(int i =0; i<arr.length; i++){
//             platformsNeeded = 1; 
//             for(int j =0; j<i ; j++){
//                 if(ans[i][0]<ans[j][1]){
//                   platformsNeeded++;
//                 }
//             }
//             maxPlatforms = Math.max(maxPlatforms, platformsNeeded);

//         }
//     return maxPlatforms;
//     }
// }




// // most optimized


// class Solution {
//     static int findPlatform(int arr[], int dep[]) {
       
//          Arrays.sort(arr);
//         Arrays.sort(dep);
        
//         int platformsNeeded = 1, result = 1;
//         int i = 1, j = 0;
        
//         while (i < arr.length && j < dep.length) {
//             if (arr[i] <= dep[j]) {
//                 platformsNeeded++;
//                 i++;
//             }
//             else if (arr[i] > dep[j]) {
//                 platformsNeeded--;
//                 j++;
//             }
            
//             if (platformsNeeded > result) {
//                 result = platformsNeeded;
//             }
//         }
        
//         return result;
//     }
// }



// class Solution {
//     static int findPlatform(int arr[], int dep[]) {
       
//          Arrays.sort(arr);
//         Arrays.sort(dep);
        
//         int platformsNeeded = 1, result = 1;
//         int i = 0, j = 0;
//         int count =0;
//         int ans=0;
        
//         while (i < arr.length ) {
//             if (arr[i] <= dep[j]) {
//                 count++;
//                ans= Math.max(ans,count);
//                i++;
//             }
//             else if (arr[i] > dep[j]) {
//                 count--;
//                 j++;
//             }
//         }
        
//         return ans;
//     }
// }