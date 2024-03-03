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

 System.out.println(map.keySet());  //will print all the keys 

 System.out.println(map.values());  // will print all the values

 System.out.println(map.size()); 

 System.out.println(map.get("addy"));  // will give the value of the corresponding key

 System.out.println(map.containsKey("raja")); //checks if the map contans the perticular key

 System.out.println(map.remove("john"));  //will remove the perticular record

 System.out.println(map.size()); //the size will be reduced by 1

 //to get all the values of the map
System.out.println("all the values in the map is : ");
 for (String  key : map.keySet()) {
    System.out.printf("%s : %d \n" ,key,map.get(key));
 }
  



  }
}