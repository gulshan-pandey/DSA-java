package DSA;
public class MergeStringsAlternately {
    /**
     * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

        Return the merged string.

        

        Example 1:

        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r



        Example 2:

        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        word1:  a   b 
        word2:    p   q   r   s
        merged: a p b q   r   s



        Example 3:

        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        word1:  a   b   c   d
        word2:    p   q 
        merged: a p b q c   d
 
     */
}



class Solution {
    public String mergeAlternately(String w1, String w2) {
        var sb = new StringBuilder();
        int i=0;
        int j=0;

        while(i<w1.length() && j <w2.length()){
            sb.append(w1.charAt(i));
            i++;
            sb.append(w2.charAt(j));
            j++;
        }
        while(i<w1.length()){
            sb.append(w1.charAt(i));
            i++;
        }
        while(j <w2.length()){
            sb.append(w2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}



//CONCISE


// class Solution {
//     public String mergeAlternately(String w1, String w2) {
//         StringBuilder sb = new StringBuilder();
//         int i = 0, len1 = w1.length(), len2 = w2.length();

//         // Iterate while both strings have characters left
//         while (i < len1 || i < len2) {
//             if (i < len1) sb.append(w1.charAt(i)); // Append from w1 if available
//             if (i < len2) sb.append(w2.charAt(i)); // Append from w2 if available
//             i++;
//         }

//         return sb.toString();
//     }
// }
