package DSA;

import java.util.*;

public class NextGreaterElementI {
    
    /*
     * 
        The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

        You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

        For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

        Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

                    
            Example 1:

            Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
            Output: [-1,3,-1]
            Explanation: The next greater element for each value of nums1 is as follows:
            - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
            - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
            - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

            
            Example 2:

            Input: nums1 = [2,4], nums2 = [1,2,3,4]
            Output: [3,-1]
            Explanation: The next greater element for each value of nums1 is as follows:
            - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
            - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.


     * 
     */
}




// iterates through the array in reverse order to find the next greater element for each element using a stack. If no greater element is found, it stores a default value (like the array length) or -1 in the result array.


// class Solution {                // O(n+m)
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {

//         int [] answer = new int[nums1.length];
//         int index =0;

//         HashMap<Integer,Integer> map = new HashMap<>();

//         Stack<Integer> stack = new Stack<>();
//         // int [] ans = new int[nums2.length];        //can also be put in array
//         for(int i=nums2.length-1; i>=0;i--){
//             if(stack.isEmpty()){
//                 // ans[i]=-1;
//                 map.put(nums2[i],-1);
//                 stack.push(nums2[i]);
//             }else{
//                 while(stack.size()>0&&stack.peek()<=nums2[i]){
//                     stack.pop();
//                 }
//                 if(stack.isEmpty()){
//                     // ans[i]=-1;
//                     map.put(nums2[i],-1);           //means the stack is empty so no element is greater than the current element
//                 } else {
//                     // ans[i]= stack.peek()         // means the max number is on the top of stack
//                     map.put(nums2[i],stack.peek());
//                 };
//                 stack.push(nums2[i]);               //pushing the element anyway            
//             }
//         }

//           for(int elem : nums1){
//             answer[index++]= map.get(elem);
            
//           }

//         System.out.println(map);
//         return answer;
//     }
    
// }




//Another implementation of monotonic stack


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];  // Array to store the result
        HashMap<Integer, Integer> map = new HashMap<>();  // Hash table to store next greater elements
        Stack<Integer> stack = new Stack<>();  // Stack to keep track of elements in a decreasing order

        // Traverse nums2 using the Monotonic Stack technique
        for (int num : nums2) {
            // Ensure the stack remains decreasing; pop elements from the stack that are smaller
            // than the current element because the current element is the next greater element for them
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            // Push the current element onto the stack
            stack.push(num);
        }

        // For any remaining elements in the stack, there is no greater element, so map to -1
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Populate the result array using the map
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}









//brute force


// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int [] res = new int[nums1.length];
//         boolean found =false;

//         for(int i =0; i<nums1.length;i++){
//             found =false;
//             for(int j =0; j<nums2.length;j++){
//                 if(nums1[i]==nums2[j]){
//                     found =true;
//                 }
//                 if(found && nums2[j]> nums1[i]){
//                     res[i]=nums2[j];
//                     break;
//                 }
//             }
//         }

//         for(int i=0; i<res.length; i++){
//             if(res[i]==0){
//                 res[i]=-1;
//             }
//         }
//         return res;
//     }

// }





//better than brute force


// class Solution {                    //  O(m×n)
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int [] res = new int[nums1.length];     //the length of the result array and the nums1 will be the same
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums2.length; i++){
//             map.put(nums2[i],i);
//         }
//         for(int i=0;i<nums1.length; i++){
//             for(int j =map.get(nums1[i])+1; j<nums2.length;j++){
             
//                 if( nums2[j]> nums1[i]){
//                     res[i]=nums2[j];
//                     break;
//                 }
//             }
//         }

//         for(int i=0; i<res.length; i++){
//             if(res[i]==0){
//                 res[i]=-1;
//             }
//         }
//         return res;
//     }

// }




