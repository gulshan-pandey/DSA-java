public class ArrayOperations {
    int [] array ;

    
    
    public ArrayOperations(int[] array) { 
        this.array = array;
    }


    public class Statistic{ //nested class
        
        double mean (){
          int mean =0;
          for(int element : array){
              mean = mean + element;
              
          }
          return mean/array.length;

           
        }
    }

    //VARARGS----------------------------------------------------------
    // public static int sum(int... a) {
    //     int result= 0;
    //     for (int i : a) {
    //         result += i;
    //     }
    //     return result;
    // }

    public static int add(int a,int b,int ...c){
        int sum =0;
        for(int n:c){     // a and b will be excluded
            sum+=n;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        ArrayOperations A = new ArrayOperations(new int[] {22,335,5,63,7});  //insertion of  array in constructor is like this

        ArrayOperations.Statistic sc = A.new Statistic(); //here we need to associate the object of Array operation to the Statistic nested class
        System.out.println(sc.mean());


        //VARARGS
    //    System.out.println(sum(4, 5, 6, 7, 8, 9)); 
       System.out.println(add(56,700,3,7,4,788,74));
    }
}