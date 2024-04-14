package Leetcode;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1, char2)){
            return true;
        }
        else return false;
    }
}
