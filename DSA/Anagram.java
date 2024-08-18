package DSA;
public class Anagram {
    

    /*
     * Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings a and b can only contain lower case alphabets.
     */
}



class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        
        // Create an array to count the frequency of each character
        int[] charCount = new int[26]; // 26 for each letter in the alphabet
        
        // Increment the count for each character in string a
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++;
        }
        
        // Decrement the count for each character in string b
        for (int i = 0; i < b.length(); i++) {
            charCount[b.charAt(i) - 'a']--;
        }
        
        // If all counts are zero, then a and b are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
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
