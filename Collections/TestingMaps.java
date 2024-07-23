package Collections;
import java.util.*;

public class TestingMaps {


  public static void main(String[] args) {
    
 Map<String,Integer> map =new HashMap<>(); //map is also an interface ,and takes 2 datatypes for key and value

 //putting the keys and values in map

 map.put("mohan", 65);
 map.put("raju", 45);
 map.put("john", 62);
 map.put("nikhil", 85);
 map.put("monty", 68);
 map.put("rahul", 95);
 map.put("addy", 99);

 map.replace("addy ", 100);   // for replacement of values { put and replace } both methods can be used

 System.out.println("map.KeySet() : " + map.keySet());  //will print all the keys 

 System.out.println("map.values() : " + map.values());  // will print all the values

 System.out.println(" map.size() : " + map.size()); 

 System.out.println("getting the marks of addy : " +map.get("addy"));  // get method will give the value of that key

 System.out.println("map.containsKey(\"raju\") : "  + map.containsKey("raju")); //checks if the map contanis the perticular key

 System.out.println(" map.remove(\"john \" ) : " + map.remove("john"));  //will remove the perticular record

 System.out.println(" map.size() : " +map.size()); //the size will be reduced by 1

 var keys = map.keySet();
 System.out.println(map.keySet());   // returns the set of keys


 //to get all the values of the map
System.out.println("\n\n all the values in the map is : ");
 for (String  key : map.keySet()) {
    System.out.printf("%s : %d \n" ,key,map.get(key));
 }
System.out.println("\n\n");



  System.out.println("iterating to the map: ");
  for(var e : map.entrySet()){   // at the place of var ->  Map.Entry<String,Integer> e : map.entrySet() can be used
    System.out.printf("%s : %d     " ,e.getKey(),e.getValue());    // we can specifically print the keys or values by using entrySet()... also  the methods like getKey() and getValue() are only in Entry interface
  }
  
  System.out.println("\n\n");


  for(var e : map.entrySet()){
    System.out.print(e + "  ");    // printing each entries
  }
  



  Set<Map.Entry<String, Integer>> entry = map.entrySet();
  System.out.println("\n\n"+entry);



  System.out.println("\n\n iterating to the map KEYS BY USING ITERATOR: ");

  Iterator <String> iter = map.keySet().iterator();

  while(iter.hasNext()){
    System.out.print(iter.next() + "     ");
  }




  

  


 // quest: WAP to ask the user for country name to get its capital and if not present ,answer accordingly

 Map <String,String> countrymap = new HashMap <> ();

 countrymap.put("India","New Delhi");
 countrymap.put("China","Beijing");
 countrymap.put("Pak","islamabad");
 countrymap.put("England","london");
 countrymap.put("France","paris");
 countrymap.put("Nepal","kathmandu");

 Scanner sc = new Scanner(System.in);
 System.out.println("\n\n\n enter the name of the country to get its capital: ");
 String name = sc.next();

 if(countrymap.containsKey(name)){
    System.out.printf("the capital of %s is :  %s ",name,countrymap.get(name));
 }
 else System.out.printf("sorry I dont have the capital of %s",name);


/* Shorthand
 * System.out.println(countrymap.getOrDefault(name, "capital not found"));
 */






  }
}