package DSA;

public class FindTheOriginalArrayOfPrefixXor {
    
    /*  
     pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].


Input: pref = [5,2,0,3,1]
Output: [5,7,2,3,2]
Explanation: From the array [5,7,2,3,2] we have the following:
- pref[0] = 5.
- pref[1] = 5 ^ 7 = 2.
- pref[2] = 5 ^ 7 ^ 2 = 0.
- pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
- pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
Example 2:

Input: pref = [13]
Output: [13]
Explanation: We have pref[0] = arr[0] = 13.
     */
}




class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length==1) return new int[] {pref[0]};
        int []arr = new int[pref.length];
        arr[0] = pref[0];
        for(int i=0;i<pref.length-1;i++){
            arr[i+1]= (pref[i] ^ pref[i+1]);
        }
        return arr;
    }
}

