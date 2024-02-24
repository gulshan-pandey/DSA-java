import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    

    public static void main(String[] args) {
        
        List <Integer> numList = new ArrayList<>();
        
        
        numList.add(5);
        numList.add(10);
        numList.add(7);
        numList.add(8);
        numList.add(-76);
        numList.add(9);

        System.out.println(numList); //we cannot print the elements like this in conventional array

       Collections.sort(numList); //it is the Collention Interface's static method to sort things ,obviously it will not work on sets!
       CollectionUtility.print(numList); //after sorting happened


       //in order to make your list unmodifiable
       List<Integer> unchangable = Collections.unmodifiableList(numList);


       System.out.println(unchangable); // this list is unmodifiable/unchangable

      // unchangable.add(78); //throws Exception





    }

}
