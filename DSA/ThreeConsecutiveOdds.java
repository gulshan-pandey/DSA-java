package DSA;
public class ThreeConsecutiveOdds {
    /*
     * Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 
     * Input: arr = [2,6,4,1]
        Output: false
        Explanation: There are no three consecutive odds.
     * 
     * 
     * Input: arr = [1,2,34,3,4,5,7,23,12]
        Output: true
        Explanation: [5,7,23] are three consecutive odds.
     */
}






// class Solution {
//     public boolean threeConsecutiveOdds(int[] arr) {
//         int x =0;
//         for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==1){
//             x++;
//             if(x==3){
//                 return true;
//             }
//            }else x=0;
//         }
//         return false;
//     }
// }




// using java 8

// class Solution {
//     public boolean threeConsecutiveOdds(int[] arr) {
//         return IntStream.range(0, arr.length - 2)
//                         .anyMatch(i -> arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0);
//     }
// }
