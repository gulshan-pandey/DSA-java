package DSA;

public class removeDuplicates {
    
}


// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.


// class Solution {
//     public int removeDuplicates(int[] nums) {
//          if (nums.length == 0) {
//             return 0;
//         }
//         int j=0;
        
//         for(int i=1 ; i<nums.length; i++){
//             if(nums[j] ==nums[i]){
        
//             } else{
                
//                 nums[j+1]=nums[i];
                
//                 j++;
//             }
//         }
//         return j+1;
//     }
// }
