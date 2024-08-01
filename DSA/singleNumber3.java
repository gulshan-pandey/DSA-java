package DSA;

public class singleNumber3 {
    
}





// class Solution {
//     public int[] singleNumber(int[] nums) {
        
//         long xorr = 0;
//         for(int i = 0; i < nums.length; i++){
//             xorr = xorr ^ nums[i];
//         }
//         long rightShift = (xorr & (xorr - 1)) ^ xorr;        // this variable is taken for separating the numbers in 2 groups

//         long b1 = 0;
//         long b2 = 0;
//         for(int j = 0; j < nums.length; j++){
//             if ((nums[j] & rightShift) != 0){
//                 b1 = b1 ^ nums[j];
//             } else{
//                 b2 = b2 ^ nums[j];
//             }
//         }
//         return new int[] { (int)b1, (int)b2 };
//     }
// }