
class klass{
    private int a;
    
    public klass(int a){ //constructor with int input
        this.a=a; //here "this" is being used as the refrence ,if we dont use "this" here we can get error or miscompilation ,and also it is a good practice
    }
    public int getA(){
        return a;
    }
}

class klass2 extends klass{

    public klass2(){
        super(0);
        System.out.println("i am just a klass2 constructor");
    }
    public klass2(int c){
       super(c); // immediate parent class jisme int input ho rha ho usko ko refer krne k lia ,if we remove it from here ,it wont be able to call the parent class and hence throw error
       System.out.println("I am the constructor of klass2");
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        
        klass k = new klass(5);
        klass2 k2= new klass2(9);
        System.out.println(k.getA());
        System.out.println("\n\n\n");

        klass2 k3= new klass2();

    }
    
}
