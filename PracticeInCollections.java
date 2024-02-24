import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class PracticeInCollections{

// public static void sortSting(List<String> list){

//     Collections.sort(list);
// }


//WAP to swap the 2 elements of arraylist
public static void swap(List<Integer> list,int x,int y){
 int swap =list.get(x);
 list.set(x,list.get(y));
 list.set(y,swap);

System.out.println(list);
}



    public static void main(String[] args) {

        //Wap to sort a list of Sting objects in ascending order

        // List <String> list = Arrays.asList("lion","tiger" ,"ant","parrot"); //this takes Arrays.asList by taking varargs
        // System.out.println(list);
       
        // sortSting(list);
        // System.out.println(list);



        //WAP to get the frequency of the specific element in the list
        // List <Integer> li = Arrays.asList(13,2,673,67,25,2,7,3,6,2);
        // System.out.println(li);
        
        //  System.out.println("the frequency of 2 is : " + Collections.frequency(li, 2));
        
        //  System.out.println("the frequency of 3 is : " + Collections.frequency(li, 3));

        // swap(li,3,6); //swapping the element


        //WAP to reverse the list
        List<Integer> numlist = new ArrayList<>();

        Collections.addAll(numlist,43,53,65,68,97,99,100);
        // System.out.println(numlist);
        // Collections.reverse(numlist);
        // System.out.println(numlist);;

        // for(int i=0;i<numlist.size();i++){
        //     int j =numlist.get(i);
        //     numlist.set(i,numlist.get(i+1));
        //     numlist.set(i+1,j);
        // }
 
        // System.out.println(numlist);
        // rev(numlist);


        // WAP that takes a String and returns the number of unique characters using set

        Set<Character> unique =new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string ");
        String str = sc.next();

        for (Character ch : str.toCharArray()) {
            unique.add(ch);
        }

        // System.out.println(unique.toString());
        System.out.println("the unique characters are : " + unique);




    } 

    public static void rev(List<Integer> li){

        int j=li.size();
        for(int i=0;i<j/2;i++){
           PracticeInCollections.swap(li,i,j-i-1);
        }
    }
}