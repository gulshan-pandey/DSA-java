package DSA;

public class ContainsDuplicate {
    /*
     * Input: nums = [1,2,3,1]
     *Output: true
     

      Example 2:

    Input: nums = [1,2,3,4]
    Output: false


    Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
     */
    
}

// by frequency map

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//         for (int num : nums) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//             if (frequencyMap.get(num) > 1) {
//                 return true; // Duplicate found
//             }
//         }
//         return false; // No duplicates
//     }
// }


// by sorting and comparing the adjacents

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums); // Sort the array
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return true; // Duplicate found
//             }
//         }
//         return false; // No duplicates
//     }
// }



// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet set = new HashSet();
//         Boolean is = false;
//         for(int i =0; i<nums.length; i++){
//             if(!set.add(nums[i])){
//                 return true;
//             }
//         }
//         return is;
//     }
// }
