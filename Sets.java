import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    
    public static void main(String[] args) {
        
        Set<String> names =new HashSet <>(); //Set is also an interface in java

        System.out.println(names.add("Rahul")); //will print true
        System.out.println(names.add("kiran"));
        System.out.println(names.add("dr. strange"));
        names.add("golu");
        System.out.println(names.add("golu")); //will print false as it has been already added previously

        CollectionUtility.print(names); //remember set is unordered so it may print unordered names
        System.out.println(" the size is :"+names.size());
        System.out.println(names.contains("golu")); //will print true
        System.out.println(names.isEmpty()); //will print false

       



    }
}
