package DSA;

public class  MajorityElement {
    
    /*
     * Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

        

        Example 1:

        Input: nums = [3,2,3]
        Output: 3
        Example 2:

        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
     * 
     */
}




// class Solution {                              //  sorting    ---->   nlogn --- O(1)
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }




// class Solution {                   //    hashmap  ----> nlongn --- nlogn
//     public int majorityElement(int[] nums) {
//         var map = new HashMap<Integer, Integer>();
//         int majority = nums.length/2;
//         for(int elem : nums){
//             map.put(elem,map.getOrDefault(elem,0)+1);
//             if(map.get(elem)>majority)return elem;
//         }
//         return -1;
//     }
// }



//boyer moore's voting algo -->  Maintain a candidate and a count: it increments the count for matching elements, decrements for mismatches, and resets the candidate when the count reaches zero, ensuring that the final candidate is the majority element if one exists.

// O(n) time and O(1) space

class Solution {
    public int majorityElement(int[] nums) {
        int num =nums[0];
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(num!=nums[i]&&count>0) count--;
            else if(num==nums[i]) count++;
            if (count==0) {
                num=nums[i] ;
                count=1;
            }
        }
        return num;
    }
}


//generalized way of moore's vote algorithm

// class Solution {
//     public int majorityElement(int[] nums) {
//         int num = nums[0];
//         int count = 1;

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == num) {
//                 count++;
//             } else {
//                 count--;
//             }

//             if (count == 0) {
//                 num = nums[i]; // Update the candidate
//                 count = 1; // Reset count for the new candidate
//             }
//         }
        
//         return num;
//     }
// }
