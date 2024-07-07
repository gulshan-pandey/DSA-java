package DSA;

public class FindXorOfTwice {
    
}


// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
//         Set set = new HashSet();
//         int ans = 0;
//         List <Integer>arr = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (set.contains(nums[i])) {
//                 arr.add(nums[i]);
//             } else
//                 set.add(nums[i]);
//         }
//         if (arr.size() == 0) {
//             return 0;
//         } else {
//             for (int a : arr) {
//                 ans = (ans ^ a);
//             }
//             return ans;
//         }
//     }
// }


// short solution

// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
        
//         Set<Integer> set = new HashSet<>();
//         int ans =0;
//         for(int i =0; i<nums.length; i++){
//             if(!set.add(nums[i])){
//                 ans= (ans ^ nums[i]);
//             }
//         }
//         return ans;
//     }
// }