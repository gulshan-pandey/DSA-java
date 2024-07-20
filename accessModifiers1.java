
//protected :
//remember: protected modifier(class) is never used independently and throws compile time error, bcz it is used in nested class same happens with private (class)
// usage of protected: variable,method,nested class

//private:
// usage: variable, methods, nested class

class Employee {

    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int n) {
        this.age = n;     //here "this" is optional
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class AccessModifiers1 {
 {

        Employee chetan = new Employee();
        // chetan.name="chetan_yadav"; --> this will give error due to private access modifier
        //chetan.age= 20; -->this will also give error
        chetan.setName("chetan_kumar");
        chetan.setAge(20);

        System.out.println("the full name of chetan is : " + chetan.getName());
        System.out.println("and the age of chetan is : " + chetan.getAge());
    }

}

