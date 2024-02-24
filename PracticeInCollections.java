import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class PracticeInCollections{

    
public static void sortSting(List<String> li){

    Collections.sort(li);
}
   

    public static void main(String[] args) {
        List <String> list = Arrays.asList("lion","tiger" ,"ant","parrot"); //Arrays.asList takes varargs
        System.out.println(list);
       
        sortSting(list);
        System.out.println(list);


    }
}