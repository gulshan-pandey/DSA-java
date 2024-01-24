import java.util.*;

public class temp {
   
    public static void main(String[] args) {

     
int [] arr={24,6,2,89,73,90};
        int temp= arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
          
        }
        System.out.println(temp);
        

    }
}
