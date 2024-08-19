package DSA;

public class MaximumNumberOfVowelsInASubstringofGivenLength {
    
    /*
     * 
     * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

        Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

        

        Example 1:

        Input: s = "abciiidef", k = 3
        Output: 3
        Explanation: The substring "iii" contains 3 vowel letters.
        Example 2:

        Input: s = "aeiou", k = 2
        Output: 2
        Explanation: Any substring of length 2 contains 2 vowels.
        Example 3:

        Input: s = "leetcode", k = 3
        Output: 2
        Explanation: "lee", "eet" and "ode" contain 2 vowels.
     * 
     */
}



//HashMap Approach

// class Solution {
//     public int maxVowels(String s, int k) {
//         int count =0;
//         int maxcount=0;
//         int c=0;
//         int l=0;
//         var map = new HashMap<Character,Integer>();
//         map.put('a',0);
//         map.put('e',0);
//         map.put('i',0);
//         map.put('o',0);
//         map.put('u',0);
//          for(int r =0; r<s.length(); r++){
//             char temp = s.charAt(r);
//             if(map.containsKey(temp)){
//                 map.put(temp,map.get(temp)+1);
                
//                 count++;
//             }
//                  if(r-l+1== k){


//                     maxcount= Math.max(count,maxcount);
//                     if(map.containsKey(s.charAt(l))) {
//                         map.put(s.charAt(l),map.get(s.charAt(l))-1);
//                         count--;
//                     }

//                     l++;
//             }
//          }
//          return maxcount;
//     }
// }




//Set approach

// class Solution {
//     public int maxVowels(String s, int k) {
//         int count =0;
//         int maxcount=0;
//         int c=0;
//         int l=0;
//         var map = new HashSet<Character>();
//         map.add('a');
//         map.add('e');
//         map.add('i');
//         map.add('o');
//         map.add('u');
//          for(int r =0; r<s.length(); r++){
//             char temp = s.charAt(r);
//             if(map.contains(temp)){
//                 map.add(temp);
                
//                 count++;
//             }
//                  if(r-l+1== k){


//                     maxcount= Math.max(count,maxcount);
//                     if(map.contains(s.charAt(l))) {
//                         count--;
//                     }

//                     l++;
//             }
//          }
//          return maxcount;
//     }
// }






// most optimized


// class Solution {
//     public int maxVowels(String s, int k) {
//         int count =0;
//         int maxcount=0;
//         int l=0;
       
//          for(int r =0; r<s.length(); r++){
//             char temp = s.charAt(r);
//             if(isVowel(temp)){
//                 count++;
//             }
//                  if(r-l+1== k){


//                     maxcount= Math.max(count,maxcount);
//                     if(isVowel(s.charAt(l))) {
//                         count--;
//                     }

//                     l++;
//             }
//          }
//          return maxcount;


//     }


//     private boolean isVowel(char c) {
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//     }
// }






class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}





