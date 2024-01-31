import java.util.*;

class temp {
  public static boolean palinStr(String str) {
    
    if (str.length() <= 1) {
      return true;
    }
    int length = str.length() - 1;
    if (str.charAt(0) != str.charAt(length)) {
      return false;
    }
    String strng = str.substring(1, length); // the length is inclusive
    return palinStr(strng);

  }

  public static void main(String[] args) {
    System.out.println("weclome to String palindrome checker ! \n\n please enter the word to check if it is palindrome ");
    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    System.out.println("your word is " + ((palinStr(word)) ? " palindrome" : "not a palindrome word"));
  }
}
