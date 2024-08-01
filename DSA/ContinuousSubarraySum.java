package DSA;

public class ContinuousSubarraySum {
    /*
     * Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
     * A good subarray is a subarray where:
     * its length is at least two, and
     * the sum of the elements of the subarray is a multiple of k.
     * 
     */

}

// class Solution {         // brute force
//     public boolean checkSubarraySum(int[] nums, int k) {

//         for(int i =0; i<nums.length;i++){
//             int sum=0;
//             int count =0;
//             for(int j =i; j<nums.length;j++){
//                 sum+=nums[j];
//                 count++;
//                 if(sum%k==0 && (count>1)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }




// just a little maths!!!!

// class Solution {                     
//     public boolean checkSubarraySum(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         map.put(0,-1);
//         int sum=0;
//         int length =0;
//         for(int i =0; i<nums.length;i++){
//             sum+=nums[i];
            
//             if(map.containsKey(sum%k)){
//                 length = Math.max(length,i-map.get(sum%k));
//                 if(length>=2){
//                     return true;
//                 }
//             }else{
//                 map.put(sum%k,i);
//             }
//         }
            
//         return false;
//     }
// }






//most optimized

// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) { 
//         Map<Integer, Integer> map = new HashMap<>();
//         map.put(0, -1); 
//         int sum = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             int remainder = sum % k;
            
//             // Handle negative remainders
//             if (remainder < 0) {
//                 remainder += k;
//             }
            
//             if (map.containsKey(remainder)) {
//                 int prevIndex = map.get(remainder);
//                 if (i - prevIndex > 1) {
//                     return true;
//                 }
//             } else {
//                 map.put(remainder, i);
//             }
//         }
        
//         return false;
//     }
// }