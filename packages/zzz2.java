package harry1.gym;

public class zzz2 {


    public int x = 5;   //public modifier
    protected int y = 45; //protected modifier
    int z = 6;            // default
    private int a = 78;     // private modifier

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }


    public static void main(String[] args) {
        System.out.println("hii");
        System.out.println("these files will not run until u put these files in there respective package");
        
        zzz2 nw = new zzz2();
        System.out.println(nw.x);
        System.out.println(nw.y);
        System.out.println(nw.z);
    }
    
}









