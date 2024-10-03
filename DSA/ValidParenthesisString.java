package DSA;

public class ValidParenthesisString {
    
    /**
     * Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

        The following rules define a valid string:

        Any left parenthesis '(' must have a corresponding right parenthesis ')'.
        Any right parenthesis ')' must have a corresponding left parenthesis '('.
        Left parenthesis '(' must go before the corresponding right parenthesis ')'.
        '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
        

        Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "(*)"
        Output: true
        Example 3:

        Input: s = "(*))"
        Output: true
     */
}




// Using DP


// class Solution {
//     public boolean checkValidString(String s) {
//         int n = s.length();
//         int[][] t = new int[n][n];
//         for (int[] row: t) {
//             Arrays.fill(row, -1);
//         }
//         return isValidString(0, 0, s, t);
//     }

//     private boolean isValidString(int idx, int open, String str, int[][] t) {
//         if (idx == str.length()) {
//             return (open == 0);
//         }
//         if (t[idx][open] != -1) {
//             return t[idx][open] == 1;
//         }
//         boolean isValid = false;
//         if (str.charAt(idx) == '*') {
//             isValid |= isValidString(idx + 1, open + 1, str, t);
//             if (open > 0) {
//                 isValid |= isValidString(idx + 1, open - 1, str, t);
//             }
//             isValid |= isValidString(idx + 1, open, str, t);
//         } else {
//             if (str.charAt(idx) == '(') {
//                 isValid = isValidString(idx + 1, open + 1, str, t);
//             } else if (open > 0) {
//                 isValid = isValidString(idx + 1, open - 1, str, t);
//             }
//         }
//         t[idx][open] = isValid ? 1 : 0;
//         return isValid;
//     }
// }




//Optimized


// class Solution {
//     public boolean checkValidString(String s) {

//         int min =0;
//         int max =0;

//         for(char i : s.toCharArray()){
//             if(i==')'){
//                 min--;
//                 max--;
//                 if(max< 0) return false;
//             }else if(i=='('){
//                 min++;
//                 max++;
//             }else{
//                     min--;
//                     max++;
//             }
//             if(min<0) min=0;
//         }

//         return min == 0;
//     }
// }




// Another Simplified approach

// class Solution {
//     public boolean checkValidString(String s) {
//         int open = 0;
//         int close = 0;
//         int n = s.length();
        
//         // Left to Right - Check Open Brackets
//         for (int i = 0; i < n; i++) {
//             if (s.charAt(i) == '(' || s.charAt(i) == '*') {
//                 open++;
//             } else {
//                 open--;
//             }
                
//             if (open < 0) {
//                 return false;
//             }
//         }

//         // Right to Left - Check Close Brackets
//         for (int i = n - 1; i >= 0; i--) {
//             if (s.charAt(i) == ')' || s.charAt(i) == '*') {
//                 close++;
//             } else {
//                 close--;
//             }
            
//             if (close < 0) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }







// using stack


// class Solution {
//     public boolean checkValidString(String s) {
//         Stack<Integer> openSt = new Stack<>();
//         Stack<Integer> asterisksSt = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch == '(') {
//                 openSt.push(i);
//             } else if (ch == '*') {
//                 asterisksSt.push(i);
//             } else {
//                 if (!openSt.isEmpty()) {
//                     openSt.pop();
//                 } else if (!asterisksSt.isEmpty()) {
//                     asterisksSt.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         // This post processing will be required for cases like - "*(())(*"
//         while (!openSt.isEmpty() && !asterisksSt.isEmpty()) {
//             if (openSt.peek() > asterisksSt.peek()) {
//                 return false;
//             }
//             openSt.pop();
//             asterisksSt.pop();
//         }

//         return openSt.isEmpty();
//     }
// }