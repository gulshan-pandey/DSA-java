package DSA;

public class StrinfCompression {
    /*
     * Input: chars = ["a","a","b","b","c","c","c"]
     * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
     * 
     * 
     * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"]
     */

}





// class Solution {
//     public int compress(char[] chars) {
//         if (chars.length == 0)
//             return 0;
//         if (chars.length == 1)
//             return 1;

//         int j = 0;
//         int count = 1;
//         char[] arr = new char[chars.length];
//         for (int i = 1; i <= chars.length; i++) {      // i <= chars.length because (i-1) index is used everywhere

//             if (i<chars.length && chars[i] == chars[i - 1]) {
//                 count++;
//             } else {
//                 arr[j++] = chars[i - 1];

//                 if (count > 1) {
//                     String temp = Integer.toString(count);
//                     for (char elem : temp.toCharArray()) {
//                         arr[j++] = elem;

//                     }
//                 }
//                 count = 1;

//             }

//         }

//         for (int i = 0; i < j; i++) {           // Copy the result back to chars
//             chars[i] = arr[i];

//         }

//         return j;           // Return the new length
//     }
// }
