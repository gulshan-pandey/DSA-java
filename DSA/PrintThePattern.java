package DSA;

public class PrintThePattern {
    /**
     * You are given a number n. You need to print the pattern for the given value of n.

        For n = 2 the pattern will be 
        2 2 1 1
        2 1

        For n = 3 the pattern will be 
        3 3 3 2 2 2 1 1 1
        3 3 2 2 1 1
        3 2 1

        Note: Instead of printing a new line print a "$" without quotes. After printing the total output, end of the line("$") is expected.
     * 
     */
}


class GfG {
    void printPat(int n) {
        // Your code here
       for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(j +" ");
                    
                }
            }
            System.out.print("$");
        }
    }
}
