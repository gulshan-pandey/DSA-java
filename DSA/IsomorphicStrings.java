package DSA;

import java.util.HashMap;

public class IsomorphicStrings {
    /**
     * Given two strings s and t, determine if they are isomorphic.

        Two strings s and t are isomorphic if the characters in s can be replaced to get t.

        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

        

        Example 1:

        Input: s = "egg", t = "add"

        Output: true

        Explanation:

        The strings s and t can be made identical by:

        Mapping 'e' to 'a'.
        Mapping 'g' to 'd'.
        Example 2:

        Input: s = "foo", t = "bar"

        Output: false

        Explanation:

        The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

        Example 3:

        Input: s = "paper", t = "title"

        Output: true
     */
}



// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character, Character> map = new HashMap<>();
//         HashMap<Character, Character> map2 = new HashMap<>();

//         for(int i =0; i<s.length(); i++){
//             char c1 = s.charAt(i);
//             char c2 = t.charAt(i);
//             if(map.containsKey(c1)){
//                 if(!map.get(c1).equals(c2)) return false;
//             }else{
//                 map.put(c1,c2);
//             }


//              if(map2.containsKey(c2)){
//                 if(!map2.get(c2).equals(c1)) return false;
//             }else{
//                 map2.put(c2,c1);
//             }

//         }
//         return true;

//     }
// }





// optimized approach


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character, Character> map = new HashMap<>();

//         for(int i =0; i<s.length(); i++){
//             char c1 = s.charAt(i);
//             char c2 = t.charAt(i);
//             if((map.containsKey(c1) && map.get(c1)!=c2) ||
//                 (!map.containsKey(c1)&& map.values().contains(c2))){
//                  return false;
//             }else{
//                 map.put(c1,c2);
//             }

//         }
//         return true;

//     }
// }












class Solution {
    public boolean isIsomorphic(String s, String t) {

        int [] c1 = new int[256];
        int [] c2 = new int[256];

        Arrays.fill(c1,-1);
        Arrays.fill(c2,-1);
        for(int i=0; i<s.length();i++){
            char st  =s.charAt(i);
            char ts  =t.charAt(i);


            if(c1[st] ==-1 && c2[ts]==-1){
                 c1[st]=ts;
                c2[ts]=st;
            }else if(c1[st]!=ts && c2[ts]!=st){
                return false;
            }

            // if((c1[st]!=-1 && c1[st]!=(int)ts)) return false;
            // else if((c2[ts]!=-1 && c2[ts]!=(int)st)) return false;
            // else{

            //     c1[st]=ts;
            //     c2[ts]=st;
            // }


        }

    return true;
    }
}

