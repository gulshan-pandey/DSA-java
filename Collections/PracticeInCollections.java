package Collections;
import java.util.*;




public class PracticeInCollections{

public static void ReverseSortSting(List<String> list){

    Collections.sort(list); //edit the list
    Collections.reverse(list); // reverse the sorted list
}


//WAP to swap the 2 elements of arraylist
public static void swap(List<Integer> list,int x,int y){
 int swap =list.get(x);
 list.set(x,list.get(y));
 list.set(y,swap);

System.out.println(list);
}



    public static void main(String[] args) {

        //Wap to sort a list of Sting objects in ascending order

        List <String> list = Arrays.asList("lion","tiger" ,"ant","parrot"); //this takes Arrays.asList by taking varargs
        System.out.println(list);
       
        //  ReverseSortSting(list);
        // System.out.println(list);


        //WAP to get the frequency of the specific element in the list
        // List <Integer> li = Arrays.asList(13,2,673,67,25,2,7,3,6,2);
        // System.out.println(li);
        
        //  System.out.println("the frequency of 2 is : " + Collections.frequency(li, 2));
        
        //  System.out.println("the frequency of 3 is : " + Collections.frequency(li, 3));

        // swap(li,3,6); //swapping the 3rd and 6th index



         
        //WAP to reverse the list
        List<Integer> numlist = new ArrayList<>();

        Collections.addAll(numlist,43,53,65,68,97,99,100); //addAll takes varargs and make them list
        // System.out.println(numlist);
        // Collections.reverse(numlist);
        // System.out.println(numlist);;

       

        rev(numlist);



        // WAP that takes a String and returns the number of unique characters using set

        Set<Character> unique =new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string to find its unique characters");
        String str = sc.nextLine();

        for (Character ch : str.toCharArray()) {   //converted the string into the character array
            unique.add(ch);
        }

        System.out.println(unique.toString());
        System.out.println("the unique characters are : " + unique + " and the size is " + unique.size());



    } 

    public static void rev(List<Integer> li){

        int j=li.size();
        for(int i=0;i<j/2;i++){
           PracticeInCollections.swap(li,i,j-i-1);         //recalling the swap method ,and this method will be called list.size()/2 times
        }
    }
}