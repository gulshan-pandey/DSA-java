package DSA;

import java.util.HashMap;

public class WordPattern {
    
    /**
     * Given a pattern and a string s, find if s follows the same pattern.

        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

        Each letter in pattern maps to exactly one unique word in s.
        Each unique word in s maps to exactly one letter in pattern.
        No two letters map to the same word, and no two words map to the same letter.
        

        Example 1:

        Input: pattern = "abba", s = "dog cat cat dog"

        Output: true

        Explanation:

        The bijection can be established as:

        'a' maps to "dog".
        'b' maps to "cat".
        Example 2:

        Input: pattern = "abba", s = "dog cat cat fish"

        Output: false

        Example 3:

        Input: pattern = "aaaa", s = "dog cat cat dog"

        Output: false

 
     * 
     */
}








class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        String[] words = s.split(" ");
        if(words.length!= pattern.length()) return false;     // Number of words and characters must match

        for(int i=0; i<words.length; i++){
            char ch = pattern.charAt(i);
            String str = words[i];

            // Check if 'ch' is already mapped to a different word
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str)) return false;                  // Pattern doesn't match            
            }else{
                map.put(ch,str);
            }
        

            // Check if 'word' is already mapped to a different character
            if(map2.containsKey(str)){
                if(!map2.get(str).equals(ch)) return false;                 // Pattern doesn't match
            }else{
                map2.put(str,ch);
            }
        }
        

        return true;   // All checks passed


    }
}





// optimized

// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         HashMap<Character, String> map = new HashMap<>();

//         String[] words = s.split(" ");
//         if (words.length != pattern.length()) return false;

//         for (int i = 0; i < words.length; i++) {
//             char ch = pattern.charAt(i);
//             String str = words[i];
            
//             if (map.containsKey(ch)) {
//                 // Use equals to compare the strings
//                 if (!map.get(ch).equals(str)) return false;
//             } else {
//                 // Ensure no two different pattern characters map to the same word
//                 if (map.containsValue(str)) return false;
//                 map.put(ch, str);
//             }
//         }
//         return true;  // All checks passed
//     }
// }


