import java.util.ArrayList;
import java.util.List;

public class Temp {

    public static void main(String[] args) {

        List strlist = new ArrayList();
        strlist.add("Indian"); // this is the 0th index;
        strlist.add("league");// this is 1st index

        System.out.println(strlist.get(0)); //accessing the element

        for(int i =0;i<strlist.size();i++){     // accessing elements via forloop
            System.out.print(strlist.get(i) + " ");
        }

        System.out.println("\n \n");


        strlist.add(1,"premier"); //adding the element in between the list
        
        for(int i=0;i<strlist.size();i++){
           System.out.print( strlist.get(i) + " ");
        }




    }

    
}