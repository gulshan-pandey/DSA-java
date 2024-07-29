package DSA;
public class LongestRepeatingCharacterReplacement {
    /*
     * 
     * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

        Return the length of the longest substring containing the same letter you can get after performing the above operations.

        

        Example 1:

        Input: s = "ABAB", k = 2
        Output: 4
        Explanation: Replace the two 'A's with two 'B's or vice versa.


        Example 2:

        Input: s = "AABABBA", k = 1
        Output: 4
        Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
        The substring "BBBB" has the longest repeating letters, which is 4.
        There may exists other ways to achieve this answer too.
     * 
     */

}




//the idea is to keep iterating through the string and put there Chars and there frequency on the hashmap and findout the highest frequency and substract it from the current size of the string

// class Solution {
//     public int characterReplacement(String s, int k) {
//         int start = 0;
//         int maxLen = 0;
//         int mostFreq = 0;
//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int end = 0; end < s.length(); end++) {
//             char endChar = s.charAt(end);
//             map.put(endChar, map.getOrDefault(endChar, 0) + 1);
//             mostFreq = Math.max(mostFreq, map.get(endChar));

//             if (end - start + 1 - mostFreq > k) {
//                 char startChar = s.charAt(start);
//                 map.put(startChar, map.get(startChar) - 1);
//                 start++;
//             }

//             maxLen = Math.max(maxLen, end - start + 1);

//         }
//         return maxLen;

//     }
// }




// the idea is same but the data structure is different

class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxLength = 0;
        int maxCount = 0;
        int[] count = new int[26];

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(end) - 'A']);

            while (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

