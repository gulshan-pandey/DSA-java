package DSA;
public class MaximumGap {
    /**
     * Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.

        You must write an algorithm that runs in linear time and uses linear extra space.

        

        Example 1:

        Input: nums = [3,6,9,1]
        Output: 3
        Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
        Example 2:

        Input: nums = [10]
        Output: 0
        Explanation: The array contains less than 2 elements, therefore return 0.
     */
}




// class Solution {
//     public int maximumGap(int[] nums) {
//     Arrays.sort(nums);
//     if(nums.length<2) return 0;
//     int max = Integer.MIN_VALUE;
//     for(int i=nums.length-1; i>=1; i--){
//         max = Math.max(nums[i]-nums[i-1],max);
//     }    
//     return max;
//     }
// }


// TLE...       O(n+k)   ... Radix and counting sort---> it has only limitation of higher value in the array and the -ve values in the array ,otherwise its a best approach of sorting


// class Solution {
//     public int maximumGap(int[] nums) {
//          if(nums.length<2) return 0;
//         int max = Integer.MIN_VALUE;
//         int maxgap = Integer.MIN_VALUE;
//         for(int i: nums) max= Math.max(max,i);

//         int[] arr = new int[max+1];
//         for(int i=0; i<nums.length; i++){
//             arr[nums[i]]++;
//         }

//         int n = arr.length;
//         int curr = n-1;
//         for(int i=n-2; i>=0; i--){
//             int temp ;
//             if(arr[i]>=1){
//                 temp =i;
//                 maxgap = Math.max(curr-i, maxgap);
//                 curr =i;
                
//             }
//         }
//         return maxgap;
//     }
// }





// optimal --- O(n)   bucket sort


// class Solution {
//     public int maximumGap(int[] nums) {
//         if (nums.length < 2) return 0;
        
//         // Step 1: Find the minimum and maximum values in the array
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
        
//         for (int num : nums) {
//             min = Math.min(min, num);
//             max = Math.max(max, num);
//         }
        
//         // Step 2: Calculate the bucket size
//         int n = nums.length;
//         int bucketSize = Math.max(1, (max - min) / (n - 1)); // bucket size cannot be 0
        
//         // Step 3: Create the buckets
//         int bucketCount = (max - min) / bucketSize + 1;  // Number of buckets
//         int[] bucketMin = new int[bucketCount];
//         int[] bucketMax = new int[bucketCount];
        
//         Arrays.fill(bucketMin, Integer.MAX_VALUE);
//         Arrays.fill(bucketMax, Integer.MIN_VALUE);
        
//         // Step 4: Place each number into a corresponding bucket
//         for (int num : nums) {
//             int bucketIndex = (num - min) / bucketSize;
//             bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
//             bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
//         }
        
//         // Step 5: Find the maximum gap
//         int maxGap = 0;
//         int previousMax = min;  // Start with the minimum element
        
//         for (int i = 0; i < bucketCount; i++) {
//             // Skip empty buckets
//             if (bucketMin[i] == Integer.MAX_VALUE) continue;
            
//             // Update maxGap
//             maxGap = Math.max(maxGap, bucketMin[i] - previousMax);
            
//             // Update previousMax to the current bucket's maximum
//             previousMax = bucketMax[i];
//         }
        
//         return maxGap;
//     }
// }


