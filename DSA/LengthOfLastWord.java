package DSA;
public class LengthOfLastWord {
 
}



//optimal approaches!

// class Solution {
//     public int lengthOfLastWord(String s) {
//         int count =0;
//     for(int i=s.length()-1; i>=0;i--){
//         if(s.charAt(i)!=' '){
//             count++;
//         }
//         if(count>0 && s.charAt(i)==' '){
//             return count;
//         }

//     }
//         return count;
//     }
// }



//class Solution {
//    public int lengthOfLastWord(String s) {
//        String[] arr = s.split(" ");
//        String value =arr[arr.length- 1];
//        return value.length();
//    }
//}




// class Solution {
//     public int lengthOfLastWord(String s) {
//         int count =0; 
//         for(int i =s.length()-1; i>=0; i--){
//             if(count==0&& s.charAt(i)==' ') continue;
//             else if(count!=0 && s.charAt(i)==' ') break;
//             else count++;

            
//         }
//         return count;
//     }
// }



// class Solution {
//     public int lengthOfLastWord(String s) {
//         s=s.trim();
//         int count=0;
//         for(int i=s.length()-1; i>=0; i--){
//             if(s.charAt(i) == ' '){
//                 return count;
//             }
//             else{
//                 count++;
//             }
//         }
//         return count;
//     }
// }