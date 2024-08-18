package DSA;

import java.util.HashMap;

public class LongestKUniqueCharactersSubstring {
    /*
     * Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

        Example 1:

        Input:
        S = "aabacbebebe", K = 3
        Output: 
        7
        Explanation: 
        "cbebebe" is the longest substring with 3 distinct characters.


        Example 2:

        Input: 
        S = "aaaa", K = 2
        Output: -1
        Explanation: 
        There's no substring with 2 distinct characters.
     * 
     */
}




class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int count =-1;
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        for(int r =0; r<s.length(); r++){
            char temp1 = s.charAt(r);
            map.put(temp1, map.getOrDefault(temp1,0)+1);
            
            while(map.size()>k){
                char temp = s.charAt(l);
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0) map.remove(temp);
                l++;
            }
            
            if(map.size()==k){
                count= Math.max(count, r-l+1);
            }
            
            
            
        }
        return count == -1 ? -1 : count;
    }
}