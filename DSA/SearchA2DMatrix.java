package DSA;

public class SearchA2DMatrix {
    /**
     * 
     * You are given an m x n integer matrix matrix with the following two
     * properties:
     * 
     * Each row is sorted in non-decreasing order.
     * The first integer of each row is greater than the last integer of the
     * previous row.
     * Given an integer target, return true if target is in matrix or false
     * otherwise.
     * 
     * You must write a solution in O(log(m * n)) time complexity.
     * 
     * 
     * 
     * Example 1:
     * 
     * 
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * Output: true
     * 
     * 
     * Example 2:
     * 
     * 
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     * Output: false
     * 
     */
}



class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int numRows = m.length;
        if (numRows == 0)
            return false;
        int numCols = m[0].length;
        int low = 0;
        int high = numRows - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (m[mid][0] <= target && m[mid][numCols - 1] >= target) { // check if target is in this row
                return search1(m[mid], target);
            } else if (m[mid][0] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    boolean search1(int[] row, int target) {

        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == target)
                return true;
            if (row[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

}