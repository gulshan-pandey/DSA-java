import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        int quantity;
        int cost = 0;
        float distance;
        float charge = 0;
        double totalCost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the online Restaurant");
        System.out.println("Enter the food type you want to eat: \"V\" for veg and \"N\" for nonveg");
        char foodType = sc.next().charAt(0);

        if (foodType == 'V' || foodType == 'N') {
            System.out.println("Enter the number of food items you want to order (minimum 1): ");
            int items = sc.nextInt();
            if (items < 1) {
                System.out.println("Invalid number of items.");
                return;
            }
            for (int i = 1; i <= items; i++) {
                System.out.println("Enter the name of food " + i + ": ");
                String name = sc.next();
                System.out.println("Enter quantity: ");
                quantity = sc.nextInt();
                System.out.println("Packing: " + name);
                if (foodType == 'V')
                    cost += quantity * 12;
                else
                    cost += quantity * 15;
            }
            System.out.println("Enter your distance in Kms: ");
            distance = sc.nextFloat();
            if (distance <= 3) {
                charge = 0 * distance;
            } else if (distance <= 6) {
                charge = 1 * distance;
            } else {
                charge = 2 * distance;
            }
            totalCost = charge + cost;
            System.out.println("Your total charge for " + (foodType == 'V' ? "Veg" : "Non-Veg") + " food is: " + totalCost);
        } else {
            System.out.println("Invalid food type entered.");
        }
    }
}
