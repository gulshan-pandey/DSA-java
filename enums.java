enum CoffeeSize {
    SMALL(10), MEDIUM(20), LARGE(30);   //instantiation of enums

    private int size;

    CoffeeSize(int size) {   //constructor of enums that takes the size ie 10, 20, 30
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}

class Coffee {
    private CoffeeSize size;         // this will be of type CoffeeSize

    public Coffee(CoffeeSize size) {
        this.size = size;
    }

    public CoffeeSize getSize() {
        return this.size;       // returning the type of coffeesize
    }
}

public class enums {
    public static void main(String[] args) {
        Coffee c1 = new Coffee(CoffeeSize.SMALL);
        Coffee c2 = new Coffee(CoffeeSize.LARGE);

        System.out.println("First coffee size: " + c1.getSize());    // Small
        System.out.println("It's volume: " + c1.getSize().getSize());  //10

        System.out.println("Second coffee size: " + c2.getSize());    // large
        System.out.println("It's volume: " + c2.getSize().getSize());  //30
    }
}
