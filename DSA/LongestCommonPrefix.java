package DSA;
public class LongestCommonPrefix {
    

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        

        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

        */
}




// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);
//         String s1 = strs[0];
//         String s2 = strs[strs.length-1];
//         int idx = 0;
//         while(idx < s1.length() && idx < s2.length()){
//             if(s1.charAt(idx) == s2.charAt(idx)){
//                 idx++;
//             } else {
//                 break;
//             }
//         }
//         return s1.substring(0, idx);
//     }
// }


// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) {
//             return "";  // Return empty if the input is invalid
//         }

//         HashMap<Character, Integer> map = new HashMap<>();
//         int minLength = Integer.MAX_VALUE;

//         // Find the length of the shortest string
//         for (String str : strs) {
//             minLength = Math.min(minLength, str.length());
//         }

//         StringBuilder prefix = new StringBuilder();

//         // Loop through each character index up to the length of the shortest string
//         for (int i = 0; i < minLength; i++) {
//             char currentChar = strs[0].charAt(i);  // Take the i-th character from the first string
//             boolean isCommon = true;

//             // Check if this character is common in all strings
//             for (String str : strs) {
//                 if (str.charAt(i) != currentChar) {
//                     isCommon = false;
//                     break;
//                 }
//             }

//             if (isCommon) {
//                 prefix.append(currentChar);  // If it's common, add to the result
//             } else {
//                 break;  // Stop if the character is not common at the current index
//             }
//         }

//         return prefix.toString();
//     }
// }





// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) {
//             return "";
//         }

//         String longestCommonPrefix = strs[0];

//         for(int i=1; i<strs.length; i++) {
//             // Reduce the prefix while it's not a prefix of strs[i]
//             while (strs[i].indexOf(longestCommonPrefix) != 0) {
//                 longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
//                 if (longestCommonPrefix.isEmpty()) {
//                     return ""; // No common prefix found
//                 }
//             }
//         }

//         return longestCommonPrefix;
//     }
// }