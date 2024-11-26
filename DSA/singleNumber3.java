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
//         int xor = 0;
//         for (int num : nums) {
//             xor ^= num; // XOR all numbers
//         }
        
//         // Find the rightmost set bit in xor
//         int rightmostSetBit = xor & -xor;           // or  (xorr & (xorr - 1)) ^ xorr;        // this variable is taken for separating the numbers in 2 groups
        
//         int[] result = new int[2];
//         for (int num : nums) {
//             // Divide numbers into two groups based on the rightmost set bit
//             if ((num & rightmostSetBit) == 0) {
//                 result[0] ^= num; // Group 1
//             } else {
//                 result[1] ^= num; // Group 2
//             }
//         }
        
//         return result; // The two unique numbers
//     }
// }

