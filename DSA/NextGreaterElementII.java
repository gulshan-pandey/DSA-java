package DSA;

import java.util.Stack;

public class NextGreaterElementII {
    
    /*
     *
     * Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

        The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.


        Example 1:

        Input: nums = [1,2,1]
        Output: [2,-1,2]
        Explanation: The first 1's next greater number is 2; 
        The number 2 can't find next greater number. 
        The second 1's next greater number needs to search circularly, which is also 2.
        Example 2:

        Input: nums = [1,2,3,4,3]
        Output: [2,3,4,-1,4]
  
     */
}




// Brute force approach; --> is to find the nge from i+1 to till  i+n-1 of every element till (n-1)th indexed element

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n=nums.length;
//          int[] ans = new int[n];
//          Arrays.fill(ans,-1);
//         for(int i =0; i<n; i++){
//             for(int j=i+1;j<i+n;j++){
//                 int ind = j%n;

//                 if(nums[i]<nums[ind]){
//                     ans[i]=nums[ind];
//                     break;
//                 }
//             }
//         }

//       return ans;
//     }
// }





class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n =nums.length;
        int [] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();


        for(int i=2*n-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()<= nums[i%n]){                         //remember this "<=" plays crucial role here bcz in n--> 0 order we cannot pop the {stack().peek<num()} (else 2 same greatest elements will suffer from this) , this will cause problem to find the nge of the two same greatest element 
                stack.pop();
            }

            if(i<n){
                ans[i]= stack.isEmpty()? -1: stack.peek();
            }
            stack.push(nums[i%n]);
        }

    return ans;
    }
}








// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         var stack = new Stack<Integer>();
        
//         // Initialize all answers to -1 (default if no greater element is found)
//         Arrays.fill(ans, -1);

//         for(int i = 0; i < 2 * n; i++) {
//             int num = nums[i % n]; // Using modulo to simulate circular array
//             while(!stack.isEmpty() && nums[stack.peek()] < num) {                            //remember this "<" plays crucial role here bcz in 0->n order we cannot pop the stack().peek<=num , this will cause problem to find the nge of the popped element {also the same elements may have future greater element so preserve them, dont pop them... thats is entirely opposite to the n --->0 case}
//                 int index = stack.pop();
//                 ans[index] = num;  // Update answer for the index popped from stack
//             }
//             if (i < n) {
//                 stack.push(i); // Push index onto stack
//             }
//         }
//         return ans;
//     }
// }








