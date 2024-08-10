package DSA;

import java.util.Arrays;

public class OptimalPartitionOfString {


}


// class Solution {        
//     public int partitionString(String s) {
//         int l=0;
//         int count=1;
//         HashSet <Character> set = new HashSet<>();          // HashMap  can also be used
//         for(int r=0; r<s.length();r++){
//             char temp = s.charAt(r);
//             if(set.contains(temp)){
//                 while(l<r){
//                     set.remove(s.charAt(l));
//                     l++;
//                 }
//                 count++;
//             }
//             set.add(temp);
//         }
//         return count;
//     }
// }



//another approach is to clear the set whenever we encounter duplicate, and start adding new elements again.

// class Solution {        
//     public int partitionString(String s) {
//         int count = 1;
//         HashSet<Character> seen = new HashSet<>();         
        
//         for (int i = 0; i < s.length(); i++) {
//             char temp = s.charAt(i);
//             if (seen.contains(temp)) {
//                 // Start a new partition
//                 count++;
//                 seen.clear(); // clear the current set
//             }
//             seen.add(temp);
//         }
        
//         return count;
//     }
// }






/*
most optimal approach ----> by using array of 26 size and every index represents the respective character of string and value represents the index of that character in that string
When a character reappears within the current substring, the string is partitioned, and the count of substrings is incremented
*/

class Solution {        
    public int partitionString(String s) {
        int count = 1;
        int[] lastseen = new int[26];
        Arrays.fill(lastseen, -1);
        int currstrt=0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(lastseen[ch-'a']>=currstrt){
                currstrt=i;
                count++;
            }
            lastseen[ch-'a']=i;
        }

        return count;
    }
}

