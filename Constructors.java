class human{

    private String name;
    private int age;

    public human(){  //this is constructor and it calls itself whenever the new object is initialized
        name="kaliaa"; //and the constructors helps us to give the default values
        age=21;
    }

    public human(String n){ //this is constructor overloading
        name=n;
    }
   
    public human(int a ,String n){ //this is constructor overloading
        age= a;
        name= n;
    }

    public void setName(String n){
        name =n;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}



class worker{
    private int salary;
    private String name;

    public worker(){ //initializing constructor that takes no argument...
        salary =12;
    }

    public int getSalary(){
        return salary ;
    }
}




public class Constructors {
    public static void main(String[] args) {
        
        human person = new human();
        System.out.println(person.getName() + " : " + person.getAge());
     
        human person3 = new human ( "gaurav");
        System.out.println(person3.getName() + " : " + person3.getAge());
    
        human person2 =new human( 18,"ghoda");
        System.out.println(person2.getName() + " : " + person2.getAge());

    
    
        worker empl1= new worker();
        System.out.println("the default slary of empl1 is  : " + empl1.getSalary());

    }
    



}
