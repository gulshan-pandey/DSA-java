package DSA;

import java.util.Stack;

public class BasicCalculator {
    /**
     * Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

        Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

        

        Example 1:

        Input: s = "1 + 1"
        Output: 2
        Example 2:

        Input: s = " 2-1 + 2 "
        Output: 3
        Example 3:

        Input: s = "(1+(4+5+2)-3)+(6+8)"
        Output: 23
        

        Constraints:

        1 <= s.length <= 3 * 105
        s consists of digits, '+', '-', '(', ')', and ' '.
        s represents a valid expression.
        '+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
        '-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
        There will be no two consecutive operators in the input.
        Every number and running calculation will fit in a signed 32-bit integer.
     * 
     */
}


// by converting infix to postfix , then calculating the expression

// class Solution {

//     public int calculate(String s) {
//         // Step 1: Convert infix expression to postfix
//         String postfix = convertToPostfix(s);

//         // Step 2: Evaluate the postfix expression
//         return evaluatePostfix(postfix);
//     }

//     private String convertToPostfix(String s) {
//         StringBuilder postfix = new StringBuilder();
//         Stack<Character> stack = new Stack<>();
//         boolean lastWasOperator = true; // To handle cases like "1 - -2"

//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             if (Character.isWhitespace(c)) {
//                 continue; // Ignore spaces
//             }

//             if (Character.isDigit(c)) {
//                 // Handle multi-digit numbers
//                 while (i < s.length() && Character.isDigit(s.charAt(i))) {
//                     postfix.append(s.charAt(i));
//                     i++;
//                 }
//                 postfix.append(' ');
//                 i--; // Adjust index since we have moved one step ahead in the while loop
//                 lastWasOperator = false;
//             } else if (c == '(') {
//                 stack.push(c);
//                 lastWasOperator = true;
//             } else if (c == ')') {
//                 while (!stack.isEmpty() && stack.peek() != '(') {
//                     postfix.append(stack.pop()).append(' ');
//                 }
//                 stack.pop(); // Pop the '(' from the stack
//                 lastWasOperator = false;
//             } else if (isOperator(c)) {
//                 if (lastWasOperator && c == '-') {
//                     // Handle unary minus (negative numbers)
//                     postfix.append('0').append(' ');
//                 }
//                 while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
//                     postfix.append(stack.pop()).append(' ');
//                 }
//                 stack.push(c);
//                 lastWasOperator = true;
//             }
//         }

//         // Pop all remaining operators in the stack
//         while (!stack.isEmpty()) {
//             postfix.append(stack.pop()).append(' ');
//         }

//         return postfix.toString().trim(); // Convert StringBuilder to String
//     }

//     private int evaluatePostfix(String postfix) {
//         Stack<Integer> stack = new Stack<>();
//         int i = 0;

//         while (i < postfix.length()) {
//             char c = postfix.charAt(i);

//             if (Character.isWhitespace(c)) {
//                 i++;
//                 continue;
//             }

//             if (Character.isDigit(c)) {
//                 int num = 0;
//                 while (i < postfix.length() && Character.isDigit(postfix.charAt(i))) {
//                     num = num * 10 + (postfix.charAt(i) - '0');
//                     i++;
//                 }
//                 stack.push(num);
//             } else if (isOperator(c)) {
//                 if (stack.size() < 2) {
//                     throw new IllegalArgumentException("Invalid postfix expression");
//                 }
//                 int operand2 = stack.pop();
//                 int operand1 = stack.pop();
//                 switch (c) {
//                     case '+':
//                         stack.push(operand1 + operand2);
//                         break;
//                     case '-':
//                         stack.push(operand1 - operand2);
//                         break;
//                     case '*':
//                         stack.push(operand1 * operand2);
//                         break;
//                     case '/':
//                         stack.push(operand1 / operand2);
//                         break;
//                 }
//                 i++;
//             }
//         }

//         if (stack.size() != 1) {
//             throw new IllegalArgumentException("Invalid postfix expression");
//         }

//         return stack.pop();
//     }

//     private boolean isOperator(char c) {
//         return c == '+' || c == '-' || c == '*' || c == '/';
//     }

//     private int precedence(char c) {
//         switch (c) {
//             case '+':
//             case '-':
//                 return 1;
//             case '*':
//             case '/':
//                 return 2;
//             default:
//                 return -1;
//         }
//     }
// }



//most optimal code
        


/**
    // Story:   

    case1: digit -> toh number banao

    case 2  '+'  means number bnn chuka hoga.. toh result me add krrdo...
                 or fir number ko 0 krrdo and sigh ko 1 krrdo

    case 3  '-'   means number bnn chuka hoga.. toh result me add krrdo...
                  or fir number ko 0 krrdo and sigh ko -1 krrdo
    
    case 4: '('   stack me result ko push kro fir stack me sign ko push kro
                  fir result ko 0 krrdo and sign ko 1 krrdo

    casee 5: ')'   result me add krrdo (means close bracket k andr kaa sara solve hojana chahia)
                   fir number ko 0 krrdo
                   fir stack se pop krrdo sign ko orr result me multiply krrdo
                   fir stack ko pop kro purane wale result ko orr bracket wale ko result se add krrdo


 */




class Solution {
    public int calculate(String s) {
        var stack = new Stack<Integer>();
        int currnumber=0;
        int result=0;
        int sign =1;  // +1 means +ve and -1 means -ve

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){ 
                currnumber = currnumber * 10 +(ch -'0');        // Build the current number
            } else if(ch=='+'){                             // means in the past we have made a number
                result += sign * currnumber;        //for previous number
                currnumber =0;
                sign =1;            // bcz of '+'
            } else if(ch=='-'){         // Add the current number to the result with the current sign
                result += sign * currnumber;
                currnumber=0;
                sign = -1;          // bcz of '-'

            } else if(ch =='('){
                stack.push(result);             // Push the current result and sign onto the stack for later
                stack.push(sign);
                sign = 1;
                result=0;               // Reset result and sign for the new sub-expression

            }else if(ch==')'){              // means the past open bracket's work has been completed
                result += sign * currnumber;        // Complete the current sub-expression
                currnumber=0;
                sign = stack.pop();
                result *= sign;          // Apply the sign before the parenthesis 
                result += stack.pop();      //add to the result before the parenthesis
            }

        }

        if (currnumber != 0) {              //bcz the string can be end at the number!! so current number will be something
            result += sign * currnumber;
        }

        return result;

    }
}





