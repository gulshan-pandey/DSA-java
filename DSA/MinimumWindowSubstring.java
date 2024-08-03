package DSA;

import java.util.HashMap;

public class MinimumWindowSubstring {
    
    /*
     * Given two strings s and t of lengths m and n respectively, 
     * return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
     * If there is no such substring, return the empty string "".



        

        Example 1:

        Input: s = "ADOBECODEBANC", t = "ABC"
        Output: "BANC"
        Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.



        Example 2:

        Input: s = "a", t = "a"
        Output: "a"
        Explanation: The entire string s is the minimum window.



        Example 3:

        Input: s = "a", t = "aa"
        Output: ""
        Explanation: Both 'a's from t must be included in the window.
        Since the largest window of s only has one 'a', return empty string.
 
     */
}







class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        int minlen = Integer.MAX_VALUE;
        int l = 0;
        int sind = -1;

        for (int r = 0; r < s.length(); r++) {
            char temp = s.charAt(r);
             if (map.containsKey(temp) && map.get(temp) > 0) {
                    count++;
                }
                map.put(temp, map.getOrDefault(temp,0) - 1);
         
            while (count == t.length()) {
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    sind = l;
                }
                char temp2 = s.charAt(l);
                    map.put(temp2, map.get(temp2) + 1);
                    if (map.get(temp2) > 0) {
                        count--;
                }
                l++;
            }
        }
        return sind == -1 ? "" : s.substring(sind, sind + minlen);
    }
}






