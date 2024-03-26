class phone{
    public void showTime(){
        System.out.println("the time is 9am ...");

    }
    public void on(){
        System.out.println("the phone is turning on...");
    }

}

class smartPhone extends phone{
    public void music(){
    System.out.println("playing th music...");
    }
    
    @Override
    public void on(){
        System.out.println("the smartphone is turning on...");
    }
}


public class DynamicMethodDispatch {
    
    public static void main(String[] args) {
        
        phone obj =new smartPhone(); //yes it is allowed but vice versa in not allowed
        // smartPhone obj2 =new phone(); // not allowed as a phone cannot be called a smartphone 

        obj.on(); //it will on the smartphone
        obj.showTime();

       // obj.music(); //Not Allowed ( u cannot say ko phone me music bjaa do!)

    }
}
