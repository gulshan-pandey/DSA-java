package DSA;
public class SearchA2DMatrixII {
    /**
     * 
     * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

        Integers in each row are sorted in ascending from left to right.
        Integers in each column are sorted in ascending from top to bottom.
        

        Example 1:

        Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
        Output: true


        Example 2:

        Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
        Output: false
     */
}


//Bruete force

// class Solution {
//     public boolean searchMatrix(int[][] m, int target) {
//         for(int i =0; i<m.length; i++){
//             for(int j = 0; j<m[i].length; j++){
//                 if(m[i][j]==target) return true;
//             }
//         }
//         return false;
//     }
// }





// efficient binary search    O(m*log(n))

// class Solution {
//     public boolean searchMatrix(int[][] m, int target) {
//     boolean found =false;
//         for(int i =0; i<m.length; i++){
//             found= bs(m[i],target);
//             if(found ==true) return true;
//         }
//         return found;
//     }

//     boolean bs(int[]m, int target){
//          int low = 0;
//         int high = m.length-1;
//          while(high>=low){
//            int pivot = low +(high-low)/2;
//            if(m[pivot]== target) return true;
//            if(m[pivot]>= target) {
//              high=pivot-1;
//            }else{
//             low =pivot+1;
//            }
          
//         }
//         return false;

//     }
// }






// Most optimized  O(m+n)


class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            return false;
        }

        int row =0;
        int col =m[0].length-1;

        while(row<m.length && col>-1){
            if(m[row][col]==target) return true;

            if(m[row][col]<target){
                row++;          // Move down if current element is smaller
            }else{
                col--;      // Move left if current element is greater
            }
        }

    return false;

    }
}



