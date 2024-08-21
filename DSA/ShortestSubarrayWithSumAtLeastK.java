package DSA;

public class ShortestSubarrayWithSumAtLeastK {
    /*
     * Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with a sum of at least k. If there is no such subarray, return -1.

        A subarray is a contiguous part of an array.

        

        Example 1:

        Input: nums = [1], k = 1
        Output: 1


        Example 2:

        Input: nums = [1,2], k = 4
        Output: -1


        Example 3:

        Input: nums = [2,-1,2], k = 3
        Output: 3
     * 
     */
}


class Solution {
    public int shortestSubarray(int[] nums, int k) {
        var mp = new TreeMap<Long,Integer>(); 
        int minlen = Integer.MAX_VALUE;
        long sum=0;
      
        for(int r= 0; r<nums.length; r++){
             if(nums[r]>k) return 1;
             sum+=nums[r];
             if(sum>=k){
                minlen = Math.min(minlen,r+1);
             }
             long remainingsum =sum-k;
             var entry = mp.floorEntry(remainingsum);
             while(entry!=null){
                int index = entry.getValue();
                minlen = Math.min(minlen,r -index);
                mp.remove(entry.getKey());
                entry = mp.floorEntry(entry.getKey()-1);
             
             }
             mp.put(sum,r);
             }
        
        return minlen==Integer.MAX_VALUE? -1: minlen;
    }
}




// class Solution {
//     public int shortestSubarray(int[] nums, int k) {
//         int n = nums.length;
//         long[] prefixSum = new long[n + 1];
//         for (int i = 0; i < n; i++) {
//             prefixSum[i + 1] = prefixSum[i] + nums[i];
//         }
        
//         int shortest = n + 1;
//         Deque<Integer> deque = new LinkedList<>();
        
//         for (int i = 0; i <= n; i++) {
//             while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {
//                 shortest = Math.min(shortest, i - deque.pollFirst());
//             }
//             while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
//                 deque.pollLast();
//             }
//             deque.offerLast(i);
//         }
        
//         return shortest == n + 1 ? -1 : shortest;
//     }
// }


