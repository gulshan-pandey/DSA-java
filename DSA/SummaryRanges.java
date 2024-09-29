package DSA;
public class SummaryRanges {
    

    /**
     * You are given a sorted unique integer array nums.

        A range [a,b] is the set of all integers from a to b (inclusive).

        Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

        Each range [a,b] in the list should be output as:

        "a->b" if a != b
        "a" if a == b
        

        Example 1:

        Input: nums = [0,1,2,4,5,7]
        Output: ["0->2","4->5","7"]
        Explanation: The ranges are:
        [0,2] --> "0->2"
        [4,5] --> "4->5"
        [7,7] --> "7"
        Example 2:

        Input: nums = [0,2,3,4,6,8,9]
        Output: ["0","2->4","6","8->9"]
        Explanation: The ranges are:
        [0,0] --> "0"
        [2,4] --> "2->4"
        [6,6] --> "6"
        [8,9] --> "8->9"
     * 
     */
}





// class Solution {
//     public List<String> summaryRanges(int[] nums) {
//         var ans = new ArrayList<String>();
//         if(nums.length==0) return ans;
//         int f = nums[0];
//         int l=nums[0];

//         for(int i=1; i<nums.length; i++){

//             if(nums[i-1]+1 == nums[i]){
//                 l = nums[i];
//             }else{
//                 if(l==f){
//                     ans.add(Integer.toString(l));
                    
//                 }else{
//                     ans.add(Integer.toString(f)+"->"+Integer.toString(l));
//                 }
//                 l=f=nums[i];
//             }

//         }

//         //  Add the final range
//         if(l==f){
//              ans.add(Integer.toString(l));
//         }else{
//              ans.add(Integer.toString(f)+"->"+Integer.toString(l));
//         }
//         return ans;
//     }
// }




// class Solution {
//     public List<String> summaryRanges(int[] nums) {
//         List<String> ans = new ArrayList<>();

//         for(int i = 0; i < nums.length; i++) {
//             int start = nums[i];

//             while(i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
//                 i++;
//             }

//             if(start != nums[i]) {
//                 ans.add(String.format("%d->%d", start, nums[i]));
//             } else {
//                 ans.add(String.valueOf(start));
//             }
//         }
        
//         return ans;
//     }
// }





//most optimal


// class Solution {
//     public List<String> summaryRanges(int[] nums) {
//         //expand the window if the right one can be added
//         //update ans when the right one can't be added
//         List<String> list = new ArrayList<>();
//         int l = 0;
//         for (int r = 0; r < nums.length; r++) {
//             StringBuilder sb = new StringBuilder();
//             while (r + 1 < nums.length && nums[r + 1] == nums[r] + 1) {
//                 r++;
//             }
               
//             if (l == r) {
//                 sb.append(nums[l]);
//             } else {
//                 sb.append(nums[l]).append("->").append(nums[r]);
//             }
//             list.add(sb.toString());
//             l = r + 1;
//         }
//         return list;
//     }
// }