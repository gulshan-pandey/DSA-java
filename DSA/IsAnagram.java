package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1, char2)){
            return true;
        }
        else return false;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,4,6,2,6,2,7,8,4,8,3};
        frequency.count(arr);
    }
}





// to calculate the frequency of the element of the array using hashmaps

class frequency{
    
    public static void count(int[] arr){
      
        Map <Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        System.out.println(map);
        //System.out.println("the most frequent element is : "+ map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());    //using stream



        int fre = 0;
        int key = 0;
        for(var e : map.entrySet()){       // traversing through the map's entryset(each entries)
            if(e.getValue()>fre){
                fre = e.getValue();
                key = e.getKey() ;
            }
        }
        System.out.println("the most frequent element is : "+ key +  "  and its occurence is : " + fre);
    }
}

