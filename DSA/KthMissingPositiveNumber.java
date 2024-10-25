package DSA;
public class KthMissingPositiveNumber {
    
    /**
     * 
     * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

        Return the kth positive integer that is missing from this array.

        

        Example 1:

        Input: arr = [2,3,4,7,11], k = 5
        Output: 9
        Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
        Example 2:

        Input: arr = [1,2,3,4], k = 2
        Output: 6
        Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
     * 
     */
}




//LINEAR SEARCH ---brute force

// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int current =1;
//         int count=0;
//         int i=0;
        
//         while(count<k){
            
//             if(i<arr.length && current==arr[i]){
//                 i++;
//             }else{
//                 count++;
//             }

//             if(count==k){
//                 return current;
//             }
//             current++;
//         }

//         return current;
//     }
// }





// BINARY SEARCH

class Solution {
   public int findKthPositive(int[] arr, int k) {
     
       int min =0;
       int max = arr.length-1;
       
       while(min<=max){
           int mid = min+(max-min)/2;
           int missing=arr[mid]-(mid+1);
           if(missing<k){
               min=mid+1;
           }else{
               max=mid-1;
           }
       }

           return min+k;
   }
}
