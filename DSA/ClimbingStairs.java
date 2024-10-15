package DSA;

public class ClimbingStairs {
    

    /**
     * 
     * You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    
        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps


        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
     */
}


class Solution {
    int[] arr = new int[46];

    public int climbStairs(int n) {

        if (n == 3)    return 3;
        if (n == 2)    return 2;
        if (n == 1)    return 1;
        if (n == 0)    return 1;
        if (arr[n] != 0) return arr[n];
        arr[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return arr[n];
    }
}




// class Solution {
// private int[] arr = new int[46]; // Initialize the array outside the method

// public int climbStairs(int n) {
// // Base cases
// if (n == 0) return 1; // There is one way to stay at the ground (do nothing)
// if (n == 1) return 1; // One way to climb one step

// // Check if already computed
// if (arr[n] != 0) return arr[n];

// // Compute the number of ways to climb n stairs
// arr[n] = climbStairs(n - 1) + climbStairs(n - 2);
// return arr[n];
// }
// }
