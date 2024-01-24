interface If1{
void meth1();
void meth2();

}

interface If2 extends If1{ //interface can extend interface means inheritance can be used bw interfaces
    void meth3();
    void meth4();

}

class kl implements If2{
  public void meth1(){
        System.out.println("this is meth1");
    }
  public void meth2(){
        System.out.println("this is meth2");
    }
  public void meth3(){
        System.out.println("this is meth3");
    }
  public void meth4(){
        System.out.println("this is meth4");
    }
}



public class inheritanceInInterface {
    public static void main(String[] args) {
        
        kl klas = new kl();

        klas.meth1();
        klas.meth2();
        klas.meth3();
        klas.meth4();
    }
}
