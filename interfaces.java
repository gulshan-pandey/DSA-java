interface bicycle{
    int a =99; //we can create properties in interfaces
    void applyBrake(int decrement);
    void speedUp(int increment);

}
interface bike{
    int y=0; //remember they all are already public by deault
    void applyDiskBrake();
    void Acclerate();

}

// we can implement 2 or more interfaces in class
class Ranger implements bicycle,bike{

    //  int a=999;  //se we can sort of modify the variables of interfaces indeed but should not overwrite them
    void blowHorn(){
      System.out.println("pee peeee...dhoom machale");
    }
    
    //defining all the mehtods of interface
    public void applyBrake(int decrement){
       System.out.println("applying brakes by :" + decrement);
    }
    public void speedUp(int increment){
     System.out.println("stopping by : " + increment);
    }

     public void applyDiskBrake(){
        System.out.println("applying diskbrake...");
     }
    public void Acclerate(){
        System.out.println("pulling the accelerator!");
    }
}

class interfaces {
    public static void main(String[] args) {
        
        Ranger mericycle = new Ranger();
        mericycle.applyBrake(6);
        mericycle.speedUp(9);

        System.out.println(mericycle.a);
        //we can create the properties in Interfaces

        //we cannot modify the propertis in Interfaces as they are final
        // mericycle.a =1; ---error

        mericycle.applyDiskBrake();
        mericycle.Acclerate();
    }

}