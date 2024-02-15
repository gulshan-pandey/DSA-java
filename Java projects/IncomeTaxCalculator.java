import java.util.Scanner;

public class IncomeTaxCalculator {
    
    public static void main(String[] args) {
        
        // calculate the income tax
        // as 2.5L to 5L 5% 5L to 10L 20% abobve 10L 30%
        // note there is no tax below 2.5L

        System.out.println("\n\n INCOME TAX CALCULATOR ");

        System.out.println("enter the amount you earn per annum");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        float tax = 0;
        if (amt <= 250000) {
            System.out.println("you will not be charged a single penney as a tax as u earn is less than 2.5Lpa");
        } else if (amt > 250000 && amt < 500000) {
            tax = tax + (amt - 250000) * 0.05f;
            System.out.println("ur tax is : " + tax);
        } else if (amt > 500000 && amt < 1000000) {
            tax = tax + (500000 - 250000) * 0.05f;
            tax = tax + (amt - 500000) * 0.2f;

            System.out.println("ur tax is : " + tax);
        } else if (amt > 100000) {
            tax = tax + (500000 - 250000) * 0.05f;
            tax = tax + (1000000 - 500000) * 0.2f;
            tax = tax + (amt - 1000000) * 0.3f;
            System.out.println("yourr tax is : " + tax);
        }

        sc.close();
    }
}
