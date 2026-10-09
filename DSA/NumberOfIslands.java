package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    /*

    Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.


    Example 1:

    Input: grid = [
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
    ]
    Output: 1
    Example 2:

    Input: grid = [
    ["1","1","0","0","0"],
    ["1","1","0","0","0"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
    ]
    Output: 3
 
    
    */
}



class Solution {

        public void bfs(char [][] grid, int r, int c, int [][] dirs){

            Queue<int[]> queue = new LinkedList<>();

            queue.add( new int[] {r,c});
            // it is visited now, so makring it as water
            grid[r][c] = '0';
            
            while(!queue.isEmpty()){
                int size = queue.size();

                for(int i =0; i<size; i++){
                    int[] cur = queue.remove();

                    int cR = cur[0];
                    int cC = cur [1];

                    for( int[]dir : dirs){

                        int nR = cR + dir[0];
                        int nC = cC + dir[1];

                        if(nR >= grid.length){
                            continue;
                        }

                        if(nC >=grid[0].length){
                            continue;
                        }

                        if(nC < 0 ){
                            continue;
                        }

                        if(nR <0){
                            continue;
                        }

                        if(grid[nR][nC]== '0'){
                            continue;
                        }

                        grid[nR][nC] = '0';

                        queue.add(new int[]{nR, nC});
                    }
                }
            }

        }

    public int numIslands(char[][] grid) {
        int countIslands =0;

        //creating the directions for searching the land and water
        int[][] dir = {
            {0,1},  //right
            {1,0},  // bottom
            {0,-1}, // left
            {-1,0}  //top
        };

        for(int i =0; i<grid.length; i++){
            for(int j =0; j<grid[0].length; j++){

                if(grid[i][j]=='1'){
                    // increase count of island by 1
                    countIslands ++;

                    bfs(grid,i,j,dir);
                }
            }
        }



    return countIslands;
    }
}




// DFS Approach


// class Solution {

//     public void dfs(char[][] grid, int i, int j, int[][] dirs) {

//         // Mark current land as visited
//         grid[i][j] = '0';

//         for (int[] dir : dirs) {

//             int nR = i + dir[0];
//             int nC = j + dir[1];

//             if ((nR >= 0 && nR < grid.length) &&
//                 (nC >= 0 && nC < grid[0].length) &&
//                 grid[nR][nC] == '1') {

//                 dfs(grid, nR, nC, dirs);
//             }
//         }
//     }

//     public int numIslands(char[][] grid) {

//         int countIslands = 0;

//         int[][] dir = {
//             {0, 1},   // right
//             {1, 0},   // bottom
//             {0, -1},  // left
//             {-1, 0}   // top
//         };

//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {

//                 if (grid[i][j] == '1') {

//                     countIslands++;

//                     dfs(grid, i, j, dir);
//                 }
//             }
//         }

//         return countIslands;
//     }
// }
