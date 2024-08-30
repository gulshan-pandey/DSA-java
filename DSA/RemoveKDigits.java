package DSA;

import java.util.Stack;

public class  RemoveKDigits{
    
    /**
     * Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

 

        Example 1:

        Input: num = "1432219", k = 3
        Output: "1219"
        Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.


        Example 2:

        Input: num = "10200", k = 1
        Output: "200"
        Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
        Example 3:

        Input: num = "10", k = 2
        Output: "0"
        Explanation: Remove all the digits from the number and it is left with nothing which is 0.
     */
}



/**
 * the intution is to keep the smaller digit at the start as much as possible
 * this can be done using monotonic stack in increasing order
 * greedy approach fails here
 */

 
class Solution {
    public String removeKdigits(String num, int k) {
        var stack = new Stack<Character>();
        if(num.length() ==k) return "0";            // remove all the element
        for(int i =0; i<num.length(); i++){
            char elem = num.charAt(i);

            while(!stack.isEmpty() && k > 0 && stack.peek() > elem){
                    stack.pop();
                    k--;
            }
            if(elem=='0'&& stack.isEmpty()){
                continue;
            }else{
                stack.push(elem);
            }
        }

        // If k is still greater than 0, remove the remaining digits from the stack-------EDGE CASE---
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        if(stack.isEmpty()) return "0";
        
        StringBuilder s = new StringBuilder();
        
        while(!stack.isEmpty()) {
            s.append(stack.pop());
        }
        
        return s.reverse().toString();
    }
}


//another approach

// class Solution {
//     public String removeKdigits(String num, int k) {
//         var stack = new Stack<Character>();
        
//         for(int i = 0; i < num.length(); i++) {
//             char elem = num.charAt(i);
            
//             while(!stack.isEmpty() && k > 0 && stack.peek() > elem) {
//                 stack.pop();
//                 k--;
//             }
            
//             if(elem != '0' || !stack.isEmpty()) {
//                 stack.push(elem);
//             }
//         }
        
//         // If we still have digits to remove, remove them from the end
//         while(k > 0 && !stack.isEmpty()) {
//             stack.pop();
//             k--;
//         }
        
//         if(stack.isEmpty()) return "0";
        
//         StringBuilder s = new StringBuilder();
        
//         while(!stack.isEmpty()) {
//             s.append(stack.pop());
//         }
        
//         return s.reverse().toString();
//     }
// }

