package DSA;
import java.util.Stack;

public class MinStack {
    /**
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

            Implement the MinStack class:

            MinStack() initializes the stack object.
            void push(int val) pushes the element val onto the stack.
            void pop() removes the element on the top of the stack.
            int top() gets the top element of the stack.
            int getMin() retrieves the minimum element in the stack.
            You must implement a solution with O(1) time complexity for each function.

            

            Example 1:

            Input
            ["MinStack","push","push","push","getMin","pop","top","getMin"]
            [[],[-2],[0],[-3],[],[],[],[]]

            Output
            [null,null,null,null,-3,null,0,-2]

            Explanation
            MinStack minStack = new MinStack();
            minStack.push(-2);
            minStack.push(0);
            minStack.push(-3);
            minStack.getMin(); // return -3
            minStack.pop();
            minStack.top();    // return 0
            minStack.getMin(); // return -2
     * 
     */
}




// class MinStack {

//     Stack<Integer> stack = new Stack<>();
//     Stack<Integer> minStack = new Stack<>();
//     public void push(int val) {
//         if(minStack.isEmpty() || minStack.peek()>val){
//             minStack.push(val);
//         }else minStack.push(minStack.peek());
//         stack.push(val);
//     }
    
//     public void pop() {
//         minStack.pop();
//         stack.pop();

//     }
    
//     public int top() {
//         return stack.peek();
//     }
    
//     public int getMin() {
//         return minStack.peek();
//     }
// }

// Ex         1 2 3 -1 10
// minstack    1 1 1 -1 -1 

//  https://www.youtube.com/watch?v=yEbnMaBYB5w&t=6s   






//most optimal approach 

  class minStack {

Stack<Integer> stack = new Stack<>();
int min = Integer.MAX_VALUE;

public void push(int x) {
    if (x <= min) {
        stack.push(min);
        min = x;
    }
    stack.push(x);
}

public void pop() {
    if (stack.peek() == min) {
        stack.pop();
        min = stack.pop();
    } else
        stack.pop();
}

public int top() {
    return stack.peek();
}

public int getMin() {
    return min;
}
}