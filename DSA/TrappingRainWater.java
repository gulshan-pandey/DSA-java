package DSA;

import java.util.Stack;

public class TrappingRainWater {
    
    /**
     * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

        Example 1:


        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        Output: 6
        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
        Example 2:

        Input: height = [4,2,0,3,2,5]
        Output: 9
     * 
     */
}





// Use a stack to track indices; calculate trapped water by finding height gaps between boundaries as we encounter taller bars.

class Solution {
    public int trap(int[] height) {
        var stack = new Stack<Integer>(); 
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int temp = stack.pop();
                if (stack.isEmpty()) 
                    continue; // Don't add to ans here
                else {
                    int heightgap = Math.min(height[i], height[stack.peek()]) - height[temp];
                    int idxgap = i - stack.peek() - 1;
                    ans += heightgap * idxgap;
                }
            }
            stack.push(i);
        }
        return ans;
    }
}






// NOTE ---> Uses two-pointer technique to calculate trapped rainwater by maintaining left and right max heights and iterating towards the center, updating answer when a smaller height is found

// class Solution {
//     public int trap(int[] height) {
//         int l =0; 
//         int r=height.length-1;
//         int lmax = 0;
//         int rmax=0;
//         int ans =0;
//         while(l<r){
//             if(height[l]<=height[r]){
//                 if(lmax>height[l]){
//                     ans+=(lmax-height[l]);
//                 }else lmax =height[l];
//                 l++;
//             }else{
//                  if(rmax>height[r]){
//                     ans+=(rmax-height[r]);
//                 }else rmax =height[r];
//                 r--;
//             }
//         }
//         return ans;
//     }
// }



// Array Preprocessing form right and left, make a max array form right and a max array from left ,and then iterate the array form the left by comparing the height[i] with the minimum of the max array of right and left and then add to the result

//--- O(3n) ---> O(n)



// class Solution {
//     public int trap(int[] height) {
//         int result=0;
//         int lmax=height[0];
//         int rmax=height[height.length-1];
//         int[] larr = new int[height.length];
//         int[] rarr = new int[height.length];
//         for(int i=0; i<height.length;i++){
//             lmax = Math.max(lmax, height[i]);
//             larr[i] = lmax; 
//         }
//         for(int i=height.length-1; i>=0;i--){
//             rmax = Math.max(rmax, height[i]);
//             rarr[i] = rmax; 
//         }
//         for(int i =0 ; i<height.length; i++){
//             int temp = Math.min(larr[i],rarr[i]);
//             if(height[i]<temp) result+=temp-height[i];
//         }

//         return result;
//     }
// }

    

