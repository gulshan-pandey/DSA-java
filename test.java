import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // Using List.replaceAll() to update each element
        numbers.replaceAll(num -> num * 2);

        // Printing the updated list
        numbers.forEach(System.out::println);
    }
}
