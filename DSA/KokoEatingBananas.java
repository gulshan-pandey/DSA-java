package DSA;

public class KokoEatingBananas {
    /**
     * 
     * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

        Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

        Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

        Return the minimum integer k such that she can eat all the bananas within h hours.

        

        Example 1:

        Input: piles = [3,6,7,11], h = 8
        Output: 4


        Example 2:

        Input: piles = [30,11,23,4,20], h = 5
        Output: 30


        Example 3:

        Input: piles = [30,11,23,4,20], h = 6
        Output: 23
 
     */
}

// similar to https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int high =Integer.MIN_VALUE;
        int low =1;

        for(int i: piles){
            high=Math.max(high,i);
            low=Math.min(low,i);
        }

        while(low<=high){
            int mid = low+(high-low)/2;

            if(canBe(mid,piles,h)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;

    }

    boolean canBe(int mid , int[]arr, int satisfy){
        int total=0;
         for(int i : arr){
            total+= ((i + mid - 1) / mid);    // Math.ceil thing
        
        if (total > satisfy) { 
                return false;
            }
        } 
                return true;
    }
}