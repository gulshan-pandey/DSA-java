public class StringMethods {
    public static void main(String[] args) {
        //first of all remember that the string is immutable
        String name = "Mallu";
        String name2 = new String("kallu");
        System.out.println("name : " + name);

        System.out.println("the length is  : " +name.length());

        String lname = name.toLowerCase();
        System.out.println("by converting into lowercase  : " + lname);

        System.out.println("to uppercase : " +name.toUpperCase());

        String nonTrimmedString = "   gullu    ";
        System.out.println(nonTrimmedString + ":" + nonTrimmedString.trim());

        System.out.println("using substring method : " + name2.substring(2)); //it is used to cut out the string from the specific index
        System.out.println("by taking 0 in the index of substring :" + name.substring(0));
        System.out.println("\n");
//-------------------------------------------------------------------------

        String gamename = "swordigo";
        System.out.println("gamename  :" + gamename);

        //to check that the gamename includes the word
        System.out.println(gamename.contains("ord")? "it contains ord in gamename" : "it doesnot contains ord");
        System.out.println("subtracting from index 3,5  : " + gamename.substring(3, 5)); /* 5 is excluded*/ //its just like slicing or substring in js

        System.out.println("\n");
        System.out.println("after using the replace method  : " + name + "=" +name.replace('M', 'P')); //single quotes uses char and double quotes for string

        System.out.println("\n");

        System.out.println(gamename.startsWith("sw")); //will return true

        System.out.println(gamename.endsWith("go")); //returns the boolean value

        char ch = gamename.charAt(2);
        System.out.println("character at index 2 is : " + ch);

        System.out.println("character at index 4 is : " + gamename.charAt(4));

        System.out.println("to calculate the index of particular (o) char is: " + gamename.indexOf("o"));

        System.out.println("\n");

        System.out.println("the index of (ord) in swordigo is : " + gamename.indexOf("ord")); // 2

        System.out.println("now taking the index of the gamename from the specified index : " + gamename.indexOf("o", 3)); //mtlb index no. 3 se dhundna start karo

        System.out.println("\n");
        System.out.println("now if the match is not present in the string so it will show -1 : " + gamename.indexOf("vhjkl"));

        System.out.println("\n");

        String str = "Hello, World!";
        char targetChar = 'z';
        int lastIndex = str.lastIndexOf(targetChar);
        if (lastIndex != -1) {
            System.out.println("Last index of '" + targetChar + "': " + lastIndex);
        } else {
            System.out.println("'" + targetChar + "' not found in the Hello, World string.");
        }
 System.out.println("\n");

            String naam ="i am the hero";
        System.out.println(naam.lastIndexOf("e",9)); //matlab "i am the h" itne string me last index serch krr k btao means 9 index kandr andr k andr andr search kro


        String example= "inception";
        System.out.println(naam.equals("hero")); //string.equals("takes the character or string in duble quotes")
        System.out.println(example.equals("inception")); //its equals method has problem it is case sensitive


        System.out.println("using equalsIgnoreCase() method : " + example.equalsIgnoreCase("InCEption")); //it will ignore the format of the word and then compare it

//----------------------------------------------------------------------
//Question wap to replace space with underscore

        String hero = "I am the hero !";
        System.out.println(" hero : " + hero);
        System.out.println(hero.replace(" ","_"));
        System.out.println("\n");

 // Question  wap to fill the letter template which looks like below
 //   letter= "dear <|name|> Thanks a lot"
 //replace <|name|> with a string (some name)

 String Letter = "dear <|name|> Thanks a lot !";
 String NewLetter = Letter.replace("<|name|>","gulshan");
        System.out.println(NewLetter);
        System.out.println("\n");

 // Question wap to detect double spaces and triple spaces
    String Invite =" hy how  are   you";
        System.out.println(Invite.indexOf("   "));
        System.out.println(Invite.indexOf("  "));
        System.out.println(Invite.indexOf("    ")); //this will show -1 because this is not present
        System.out.println("\n");

 // question wap to write this string in a letter format   " Dear Gulshan, This Java Course is Amazing. Thanks!"

String Invitation = " Dear Gulshan, This Java Course is Amazing. Thanks!";
        System.out.println(" Dear Gulshan,\n\t This Java Course is Amazing.\n\t Thanks!" ); //these are escape sequecer


    // use printf over concatination as concat method uses too much memory 

    String animal= "dog";
    int regNo=24732;
    System.out.printf("hello %s ,your roll no is %d \n" ,animal,regNo);
   
    System.out.printf("hello %S ,your roll no is %d \n" ,animal,regNo);
   
    System.out.printf("hello %10S ,your roll no is %10d \n" ,animal,regNo);
    
    System.out.printf("hello %10S ,your roll no is %010d \n" ,animal,regNo);
    
    System.out.printf("hello %10S ,your roll no is %0,10d \n" ,animal,regNo);
    



    // WAP to remove the duplicate elements from the string

    // String str = "object oriented programming";
    // System.out.println(removeDuplicatesandSpaces(str));


    }






    //methods----------------------------------------------------------------------

//program to remove the dupicate the elements from the string

    public static String removeDuplicatesandSpaces(String str) {
        StringBuilder noDupes = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is not a space and not already in noDupes
            if (ch != ' ' && noDupes.indexOf(String.valueOf(ch)) == -1) {
                noDupes.append(ch);
            }
        }
        return noDupes.toString();
    }

        }

