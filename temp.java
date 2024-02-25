public class temp {
    public static String reverseEachWord(String str) {
         String res = "";
         for (String s: str.split(" ")) {
             res = res + " " + reverseWord(s);
         }
         return res.trim();
     }
     private static String reverseWord(String s) {
         String res = "";
         for (int i = s.length() - 1; i >= 0; i--) res = res + s.charAt(i);
         return res;
     
   }
   
   public static void main(String args[]){
       String str = "all Cows eat grass";
       System.out.println(reverseEachWord(str));
   }
}