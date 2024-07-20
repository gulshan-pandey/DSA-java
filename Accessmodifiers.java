class modify {
    public int x = 5;   //public modifier
    protected int y = 45; //protected modifier
    int z = 6;            // default
    private int a = 78;     // private modifier

    public void meth() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Accessmodifiers {
 public static void main(String[] args) {
    
    modify m =new modify();
    m.meth();

System.out.println("\n\n");


    System.out.println( m.x);
    System.out.println( m.y);
    System.out.println( m.z);
    // System.out.println( m.a);  is private so wont work
    // System.out.println( m.a); --> this is not allowed ,the private variavles are not allowed in same package
 }
}
