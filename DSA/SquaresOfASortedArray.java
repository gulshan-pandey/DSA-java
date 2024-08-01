package DSA;

public class SquaresOfASortedArray {
    /*
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     * 
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].

     */
}






// nlog(n) approach

// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int[] arr =new int[nums.length];
//         for(int i=0; i<nums.length;i++){

//           arr[i]=(int)Math.pow(nums[i],2);
//         }

//         Arrays.sort(arr);

//         return arr;
//     }
// }




//O(n) approach
//
//class Solution {
//    public int[] sortedSquares(int[] nums) {
//        int [] arr = new int[nums.length];
//        int left =0;
//        int right =nums.length-1;
//        int i=right;
//        while(right>=left){
//            if(Math.abs(nums[left])>Math.abs(nums[right])){
//                arr[i] = nums[left]*nums[left];
//                left++;
//            }else{
//                arr[i] =nums[right]*nums[right];
//                right--;
//            }
//            i--;
//        }
//        return arr;
//    }
//}