

//create three classes calculator ,ScCalculator and hybridCalculator and group them into a package.
class Calculator {
    
    public void calculate(int a, int b) {
        System.out.println(" the result is  :" + a + b);
    }
}

class ScCalculator {
    public void calibrate(int a, int b) {
        System.out.println("the result is : " + Math.sin(a + b));
    }
}

class HyCalculator {
    public void calibrate(int a, int b) {
        System.out.println("the result is : " + Math.sin(a + b));
        System.out.println(" the result is  :" + a + b);
    }
}

public class prob2 {
    public static void main(String[] args) {
        

        System.out.println("i am sout that contains calculators");
    }


}
