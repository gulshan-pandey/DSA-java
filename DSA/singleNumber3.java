package DSA;

import java.util.HashMap;

public class singleNumber3 {
    /*
    Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.


Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]
    
    */
}









// brute force approach use map


class Solution {
    public int[] singleNumber(int[] nums) {
        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array and count the occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Create an array to store the result (the two unique numbers)
        int[] result = new int[2];
        int index = 0;
        
        // Iterate through the map and find the numbers that appear exactly once
        for (int key : map.keySet()) {
            // Check if the value in the map for this key is 1
            if (map.get(key) == 1) {
                result[index++] = key;
                // Since we know there are exactly two numbers that appear once,
                // we can stop once we have found both
                if (index == 2) {
                    break;
                }
            }
        }
        
        // Return the result array containing the two single numbers
        return result;
    }
}







// java 8

// class Solution {
//     public int[] singleNumber(int[] nums) {
//         // Create a HashMap to store the frequency of each number
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         // Iterate through the array and count the occurrences of each number
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // Using stream to filter the numbers that appear once and collect them
//         int[] result = map.entrySet().stream()
//                 .filter(entry -> entry.getValue() == 1)  // Only keep elements with value 1
//                 .map(Map.Entry::getKey)  // Extract the key (the number)
//                 .collect(Collectors.toList())  // Collect into a list
//                 .stream()
//                 .mapToInt(i -> i)  // Convert to int array
//                 .toArray();

//         // Return the result array containing the two single numbers
//         return result;
//     }
// }








//using xor most efficient 

// class Solution {
//     public int[] singleNumber(int[] nums) {
        
//         long xorr = 0;
//         for(int i = 0; i < nums.length; i++){
//             xorr = xorr ^ nums[i];
//         }
//         long rightShift = (xorr & (xorr - 1)) ^ xorr;        // this variable is taken for separating the numbers in 2 groups

//         long b1 = 0;
//         long b2 = 0;
//         for(int j = 0; j < nums.length; j++){
//             if ((nums[j] & rightShift) != 0){
//                 b1 = b1 ^ nums[j];
//             } else{
//                 b2 = b2 ^ nums[j];
//             }
//         }
//         return new int[] { (int)b1, (int)b2 };
//     }
// }
