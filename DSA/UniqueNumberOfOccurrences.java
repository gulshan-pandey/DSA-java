package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class  UniqueNumberOfOccurrences {
    
    /**
     * 
     * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

        

        Example 1:

        Input: arr = [1,2,2,1,1,3]
        Output: true
        Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.



        Example 2:

        Input: arr = [1,2]
        Output: false



        Example 3:

        Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
        Output: true
     */
}



class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        var map = new HashMap<Integer,Integer>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        var set = new HashSet<Integer>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(!set.add(entry.getValue())){
                return false;
            }
            set.add(entry.getValue());
        }
        return true;
    }
}