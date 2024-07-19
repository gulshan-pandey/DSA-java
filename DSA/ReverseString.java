package DSA;

public class ReverseString {
    
}



class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int j = s.length - 1 - i;
            if (i != j) {
                s[i] ^= s[j];
                s[j] ^= s[i];
                s[i] ^= s[j];
            }
        }
    }
}



// using temp variable



// class Solution {
//     public void reverseString(char[] s) {
//         int f=0;
//         int l=s.length-1;
//         for(int i=0;i<s.length;i++){
//             if(f<l){
//                 char temp=s[f];
//                 s[f]=s[l];
//                 s[l]=temp;
//             }
//             f++;
//             l--;
//         }
//     }
// }