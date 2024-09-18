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


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if((map.containsKey(c1) && map.get(c1)!=c2) ||
                (!map.containsKey(c1)&& map.values().contains(c2))){
                 return false;
            }else{
                map.put(c1,c2);
            }

        }
        return true;

    }
}







// most optimized


// class Solution {
  
    // Method to check if two strings are isomorphic.
    // Two strings are isomorphic if the characters in string 's' can be replaced to get string 't'.
//     public boolean isIsomorphic(String s, String t) {
      
//         // Create two arrays to store the last seen positions of characters
//         int[] lastSeenPositionInS = new int[256]; // Assuming extended ASCII
//         int[] lastSeenPositionInT = new int[256]; // Assuming extended ASCII
      
//         // Length of the input strings
//         int length = s.length();
      
//         // Iterate through each character in the strings
//         for (int i = 0; i < length; ++i) {
//             // Get the current characters from each string
//             char charFromS = s.charAt(i);
//             char charFromT = t.charAt(i);
          
//             // If the last seen position of the respective characters
//             // in the two strings are not the same, then they are not isomorphic
//             if (lastSeenPositionInS[charFromS] != lastSeenPositionInT[charFromT]) {
//                 return false; // Not isomorphic
//             }
          
//             // Update the last seen position of the characters
//             // i + 1 is used because default value in int arrays is 0, 
//             // and we are using the index as a check (can't use 0 as it is the default)
//             lastSeenPositionInS[charFromS] = i + 1;
//             lastSeenPositionInT[charFromT] = i + 1;
//         }
      
//         // If all characters in 's' can be replaced to get 't', return true, as the strings are isomorphic
//         return true;
//     }
// }