package DSA;

public class SingleNumber {
    
}


//objective-- to find the non repeating unique number in the array


//optimal-- using xor operator-- it gives 1 if 2 bits are different , and gives 0 if 2 bits are same
// illustration

// [4, ...100
//  1, ...001
//  2, ...010
//  1, ...001
//  2, ...010
// ]

// by xoring all of them bit by bit we get the  unique non repeating number
// remember 0 ^ n = n      xor with any number with 0 is that number




// optimized

// class Solution {
//     public int singleNumber(int[] nums) {
           
//             int value = 0;     // as  n ^ 0 =n    {n= 1 or 0}
//            for(int i =0; i<nums.length;i++){
//             value = value ^ nums[i];
//            }
//            return value;
//     }
// }



//hashmap approach

// class Solution {
//     public int singleNumber(int[] nums) {
           
//           HashSet<Integer> value = new HashSet<>();

//            for(int i =0; i<nums.length;i++){
//             if(value.contains(nums[i])){
//                 value.remove(nums[i]);
//             }else{
//                 value.add(nums[i]);
//             }

//            }
           
//            return value.iterator().next();
//     }
// }


//another optimized but using sorting method approach

// class Solution {
//     public int singleNumber(int[] nums) {
       
//        Arrays.sort(nums);
//             if(nums.length==1){
//                 return nums[0];
//             }
//             if (nums[nums.length - 1] != nums[nums.length - 2]) {
//             return nums[nums.length - 1];
//         }
//         for(int i=1; i<nums.length-1; i+=2){
//             if(nums[i]!=nums[i-1]){
//              return nums[i-1];
//             }
//         }
//         return 0;
//     }

// }