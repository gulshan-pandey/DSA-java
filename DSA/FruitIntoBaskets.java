package DSA;

import java.util.HashMap;

public class  FruitIntoBaskets {
    
    /*
     * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

        You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
        Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
        Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
        Given the integer array fruits, return the maximum number of fruits you can pick.

        
        Example 1:

        Input: fruits = [1,2,1]
        Output: 3
        Explanation: We can pick from all 3 trees.


        Example 2:

        Input: fruits = [0,1,2,2]
        Output: 3
        Explanation: We can pick from trees [1,2,2].
        If we had started at the first tree, we would only pick from trees [0,1].


        Example 3:

        Input: fruits = [1,2,3,2,2]
        Output: 4
        Explanation: We can pick from trees [2,3,2,2].
        If we had started at the first tree, we would only pick from trees [1,2].
        


     */
}






// class Solution {                                  // brute force solution exceeds time limit
//     public int totalFruit(int[] fruits) {
//         int length=0;
//         if(fruits.length ==1) return 1;
//         if(fruits.length ==2) return 2;
//         for(int i =0 ; i<fruits.length; i++){
//         Set<Integer> set = new HashSet<>();
//              for(int j =i; j<fruits.length; j++){
//                 set.add(fruits[j]);

//                 if(set.size()<=2){
//                    length = Math.max(length,j-i+1);
//                 }else break;

//              }
//         }

//         return length;
//     }
// }



// class Solution {                                     //this solution is yet to be revised
//     public int totalFruit(int[] fruits) {
//         if (fruits.length == 1) return 1;
//         if (fruits.length == 2) return 2;
        
//         int temp1 = fruits[0];
//         int temp2 = -1; // Use -1 to represent an uninitialized second type
//         int start = 0;
//         int end = 0;
//         int maxLength = 0;
        
//         while (end < fruits.length) {
//             if (fruits[end] == temp1 || fruits[end] == temp2 || temp2 == -1) {
//                 if (temp2 == -1 && fruits[end] != temp1) {
//                     temp2 = fruits[end];
//                 }
//                 maxLength = Math.max(maxLength, end - start + 1);
//             } else {
//                 start = end - 1;
//                 while (start > 0 && fruits[start - 1] == fruits[start]) {
//                     start--;
//                 }
//                 temp1 = fruits[start];
//                 temp2 = fruits[end];
//                 maxLength = Math.max(maxLength, end - start + 1);
//             }
//             end++;
//         }
        
//         return maxLength;
//     }
// }




class Solution {           
    public int totalFruit(int[] fruits) {
        int left =0; 
        int right =0;
        int length =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while (right<fruits.length){
            map.put(fruits[right],map.getOrDefault(fruits[right],0) +1);
            while(map.size()==3){
                map.put(fruits[left],map.get(fruits[left])-1);
                if((map.get(fruits[left])==0)){
                    map.remove(fruits[left]);
                }
                left++;
            }
            length = Math.max(length,right-left+1);
            right++;
        } 
        return length;
    }
}
  

