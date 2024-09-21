package DSA;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    /**
     * 
     * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

    

    Example 1:

    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].


    Example 2:

    Input: intervals = [[1,4],[4,5]]
    Output: [[1,5]]
    Explanation: Intervals [1,4] and [4,5] are considered overlapping.
     * 
     */
}




// class Solution {
//     public int[][] merge(int[][] intervals) {
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         int fi=intervals[0][0];
//         int fl =intervals[0][1];
//         var  list = new ArrayList<List<Integer>>();
        
//         for(int i=1; i<intervals.length; i++){

         
//                int sf=intervals[i][0];
//                 if(sf<=fl){
//                     fl =Math.max(intervals[i][1],fl);

//                 }else{
//                     list.add(Arrays.asList(fi,fl));
//                     fi =intervals[i][0];
//                     fl = intervals[i][1];
//                 }

//         }
//             list.add(Arrays.asList(fi,fl));


//             int[][] ans = new int[list.size()][2];
//             for(int i=0; i<list.size(); i++){
//                 ans[i][0]=list.get(i).get(0);
//                 ans[i][1]=list.get(i).get(1);
//             }
//             return ans;
//     }
// }





class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int fi=intervals[0][0];
        int fl =intervals[0][1];
        var  list = new ArrayList<List<Integer>>();
        
        for(int i=1; i<intervals.length; i++){

         
               int sf=intervals[i][0];
                if(sf<=fl){
                    fl =Math.max(intervals[i][1],fl);

                }else{
                    list.add(Arrays.asList(fi,fl));
                    fi =intervals[i][0];
                    fl = intervals[i][1];
                }

        }
            list.add(Arrays.asList(fi,fl));


            int[][] ans = new int[list.size()][2];
            for(int i=0; i<list.size(); i++){
                ans[i][0]=list.get(i).get(0);
                ans[i][1]=list.get(i).get(1);
            }
            return ans;
    }
}








// class Solution {
//     public int[][] merge(int[][] intervals) {
//         // Sort by the start of each interval
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

//         // Initialize the position to place merged intervals
//         int index = 0;

//         // Iterate through the intervals to merge them
//         for (int i = 1; i < intervals.length; i++) {
//             // If the current interval overlaps with the previous one
//             if (intervals[i][0] <= intervals[index][1]) {
//                 // Merge the intervals by updating the end
//                 intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
//             } else {
//                 // Move to the next position and set this as a new interval
//                 index++;
//                 intervals[index] = intervals[i];
//             }
//         }

//         // Return the merged intervals, which are now in the first 'index + 1' positions
//         return Arrays.copyOf(intervals, index + 1);
//     }
// }







// best


// class Solution {
//     public int[][] merge(int[][] intervals) {


//         if (intervals.length == 1) {
//             return intervals;
//         }
//         int max = -1;
//         for (int i = 0; i < intervals.length; i++) {
//             max = Math.max(intervals[i][0], max);
//         }
//         if (max == -1) {
//             return new int[][] { intervals[0] };
//         }
//         int[] timeTable = new int[max + 1];
//         for (int i = 0; i < intervals.length; i++) {
//             int startTime = intervals[i][0];
//             int endTime = intervals[i][1];
//             timeTable[startTime] = Math.max(endTime + 1, timeTable[startTime]);
//         }
//         int resultSize = 0, currEnd = -1, currStart = -1;
//         for (int i = 0; i < timeTable.length; i++) {
//             if (timeTable[i] != 0) {
//                 if (currStart == -1) {
//                     currStart = i;
//                 }
//                 currEnd = Math.max(timeTable[i] - 1, currEnd);
//             }
//             if (currEnd == i) {
//                 intervals[resultSize++] = new int[] { currStart, currEnd };
//                 currEnd = -1;
//                 currStart = -1;
//             }
//         }
//         if (currStart != -1) {
//             intervals[resultSize++] = new int[] { currStart, currEnd };
//         }
//         if (intervals.length == resultSize) {
//             return intervals;
//         }
//         int[][] res = new int[resultSize][];
//         for (int i = 0; i < resultSize; i++) {
//             res[i] = intervals[i];
//         }
//         return res;
        
//     }
// }