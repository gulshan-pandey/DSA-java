package DSA;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    

    /**
     * 
     * Given an integer array nums and an integer k, return the kth largest element in the array.

        Note that it is the kth largest element in the sorted order, not the kth distinct element.

        Can you solve it without sorting?

        

        Example 1:

        Input: nums = [3,2,1,5,6,4], k = 2
        Output: 5



        Example 2:

        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
        Output: 4
     */
}



// Using Sort
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//      Arrays.sort(nums);

//     return nums[nums.length-k];

//     }
// }






// Using Priority Queue

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
      PriorityQueue <Integer> q = new PriorityQueue<>(k);

      for(int i : nums){
        if(q.size()<k){
            q.add(i);
        }else{
            if(i>q.peek()){
                q.poll();
                q.add(i);
            }
        }
      }
         return q.peek();
    }
}

 
