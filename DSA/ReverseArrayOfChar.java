package DSA;

public class ReverseArrayOfChar {

    // a^b=c  => a^c=b  => b^c=a             basic principal of xor
}


//brute force

// class Solution {
//     public void reverseString(char[] s) {
//       int left =0;
//       int right = s.length -1;
//       while(right>left){
//         char temp = s[left];
//         s[left]= s[right];
//         s[right] = temp;

//         left++;
//         right--;

//       }
//       System.out.println(s)
//     }
// }





//optimized

// class Solution {
//     public void reverseString(char[] s) {
//         for (int i = 0; i < s.length / 2; i++) {
//             int j = s.length - 1 - i;
//             s[i] ^= s[j];
//             s[j] ^= s[i];
//             s[i] ^= s[j];
//         }
//     }
// }


