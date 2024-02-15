
import java.util.Scanner;
public class FoodOrder {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		char wantToAddFoodItem = 'Y';
		int unitPrice = 10;
		int quantity = 1;
		while (wantToAddFoodItem == 'Y' || wantToAddFoodItem =='y' ) {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add more food items to your order? Y or N");
			wantToAddFoodItem = sc.next().charAt(0); // Accepting input from the customer
           
		}
		if(wantToAddFoodItem =='n' || wantToAddFoodItem =='N'){
			System.out.println("your total amount is : " + totalCost);
		}



	}
}

