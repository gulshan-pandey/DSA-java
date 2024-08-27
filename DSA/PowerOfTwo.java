package DSA;
public class PowerOfTwo {

/*
 Example 1:

Input: n = 1
Output: true
Explanation: 2^0 = 1

 
Example 2:

Input: n = 16
Output: true
Explanation: 2^4 = 16


Example 3:

Input: n = 3
Output: false

 */


}




//  number has exactly one bit set in its binary representation using the bitwise operation (n & -n) == n


// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n==0) return false;
//         if(n>0 && (n &(n-1)) ==0){
//             return true;
//         }else return false;
//     }
// }




// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         return n > 0 && (n & (n - 1)) == 0;
//     }
// }


// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n>0 &&((n & -n)==n)){
//             return true;
//         } else return false;

//     }
// }

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         return n > 0 && (n & -n) == n;
//     }
// }




