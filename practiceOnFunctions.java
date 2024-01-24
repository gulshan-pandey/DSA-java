public class practiceOnFunctions {
    // tables
    static void tables(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + n * i);
        }
    }

    // for printing the star parren upto n rows
    static void star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // wap to print sum of first n recursive functions
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // printing the stars in reverse
    static void revStar(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // Alternatively
    // static void revStar(int n) {
    // for(int i=1; i<=n;i++){
    // for(int j=n ; j>=i;j--){
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // }

    // question to print febonnacci series
    static void febo(int n) {
        int a = 0;
        int b = 1;
        for (int i = n; i >= 1; i--) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    // WAP to print the nth term of the febonnaci series
    static int fib(int n) {

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        // if (n==1 || n==2){
        // return n-1;
        // }
        else
            return fib(n - 1) + fib(n - 2);
    }
    //VARARGS----------------------
    static float avg(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (float) sum / arr.length;
    }

   //WAP to print the stars in a recursive manner in ascending order
    static void printStar(int n){
        if(n>0){
           printStar(n-1);
           for(int i=0;i<n;i++){
               System.out.print("*");
           }
           System.out.println();
   
        }
           
       }

       //celcius to farenhite
       static String celcuis(int x){

        return ((x*(9.0/5))+ 32) + "f" ;

      }
      

      //sum of first n natural numbers using iteration
      static int summm(int n){
        int s=0;
       for(int i=0; i<=n;i++){
           s+=i;
       }
       return s;


   }


    public static void main(String[] args) {

        tables(9);

        // printing 10 star rows
        star(10);

        System.out.println(sum(5));

        revStar(8);

        febo(7);
        System.out.println("\n\n");

        System.out.println(fib(7)); // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

        System.out.println(avg(1,2,4,2,45,2,6,7));

                
        printStar(4); //printStar(3) +4times star and new line
        //   printSatr(2) + 3time star and a new line+ 4times star and anew line
        //printStar(1) + 2time star and a new line + 3time star and a new line +4 time star and a new line
    

        System.out.println(celcuis(25));


        System.out.println(summm(55));
    }

}
