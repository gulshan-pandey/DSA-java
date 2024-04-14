package Leetcode;
public class StringReverse {
    public String reverseWords(String s) {
        String[] words= s.trim().split("\\s+");
        String rev="";
        for(int i=(words.length-1);i>=0;i--){
            if(i==0){
             rev+=words[i];
            }
            else rev+=words[i]+" ";
        } 
        return rev;
    }

    
    //optimal approach using string builder

    // class Solution {
    //     public String reverseWords(String s) {
    //         String[] words = s.trim().split("\\s+");
    //         StringBuilder rev = new StringBuilder();
            
    //         for (int i = words.length - 1; i >= 0; i--) {
    //             rev.append(words[i]);
    //             if (i > 0) {
    //                 rev.append(" ");
    //             }
    //         }
            
    //         return rev.toString();
    //     }
    // }
    


}
