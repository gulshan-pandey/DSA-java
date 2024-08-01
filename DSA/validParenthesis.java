package DSA;
import java.util.Stack;

public class validParenthesis {
    
}


// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (char c : s.toCharArray()) {

//             if (c == '(' || c == '{' || c == '[') {
//                 stack.push(c);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
                
//                 char top = stack.pop();
//                 if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }
        
//         return stack.isEmpty();
//     }
// }



// another approach


// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {
//             char current = s.charAt(i);

//             if (current == '(' || current == '{' || current == '[') {
//                 stack.push(current);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
                
//                 char top = stack.pop();
//                 if ((current == ')' && top != '(') || (current == '}' && top != '{') || (current == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }
        
//         return stack.isEmpty();
//     }
// }

