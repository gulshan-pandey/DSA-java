class NegativeRadiusException extends Exception {

    @Override
    public String toString() {
        return "radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "please check the radius";
    }
}


public class ThrowsException {

    public static int divide(int a, int b)
            throws ArithmeticException {
        int result = a / b;
        return result;
    }
   
 //the throws keyword does 2 thing ...1 it indicates the fellow caller to get prepare for the exception and handle it accordingly...2nd after writing throws to a mehtod,that merhod dont have to define the try and catch statements!

    public static double circum(double r)
            throws  NegativeRadiusException {
                if(r<0){ //it is necessary to put this condtion otherwise jvm will claculate the -ve circumfence
                  throw new NegativeRadiusException();
                }
        double result = Math.PI *2*r;
        return result;
    }

    public static void main(String[] args)  {

        try{
        System.out.println(divide(2,0));
        }
        catch(Exception e){
        System.out.println("exception occured");
        }



        try {
           System.out.println(circum(-3));
        } catch (NegativeRadiusException e) {
           System.out.println(e.getMessage()); 
           e.printStackTrace();
           System.out.println(e.toString());
         
        }finally{
            System.out.println(" \n \n finally block is always executed regardless of any try catch block ecxcuted or not,further more finally is generally used for closing resource like files or database ");
         }
    }

}
