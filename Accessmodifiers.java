class farzi {
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
    
    farzi f =new farzi();
    f.meth();

System.out.println("\n\n");


    System.out.println( f.x);
    System.out.println( f.y);
    System.out.println( f.z);
    // System.out.println( f.a);  is private so wont work
    // System.out.println( f.a); --> this is not allowed ,the private variavles are not allowed in same package
 }
}
