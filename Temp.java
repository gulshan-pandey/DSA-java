import java.util.ArrayList;
import java.util.List;

public class Temp {

    public static void main(String[] args) {

        List strlist = new ArrayList(); //list is interface so its proper object cannot be formed
        strlist.add("Indian"); // this is the 0th index;
        strlist.add("league");// this is 1st index
        strlist.add(1);// it can add different datatypes as well !!!

        System.out.println(strlist.get(0)); //accessing the element

        for(int i =0;i<strlist.size();i++){     // accessing elements via forloop
            System.out.print(strlist.get(i) + "  ");
        }

        System.out.println("\n \n");


        strlist.add(1,"premier"); //adding the element in between the list
        
        for(int i=0;i<strlist.size();i++){
            System.out.print( i + ":" + strlist.get(i) + "  ");
        }
        
        
        
        System.out.println("\n\n" + " after removing : "+"Indian");
        strlist.remove("Indian");
        for(int i=0;i<strlist.size();i++){
            System.out.print(i + ":"  + strlist.get(i)+ "   ");
        }      

        System.out.println("\n\n" + " removal of element by index: ");
        strlist.remove(2); //deleting league which is at index 1
        for(int i=0;i<strlist.size();i++){
            System.out.print(i +  ":" + strlist.get(i)+  "  ");
        }


        // for replacing the element in list
        System.out.println("\n\n replacing the element in list :-");
        strlist.set(1,"Nepal");      //replaced

        for(int i=0;i<strlist.size();i++){
            System.out.print(i + ":" + strlist.get(i) + "  ");
        }

      
        System.out.println(" \n\n " + "size of the list is : " + strlist.size());

        
        System.out.println("list.contains(object): checks weather the list contains the object or not");

        System.out.println("strlist.contains(premier) : "+ strlist.contains("premier"));


    }

    
}