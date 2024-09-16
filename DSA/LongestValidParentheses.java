package DSA;

import java.util.Stack;

public class LongestValidParentheses {
    /**
     * Given a string str consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.

        A parenthesis string is valid if:

        For every opening parenthesis, there is a closing parenthesis.
        Opening parenthesis must be closed in the correct order.
        Examples :

        Input: str = ((()
        Output: 2
        Explaination: The longest valid parenthesis substring is "()".


        Input: str = )()())
        Output: 4
        Explaination: The longest valid parenthesis substring is "()()".
     */
}



class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> stack = new Stack<>();
        int len=0;
        int lastInvalid =-1;
        int i=0;
        for(char ch : S.toCharArray()){
            if(ch=='(' ){
                stack.push(i);
            }else{
                if(stack.isEmpty()) lastInvalid=i;
               
                else{
                    stack.pop();
                    if(stack.isEmpty()){
                        len = Math.max(len,i-lastInvalid);          // this will constantly updating the max length, if the consecuent opening and closings are found
                    }else{
                        len = Math.max(len,i-stack.peek());
                    }
                }
            }
            i++;
        }
        return len;
    }
}