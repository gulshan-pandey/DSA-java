package DSA;

import java.util.HashMap;

public class CountOccurencesOfAnagrams {
    /*
     * 
     * Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.

        Example 1:

        Input:
        txt = forxxorfxdofr
        pat = for
        Output: 3
        Explanation: for, orf and ofr appears
        in the txt, hence answer is 3.
        Example 2:

        Input:
        txt = aabaabaa
        pat = aaba
        Output: 4
        Explanation: aaba is present 4 times
        in txt.
     */
}



class Solution {

    int search(String pat, String txt) {
        // code here
        HashMap <Character,Integer> map = new HashMap<>();
        int fill=0;
        for(char ch : pat.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            fill++;
        }
        
        int wordlen=fill;
        int count=0;
        int l=0;
        for(int r = 0; r<txt.length();r++){
            char temp = txt.charAt(r);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) - 1);
                if (map.get(temp) >= 0) {
                    fill--;
                }
            }
            
            if(r-l+1 > wordlen){
                 char leftChar = txt.charAt(l);
                 if( map.containsKey(leftChar)){
                     if(map.get(leftChar)>=0){
                        fill++;    
                     }
                 map.put(leftChar,map.get(leftChar)+1);
                }
                l++;
            }
             
            if(r-l+1==wordlen && fill==0){
                count++;
            }
            
        }
        
        return count;
        
    }
}