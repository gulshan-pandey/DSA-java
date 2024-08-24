package DSA;

public class PermutationInString {
    /*
     * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

        In other words, return true if one of s1's permutations is the substring of s2.

        

        Example 1:

        Input: s1 = "ab", s2 = "eidbaooo"
        Output: true
        Explanation: s2 contains one permutation of s1 ("ba").
        Example 2:

        Input: s1 = "ab", s2 = "eidboaoo"
        Output: false
     * 
     */
}



// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         var map = new HashMap<Character,Integer>();
//         for(int i=0; i<s1.length() ; i++){
//             map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
//         }
//         int elements = map.size();

//         int l=0;
//         for(int r=0; r<s2.length();r++){
//             char temp=s2.charAt(r);
//             if(map.containsKey(temp)) {
//                 map.put(temp,map.get(temp)-1);
//                 if(map.get(temp) == 0) elements--;
//             }
//             while(r-l+1==s1.length()){

//                 if(elements==0) return true;
//                 if(map.containsKey(s2.charAt(l))) {
//                     if(map.get(s2.charAt(l)) == 0) elements++;
//                     map.put(s2.charAt(l),map.get(s2.charAt(l))+1);
//                 }
//                 l++;
//             } 
//         }
//         return false;
//     }
// }







class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26]; // Array to store counts of characters in s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++; // Increment count for each character in s1
        }

        int elements = s1.length(); // Number of characters to match
        int l = 0; // Left pointer of the window

        for (int r = 0; r < s2.length(); r++) { 
            char temp = s2.charAt(r);
            if (count[temp - 'a'] > 0) {
                elements--; 
            }
            count[temp - 'a']--; 

            if (r - l + 1 == s1.length()) { // When window size matches s1 length
                if (elements == 0) return true; // All characters matched

                char leftChar = s2.charAt(l);
                if (count[leftChar - 'a'] >= 0) {
                    elements++; 
                }
                count[leftChar - 'a']++;
                l++;
            }
        }
        return false; 
    }
}
