package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;


class functionalOnly {
    
    //comparator is also an functional interface
    public static void main(String[] args) {
        Runnable runnable = () ->{          // runnable is a functional interface, function interface can act as a type of lambda expression
            for(int i =0; i <20; i++){
                System.out.println("hello world");
            }
        };

        runnable.run();

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Collections.sort(list,(a,b) -> b-a);            // sort method takes the list and a comparator whcih is an functional interface and though we can define it into lambda

        System.out.println(list);





        //Tree set which is a squenced version of the hashset... ti prints the elements in sorted order by default
        Set<Integer> set = new TreeSet<>();
        set.add(42);
        set.add(53);
        set.add(63);
        set.add(22);
        set.add(0);

        System.out.println("\n\n using treeset before sorting :" +set);

       Set<Integer> s = new TreeSet<>((a, b) -> a + b);
        s.add(42);
        s.add(53);
        s.add(63);
        s.add(22);
        s.add(0);

        System.out.println(" using treeset after sorting :" +s);



          //Tree map which is a squenced version of the hashset... it prints the elements in sorted order by default

          Map<Integer,String> m = new TreeMap<>();
          m.put(1,"z");
          m.put(2,"y");
          m.put(3,"x");
          m.put(4,"w");
          m.put(5,"v");
          
          System.out.println("\n\n using the default order of the treeMap: " + m);


          Map<Integer,String> mm = new TreeMap<>((a,b) -> b-a);
          mm.put(1,"z");
          mm.put(2,"y");
          mm.put(3,"x");
          mm.put(4,"w");
          mm.put(5,"v");
          
          System.out.println("by applying the comparator in treeMap: " + mm);



        // sorting the custom class of list
        System.out.println("\n\n");


        List<Stud> listOfStu = new ArrayList<>();

        listOfStu.add(new Stud(1,"amir"));
        listOfStu.add(new Stud(2,"raj"));
        listOfStu.add(new Stud(3,"vipul"));
        listOfStu.add(new Stud(4,"rohan"));
        listOfStu.add(new Stud(5,"sherya"));

        Collections.sort(listOfStu,(a,b) -> a.id - b.id);                   // earlier the comparator used to take the 2 integer objects but now it takes the object of the custom class(student) and sort on the basis of there id
        System.out.println(listOfStu); 



      
    }
}

class Stud {
    int id;
    String name;

    public Stud(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

  
}
 