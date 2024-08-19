package DSA;

public class StrictlyPalindromicNumber {
    /*
     * An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.

        Given an integer n, return true if n is strictly palindromic and false otherwise.

        A string is palindromic if it reads the same forward and backward.

        

        Example 1:

        Input: n = 9
        Output: false
        Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
        In base 3: 9 = 100 (base 3), which is not palindromic.
        Therefore, 9 is not strictly palindromic so we return false.
        Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.
        Example 2:

        Input: n = 4
        Output: false
        Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
        Therefore, we return false.
     * 
     */
}






class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int b = 2; b <= n - 2; b++) {
            String s = convert(n, b);
            if (!isPalindrome(s)) {
                return false;
            }
        }
        return true;
    }

    // Method to convert a number 'n' to base 'b'
    private String convert(int n, int b) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.append(n % b);
            n /= b;
        }
        return s.reverse().toString();
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
