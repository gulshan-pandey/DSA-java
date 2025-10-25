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
        int n = mat.length;
        int candidate = 0;

        // Step 1: Find a potential candidate
        for (int i = 1; i < n; i++) {
            // If candidate knows i, then candidate can't be celebrity
            if (mat[candidate][i] == 1) {
                candidate = i;
            }
        }

        // Step 2: Verify the candidate
        if (isCelebrity(mat, candidate)) {
            return candidate;
        }

        return -1;
    }

    // Helper function to verify if a person is a celebrity
    private boolean isCelebrity(int[][] mat, int idx) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            if (i == idx) continue;

            // Celebrity should not know i
            if (mat[idx][i] == 1) return false;

            // Everyone should know celebrity
            if (mat[i][idx] == 0) return false;
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
        
        
      



// Stack based approach        
        
      
// class Solution {
    
//     // Function to check if a knows b
//     private boolean knows(int[][] mat, int a, int b) {
//         return mat[a][b] == 1;
//     }
    
//     public int celebrity(int mat[][]) {
//         Stack<Integer> stack = new Stack<>();
        
//         int n=mat.length;
//         // Step 1: Push all people to the stack
//         for (int i = 0; i < n; i++) {
//             stack.push(i);
//         }

//         // Step 2: Find the potential celebrity
//         while (stack.size() > 1) {
//             int A = stack.pop();
//             int B = stack.pop();
            
//             if (knows(mat, A, B)) {
//                 // A knows B, so A cannot be a celebrity, push B
//                 stack.push(B);
//             } else {
//                 // A doesn't know B, so B cannot be a celebrity, push A
//                 stack.push(A);
//             }
//         }

//         // Step 3: Verify the potential celebrity
//         int C = stack.pop();

//         // C should not know anyone, and everyone should know C
//         for (int i = 0; i < n; i++) {
//             if (i != C && (knows(mat, C, i) || !knows(mat, i, C))) {
//                 return -1; // No celebrity found
//             }
//         }

//         // Step 4: Return the celebrity
//         return C;
//     }
// }

      
      
          

