package DSA;

public class MissingNumbers {
    /*
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
     * 
     * Input: nums = [3,0,1]
     * Output: 2
     * 
     * Input: nums = [0,1]
     * Output: 2
     * 
     * Input: nums = [9,6,4,2,3,5,7,0,1]
     * Output: 8
     */
    
}




// class Solution {
//     public int missingNumber(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums.length ; i++){
//             set.add(nums[i]);
            
//         }
//         for(int i=0; i<=nums.length ; i++){
            
//             if(!set.contains(i)){
//                 return i;
//             }
//         }
//           return -1;
//     }
// }



//optimized

// class Solution {
//     public int missingNumber(int[] nums) {
//         int[] arr=new int[nums.length+1];
//         Arrays.fill(arr,-1);             //filled the whole array with -1 at each index of vector
//         for(int i=0;i<nums.length;i++){
//             arr[nums[i]]=nums[i];           //nums's same valued index contains the same value in the array
//         }
//         for(int i=0;i<nums.length+1;i++){
//             if(arr[i]==-1){                 // now checking which index is left with -1 and return that index
//                 return i;
//             }
//         }
//         return -1;
        
//     }
// }