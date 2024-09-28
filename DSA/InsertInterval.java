package DSA;
public class InsertInterval {
    /**
     * link--> https://leetcode.com/problems/insert-interval/description/
     * 
     * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

        Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

        Return intervals after the insertion.

        Note that you don't need to modify intervals in-place. You can make a new array and return it.

        

        Example 1:

        Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
        Output: [[1,5],[6,9]]


        Example 2:

        Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        Output: [[1,2],[3,10],[12,16]]
        Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 
     */
}





// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {

//         var ans = new ArrayList<List<Integer>>();
//         int nf = newInterval[0];
//         int nl = newInterval[1];
//         boolean inserted = false;

//         for (int i = 0; i < intervals.length; i++) {
//             if (intervals[i][1] < nf) {
//                 ans.add(new ArrayList<>(List.of(intervals[i][0], intervals[i][1])));
//             } else if (intervals[i][0] > nl) {
//                 if (!inserted) {
//                     ans.add(new ArrayList<>(List.of(nf, nl)));
//                     inserted = true;
//                 }
//                 ans.add(new ArrayList<>(List.of(intervals[i][0], intervals[i][1])));
//             } else {
//                 nf = Math.min(nf, intervals[i][0]);
//                 nl = Math.max(nl, intervals[i][1]);
//             }
//         }

//         // if loop ended but the new interval was not added
//         if (!inserted) {
//             ans.add(new ArrayList<>(List.of(nf, nl)));
//         }

//         int[][] res = new int[ans.size()][2];
//         for (int i = 0; i < ans.size(); i++) {
//             res[i][0] = ans.get(i).get(0);
//             res[i][1] = ans.get(i).get(1);
//         }

//         return res;
//     }
// }






// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
//         var ans = new ArrayList<int[]>();

//         int nf = newInterval[0];
//         int nl = newInterval[1];
//         boolean found = false;

//         for (int[] interval : intervals) {
//             if (interval[1] < nf) {
//                 ans.add(interval);
//             } else if (interval[0] > nl) {
//                 if (!found) {
//                     ans.add(new int[]{nf, nl});
//                     found = true;
//                 }
//                 ans.add(interval);
//             } else {
//                 nf = Math.min(nf, interval[0]);
//                 nl = Math.max(nl, interval[1]);
//             }
//         }

//         if (!found) {
//             ans.add(new int[]{nf, nl});
//         }

//         return ans.toArray(new int[ans.size()][]);
//     }
// }







// Most optimal

class Solution {
    public int[][] insert(int[][] intervals, int[] arr) {
        List<int[]> l = new ArrayList<>();
        
        int n = intervals.length, i = 0;

        while(i<n && intervals[i][1] < arr[0]) l.add(intervals[i++]);           // left part of the array

        while(i<n && intervals[i][0] <= arr[1]) {                               // collision part
            arr[0] = Math.min(intervals[i][0], arr[0]);
            arr[1] = Math.max(intervals[i][1], arr[1]);
            i++;
        }

        l.add(arr);

        while(i<n) l.add(intervals[i++]);                                       // right part of the interval
        
        int[][] res = new int[l.size()][];
        for(int j=0; j<l.size(); j++) {
            res[j] = l.get(j);
        }

        return res;
    }
}
