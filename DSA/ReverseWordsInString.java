package DSA;

public class ReverseWordsInString {
    /*
     
Input: s = "the sky is blue"
Output: "blue is sky the"



Example 2:
Input: s = "  hello world  "
Output: "world hello"


Example 3:
Input: s = "a good   example"
Output: "example good a"



*/
    
}





class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder rev = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]);
            if (i > 0) {
                rev.append(" ");
            }
        }
        
        return rev.toString();
    }
}



