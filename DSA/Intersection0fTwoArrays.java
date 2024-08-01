package DSA;

public class Intersection0fTwoArrays {
    
    /*
     * Given two integer arrays nums1 and nums2, return an array of their  intersection. Each element in the result must be unique and you may return the result in any order.
     * 
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
       Output: [2]



     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
       Output: [9,4]
       Explanation: [4,9] is also accepted.


     */
}


// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> h1 = new HashSet<>();
//         HashSet<Integer> h2 = new HashSet<>();

//       for(int elem : nums1){
//         h1.add(elem);
//       }
//       for(int elem : nums2){
//         h2.add(elem);
//       }
//         h1.retainAll(h2);   // to retain only the elements that are also present in another collection
        
//         int[] arr = new int[h1.size()];
//         int i =0;
//         for(int elem :h1){
//             arr[i]= elem;
//             i++;
//         }
//         return arr;
//     }
// }





//optimized


// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();

//         for (int x : nums1)
//             set1.add(x);
        
//         for (int x : nums2) {
//             if (set1.contains(x))
//                 set2.add(x);
//         }
        
//         int[] res = new int[set2.size()];
//         int i = 0;
//         for (int x : set2) {
//             res[i] = x;
//             i++;
//         }
//         return res;
//     }
// }