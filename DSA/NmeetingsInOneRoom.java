package DSA;

import java.util.Arrays;

public class NmeetingsInOneRoom {
    /**
     * You are given timings of n meetings in the form of (start[i], end[i]) where start[i] is the start time of meeting i and end[i] is the finish time of meeting i. Return the maximum number of meetings that can be accommodated in a single meeting room, when only one meeting can be held in the meeting room at a particular time. 

        Note: The start time of one chosen meeting can't be equal to the end time of the other chosen meeting.

        Examples :

        Input: n = 6, start[] = [1, 3, 0, 5, 8, 5], end[] =  [2, 4, 6, 7, 9, 9]
        Output: 4
        Explanation: Maximum four meetings can be held with given start and end timings. The meetings are - (1, 2), (3, 4), (5,7) and (8,9)

        Input: n = 3, start[] = [10, 12, 20], end[] = [20, 25, 30]
        Output: 1
        Explanation: Only one meetings can be held with given start and end timings.

        Expected Time Complexity: O(n*logn)
        Expected Auxilliary Space: O(n)
     */
}




class Solution {
    public int maxMeetings(int n, int start[], int end[]) {
        int count =1;
        
        int[][] res = new int[n][2];
        for(int i=0; i<start.length; i++){
            res[i][0]=start[i];
            res[i][1]=end[i];
        }
        Arrays.sort(res, (a,b)-> Integer.compare(a[1],b[1]));
        
        int curr = res[0][1];
        for(int i =1; i<res.length; i++){
            if(res[i][0]>curr){
                count++;
                curr=res[i][1];
            }
        }
        return count;
    }
}














