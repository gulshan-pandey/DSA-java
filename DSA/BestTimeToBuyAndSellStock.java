package DSA;
public class BestTimeToBuyAndSellStock {
    
    //uses dp
}





class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int cost =prices[i]-min;
            profit = Math.max(cost, profit);
            min = Math.min(min, prices[i]);
        }

        return profit>0? profit:0;
    }
}




// class Solution {
//     public int maxProfit(int[] prices) {
       

//         int left=0, right=1; 
//         int maxProfit = 0; 

//         while(right<prices.length){
//             if(prices[left]<prices[right]){
//                 maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
//             }
//             else{
//                 left=right;
//             }
//             right++;
//         }

//         return maxProfit;
//     }
// }


