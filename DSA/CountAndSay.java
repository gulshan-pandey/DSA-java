package DSA;

import java.util.Arrays;

public class CountAndSay {
    
    /*
     * Input: n = 4
     * Output: "1211"
     * Explanation:

        countAndSay(1) = "1"
        countAndSay(2) = RLE of "1" = "11"
        countAndSay(3) = RLE of "11" = "21"
        countAndSay(4) = RLE of "21" = "1211"


     *Input: n = 1
     * Output: "1"
     * 
     */


     public static void main(String[] args) {
        char[] arr = new char[5];
        System.out.println(Arrays.toString(arr));
     }
}


//
//
//
//class Solution {
//    public String countAndSay(int n) {
//        if(n==1){
//            return "1";
//        }
//        StringBuilder sb = new StringBuilder();
//        String say = countAndSay(n-1);
//
//        int count=1;
//        for(int i =1; i<=say.length();i++){
//            if(i<say.length() && say.charAt(i)==say.charAt(i-1)){
//                count++;
//            }else{
//                sb.append(count).append(say.charAt(i-1));
//
//                count=1;
//            }
//
//        }
//        return sb.toString();
//    }
//}







//another way


// class Solution {
//     public String countAndSay(int n) {
//         if (n == 1) {
//             return "1";
//         }
//         StringBuilder sb = new StringBuilder();
//         String say = countAndSay(n - 1);
        
//         int count = 1;
//         for (int i = 1; i < say.length(); i++) {
//             if (say.charAt(i) == say.charAt(i - 1)) {
//                 count++;
//             } else {
//                 sb.append(count).append(say.charAt(i - 1));
//                 count = 1; 
//             }
//         }
//         sb.append(count).append(say.charAt(say.length() - 1));
        
//         return sb.toString();
//     }
// }
