//use a builtin package in java to write a class which displays a messge(by using sout) after taking input from the user
class print{
    public void met(){
java.util.Scanner sc = new java.util.Scanner(System.in);
String v = sc.nextLine();
System.out.println(v + "  by using sout");
 sc.close();
}

}
public class Builtins {
  public static void main(String[] args) {
    
    print p = new print();

    p.met();
  }

    
}
