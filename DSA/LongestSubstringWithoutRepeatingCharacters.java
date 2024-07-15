package DSA;

public class LongestSubstringWithoutRepeatingCharacters {
    
    /*
     * Given a string s, find the length of the longest substring without repeating characters.
     * 
     * 
     * Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.

        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        

        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

     */
}





// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         int maxLength = 0;
//         int start = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (map.containsKey(s.charAt(i))) {
//                 // Update the start index to be the next index after the last occurrence of current character
//                 start = Math.max(start, map.get(s.charAt(i)) + 1);
//             }
//             // Update the map with the current character's index
//             map.put(s.charAt(i), i);
//             // Calculate the length of the current substring and update maxLength if necessary
//             maxLength = Math.max(maxLength, i - start + 1);
//         }

//         return maxLength;
//     }
// }
