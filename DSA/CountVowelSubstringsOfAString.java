package DSA;

public class CountVowelSubstringsOfAString {
    
    /*
     * A substring is a contiguous (non-empty) sequence of characters within a string.

        A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.

        Given a string word, return the number of vowel substrings in word.

        

        Example 1:

        Input: word = "aeiouu"
        Output: 2
        Explanation: The vowel substrings of word are as follows (underlined):
        - "aeiouu"
        - "aeiouu"

        Example 2:

        Input: word = "unicornarihan"
        Output: 0
        Explanation: Not all 5 vowels are present, so there are no vowel substrings.


        Example 3:

        Input: word = "cuaieuouac"
        Output: 7
        Explanation: The vowel substrings of word are as follows (underlined):
        - "cuaieuouac"
        - "cuaieuouac"
        - "cuaieuouac"
        - "cuaieuouac"
        - "cuaieuouac"
        - "cuaieuouac"
        - "cuaieuouac"
     * 
     */
}




class Solution {
    public int countVowelSubstrings(String s) {
        int count = 0;
        int n = s.length();
        
        for (int start = 0; start < n; start++) {
            if (isVowel(s.charAt(start))) {
                int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
                for (int end = start; end < n; end++) {
                    char ch = s.charAt(end);
                    if (ch == 'a') {
                        aCount++;
                    } else if (ch == 'e') {
                        eCount++;
                    } else if (ch == 'i') {
                        iCount++;
                    } else if (ch == 'o') {
                        oCount++;
                    } else if (ch == 'u') {
                        uCount++;
                    } else {
                        break; // Non-vowel character encountered
                    }
                    
                    if (aCount > 0 && eCount > 0 && iCount > 0 && oCount > 0 && uCount > 0) {
                        count++; // Valid substring found
                    }
                }
            }
        }
        
        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}




// smaller and concise solution

// class Solution {
//     public int countVowelSubstrings(String word) {
//         int count =0; 
//         for(int i=0; i<word.length(); i++){
//             if(isVovel(word.charAt(i))){
//                 int acount = 0, ecount = 0, icount = 0, ocount = 0,ucount = 0;
//                 for(int end = i; end<word.length(); end++){
//                     char temp = word.charAt(end);
//                     if(temp == 'a') acount++;
//                     else if( temp == 'e') ecount++;
//                     else if( temp == 'i') icount++;
//                     else if( temp == 'o') ocount++;
//                     else if( temp == 'u') ucount++;
//                     else break;

//                     if(acount>0 && ecount>0 && icount>0 && ocount>0 && ucount>0) count++;

//                 }
//             }

//         }
//         return count;

//     }
//     private boolean isVovel(char ch){
//         return ch=='a' || ch =='e' || ch =='i' || ch== 'o' || ch=='u';
//     }
// }