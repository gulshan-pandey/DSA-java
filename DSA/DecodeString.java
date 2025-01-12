package DSA;

import java.util.Stack;

public class DecodeString {
    

    /**
     * 
     * Given an encoded string, return its decoded string.

        The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

        You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

        The test cases are generated so that the length of the output will never exceed 105.

        

        Example 1:

        Input: s = "3[a]2[bc]"
        Output: "aaabcbc"



        Example 2:

        Input: s = "3[a2[c]]"
        Output: "accaccacc"



        Example 3:

        Input: s = "2[abc]3[cd]ef"
        Output: "abcabccdcdcdef"
     */
}



class Solution {
    public String decodeString(String s) {
        
        var stack = new Stack<Character>();


        for(int i =0; i <s.length(); i++){
        
           if(s.charAt(i)!=']'){
            stack.push(s.charAt(i));
           }else{
               var sb = new StringBuilder();
               while(!stack.isEmpty() && stack.peek()!='['){
                 sb.append(stack.pop());                                                
               }
               stack.pop();

                var numsb = new StringBuilder();
               while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                 numsb.append(stack.pop());
               }

               int k = Integer.parseInt(numsb.reverse().toString());
               String repeateds = sb.reverse().toString().repeat(k);

                for(char ch : repeateds.toCharArray()){
                    stack.push(ch);
                }
           }
        }

         var finalString= new StringBuilder();

         while(!stack.isEmpty()){
            finalString.append(stack.pop());
         }
         return finalString.reverse().toString();

    }

   
}




// Alternatively without using String buffer



// class Solution {
//     public String decodeString(String s) {
//         Stack<String> stack = new Stack<>();
        
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
            
//             if (ch != ']') {
//                 // Push everything except ']' onto the stack
//                 stack.push(String.valueOf(ch));
//             } else {
//                 // Step 1: Get the encoded string inside the brackets
//                 String encodedString = "";
//                 while (!stack.isEmpty() && !stack.peek().equals("[")) {
//                     encodedString = stack.pop() + encodedString; // Build the string in reverse
//                 }
//                 stack.pop(); // Remove the '[' from the stack
                
//                 // Step 2: Get the number (k)
//                 String numStr = "";
//                 while (!stack.isEmpty() && isNumeric(stack.peek())) {
//                     numStr = stack.pop() + numStr; // Build the number in reverse
//                 }
//                 int k = Integer.parseInt(numStr);
                
//                 // Step 3: Repeat the encoded string k times and push it back to the stack
//                 String repeatedString = "";
//                 for (int j = 0; j < k; j++) {
//                     repeatedString += encodedString; // Repeat the string k times
//                 }
//                 stack.push(repeatedString);
//             }
//         }
        
//         // Step 4: Build the final result from the stack
//         String result = "";
//         while (!stack.isEmpty()) {
//             result = stack.pop() + result; // Build the result in reverse
//         }
//         return result;
//     }
    
//     // Helper function to check if a string is numeric
//     private boolean isNumeric(String str) {
//         return str.matches("\\d+"); // Matches one or more digits
//     }
// }
