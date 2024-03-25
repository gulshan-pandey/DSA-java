package AdvanceJava;

import java.util.ArrayList;
import java.util.List;

public class tesr {
    
    public static void main(String[] args) {
        
        List <String> lis= new ArrayList<>(List.of("dog","cow","monkey","goat","deer","donkey","lion","tiger","leopard","cat","rabbit"));

        lis.stream().filter(li->li.length()>3).forEach(li->System.out.println(li));



    }
}
