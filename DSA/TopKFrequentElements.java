package DSA;
public class TopKFrequentElements {
    /*
     * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

        Example 1:

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
        Example 2:

        Input: nums = [1], k = 1
        Output: [1]
        
     * 
     * 
     */
}


// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         int[] arr = new int[k];
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for (int j = 0; j < k; j++) {
//             int max = Integer.MIN_VALUE;
//             int maxvalue = Integer.MIN_VALUE;
//             for (var entry : map.entrySet()) {
//                 if (entry.getValue() > max) {
//                     max = entry.getValue();
//                     maxvalue = entry.getKey();
//                 }
//             }
//             arr[j] = maxvalue;
//             map.remove(maxvalue);

//         }
//         return arr;
//     }

// }





//  priority queue approach

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         int[] arr = new int[k];
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         PriorityQueue<Map.Entry<Integer, Integer>>q = new PriorityQueue<>((a,b) -> b.getValue() -a.getValue());

//         q.addAll(map.entrySet());

//         for(int i=0; i<k; i++){
//             arr[i]= q.poll().getKey();
//         }
//         return arr;
//     }
// }