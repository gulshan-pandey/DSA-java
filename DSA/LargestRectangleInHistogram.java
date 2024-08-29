package DSA;

import java.util.*;


/**
 * Befor doing this question , complete Next smaller element, previous smaller element, sum of subarray minimums --->  https://leetcode.com/problems/sum-of-subarray-minimums/ 
 * 
 * 
 * for this question tutorial -> https://youtu.be/Bzat9vgD0fs?si=K64Pi3VLM5hZzIDl
 * 
 * The intuition behind is we need to form the largest area in the rectangle by the help of the width(indexs) and the heigths of the bars, the key is to find the next smaller in the left and in the right for every element, bcz thats where till the rectangle will be formed , after finding it height * ( (i- nsl[i]) + (nsr[i] - i-1) ) take out the maximum for every of the element.
 * 
 *   Approach: Calculate left and right boundaries where heights are smaller using stacks, then compute max area for each bar as height * (leftH + rightH).
 * 

 */
public class LargestRectangleInHistogram {
    /**
     * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
     
     
     Example 1:
     
     
     Input: heights = [2,1,5,6,2,3]
     Output: 10
        Explanation: The above is a histogram where width of each bar is 1.
        The largest rectangle is shown in the red area, which has an area = 10 units.
        Example 2:


        Input: heights = [2,4]
        Output: 4
        
     * 
     */

}

    






    //BRUTE FORCE:
        
    //  class Solution {
    //     public int largestRectangleArea(int[] heights) {
    //         // Initialize maxArea to 0
    //         int maxArea = 0;

    //         // Iterate over all possible rectangle starting positions
    //         for (int start = 0; start < heights.length; start++) {
    //             // Iterate over all possible rectangle ending positions
    //             for (int end = start; end < heights.length; end++) {
    //                 // Calculate the width of the rectangle
    //                 int width = end - start + 1;
                    
    //                 // Calculate the height of the rectangle (minimum height of bars)
    //                 int height = Integer.MAX_VALUE;
    //                 for (int i = start; i <= end; i++) {
    //                     height = Math.min(height, heights[i]);
    //                 }
    //                 int area = width * height;
    //                 maxArea = Math.max(maxArea, area);
    //             }
    //         }
    //         return maxArea;
    //     }

    // }




class Solution {                    // near about O(5n) ---> O(n)

    public int[] nsr(int[] arr, Stack<Integer> stack){
        int n = arr.length;
        int [] nsr = new int[n];
        Arrays.fill(nsr,n);
        for(int i =0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()]> arr[i]){
                nsr[stack.pop()]= i;
            }
            stack.push(i);
        }
        return nsr;
    }


    public int[] nsl(int[] arr, Stack<Integer> stack){
        int n = arr.length;
        int [] nsl = new int[n];
        Arrays.fill(nsl,-1);
        for(int i=n-1;i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]> arr[i]){
                nsl[stack.pop()]= i;
            }
            stack.push(i);
        }
        return nsl;
    }

    // Main function
    public int largestRectangleArea(int[] heights) {
        var stack = new Stack<Integer>();
        int n = heights.length;
        int[] nsr = nsr(heights,stack);
        stack.clear();
        int[] nsl = nsl(heights,stack);
        // System.out.println(Arrays.toString(nsr));
        // System.out.println(Arrays.toString(nsl));

        int maxArea =0;
        for(int i=0; i<n; i++){
            int leftH = i-nsl[i];
            int rightH = nsr[i]-i-1;                // int width = nsr[i] - nsl[i] - 1;
            int area= heights[i]*(leftH+rightH);
            maxArea = Math.max(area,maxArea);
        }

        return maxArea;
    }
}





// generalized way

// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int n = heights.length;
//         int[] left = new int[n];   // stores the indices of the next smaller element on the left
//         int[] right = new int[n];  // stores the indices of the next smaller element on the right
//         Stack<Integer> stack = new Stack<>();

//         // Fill the 'left' array
//         for (int i = 0; i < n; i++) {
//             while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
//                 stack.pop();
//             }
//             left[i] = stack.isEmpty() ? -1 : stack.peek();
//             stack.push(i);
//         }

//         stack.clear();

//         // Fill the 'right' array
//         for (int i = n - 1; i >= 0; i--) {
//             while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
//                 stack.pop();
//             }
//             right[i] = stack.isEmpty() ? n : stack.peek();
//             stack.push(i);
//         }
//          System.out.println(Arrays.toString(left));
//          System.out.println(Arrays.toString(right));
//         // Calculate the maximum area
//         int maxArea = 0;
//         for (int i = 0; i < n; i++) {
//             int width = right[i] - left[i] - 1;
//             int area = heights[i] * width;
//             maxArea = Math.max(maxArea, area);
//         }

//         return maxArea;
//     }
// }




//Most optimal solution-------> O(n) in single traversal

/**
 * this approach travers the the array only once and maintains the increasing order monotonic stack, 
 * once the element is popped out means that the element that popped it is the next smaller element of the popped element and the element which is currently remains in the stack is the previous smaller element of the popped element.
 * now the nse and pse is found we can do the operation --> {heights[element]*(nse- pse-1)} , this will give the rectangle area occupied by that element 
 * we will do this to every element in the array and find the maximum of its area
 */


// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int maxArea=0;
//         var stack = new Stack<Integer>();
//         int n = heights.length;

//         for(int i =0; i<n; i++){

//             while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
//                 int element= stack.pop();
//                 int pse = stack.empty()? -1: stack.peek();
//                 int nse =i;
//                 maxArea = Math.max(maxArea,heights[element]*(nse- pse-1));
//             }
//             stack.push(i);
//         }
//         while(!stack.isEmpty()){
//             int nse =n;
//             int element = stack.pop();
//             int pse = stack.isEmpty()? -1:stack.peek();
//             maxArea = Math.max(maxArea,heights[element]*(nse- pse-1));
//         }
//         return maxArea;
//     }
// }
