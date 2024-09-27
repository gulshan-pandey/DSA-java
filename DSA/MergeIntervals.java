package DSA;

import java.util.ArrayList;
import java.util.Arrays;
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






