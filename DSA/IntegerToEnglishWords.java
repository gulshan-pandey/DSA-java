package DSA;
public class IntegerToEnglishWords {
    
    /*
     * Convert a non-negative integer num to its English words representation.

 

        Example 1:

        Input: num = 123
        Output: "One Hundred Twenty Three"
        Example 2:

        Input: num = 12345
        Output: "Twelve Thousand Three Hundred Forty Five"
        Example 3:

        Input: num = 1234567
        Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
     */
}



class Solution {
    public String numberToWords(int num) {

        var sb = new StringBuilder();
        if(num==0) return "Zero";
       
       if(num>=1000000000){
         sb.append(word(num/1000000000)).append(" Billion ");
         num%=1000000000;
       }
       if(num>=1000000){
         sb.append(ThreeDigitNumber(num/1000000)).append(" Million ");
         num%=1000000;
       }
       if(num>=1000){
         sb.append(ThreeDigitNumber(num/1000)).append(" Thousand ");
         num%=1000;
       }
        if(num>=0){
            sb.append(ThreeDigitNumber(num));
        }


        return sb.toString().trim();


    }


    public String word(int num) {
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Eleven";
            case 12 -> "Twelve";
            case 13 -> "Thirteen";
            case 14 -> "Fourteen";
            case 15 -> "Fifteen";
            case 16 -> "Sixteen";
            case 17 -> "Seventeen";
            case 18 -> "Eighteen";
            case 19 -> "Nineteen";
            case 20 -> "Twenty";
            case 30 -> "Thirty";
            case 40 -> "Forty";
            case 50 -> "Fifty";
            case 60 -> "Sixty";
            case 70 -> "Seventy";
            case 80 -> "Eighty";
            case 90 -> "Ninety";
            case 100 -> "One Hundred";
            case 1000 -> "One Thousand";
            case 100000 -> "One Million";
            case 1000000000 -> "One Billion";
            default -> "jfew";

        };
    }


    public String ThreeDigitNumber(int num){
        var s = new StringBuilder();
        if(num>=100){
            s.append(word(num/100)).append(" Hundred ");
            num%=100;
        }
        if(num>=20){
            s.append(word(num-num%10)).append(" ");
            num%=10;
        }
        if(num>0){
             s.append(word(num)).append(" ");
        }
        return s.toString().trim();
    }
   
}  