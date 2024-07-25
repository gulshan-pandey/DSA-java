import java.util.Enumeration;
import java.util.Vector;

public class Enumeratn {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }

        System.out.println(vector);

        Enumeration<Integer> enumer = vector.elements();

        while(enumer.hasMoreElements()){
            String elem = enumer.nextElement().toString();
            System.out.print(elem+ " ");
        }


    }
}
