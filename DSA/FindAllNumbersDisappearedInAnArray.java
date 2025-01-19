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
Approach to find missing numbers (1 to n) in array:

Step 1: Mark Numbers as Seen
- Iterate through array
- For each number n, mark the number at index (n-1) as negative
- This marks that we've seen number n in the array
- We use Math.abs() to handle already negative numbers

Step 2: Find Missing Numbers
- Iterate through array again
- If a number is still positive, it means its index+1 was never seen
- Example: if nums[2] is positive, then 3 was never in original array

Step 3: Build Result
- Add all (index+1) values to result list where nums[index] is positive
- These are the numbers that never appeared in original array

Time Complexity: O(n), Space Complexity: O(1) excluding output list

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
