
class Employee {

    private int  employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName){

        this.employeeName=employeeName;
        this.employeeId=employeeId;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Implement your code here

    //Uncomment the below method after implementation before verifying
    //DO NOT MODIFY THE METHOD

    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }

}

// it is extending so only super can be used .
class PermanentEmployee extends Employee {

    private double basicPay;
    private double hra;
    private float experience;




    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);  // super constructor so that parent class constructor is invoked.
        this.basicPay=basicPay;
        this.hra=hra;
        this.experience=experience;
    }

    public void calculateMonthlySalary(){

        double x = this.getExperience();
        double variableComponent = 0;

        if (x<3){
            this.setSalary((float)(this.basicPay+this.hra));
        }
        else if (x>=3 && x<5){
            this.setSalary((float)(this.basicPay+this.hra+this.basicPay*.05));
        }
        else if (x>=5 && x<10){
            this.setSalary((float)(this.basicPay+this.hra+this.basicPay*0.07));
        }
        else
            this.setSalary((float)(this.basicPay+this.hra+this.basicPay*0.12));


//        if (x<3){
//            variableComponent=0;
//        }
//        else if (x>=3 && x<5){
//            if (x==3.5||x==4.0||x==4.5||x==3){
//
//            variableComponent=5;}
//        }
//        else if (x>=5 && x<10){
//
//             if (x==5||x==5.5||x==6.0||x==6.5||x==7.0||x==7.5||x==8||x==8.5||x==9||x==9.5){
//                 variableComponent=7;
//             }
//
//
//        }
//
//        else if (x>=10){
//            variableComponent=12;
//        }
//
//        double v = getBasicPay()*((variableComponent + 100) / 100);
//        System.out.println(variableComponent);
//        System.out.println(getBasicPay());
//
//        double y = this.getHra()+ v;
//
//        setSalary(y);



    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
    //Implement your code here

    //Uncomment the below method after implementation before verifying
    //DO NOT MODIFY THE METHOD

    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }

}

class ContractEmployee extends Employee {

    private double wage;
    private float hoursWorked;

    // Constructor Overloading

    public ContractEmployee(int empId, String name, double wage, float hoursWorked ){
        super(empId, name);

        this.wage=wage;
        this.hoursWorked=hoursWorked;


    }

    public void calculateSalary(){

        double z = this.wage * this.hoursWorked;

        setSalary(z);

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //Implement your code here

    //Uncomment the below method after implementation before verifying
    //DO NOT MODIFY THE METHOD

    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }

}

public class Tester {

    public static void main(String[] args) {

        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1999, 145, 3.0f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);

        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);

        //Create more objects for testing your code
    }

}