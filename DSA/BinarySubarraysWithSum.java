package DSA;
public class  BinarySubarraysWithSum {
    /*
     * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.


        Example 1:

        Input: nums = [1,0,1,0,1], goal = 2
        Output: 4
        Explanation: The 4 subarrays are bolded and underlined below:
        [1,0,1,0,1]
        [1,0,1,0,1]
        [1,0,1,0,1]
        [1,0,1,0,1]
        Example 2:

        Input: nums = [0,0,0,0,0], goal = 0
        Output: 15


     * 
     */

}





// the idea behind this approach is to use two ptr ans sliding window for the problem where we need to find all the subarrays with sum <=goal ... then my modifying the solution to  calculate the function for  {sum<=goal - sum<=goal-1} by returning this function.



class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return ans( nums, goal)-ans( nums, goal-1);
   
    }
   
   
    //my own function
    public int ans(int[] nums, int goal) {
     int left=0;
       int right=0;
       int sum=0;
       int count=0;
       if(goal<0){
           return 0;
       }
       while(right<nums.length){
           sum+=nums[right];
           while(sum>goal){
                if(nums[left]==1){
                       sum--;
                   }
                   left++;
           }
               count+=(right-left+1);
   
           right++;
       }
       return count;
    }
   }
   





   
   //hashmap approach


   
// class Solution {
//  public int numSubarraysWithSum(int[] nums, int goal) {
//         int count = 0;
//         int odds = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0, 1);

//         for (int num : nums) {
//             odds+=num%2;        //number of odds

//             count+=map.getOrDefault(odds-goal,0);
        
//             map.put(odds,map.getOrDefault(odds,0)+1);

           
//         }

//         return count;
//     }
// }