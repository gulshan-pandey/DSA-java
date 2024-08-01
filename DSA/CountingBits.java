package DSA;

public class CountingBits {


    // to unset the ith bit
    public static int unsetIthBit(int n, int i) {
        int mask = ~(1 << (i - 1));
        return n & mask;
    }

/*
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 */

//  Example 1:

// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10


// Example 2:
// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101


}


//bruteforce

// class Solution {             //brute force
//     public int[] countBits(int n) {

//         int[] arr = new int[n + 1];
//         for (int i = 0; i <= n; i++) {
//             int count = 0;
//             for (int j = 0; j < 32; j++) {
//                 if((i & (1 << j ))!= 0) {
//                     count++;
//                 }

//             }
//             arr[i] = count;
//         }
//         return arr;
//     }
// }





//optimized

// class Solution {        // dp-----  The number of 1-bits in the binary representation of a number i can be determined by the number of 1-bits in i / 2 (which is i >> 1) plus 1 if i is odd (i & 1).
//     public int[] countBits(int n) {
//         int[] arr = new int[n + 1];
        
//         for (int i = 1; i <= n; i++) {
//             arr[i] = arr[i >> 1] + (i & 1);
//         }
        
//         return arr;
//     }
// }





// optimistt way-------Kernighan's algorithm.: is an efficient way to count the number of set bits (1-bits) in an integer's binary representation. The key insight is that the operation  k=k&(k−1) removes the lowest set bit from k


//
//
//class Solution {
//    public int[] countBits(int n) {
//        int[] arr = new int[n + 1];
//
//        for (int i = 1; i <= n; i++) {
//            int count =0;
//            int k=i;
//            while(k>0){
//                 k=k&(k-1);         // main part
//                 count++;
//            }
//            arr[i]=count;
//
//        }
//
//        return arr;
//    }
//}






// to remove ith set bit of the number

// num= num-(num & -num);                   ---> this approach is used in fenvick tree