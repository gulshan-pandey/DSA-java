package DSA;

//SUIMILAR PROBLEM TO THE FruitsIntoBaskets
public class  LongestSubstringWithAtMostKDistinctCharacters{    
   

/*
 * You are given a string 'str' and an integer ‘K’. Your task is to find the length of the largest substring with at most ‘K’ distinct characters.
    For example:
    You are given ‘str’ = ‘abbbbbbc’ and ‘K’ = 2, then the substrings that can be formed are [‘abbbbbb’, ‘bbbbbbc’]. Hence the answer is 7.

 */

}






// public class Solution {

//     public static int kDistinctChars(int k, String str) {
//         if (k == 0) return 0; // Edge case: if k is 0, return 0
        
//         int left = 0;
//         int right = 0;
//         int maxLength = 0;
//         HashMap<Character, Integer> map = new HashMap<>();

//         while (right < str.length()) {
//             map.put(str.charAt(right), map.getOrDefault(str.charAt(right), 0) + 1);

//             while (map.size() > k) {
//                 map.put(str.charAt(left), map.get(str.charAt(left)) - 1);
//                 if (map.get(str.charAt(left)) == 0) {
//                     map.remove(str.charAt(left));
//                 }
//                 left++;
//             }

//             maxLength = Math.max(maxLength, right - left + 1);
//             right++;
//         }
//         return maxLength;
//     }
// }
