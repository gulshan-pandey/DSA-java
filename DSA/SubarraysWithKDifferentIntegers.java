package DSA;

import java.util.HashMap;

public class SubarraysWithKDifferentIntegers {
    
    /*
     * Given an integer array nums and an integer k, return the number of good subarrays of nums.

        A good array is an array where the number of different integers in that array is exactly k.

        For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.


        
        Example 1:

        Input: nums = [1,2,1,2,3], k = 2
        Output: 7
        Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

        
        Example 2:

        Input: nums = [1,2,1,3,4], k = 3
        Output: 3
        Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
     */
}











// class Solution {        //brute force (generate all the possible subarrays)--> TLE
//     public int subarraysWithKDistinct(int[] nums, int k) {
//         int count=0;
//         for(int i=0; i<nums.length;i++){
//             HashSet<Integer> st =new HashSet<>();
//             for(int j=i;j<nums.length;j++){
//                 st.add(nums[j]);
//                 if(st.size()==k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }



// the idea behind this approach is to use two ptr ans sliding window for the problem where we need to find all the subarrays with subarrays <=k ... then my modifying the solution to  calculate the function for  {subarrays<=k - subarrays<=k-1} by returning this function.


class Solution {       
    public int subarraysWithKDistinct(int[] nums, int k) {


        return fun(nums,k) -fun(nums,k-1);

    }

    public int fun(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int left=0;
        int count=0;

        if(k<0) return 0;
        for(int end =0; end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
           
                count+=(end-left+1);
            

        }

        return count;
    }
}

