package DSA;
public class MaxConsecutiveOnes {
  
    /*
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     */
    
}





class Solution {        // classic approach but optimal one
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int counting=0;

        for(int i =0; i<nums.length; i++){
            if(nums[i]==1){
                counting++;
            }else{
                count= Math.max(count,counting);
                counting=0;
            }
        }
        return count= Math.max(count,counting);         // in this line the Math.max is necessary bcz if the else condition dont run at the last step, the previous value of the count will be return and the error will occur
    }
}



