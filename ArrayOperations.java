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

    
    public static void main(String[] args) {
        
        ArrayOperations A = new ArrayOperations(new int[] {22,335,5,63,7});

        ArrayOperations.Statistic sc = A.new Statistic(); //here we need to associate the object of Array operation to the Statistic nested class
        System.out.println(sc.mean());
    }
}