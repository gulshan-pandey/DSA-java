package DSA;

public class CapitalizeTheTitle {
    /*
     * You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:
     * If the length of the word is 1 or 2 letters, change all letters to lowercase.
     * Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
     * 
     * 
     * Input: title = "capiTalIze tHe titLe"
     * Output: "Capitalize The Title"
     * 
     * Input: title = "i lOve leetcode"
     * Output: "i Love Leetcode"
     */


}



//
//
//class Solution {
//    public String capitalizeTitle(String title) {
//        StringBuilder sb = new StringBuilder();
//        String[] words = title.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length() > 2) {
//                sb.append(Character.toUpperCase(words[i].charAt(0))); // Capitalize the first character
//                sb.append(words[i].substring(1).toLowerCase()); // Append the rest of the word in lowercase
//            } else {
//                sb.append(words[i].toLowerCase()); // Append the whole word in lowercase
//            }
//            if (i < words.length - 1) {
//                sb.append(" "); // Add space between words
//            }
//        }
//        return sb.toString();
//    }
//}




//another approach

// class Solution {
//     public String capitalizeTitle(String title) 
//     {
//         String str[]=title.split(" ");
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<str.length;i++)
//         {
//             String s=str[i];
//             if(s.length()<=2)
//             {
//                 for(int j=0;j<s.length();j++)
//                 {
//                     char ch=Character.toLowerCase(s.charAt(j));
//                     sb.append(ch);
//                 }
//                 sb.append(" ");
//             }
//             else
//             {
//                 char ch=Character.toUpperCase(s.charAt(0));
//                 sb.append(ch);
//                 for(int j=1;j<s.length();j++)
//                 {
//                     sb.append(Character.toLowerCase(s.charAt(j)));
//                 }
//                 sb.append(" ");
//             }
//         }
//          // Remove the extra space at the end
//         // if (sb.length() > 0) {
//           //  sb.setLength(sb.length() - 1);
//         //}

//         return sb.toString().trim();
//     }
// }
