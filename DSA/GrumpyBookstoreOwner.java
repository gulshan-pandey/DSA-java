package DSA;

public class GrumpyBookstoreOwner {
    
    /*
     * There is a bookstore owner that has a store open for n minutes. Every minute, some number of customers enter the store. You are given an integer array customers of length n where customers[i] is the number of the customer that enters the store at the start of the ith minute and all those customers leave after the end of that minute.

            On some minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1 if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.

            When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise, they are satisfied.

            The bookstore owner knows a secret technique to keep themselves not grumpy for minutes consecutive minutes, but can only use it once.

            Return the maximum number of customers that can be satisfied throughout the day.

            

            Example 1:

            Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
            Output: 16
            Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
            The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.


            Example 2:

            Input: customers = [1], grumpy = [0], minutes = 1
            Output: 1
            
     */
}


class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int m) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int un =0;
        int maxunset=0;
        int satsum =0;
        int res=0;
        for(int i=0; i<customers.length;i++){
            satsum+=customers[i]*(1-grumpy[i]);
            if(i<m){
            un+=customers[i]*grumpy[i];
            }
        }
        maxunset=un;

        for(int j =m; j<grumpy.length;j++){
                un += (customers[j]*grumpy[j]) - customers[j-m]*grumpy[j-m];
                maxunset= Math.max(un,maxunset);
            

        }
        return satsum + maxunset;
        
    }
}





//next approach


// class Solution {
//     public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//         int total = 0;
//         int maxIncrease = 0;
//         int windowSum = 0;
        
//         for (int i = 0; i < customers.length; i++) {
//             if (grumpy[i] == 0) {
//                 total += customers[i];
//             } else {
//                 windowSum += customers[i];
//             }
            
//             if (i >= minutes) {
//                 windowSum -= customers[i - minutes] * grumpy[i - minutes];
//             }
            
//             maxIncrease = Math.max(maxIncrease, windowSum);
//         }
        
//         return total + maxIncrease;
//     }
// }
