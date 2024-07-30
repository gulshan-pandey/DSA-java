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







// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         int[] arr = new int[k];
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // PriorityQueue to sort keys based on their frequencies
//         PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

//         // Add all keys into the PriorityQueue
//         for (int key : map.keySet()) {
//             q.add(key);
//         }

//         for (int i = 0; i < k; i++) {
//             arr[i] = q.poll();
//         }
        
//         return arr;
//     }
// }



// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         int[] arr = new int[k];
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // PriorityQueue to sort keys based on their frequencies... in java priority queue is the implementation of heap
//         PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

//         // Add all keys into the PriorityQueue
//         for (int key : map.keySet()) {
//             minheap.add(key);
//             if(minheap.size()>k){
//                 minheap.poll();
//             }
//         }

//        while(k-- >0){
//         arr[k]=minheap.poll();
//        }
        
//         return arr;
//     }
// }




// class Solution {            //bucket sort  O(n) approach  MOST OPTIMAL SOLUTION
//    public int[] topKFrequent(int[] nums, int k){
       
//        Map<Integer,Integer> map = new HashMap<>();

//        for(int elem : nums){
//            map.put(elem,map.getOrDefault(elem,0)+1);
//        }

//        List<Integer> [] arr = new ArrayList[nums.length+1];

//        for(int key : map.keySet()){
//            int freq = map.get(key);
//            if(arr[freq]==null){
//                arr[freq] = new ArrayList<>();
//            }
//            arr[freq].add(key);
//        }

//        int [] ans = new int[k];
//        int index=0;
       


   

//     for(int i= arr.length-1; i>=0 && index< k; i--){
//            if(arr[i]!=null){
//                for(int j =0; j< arr[i].size()&& index<k; j++){
//                    ans[index++] = arr[i].get(j);
//                }
//            }
//        }
   
   
//    return ans;
//    }
// }
