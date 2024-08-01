package DSA;

public class findXorOfEveryIndex {
    // You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:

    // pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
}





// class Solution {
//     public int[] findArray(int[] pref) {
//         if(pref.length==1) return new int[] {pref[0]};
//         int []arr = new int[pref.length];
//         arr[0] = pref[0];
//         for(int i=0;i<pref.length-1;i++){
//             arr[i+1]= (pref[i] ^ pref[i+1]);
//         }
//         return arr;
//     }
// }

