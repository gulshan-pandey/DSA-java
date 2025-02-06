package DSA;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumPerformanceOfATeam {
    /**
     * 
     * You are given two integers n and k and two integer arrays speed and efficiency both of length n. There are n engineers numbered from 1 to n. speed[i] and efficiency[i] represent the speed and efficiency of the ith engineer respectively.

        Choose at most k different engineers out of the n engineers to form a team with the maximum performance.

        The performance of a team is the sum of its engineers' speeds multiplied by the minimum efficiency among its engineers.

        Return the maximum performance of this team. Since the answer can be a huge number, return it modulo 109 + 7.

        

        Example 1:

        Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 2
        Output: 60
        Explanation: 
        We have the maximum performance of the team by selecting engineer 2 (with speed=10 and efficiency=4) and engineer 5 (with speed=5 and efficiency=7). That is, performance = (10 + 5) * min(4, 7) = 60.



        Example 2:

        Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 3
        Output: 68
        Explanation:
        This is the same example as the first but k = 3. We can select engineer 1, engineer 2 and engineer 5 to get the maximum performance of the team. That is, performance = (2 + 10 + 5) * min(5, 4, 7) = 68.



        Example 3:

        Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 4
        Output: 72
     */
}



/*
Intuition:
1. Sort engineers by efficiency in descending order
2. For each engineer (in efficiency order):
   - Add their speed to a min-heap
   - Keep only k fastest engineers in heap
   - Calculate performance = (current efficiency × sum of top k speeds)
3. Track maximum performance throughout process

Key idea: By processing highest efficiency first and maintaining k highest speeds,
we ensure we don't miss the optimal combination.
*/


class Solution {
    public int maxPerformance(int n, int[] s, int[] e, int k) {
        
        long MOD = 1_000_000_007;
        int[][] pair = new int[n][2];
        for(int i = 0; i < n; i++) {
            pair[i][0] = e[i];
            pair[i][1] = s[i];
        }
        
        Arrays.sort(pair, (a,b) -> b[0]-a[0]);
        
        PriorityQueue<Integer> speed = new PriorityQueue<>();
        
        long speedSum = 0, maxPerformance = 0;
        
        for(int[] p : pair) {
            speedSum+=p[1];
            speed.offer(p[1]);
            if(speed.size() > k) {
                speedSum-=speed.poll();
            }
            maxPerformance = Math.max(maxPerformance, speedSum*p[0]);
        }
        
        return (int)(maxPerformance%MOD);
        
    }
}