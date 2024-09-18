package DSA;
public class IsSubsequence {
    
    /**
     * 
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

        A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

        

        Example 1:

        Input: s = "abc", t = "ahbgdc"
        Output: true
        Example 2:

        Input: s = "axc", t = "ahbgdc"
        Output: false
     */
}





class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = s.length();
        int i=-1;
        for(char ch : s.toCharArray()){

            while(i<t.length()-1 && len>0){
                i++;
                if(ch==t.charAt(i)){
                    len--;
                    break;
                }
            }
        }
        return len==0? true: false;
    }
}



// straight forward code

// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int si=0;
//         int ti=0;
        
//         while(si<s.length() && ti<t.length()){
//             if(s.charAt(si)==t.charAt(ti)) si++;
//             ti++;
//         }
//         return si==s.length();
//     }
// }