public class Cloneablee implements Cloneable{

    int i = 10;

    @Override
    public Cloneablee clone() {
        try {
            return (Cloneablee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

    public static void main(String[] args) {

        Cloneablee c = new Cloneablee();
        Cloneablee cloneObject = c.clone();     //making a clone of the object by clone method
        System.out.println(c.hashCode());
        c.i=100;
        System.out.println(c.i);

        System.out.println(cloneObject.hashCode());      // will print different hashcodes
        System.out.println(cloneObject.i);               // will print 10, as this object will have separate copy of i

    }
}
