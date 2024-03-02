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

        System.out.println(numList); //we cannot print the elements like this in conventional array!

       Collections.sort(numList); //it is the Collention's static method to sort things ,obviously it will not work on sets!
       CollectionUtility.print(numList); //after sorting happened

       Collections.unmodifiableList(numList);
       //in order to make your list unmodifiable
       List<Integer> unchangable = Collections.unmodifiableList(numList); //creating new list which is unmodifiable


       System.out.println("the unchangable list is " + unchangable); // this list is unmodifiable/unchangable

      // unchangable.add(78); //throws Exception


      //creating a list shorthand
     
      List <Integer> list2 =new ArrayList<>();
      Collections.addAll(list2,2,3,3,45,5,77,9999999);
      System.out.println(list2);



     //finding max and min in the list
    
     int max = Collections.max(numList);

     int min = Collections.min(numList);
     System.out.println("max : " + max + "   min: " + min);
     

     //Reversing the list

    Collections.reverse(list2);
    System.out.println("reversed of the list is : " + list2);


    }

}
