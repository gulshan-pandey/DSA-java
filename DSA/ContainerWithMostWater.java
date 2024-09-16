package DSA;

public class ContainerWithMostWater {
    
    /**
     * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

        Find two lines that together with the x-axis form a container, such that the container contains the most water.

        Return the maximum amount of water a container can store.

        Notice that you may not slant the container.

        

        Example 1:


        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
        Example 2:

        Input: height = [1,1]
        Output: 1

     */
}


/**
 * Approach : run a while loop by taking 2 pointers, 
 * find the maximum of the ( minimum of both of the pointers and multiply with the index gap between them) and move the pointer forward of which was had the minimum value!...
 *  in the end return that maximum value
 */

class Solution {
    public int maxArea(int[] h) {
        int max =0;
        int l =0;
        int r=h.length-1;

        while(l<r){
            if(h[l]<=h[r]){
                int gap = r-l;
                max= Math.max(max,h[l]*gap);
                l++;
            }else{
                int gap = r-l;
                max= Math.max(max,h[r]*gap);
                r--;
            }
        }
        return max;
    }
}




// class Solution {
//     public int maxArea(int[] height) {
//         int maxArea = 0;
//         int left = 0;
//         int right = height.length - 1;

//         while (left < right) {
//             maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return maxArea;        
//     }
// }
