package DSA;

public class PlusOne {
    
    /**
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.

        

        Example 1:

        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
        Example 2:

        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.
        Incrementing by one gives 4321 + 1 = 4322.
        Thus, the result should be [4,3,2,2].
        Example 3:

        Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].
        
     */
}



class Solution {
    public int[] plusOne(int[] digits) {
        for(int i =digits.length-1 ; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
    
        int [] ans = new int[digits.length+1];
        ans[0]=1;
    
        return ans;
       }
    }
    
    
    

    // different apptoach using BigIntegers------ but very high time complexity

// class Solution {
//     public int[] plusOne(int[] digits) {
//         BigInteger num = BigInteger.ZERO;
//         for (int digit : digits) {
//             num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
//         }
//         num = num.add(BigInteger.ONE);

//         String s = num.toString();
//         int[] ans = new int[s.length()];
//         for (int i = 0; i < s.length(); i++) {
//             ans[i] = Character.getNumericValue(s.charAt(i));
//         }
//         return ans;
//     }
// }
