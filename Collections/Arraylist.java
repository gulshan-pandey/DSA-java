package Collections;
import java.util.ArrayList;
import java.util.List;

public class Arraylist {

   
    public static void main(String[] args) {

       List strlist = new ArrayList(); //list is interface so its proper object cannot be formed
       
      //If we want the list to contain specific type of elements then put it in <> on left side these are called "generics" and these are only exist within compiletime just to help the developer!
      // List <String> strlist = new ArrayList<>();  

      

        strlist.add("Indian"); // this is the 0th index;
        strlist.add("league");// this is 1st index
       strlist.add(1);// it can add different datatypes as well if we dont mention <datatype> during object creation !!!
 
        System.out.println(strlist.get(0)); //accessing the element

        for(int i =0;i<strlist.size();i++){     // accessing elements via forloop
            System.out.print(strlist.get(i) + "  ");
        }

        System.out.println("\n \n");


        strlist.add(1,"premier"); //adding the element in between the list
        
        for(int i=0;i<strlist.size();i++){
            System.out.print( i + ":" + strlist.get(i) + "  ");
        }
        
        
        
        System.out.println("\n\n" + "removing : "+"Indian");
        strlist.remove("Indian");
        for(int i=0;i<strlist.size();i++){
            System.out.print(i + ":"  + strlist.get(i)+ "   ");
        }      

        System.out.println("\n\n" + " removal of element by index: ");
        strlist.remove(2); //deleting 1 which is at index 2
        for(int i=0;i<strlist.size();i++){
            System.out.print(i +  ":" + strlist.get(i)+  "  ");
        }


        // for replacing the element in list
        System.out.println("\n\n replacing the element in list :-");
        strlist.set(1,"Nepal");      // .set() is used for replacing

        for(int i=0;i<strlist.size();i++){
            System.out.print(i + ":" + strlist.get(i) + "  ");
        }

      
        System.out.println(" \n\n " + "size of the list is : " + strlist.size());


        System.out.println("\n\nlist.contains(object): checks weather the list contains the object or not");

        if(strlist.contains("Nepal")){
            System.out.println("----Nepal exists " +  "at index = " + strlist.indexOf("Nepal"));
        }


        strlist.clear(); //it will clear the entire list
        for(int i = 0; i<strlist.size();i++){
            System.out.println(strlist.get(i));  //nothing will be printed

            
        }
   
        System.out.println("\n\n another list: ");

        

        
        ArrayList<Integer> l1 = new ArrayList<>();  //<Integer> depects only integers are allowed
        ArrayList<Integer> l2 = new ArrayList<>(5); //size can be modified by manupulating elements
            l1.add(3);
            l1.add(4);
            l1.add(5);
            l1.add(6);

            l1.add(0,1); //adding by index
            l1.add(0,2);
            for(int n=0;n<l1.size();n++){
                System.out.print(n + ":" + l1.get(n) +"  "); //index: elements 
            }

            System.out.println("\n\n");

            l2.add(55);
            l2.add(66);
            l2.add(77);
            l2.add(88);

           // l1.addAll(l2); //it adds list witin lists

           l1.addAll(0,l2); //   it will add form the first... however if we didnt mentuoned the index then by default it will add in the last

            for(int n=0;n<l1.size();n++){
                System.out.print(n + ": " + l1.get(n) + "  ");
            }

            
            System.out.println("\n\n");


           System.out.println(l1.contains(5));
           System.out.println(l1.contains(99));
           

           System.out.println("\n\n");

           l1.removeIf(n->(n%5==0));  //here divisible of 5 will be eleminated... lambda expression used
           for(int i : l1){
            System.out.println(i);
           }
           
         CollectionUtility.print(l1);  //this is the collection utility used to print all the elements of the collection
          




         

         List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

         // Using List.replaceAll() to update each element
         numbers.replaceAll(num -> num * 2);
         // Printing the updated list
         numbers.forEach(System.out::println);
         // -------------------------------------OR-----------------------------
         System.out.println(numbers);
         
         //  numbers.remove(Integer.valueOf(6));    // to remove the specific element without knowing its index
        //  numbers.forEach(System.out::println);



         


           }
    

    
}