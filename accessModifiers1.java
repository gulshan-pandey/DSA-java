
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
    public static void main(String[] args) {

        Employee chetan = new Employee();
        // chetan.name="chetan_yadav"; --> this will give error due to private access modifier
        //chetan.age= 20; -->this will also give error
        chetan.setName("chetan_kumar");
        chetan.setAge(20);

        System.out.println("the full name of chetan is : " + chetan.getName());
        System.out.println("and the age of chetan is : " + chetan.getAge());
    }

}
