package DSA;

public class SortCharactersByFrequency {
    

    /*
     * Example 1:

        Input: s = "tree"
        Output: "eert"
        Explanation: 'e' appears twice while 'r' and 't' both appear once.
        So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.


        Example 2:

        Input: s = "cccaaa"
        Output: "aaaccc"
        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
        Note that "cacaca" is incorrect, as the same characters must be together.


        Example 3:

        Input: s = "Aabb"
        Output: "bbAa"
        Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
        Note that 'A' and 'a' are treated as two different characters.

        
     */
}



/*
- Create a HashMap to store each character and its frequency count
- Iterate through the string to populate the frequency map

Step 2: Create Bucket Array
- Initialize an array of Lists with size = string.length() + 1
- Each index represents a frequency
- Each element will be a List<Character> to store characters with that frequency

Step 3: Populate Bucket Array
- Iterate through the frequency map's keyset
- For each character, get its frequency from the map
- Add the character to the bucket array at index = frequency

Step 4: Build Result String
- Create a StringBuilder for the result
- Iterate through bucket array in reverse order (from highest frequency to lowest)
- For each character in a bucket, append it to result repeated by its frequency
- This gives us characters sorted by frequency without explicit sorting
*/


// class Solution {                                    //most optimized 
//     public String frequencySort(String s) {
//         StringBuilder sb = new StringBuilder();
//         List<Character>[] arr = new ArrayList[s.length()+1];
//         Map<Character,Integer> map = new HashMap<>();
//         for(char e : s.toCharArray()){
//             map.put(e,map.getOrDefault(e,0)+1);
//         }
//         map.keySet().forEach(
//             c -> {
//                if(arr[map.get(c)]==null){
//                 arr[map.get(c)]= new ArrayList();
//                } 
//                arr[map.get(c)].add(c);
//             }
//         );

//         for(int i= arr.length-1; i>0; i--){
//             if(arr[i]!=null){
//                 for(char j : arr[i]){
//                     for(int k=0; k<i ;k++){
//                         sb.append(j);

//                     }

//                 }
//             }
//         }

//         return sb.toString();
//     }
// }






//using priority queue

// class Solution {                                  
//     public String frequencySort(String s) {
//         HashMap <Character, Integer> map = new HashMap<>();
//         PriorityQueue<Character> q = new PriorityQueue<>((x,y) -> (map.get(y) - map.get(x)));
//         StringBuilder sb = new StringBuilder();
//         for(char elem : s.toCharArray()){
//             map.put(elem, map.getOrDefault(elem,0) +1);
//         }

//         for(char c : map.keySet()){
//             q.offer(c);
//         }
        
//         while(!q.isEmpty()){
//             char temp =q.poll();
//             for(int i =0; i<map.get(temp);i++){

//             sb.append(temp);
//             }
//         }
//         return sb.toString();
//     }
// }


//optimal solution

// class Solution {                                  
//     public String frequencySort(String s) {
//         Map<Character, Integer> map = new HashMap<>();
//         for(char elem : s.toCharArray()){
//             map.put(elem,map.getOrDefault(elem,0)+1);
//         }
//         List<Character>[] arr = new List[s.length() +1];
//         for(Character key : map.keySet()){
//             int freq = map.get(key);
//             if(arr[freq]== null){
//                 arr[freq]= new ArrayList<>();
//             }
//             arr[freq].add(key);
//         }
//         StringBuilder sb = new StringBuilder();
//         for(int j = arr.length-1; j>0; j--){
//             if(arr[j] != null){
//                 for( char c : arr[j]){
//                     for(int k =0; k<map.get(c); k++){
//                         sb.append(c);
//                     }
//                 }
//             }
//         }

//         return sb.toString();
//     }
// }
