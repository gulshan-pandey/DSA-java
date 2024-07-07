package DSA;
public class StringReverse {
    

   
}




class solution{
    String reverseWords(String s) {
        String[] words= s.trim().split("\\s+");         // \\s+ means space
        String rev="";
        for(int i=words.length-1;i>=0;i--){
            if(i==0){
                rev+=words[i];
            }
           else rev+=words[i]+" ";
       } 
       return rev;
    }
}    




//recursion method

// public static String reverseString(String str) {
//     if (str.isEmpty()) {
//         return "";
//     }
//     return reverseString(str.substring(1)) + str.charAt(0);
// }

// public static void main(String[] args) {
//     String strr= "Hello world";

//     System.out.println(reverseString(strr));
// }








//optimal approach using string builder
// class Solution {
    //     public String reverseWords(String s) {
        //         String[] words = s.trim().split("\\s+");
//         StringBuilder rev = new StringBuilder();
        
//         for (int i = words.length - 1; i >= 0; i--) {
//             rev.append(words[i]);
//             if (i > 0) {
//                 rev.append(" ");
//             }
//         }
        
//         return rev.toString();
//     }
// }


