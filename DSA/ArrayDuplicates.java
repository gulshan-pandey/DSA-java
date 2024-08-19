package DSA;
public class ArrayDuplicates {
    /*
     * Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

        Examples:

        Input: n = 4, arr[] = [0,3,1,2]
        Output: -1
        Explanation: There is no repeating element in the array. Therefore output is -1.

        Input: n = 5, arr[] = [2,3,1,2,3]
        Output: 2 3 
        Explanation: 2 and 3 occur more than once in the given array.
     * 
     */
}



// class Solution {
//     public static ArrayList<Integer> duplicates(int[] arr) {
//         // code here
//         int n = arr.length;
//         ArrayList<Integer> result = new ArrayList<>();
//         int[] freq = new int[n];

//         for (int i = 0; i < n; i++) {
//             freq[arr[i]]++;
//         }

//         // Collect elements that appear more than once
//         for (int i = 0; i < n; i++) {
//             if (freq[i] > 1) {
//                 result.add(i);
//             }
//         }

//         // If no element is found, return [-1]
//         if (result.isEmpty()) {
//             result.add(-1);
//         }

//         return result;
//     }
// }
