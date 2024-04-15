package DSA;
import java.util.*;  
public class VectorExample {  
       public static void main(String args[]) {  
          //Create a vector  
          int n=100; 
          for (int i = 2; i * i < n; i++) {
             System.out.println(i + " !!!");
            for (int j = i * i; j < n; j += i) {   
                System.out.println(j);
            }
        }
        
       }  
} 

