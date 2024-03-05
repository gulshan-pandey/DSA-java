public class GenericsAndDiamondOperators {
    
    //without using generics

    // class SpecifiClass{
    //     private String thing;

    //     public String getThing(){
    //         return thing;
    //     }
    //     public void setThing(String thing){
    //         this.thing = thing;
    //     }
    // }


    //by using generics

    class specificClass <T>{
      private T thing;

      public T getThing(){
        return thing;
      }
      
      public void setThing(T thing){
        this.thing = thing;
      }
    }

    public static void main(String[] args) {
        
        

    }
}
