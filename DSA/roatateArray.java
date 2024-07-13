package DSA;

public class roatateArray {
    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    

    
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
}






// brute force           can give error for larger values

//class Solution {
//    public void rotate(int[] nums, int k) {
//        // k = k % nums.length;
//        for(int i =0; i<k;i++){
//            int temp = nums[nums.length-1];
//            for(int j=nums.length-1; j>0;j--){
//                nums[j] = nums[j-1];
//            }
//            nums[0]=temp;
//        }
//    }
//}





// better than brute force
// the idea is to reverse the whole array and then reverse the first k elements and then reverse the rest of the elements

// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         rev(nums);
//         revk(nums, k);
//         revrest(nums,k);


//     }

//     public void rev(int[] arr){
//         int left =0;
//         int right =arr.length-1;
//         while(right>left){
//             arr[left] = arr[left] + arr[right];
//             arr[right]= arr[left] - arr[right];
//             arr[left] = arr[left]- arr[right];
//             left++;
//             right--;
//         }
//     }

//     public void revk(int[] arr, int k){
   
//             int left =0;
//         int right = k-1;
//         while(right>left){
//             arr[left] = arr[left] + arr[right];
//             arr[right]= arr[left] - arr[right];
//             arr[left] = arr[left]- arr[right];
//             left++;
//             right--;
        
//         }
//     }

//     public void revrest(int[] arr, int k){
    
//             int left =k;
//             int right = arr.length -1;
//             while(right>left){
//                 arr[left] = arr[left] + arr[right];
//                 arr[right]= arr[left] - arr[right];
//                 arr[left] = arr[left]- arr[right];
//                 left++;
//                 right--;
            
//             }
//         }

// }








// optimised approach

// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         rev(nums, 0, nums.length - 1);
//         rev(nums, 0, k - 1);
//         rev(nums, k, nums.length - 1);
//     }

//     public void rev(int[] arr, int left, int right) {
//         while (right > left) {
//             int temp = arr[left];                   
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//     }
// }





// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         rev(nums,0,nums.length-1);
//         rev(nums,0, k-1);
//         rev(nums,k,nums.length-1);


//     }

//     public void rev(int[] arr, int left ,int right){
      
//         while(right>left){
//             arr[left] = arr[left] + arr[right];           // arithmatic reversal
//             arr[right]= arr[left] - arr[right];
//             arr[left] = arr[left]- arr[right];
//             left++;
//             right--;
//         }
//     }

// }






//another optimal approach

// class Solution {
//     public void rotate(int[] nums, int k) {

//         k = k % nums.length;

//         int[] temp = new int[nums.length];

//         int j = 0;

//         for (int i = nums.length - k; i < nums.length; i++) {

//             temp[j] = nums[i];
//             j++;

//         }

//         for (int i = 0; i < nums.length - k; i++) {

//             temp[j] = nums[i];
//             j++;

//         }
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = temp[i];
//         }

//     }
// }