package DSA;
public class TheCelebrityProblem {

    /**
     *    https://www.geeksforgeeks.org/problems/the-celebrity-problem/1
     * 
     * A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people.  A square matrix mat is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

        Note: Follow 0-based indexing.

        Examples:

        Input: mat[][] = [[0 1 0],
                        [0 0 0], 
                        [0 1 0]]
        Output: 1
        Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity. 


        Input: mat[][] = [[0 1],
                        [1 0]]
        Output: -1
        Explanation: The two people at the party both know each other. None of them is a celebrity.
     */
}


// NOTE : there can be only one celebrity



class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int []ans = new int[mat.length];
        int res=-1;
        
        for(int i =0; i<mat.length; i++){
            
            for(int j =0; j<mat[0].length; j++){
                if (mat[i][j]==1){
                    
                    ans[i] =1;
                    break;
                } 
            }
        }
        
        for(int i =0; i<ans.length; i++){
            if(ans[i]==0) {
                if(checker(mat,i)){
                    return i;       // the celebrity is found
                }
            }
        }
        
        return -1;
    }

     // Helper function to verify if a person is a celebrity
    public boolean checker(int mat[][] ,int idx){
        int n = mat.length;
        for(int i=0; i<n; i++){
             if (i != idx &&  mat[i][idx]!=1) return false;     // A celebrity should be known by everyone and should not know anyone else
        }
        return true;
    }
}






//optimized-------> tutorial  https://youtu.be/cEadsbTeze4?si=cT9ha6O_NjkvuiOd



// class Solution {
//     // Function to find if there is a celebrity in the party or not.
    
//     public int celebrity(int mat[][]) {
//         int n = mat.length;
//         int top =0;
//         int down = n-1;
        
//         while(top<down){
            
//             if(mat[top][down]==1){      //does the top knows down?
//                 top++;
//             } else if(mat[down][top]==1){       //does the down knows top?
//                 down--;
//             }else {             // means no one is celebrity bcz someone has to know them(a celeb is known by everyone)
//                 top++;
//                 down--;
//             }
            
//         }
        
//         if(top>down) return -1;
        
//         for(int i=0; i<n; i++){
            
//             if(i==top) continue;
//             if(mat[top][i]==0 && mat[i][top]==1){           //knows no body but known by everybody 
//             }
//             else return -1;
            
//         }
        
        
//         return top;
       
//     }
// }
        
        
        
        
        
        

