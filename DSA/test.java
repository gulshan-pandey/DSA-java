package DSA;


public class test{

public static void main(String[] args) {
    try{
        System.out.println(10/0);
    }
    catch(RuntimeException e){
        System.out.println(e);
    }
}



}