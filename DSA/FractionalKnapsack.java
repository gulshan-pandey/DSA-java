package DSA;

import java.util.Arrays;

public class FractionalKnapsack {
    /**
     * problem -> https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
     * 
     * Given weights and values of n items, we need to put these items in a knapsack of capacity w to get the maximum total value in the knapsack. Return a double value representing the maximum value in knapsack.
        Note: Unlike 0/1 knapsack, you are allowed to break the item here. The details of structure/class is defined in the comments above the given function.

        Examples :

        Input: n = 3, w = 50, value[] = [60,100,120], weight[] = [10,20,30]
        Output: 240.000000
        Explanation: Take the item with value 60 and weight 10, value 100 and weight 20 and split the third item with value 120 and weight 30, to fit it into weight 20. so it becomes (120/30)*20=80, so the total value becomes 60+100+80.0=240.0 Thus, total maximum value of item we can have is 240.00 from the given capacity of sack. 
        Input: n = 2, w = 50, value[] = [60,100], weight[] = [10,20]
        Output: 160.000000
        Explanation: Take both the items completely, without breaking. Total maximum value of item we can have is 160.00 from the given capacity of sack.
        Expected Time Complexity : O(n log n)
        Expected Auxilliary Space: O(1)
     * 
     */
}




/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/



// class Solution {
//     // Function to get the maximum total value in the knapsack.
//     double fractionalKnapsack(int w, Item arr[], int n) {
//         double ans=0;
//         // Arrays.sort(arr, new Comparator<Object>() {              
//         //     @Override
//         //     public int compare(Object a, Object b) {
//         //         double ratioA = (double) a.value / a.weight;
//         //         double ratioB = (double) b.value / b.weight;
//         //         return Double.compare(ratioB, ratioA);
//         //     }
//         // });
//          Arrays.sort(arr, (a, b) -> Double.compare(                 // either way is fine
//             (double)b.value / b.weight, 
//             (double)a.value / a.weight
//         ));
//         for(int i =0; i<arr.length; i++){
//             int min = Math.min(w,arr[i].weight);
//             ans +=((double)arr[i].value/arr[i].weight)*min;
//             w-=min;
//             if(w==0) break;
//         }
        
//         return ans;
        
//     }
// }