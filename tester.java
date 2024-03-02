import java.util.*;

public class tester {
    
    public static List adder(List <Integer> list){
     int n= list.size()-1;
     
     for(int i=0;i<n/2;i++){
        int j = list.get(i);
        list.set(i,list.get(n-i));
        list.set(n-i,j);
     }
     return list;
    }
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(2,4,55,7,64,45,7,4);

        System.out.println(adder(list));
         
    }
}
