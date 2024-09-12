package DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    
    /**
     * Given an array of strings strs, group the 
anagrams
        together. You can return the answer in any order.

        

        Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]

        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Explanation:

        There is no string in strs that can be rearranged to form "bat".
        The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
        The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
        Example 2:

        Input: strs = [""]

        Output: [[""]]

        Example 3:

        Input: strs = ["a"]

        Output: [["a"]]
     */
}




// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         var map = new HashMap<String,List<String>>();
//         var list = new ArrayList<List<String>>();

//         for(String str:  strs){
//            char[] charArray = str.toCharArray();  // Convert string to char array
//             Arrays.sort(charArray);              // Sort the char array
//             String s = new String(charArray); 
//             if(map.containsKey(s)){
//                 map.get(s).add(str);
//             }else{
//                 map.put(s, new ArrayList<>(Collections.singletonList(str)));        //the ArrayList constructor expects a Collection, not a single string.
//             }
//         }

//         for(var key : map.keySet()){
//             list.add(map.get(key));
//         }

//         return list;
//     }
// }




class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();

        for (String str : strs) {
            // Sort the string and convert it back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            // If the sorted string is already a key, add to the list
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(str);
            } else {
                // Create a new list and add the string
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(sortedString, newList);
            }
        }
        // Prepare the result list
        var list = new ArrayList<List<String>>();
        for (var key : map.keySet()) {
            list.add(map.get(key));
        }

        return list;
    }
}





// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();
        
//         for (String word : strs) {
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String sortedWord = new String(chars);
            
//             if (!map.containsKey(sortedWord)) {
//                 map.put(sortedWord, new ArrayList<>());
//             }
            
//             map.get(sortedWord).add(word);
//         }
        
//         return new ArrayList<>(map.values());
//     }
// }