package DSA;
public class MaximumPointsYouCanObtainFromCards {
    /*
     * Example 1
     * Input: cardPoints = [1,2,3,4,5,6,1], k = 3
     *Output: 12
     *Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.


     * Example 2
     * Input: cardPoints = [2,2,2], k = 2
     *Output: 4
     *Explanation: Regardless of which two cards you take, your score will always be 4.
     * 
     * 
     * Example 3
     * 
     * Input: cardPoints = [9,7,7,9,7,7,9], k = 7
     *Output: 55
     *Explanation: You have to take all the cards. Your score is the sum of points of all cards.
 
     * 
     */
}




class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sumLeft=0;
        int maxsum=0;
        int rightind =cardPoints.length-1;

        for(int i =0; i<k; i++){
            sumLeft +=cardPoints[i];
        }
        maxsum = sumLeft;
        for(int j = k-1 ; j>=0;j--){
            sumLeft -= cardPoints[j];
            sumLeft+=cardPoints[rightind];
            rightind--;
            maxsum = Math.max(maxsum,sumLeft);
        }
        return maxsum;
    }
}