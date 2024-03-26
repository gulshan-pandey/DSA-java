public class PassByRefrence {
    int a;
    int b;

    
    public PassByRefrence(int a, int b) {
        this.a = a;
        this.b = b;
    }

    

    @Override
    public String toString() {
        return "Values  [a=" + a + ", b=" + b + "]";
    }

    
    
    public static void main(String[] args) {
        PassByRefrence values = new PassByRefrence(5, 7);
        System.out.println(values);
        
        move(values);
        
        System.out.println(values);  //actual values changed
    }
    public static void move (PassByRefrence p){
        p.a++;
        p.b++;
        System.out.println(p);
    }
}
