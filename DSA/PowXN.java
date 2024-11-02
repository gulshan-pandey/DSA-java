package DSA;

public class PowXN {

    /*
     * 
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

        Example 1:

        Input: x = 2.00000, n = 10
        Output: 1024.00000
        Example 2:

        Input: x = 2.10000, n = 3
        Output: 9.26100
        Example 3:

        Input: x = 2.00000, n = -2
        Output: 0.25000
        Explanation: 2-2 = 1/22 = 1/4 = 0.25
     */
}




class Solution {
    public double myPow(double x, int n) {
        // Handle the case when n is negative
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return pow(x, n);
    }

    private double pow(double x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half; // even
        } else {
            return half * half * x; // odd
        }
    }
}







// class Solution {
//     public double myPow(double x, int n) {
//         if (n == 0) return 1.0;
        
//         if (n < 0) {
//             return neg(x, n);
//         } else {
//             double result = 1.0;
//             long power = n;  // Use long to handle multiplication
//             while (power > 0) {
//                 if ((power & 1) == 1) {  // If power is odd
//                     result *= x;
//                 }
//                 x *= x;  // Square x
//                 power >>= 1;  // Divide power by 2
//             }
//             return result;
//         }
//     }

//     double neg(double x, int n) {
//         if (n == Integer.MIN_VALUE) {
//             x = 1/x;
//             return myPow(x, -(n + 1)) * x;
//         }
//         x = 1/x;
//         return myPow(x, -n);
//     }
// }

