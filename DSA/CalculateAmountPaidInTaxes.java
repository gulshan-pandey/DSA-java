package DSA;

public class CalculateAmountPaidInTaxes {
    /*
     * You are given a 0-indexed 2D integer array brackets where brackets[i] = [upperi, percenti] means that the ith tax bracket has an upper bound of upperi and is taxed at a rate of percenti. The brackets are sorted by upper bound (i.e. upperi-1 < upperi for 0 < i < brackets.length).
     * 
     * Input: brackets = [[3,50],[7,10],[12,25]], income = 10
     * Output: 2.65000
     * Based on your income, you have 3 dollars in the 1st tax bracket, 4 dollars in the 2nd tax bracket, and 3 dollars in the 3rd tax bracket.The tax rate for the three tax brackets is 50%, 10%, and 25%, respectively.In total, you pay $3 * 50% + $4 * 10% + $3 * 25% = $2.65 in taxes.
     * 
     * 
     * Input: brackets = [[1,0],[4,25],[5,50]], income = 2
     * Output: 0.25000
     * Based on your income, you have 1 dollar in the 1st tax bracket and 1 dollar in the 2nd tax bracket.The tax rate for the two tax brackets is 0% and 25%, respectively.In total, you pay $1 * 0% + $1 * 25% = $0.25 in taxes.
     * 
     * 
     * Input: brackets = [[2,50]], income = 0
     * Output: 0.00000
     * You have no income to tax, so you have to pay a total of $0 in taxes.
     * 
     */
}




class Solution {
    public double calculateTax(int[][] brackets, int income) {

        double sum =0;
        int prev=0;
        for (int i = 0; i < brackets.length; i++) {
            int current = brackets[i][0];
            double rate =brackets[i][1]/100.0;

            if(current>=income){
                sum+=(income-prev) * rate;
                break;
            }else{
                sum+= (current-prev)* rate; 
                prev = current;
            }
        
          
        }
        return sum;
    }
}

