package DSA;

public class FindTheIndexOfTheFirstOccurrenceInString {
    /**
     * 
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

        

        Example 1:

        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.
        Example 2:

        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.
     * 
     */
}





// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }
// }



 class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0; // Return 0 if needle is empty
        }
        if (haystack == null || haystack.length() < needle.length()) {
            return -1; // Return -1 if haystack is null or shorter than needle
        }



        for(int i =0; i<=haystack.length()-needle.length(); i++){
            int j;
            for(j=0;j<needle.length(); j++){
                if(haystack.charAt(i+j)!= needle.charAt(j)) break;
            }
            if(j==needle.length())return i;
        }

        return -1;
    }
}