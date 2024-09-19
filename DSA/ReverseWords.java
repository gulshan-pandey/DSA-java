package DSA;
public class ReverseWords {
    
    /**
     * Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

        Note: The last character has not been '.'. 

        Examples :

        Input: str = i.like.this.program.very.much
        Output: much.very.program.this.like.i
        Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
        Input: str = pqr.mno
        Output: mno.pqr
        Explanation: After reversing the whole string , the input string becomes mno.pqr
     */
}



// class Solution {
//     String reverseWords(String str) {
//         // code here
//         String[] temp = str.split("\\.");
//         int i=0;
//         int j=temp.length-1;
//         while(j>i){
//             String t =temp[i];
//             temp[i]=temp[j];
//             temp[j]=t;
//             i++;
//             j--;
//         }
//         return String.join(".",temp);
//     }
// }



// class Solution {
    //     String reverseWords(String str) {
        //         List<String> words = new ArrayList<>(Arrays.asList(str.split("\\.")));
//         Collections.reverse(words);
//         return String.join(".", words);
//     }
// }



// class Solution {
//         String reverseWords(String str) {
//                 String[] words = str.split("\\.");
//                 Stack<String> stack = new Stack<>();
        
//                 for (String word : words) {
//             stack.push(word);
//         }
        
//         StringBuilder reversed = new StringBuilder();
//         while (!stack.isEmpty()) {
//             reversed.append(stack.pop());
//             if (!stack.isEmpty()) {
//                 reversed.append(".");
//             }
//         }

//         return reversed.toString();
//     }
// }







// class Solution {
    //     String reverseWords(String str) {
        //         int dotIndex = str.lastIndexOf('.');
        //         if (dotIndex == -1) {
            //             return str;
            //         }
        
//         return str.substring(dotIndex + 1) + "." + reverseWords(str.substring(0, dotIndex));
//     }
// }







// class Solution {
//     String reverseWords(String str) {
//         return Arrays.stream(str.split("\\."))
//                     .collect(Collectors.collectingAndThen(
//                         Collectors.toList(),
//                         list -> {
//                             Collections.reverse(list);
//                             return String.join(".", list);
//                         }
//                     ));
//     }
// }