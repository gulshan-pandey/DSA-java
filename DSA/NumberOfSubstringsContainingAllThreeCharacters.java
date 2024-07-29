package DSA;

public class NumberOfSubstringsContainingAllThreeCharacters {
    
    /*
     * 
     * Given a string s consisting only of characters a, b and c.

        Return the number of substrings containing at least one occurrence of all these characters a, b and c.

        

        Example 1:

        Input: s = "abcabc"
        Output: 10
        Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
       
       
        Example 2:

        Input: s = "aaacb"
        Output: 3
        Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
        
        
        Example 3:

        Input: s = "abc"
        Output: 1
 
     * 
     */
}




// class Solution {            //brute force gives TLE
//     public int numberOfSubstrings(String s) {
//         int count = 0;
//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i; j < s.length(); j++) {
//                 String temp = s.substring(i, j + 1);
//                 if (temp.contains("a") && temp.contains("b") && temp.contains("c")) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }



// class Solution {
//     public int numberOfSubstrings(String s) {
//         int count = 0;
//         int aCount = 0, bCount = 0, cCount = 0;
//         int start = 0;

//         for (int end = 0; end < s.length(); end++) {
//             char ch = s.charAt(end);
//             if (ch == 'a') {
//                 aCount++;
//             } else if (ch == 'b') {
//                 bCount++;
//             } else if (ch == 'c') {
//                 cCount++;
//             }

//             while (aCount > 0 && bCount > 0 && cCount > 0) {
//                 count += s.length() - end; // All substrings from start to end are valid
//                 char startChar = s.charAt(start);
//                 if (startChar == 'a') {
//                     aCount--;
//                 } else if (startChar == 'b') {
//                     bCount--;
//                 } else if (startChar == 'c') {
//                     cCount--;
//                 }
//                 start++;
//             }
//         }
//         return count;
//     }
// }




// class Solution {                                   // yet to revise--- not fully understood
//     public int numberOfSubstrings(String s) {
//         int[] lastSeen = {-1, -1, -1};
//         int count = 0;
//         for (int i = 0; i < s.length(); i++) {
//             lastSeen[s.charAt(i) - 'a'] = i;
//             if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
//                 count += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
//             }
//         }
//         return count;
//     }
// }




// class Solution {
//     public int numberOfSubstrings(String s) {
//         int count = 0;
//         int[] charCount = {0, 0, 0};  // to store the count of 'a', 'b', 'c'
//         int left = 0;

//         for (int right = 0; right < s.length(); right++) {
//             charCount[s.charAt(right) - 'a']++;
            
//             // When all characters 'a', 'b', 'c' are present in the window
//             while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
//                 // All substrings from left to right are valid
//                 count += s.length() - right;
                
//                 // Shrink the window from the left
//                 charCount[s.charAt(left) - 'a']--;
//                 left++;
//             }
//         }

//         return count;
//     }
// }
 