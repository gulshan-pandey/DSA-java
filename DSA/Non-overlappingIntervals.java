package DSA;

public class Non-overlappingIntervals {
    /**
     * 
     * Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

 

        Example 1:

        Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
        Output: 1
        Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.


        Example 2:

        Input: intervals = [[1,2],[1,2],[1,2]]
        Output: 2
        Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.


        Example 3:

        Input: intervals = [[1,2],[2,3]]
        Output: 0
        Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
     */
}




// just opposite to N meetings in a room  -->   https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
            int count =1;

          int curr = intervals[0][1];
        for(int i =1; i<intervals.length; i++){
            if(intervals[i][0]>=curr){
                count++;
                curr=intervals[i][1];
            }
        }


        return intervals.length-count;
    }
}




// class Solution {
//     public int eraseOverlapIntervals(int[][] intervals) {
//         Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
//         System.out.println(Arrays.deepToString(intervals));
//         int count =0;
//         int f=intervals[0][1];
//         for(int i=1; i<intervals.length; i++){
//             if(f>intervals[i][0]){
//                 count++;
//             }else f=intervals[i][1];

//         }
//         return count;
//     }
// }





// class Solution {
//     public int eraseOverlapIntervals(int[][] intervals) {
//         // Sort intervals based on end time
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
//         int count = 0;
//         int end = Integer.MIN_VALUE;
        
//         for (int[] interval : intervals) {
//             if (interval[0] >= end) {
//                 // No overlap, update end
//                 end = interval[1];
//             } else {
//                 // Overlap found, increment count
//                 count++;
//             }
//         }
        
//         return count;
//     }
// }


