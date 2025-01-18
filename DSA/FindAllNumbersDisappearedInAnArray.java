package DSA;

import java.util.ArrayList;
import java.util.List;

public class  FindAllNumbersDisappearedInAnArray {
    
    /*
     * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

        

        Example 1:

        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]
        Example 2:

        Input: nums = [1,1]
        Output: [2]
        
     */
    
}



/*
 * O(n) and O(n) time and space respectively
 */

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int n = nums.length;
//         int[] arr = new int[n+1];

//         for(int i =0; i<nums.length; i++){
//             arr[nums[i]]=1;
//         }

//         var list = new ArrayList<Integer>();
//         for(int i =1; i<arr.length; i++){
//             if(arr[i]==0) list.add(i);
//         }

//         return list;

//     }
// }



/*
 * O(n) and O(1) time and space respectively
 * most optimal solution
 * 
 * approach -> we mark the numbers present in the array as negative
 * then we return the positive numbers
 */


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        for(int i=0; i<nums.length; i++){
             int preserve = Math.abs(nums[i])-1;
             if(nums[preserve]>0){
                nums[preserve] = -nums[preserve];
             }
            
        }

        var list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
           if(nums[i]>0) list.add(i+1);
        }

        return list;

    }
}
