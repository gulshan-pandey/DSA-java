
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {




        /*
         * 3 ways to initialize the string object in java
         * 
         * 1 by string literal -----String str1 = "Hello, world!";
         * 2 by new keyword--------String str2 = new String("Hello, world!");
         * 3 by using charArray---------char[] charArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
                                        String str3 = new String(charArray);
         *
         * 
         *  
         * Que: why string objects are immutable objects?
        * Ans: An object can be referred by multiple reference variables in this case if
                    string objects are mutable objects, then we change the content of object
                    automatically other references get also modified so that string objects are given as immutable objects it
                    means whenever any operation is done on strings it will create new object.
         *
         * 
         */

         char arr[] ={'a','s','h','w','a','n','i'};
         String s=new String(arr);      //another way to make string
         System.out.println(s);




        String name = "rohan";  //---------in string constant pool
        String name2 = new String("kartik"); // another way to define string --- in heap memory and also in constant pool both
        // System.out.print("the name is: ");
        // System.out.print(name );
        // here remember that the println is used for the printing next words with new
        // line, but the 'print' does not include the new line and prints the next words
        // in the same line

        // more diff ways to print things
        
        // int m = 66;
        // float n = 55.333f;
        // System.out.printf("the values of m was %d and the value of n is %8.3f", m, n);
        // here %8.3f is mean that the number will occupy 8 digit spaces and the .3 is mean that it will upto 3 decimal point!

        // for taking the string as an input greetings

        // System.out.println("\n hello how are you");
        // Scanner s = new Scanner(System.in);
        // String ans = s.nextLine();
        // System.out.println(ans + "  as well");



        //use string builder to make a string
        //string builder is better than the string making method,is it fastest ,reduces memory storage, it is mutable, its a class defind by the java and we have to make its object in order to use it...


        StringBuilder sb = new StringBuilder("this the demo");
        sb.append(53);
        sb.append(" i am the destroyer");
        sb.append(3000.3000);
        System.out.println(sb.toString());



        

       //WAP take an array of word and concatinate them into a single string using string builder


        String [] array = new String[] {"task","to",
									    "create","an","array","of","strings",
									    "using","StringBuilder"};
		StringBuilder builder = new StringBuilder();

		for (String element : array) {
			builder.append(element + " ");
		}
		System.out.println(builder);




        //WAP to allign the special characters at the last and the words at the starting

        String str = "He@#$lloThere!*&";
        System.out.println(moveSpecialCharacters(str));

        
        
        
        //WAP to find the highest number of occurences in the given string
        String strng = "hello";
        int highestCount = findHighestOccurrence(strng);
        System.out.println("The highest number of occurrences in '" + strng + "' is " + highestCount);
        
        
        //WAP to reverse all the words in the string
        
        // String str = "all Cows eat grass";
        // System.out.println(reverseEachWord(str));
        
        String nam ="hello world";
    
        System.out.println(nam.contains("world"));

        String res = nam.replace("hello", "hi");
        System.out.println(res);
        System.out.println(res.indexOf("w"));   //------3
        System.out.println(nam.compareTo(res));
        System.out.println(nam.equals(res));
        String res2 = nam.substring(1,5);
        System.out.println(res2);


    }



   









    //methodssss----------------------------------------------



    //allign the special characters at the last and the words at the starting --method

        public static String moveSpecialCharacters(String str){
            String word ="" ;
            String extra ="";
            for(char ch : str.toCharArray()){
                
                if(Character.isLetterOrDigit(ch)){
                    word += ch;
                }else extra += ch;
            }
            str = word + extra;
            return str;
        }



        //WAP to find the highest number of occurences in the given string


            public static int findHighestOccurrence(String str) {
                int maxCount = 0;
                char maxChar = '\0';
                for (char c : str.toCharArray()) {
                    int count = 0;
                    for (char d : str.toCharArray()) {
                        if (c == d) {
                            count++;  
                            
                        }
                    }
                    if (count > maxCount) {
                        maxCount = count;
                        maxChar = c;
                    }
                }
                return maxCount;
            }

                //WAP to concatinate no of Strings into a single string

                // public static String concatinated(String ...a){
                //     StringBuilder sb = new StringBuilder();
                //     for (String str : a) {
                //         sb.append(str).append(" ");
                //     }
                //     return sb.toString();
                //  }
            
                


                //program to reverse each word in a given sentence

            //     public static String reverseEachWord(String str) {
            //         String res = "";
            //         for (String s: str.split(" ")) {       //str.spilit(" ") is used to break the sentence on the basis of white spaces and convet them into individual word to an array
            //             res = res + " " + reverseWord(s);
            //         }
            //         return res.trim();
            //     }
            //     private static String reverseWord(String s) {
            //         String res = "";
            //         for (int i = s.length() - 1; i >= 0; i--) res = res + s.charAt(i);
            //         return res;
                
            //   }




        
        

}
