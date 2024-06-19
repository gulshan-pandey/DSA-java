package DSA;

public class twoSum {
    
}

//optimal

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i =0; i<nums.length(); i++){
//             if(map.containsKey(target - nums[i])){
//                 int[] arr = {i,map.value(target - nums[i])}
//                 return arr;
//             }

//         map.put(nums[i],i);
//         }
//         return null;
//     }
// }



//brute force


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
        
//         // Iterate through the array
//         for (int i = 0; i < nums.length; i++) {
//            for(int j=i+1;j<nums.length; j++){
//                 if(nums[i] + nums[j]== target){
//                     int[] arr = {i,j};
//                     return arr;
//                 }
//            }
//         }
//          return null;
//         }
// }
        
       
     



