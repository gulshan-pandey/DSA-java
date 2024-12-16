package DSA;
public class Anagram {
    

    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
            
            Example 1:
            
            Input: s = "anagram", t = "nagaram"
            
            Output: true


            
            Example 2:
            
            Input: s = "rat", t = "car"
            
            Output: false
     */
}



class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;

        int[] arr=  new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            arr[ch-'a']--;
            if(arr[ch-'a']<0) return false;
        }
        return true;

    }
}


//shortcut

// class Solution {
//     // Function is to check whether two strings are anagram of each other or not.
//     public static boolean isAnagram(String a, String b) {
//         // If lengths of the strings are not equal, they cannot be anagrams
//         if (a.length() != b.length()) {
//             return false;
//         }
        
//         // Convert strings to char arrays and sort them
//         char[] charArrayA = a.toCharArray();
//         char[] charArrayB = b.toCharArray();
//         Arrays.sort(charArrayA);
//         Arrays.sort(charArrayB);
        
//         // Compare the sorted char arrays
//         return Arrays.equals(charArrayA, charArrayB);
//     }
// }
