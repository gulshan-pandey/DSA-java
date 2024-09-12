package DSA;
import java.util.HashMap;
import java.util.Map;


class Solution{
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        for (int i = 0; i < s.length(); i++) {
            String value = String.valueOf(s.charAt(i));       // of Character.toString(s.charAt(i));
            sum = sum + (map.get(value));
        }
        return sum;
    }


}



// more optimized

// class Solution {
//     public int romanToInt(String s) {
//         // Map of Roman numerals to their integer values
//         int[] values = new int[128];
//         values['I'] = 1;
//         values['V'] = 5;
//         values['X'] = 10;
//         values['L'] = 50;
//         values['C'] = 100;
//         values['D'] = 500;
//         values['M'] = 1000;

//             int total =0;
//             int prev =0;
//             for(int i =s.length()-1; i>=0; i--){
//                 int currval = values[s.charAt(i)];
                
//                 if(currval<prev) total-=currval;
//                 else{
//                     total+=currval;
//                     prev=currval;
//                 }
//             }
//             return total;
//     }
// }
