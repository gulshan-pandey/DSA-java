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




    /////////////PRIME CHECK////////////////////////
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){      // or   for( int i=2 ; i*i<= N ; i++)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }




    //////////////////count the number of primes using sieve of eranthosnes///////////
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];   // initialize n lenth array and all value to be true
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i < n; i++) {     //2 to sqrt(n) loop
            if (!isPrime[i]) {
                continue;       // if the value is already false, then continue
            }
            for (int j = i * i; j < n; j += i) {     //  note here j = i * i cuz it will convert index into false starting from the square of that number because the numbers less than them have already turned itno false by the previous numbers
                isPrime[j] = false;
            }
        }

        int count = 0; 
        for (int i = 2; i < n; i++) {         // count the number of true
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
    
    





    public static void main(String[] args) {
          System.out.println(gcd(8,6));
          System.out.println(Solution.efficientgcd(8,6));


          System.out.println("\n\n\n");
          int n = 30;

// Assuming this loop starts from i = 2
        for (int i = 2; i < n; i++) {
        System.out.println("i = " + i);
        for (int j = i * i; j < n; j += i) {
        System.out.println("  j = " + j);
            }
        }



    }
}