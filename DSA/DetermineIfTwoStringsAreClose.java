package DSA;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    /**
     * 
     * Two strings are considered close if you can attain one from the other using the following operations:

        Operation 1: Swap any two existing characters.
        For example, abcde -> aecdb
        Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
        For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
        You can use the operations on either string as many times as necessary.

        Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

        

        Example 1:

        Input: word1 = "abc", word2 = "bca"
        Output: true
        Explanation: You can attain word2 from word1 in 2 operations.
        Apply Operation 1: "abc" -> "acb"
        Apply Operation 1: "acb" -> "bca"


        Example 2:

        Input: word1 = "a", word2 = "aa"
        Output: false
        Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.



        Example 3:

        Input: word1 = "cabbba", word2 = "abbccc"
        Output: true
        Explanation: You can attain word2 from word1 in 3 operations.
        Apply Operation 1: "cabbba" -> "caabbb"
        Apply Operation 2: "caabbb" -> "baaccc"
        Apply Operation 2: "baaccc" -> "abbccc"
     */
}




/*
 * Intuition and Approach:
 * Check Lengths: If the lengths of word1 and word2 are not the same, they can't be "close," so return false.
 * Track Characters and Frequencies: Use arr and arr2 to record which characters are present in each string and freq1 and freq2 to count their frequencies.
 * Match Character Sets: Ensure both strings have the same set of characters using Arrays.equals(arr, arr2).
 * Sort and Compare: Sort freq1 and freq2 and compare them to check if they are equal.
 */


class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
          int[] freq1 = new int[26];
        int[] freq2 = new int[26];
         int[] arr = new int[26];
         int[] arr2 = new int[26];
         for(char ch : word1.toCharArray()){
            freq1[ch - 'a']++;
            arr[ch-'a']=1;
         }

         for(char ch : word2.toCharArray()){
            freq2[ch - 'a']++;
            arr2[ch -'a']=1;
         }

         if (!Arrays.equals(arr,arr2)) return false;

          Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);
    }
}





//Most Optimal Solution



// class Solution {
//    public boolean closeStrings(String word1, String word2) {

//     if(word1.length()!= word2.length()) return false;

//     int[] arr1 = new int[26];
//     int[] arr2 = new int[26];

//     for(char ch : word1.toCharArray() ){
//        arr1[ch-97]++;
//     }
//       for(char ch : word2.toCharArray() ){
//        arr2[ch-97]++;
//     }

//        for(int i =0 ;i < 26 ; i++){
//            if(arr1[i]>0 && !(arr2[i]>0)){
//                return false;
//            }
//        }
//    Arrays.sort(arr1);
//    Arrays.sort(arr2);
       
//        return Arrays.equals(arr1,arr2);

//    }
// }


