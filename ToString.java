
class Kar {
    int noOfDoors;
        int wheels;
        String name;
        int maxSpeed;
        
        final int MARKS = 99; //now rhis final keyword means that the variable ha became constant and cant be changed now,the convention of writing the variable of final keyword is by making them "CAPITAL_AND_ADDED_BY_THESE_DASHES"

        public Kar(int noOfDoors, int wheels, String name, int maxSpeed) {
            this.noOfDoors = noOfDoors;
            this.wheels = wheels;
            this.name = name;
            this.maxSpeed = maxSpeed;
        }

        @Override
        public String toString() {  //this toString class is also defined in java and if we dont define it here then that method will be returned hashes!
            return "Kar [name=" + name + ", maxSpeed=" + maxSpeed + "]";
        }

       
    }


    // make another class student and by the help of toString method prints his credentials

    class Students {
        String name;
        int age;
        int roll;
        String house;
        public Students(String name, int age, int roll) {
            this.name = name;
            this.age = age;
            this.roll = roll;
        }
       
        @Override
        public String toString(){
            return "Student-details :{name:" +  name
                     +" , age: "+ age
                     +" , roll: "+ roll+" }";
                    
        }
        
    }
    
    public class ToString {
    public static void main(String[] args) {
        Kar cr = new Kar(4, 4, "maruti", 120);
        System.out.println(cr.toString()); //will print the name of class followed by hashcode because everytime we try to print object,it will call toString method even if you dont mention.,if basically call the methods toString from its own class and print those hexadecimal hashcode stuff.

        //so what if we define our own toString mthod it will just imply our toString method
        System.out.println(cr);


        
		Students stu = new Students("goul" ,12,15);

		System.out.println(stu);  //toString will called
        

    }
}
