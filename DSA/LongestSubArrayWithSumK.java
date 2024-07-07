package DSA;

public class LongestSubArrayWithSumK {
    // Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.
}


//brute force

// class Solution {
//     // Function for finding maximum length of subarray with sum K
//     public static int lenOfLongSubarr(int A[], int N, int K) {
//         // List to store lengths of subarrays with sum K
//         List<Integer> list = new ArrayList<>();
//         for (int i = 0; i < N; i++) {
//             int sum = 0;
//             int count = 0;
//             for (int j = i; j < A.length; j++) {
//                 sum += A[j];
//                 count++;
//                 if (sum == K) {
//                     list.add(count);
//                 }
//             }
//         }
//         // Return the maximum length or 0 if no subarray with sum K found
//         return list.stream().max(Integer::compareTo).orElse(0);
        
//     }
    
    
// }








//optimized

// class Solution{
    
    // Function for finding maximum and value pair
//     public static int lenOfLongSubarr (int A[], int N, int K) {
        
//         Map<Integer,Integer> map = new HashMap<>();
//         int maxLength=0;
//         int sum=0;
//         for(int i=0; i<N;i++){
//             sum+=A[i];
//             if(sum==K){
//                 maxLength= i +1;
//             }
//             if(map.containsKey(sum-K)){
//                 maxLength= Math.max(maxLength,i-map.get(sum-K));
//             }
//             if(!map.containsKey(sum)){
                
//             map.put(sum,i);
//             }
//         }
//         return maxLength;
//     }
    
    
// }