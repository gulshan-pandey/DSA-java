package DSA;
public class BasicMaths {

    ///////////////////////gcd//////////////////////////////////
    public static int gcd(int a, int b){       // greatest common dinominator
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }


    //{ optimized solution }
class Solution {
    public static int efficientgcd(int a, int b) {
        // code here
        if(b==0) return a;
        else return gcd(b,a%b);     // if b is> a then it will just reverse the numbers          example   gcd(12,15) -> gcd(15,12) -> gcd(12,3) -> gcd(3,0) -> 3      example2  gcd(10,15) -> gcd(15,10) -> gcd(10 ,5) -> gcd(5,0) -> 5

    }
}
        

/////////////////////////////LCM///////////////////////////////
    public static int lcm(int a, int b){       // least common multiple
        int res = Math.max(a,b);
        while(res%a!=0 || res%b!=0){
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
          System.out.println(gcd(8,6));
          System.out.println(Solution.efficientgcd(8,6));

    }
}