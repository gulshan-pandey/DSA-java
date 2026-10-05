package DSA;

import java.util.Stack;

public class DailyTemperatures {
    
    /*
     * 
     * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

        Example 1:

        Input: temperatures = [73,74,75,71,69,72,76,73]
        Output: [1,1,4,2,1,1,0,0]
        Example 2:

        Input: temperatures = [30,40,50,60]
        Output: [1,1,1,0]
        Example 3:

        Input: temperatures = [30,60,90]
        Output: [1,1,0]
     */
}




class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n= nums.length;
        int [] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<nums.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()]< nums[i]){
                int temp = stack.pop();
                ans[temp] = i- temp;
            }
            stack.push(i);
        }
        return ans;
        }
    }




// class Solution {
//     public int[] dailyTemperatures(int[] nums) {
        
//         Stack<Integer> stack = new Stack<>();
//         int n = nums.length;
//         int [] arr = new int[n];
        
//         for (int i = n - 1; i >= 0; i--) {
//             while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
//                 stack.pop(); 
//             }
            
//             if (!stack.isEmpty()) {
//                 arr[i] = stack.peek()-i; 
//             }
            
//             stack.push(i); 
//         }

//         return arr;
      
//     }
// }



// most efficient approach which is using the array instead of stack by doing the same operartion as stack using the counter variable to keep track of the top of the stack 


// class Solution {
//     public int[] dailyTemperatures(int[] t) {
//         int [] st = new int[t.length];
//         int[] ans = new int[t.length];
//         int counter = -1;
//         for(int i =0; i<t.length; i++){
//             while(counter>=0 && t[st[counter]]<t[i]){
//                 int val = st[counter];
//                 counter--;
//                 ans[val] = i-val;
//             }
//             counter++;
//             st[counter]=i;
//         }

//         return ans;
//     }
// }