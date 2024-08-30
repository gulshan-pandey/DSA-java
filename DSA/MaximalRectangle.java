package DSA;

import java.util.Stack;

public class MaximalRectangle {
    /**
     * https://leetcode.com/problems/maximal-rectangle/description/
     * Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

 

        Example 1:


        Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
        Output: 6
        Explanation: The maximal rectangle is shown in the above picture.


        Example 2:

        Input: matrix = [["0"]]
        Output: 0
        Example 3:

        Input: matrix = [["1"]]
        Output: 1
     * 
     */
}


/**
 * prerequisite is to solve the largest rectangle in histogram problem: 
 * Note: use prefix sum for every row in the matrix to compute the bar height of the every row and this will convert the problem into largest rectangle in histogram for every row,
 *  then find the maximum area among all the rows
 */



class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int maxArea = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] psum = new int[m][n];

        // Step 1: Build the histogram heights for each column
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(matrix[i][j]=='1'){
                    psum[i][j] = (i == 0 ? 1: psum[i-1][j]+1);
                }else {
                    psum[i][j] = 0;
                }
            }
        }

        // Step 2: Calculate the maximum rectangle area for each row's histogram
        for(int i=0; i<m; i++){
            maxArea = Math.max(maxArea, maxAreaHistogram(psum[i]));
        }

        return maxArea;
    }



    // Helper method to calculate the maximum rectangle area in a histogram
    public int maxAreaHistogram(int [] arr){
        int maxArea=0;
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        for(int i =0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                int element = stack.pop();
                int pse = stack.empty()? -1: stack.peek();
                int nse =i;
                maxArea = Math.max(maxArea, arr[element]*(nse- pse-1));
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int element = stack.pop();
            int nse = n;
            int pse = stack.isEmpty()? -1:stack.peek();
            maxArea = Math.max(maxArea,arr[element]*(nse-pse-1));
        }

        return maxArea;
    }
}
