package DSA;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringCharacter {
    /**
     * For a given a string(str), find and return the highest occurring character.

        Example:
        Input String: "abcdeapapqarr"
        Expected Output: 'a'
        Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
        If there are two characters in the input string with the same frequency, return the character which comes first.

        Consider:
        Assume all the characters in the given string to be in lowercase always.

        Sample Input 1:

        abdefgbabfba
        Sample Output 1:
        b


        Sample Input 2:

        xy
        Sample Output 2:
        x
     
        */
}




class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		HashMap <Character,Integer>map = new HashMap<>();
		int count =0;
		for(int i =0; i<str.length(); i++){
			char temp =str.charAt(i);
			map.put(temp,map.getOrDefault(temp,0)+1);
		}
		char ch =' ';
		for(Map.Entry<Character, Integer> mapp : map.entrySet()){
			if(mapp.getValue()>count){
				count=mapp.getValue();
				ch=mapp.getKey();
			}
		}
		return ch;
	}

}