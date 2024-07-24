package DSA;

public class SortArrayByIncreasingFrequency {

    /*
     * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

        Return the sorted array.

        
            Example 1:

            Input: nums = [1,1,2,2,2,3]
            Output: [3,1,1,2,2,2]
            Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.


            Example 2:

            Input: nums = [2,3,1,3,2]
            Output: [1,3,3,2,2]
            Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

            
            Example 3:

            Input: nums = [-1,1,-6,4,5,-6,1,4,1]
            Output: [5,-1,4,4,-6,-6,1,1,1]

     */
}




// class Solution {
//     public int[] frequencySort(int[] nums) {
        
//         Map<Integer,Integer> map = new HashMap<>();
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         PriorityQueue <Integer> q = new PriorityQueue<>((a, b) -> {
//             int freqA = map.get(a);
//             int freqB = map.get(b);
//             // Sort by frequency, and then by value in descending order
//             return freqA == freqB ? b - a : freqA - freqB;
//         });

//         for(var elem : map.keySet()){
//            q.offer(elem);
//         }
//         int[] arr = new int[nums.length];
//         int index = 0;
//         while(!q.isEmpty()){
//             int num = q.poll();
//              int freq = map.get(num);
//             for(int j =0; j<freq; j++){
//                 arr[index++] = num;
//             }
//         }

//     return arr;
//     }
// }