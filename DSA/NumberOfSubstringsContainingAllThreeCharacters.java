package DSA;

public class NumberOfSubstringsContainingAllThreeCharacters {
    
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



class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int aCount = 0, bCount = 0, cCount = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (ch == 'a') {
                aCount++;
            } else if (ch == 'b') {
                bCount++;
            } else if (ch == 'c') {
                cCount++;
            }

            while (aCount > 0 && bCount > 0 && cCount > 0) {
                count += s.length() - end; // All substrings from start to end are valid
                char startChar = s.charAt(start);
                if (startChar == 'a') {
                    aCount--;
                } else if (startChar == 'b') {
                    bCount--;
                } else if (startChar == 'c') {
                    cCount--;
                }
                start++;
            }
        }
        return count;
    }
}




// class Solution {                                             // yet to revise--- not fully understood
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



