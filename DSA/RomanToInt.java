package DSA;
import java.util.HashMap;
import java.util.Map;

class RomanToInt {
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

    public static void main(String[] args) {
       System.out.println(romanToInt("IV")); 
    }
}