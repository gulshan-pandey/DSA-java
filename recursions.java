//wap for calculating factorial

public class recursions {

    static int fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }

   //iteratively 

    static int factIterative(int y) {
        if (y == 0 || y == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= y; i++) {
                product = product * i;
            }
            return product;
        }
    }

    //WAP to find febonnaci series using recursion

    static void febo(int n){
        int x=0;
        int y= 1;
        for(int i=1;i<=n;i++){
            
            int temp=x+y;
            System.out.println(x);
            x=y;
            y=temp;


        }
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println("the factorial is : " + fact(n));
        System.out.println("the factorial by using iterative approach is : " + factIterative(n));
    
        int m=7;
        febo(m);
    }
}
