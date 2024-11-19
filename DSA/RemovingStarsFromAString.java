package DSA;
public class RemovingStarsFromAString {
    
    /**
     * You are given a string s, which contains stars *.

        In one operation, you can:

        Choose a star in s.
        Remove the closest non-star character to its left, as well as remove the star itself.
        Return the string after all stars have been removed.

        Note:

        The input will be generated such that the operation is always possible.
        It can be shown that the resulting string will always be unique.
        

        Example 1:

        Input: s = "leet**cod*e"
        Output: "lecoe"
        Explanation: Performing the removals from left to right:
        - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
        - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
        - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
        There are no more stars, so we return "lecoe".


        Example 2:
        
        Input: s = "erase*****"
        Output: ""
        Explanation: The entire string is removed, so we return an empty string.
        */
        
        
    }




    // Using stacks

    
// class Solution {
//     public String removeStars(String s) {
        
//         var stack = new Stack();
//         for(char ch : s.toCharArray()){
//             if(ch=='*') stack.pop();
//             else stack.push(ch);
//         }

//         String temp = "";
//         while(!stack.isEmpty()){
//             temp+=stack.pop();
//         }

//         return new StringBuilder(temp).reverse().toString();
//     }
// }





// optimized approach


class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for ( char c: s.toCharArray()){
            if (c != '*'){
                sb.append(c);
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}



// class Solution {
//     public String removeStars(String s) {
//         int count = 0, len = s.length();
//         StringBuilder sb = new StringBuilder();
//         for (int i = len - 1; i >= 0; i--) {
//             if (s.charAt(i) != '*') {
//                 if (count > 0) {
//                     count--;
//                 } else {
//                     sb.append(s.charAt(i));
//                 }
//             } else {
//                 count++;
//             }
//         }
//         return sb.reverse().toString();
//     }
// }




