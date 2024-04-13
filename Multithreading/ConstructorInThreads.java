class constr extends Thread {
    public constr(String name) {    //constructor
        super(name);
    }

    public void run() {

        String name = "john";
        System.out.println(" hii my name is " + name);

        for (int i = 0; i < 200; i++) {
            System.out.println("I am your top suppoter!");
        }
    }

}

public class ConstructorInThreads {
    public static void main(String[] args) {

        constr c = new constr("vscode");
        constr c2 = new constr("pycharm");

        c.start();

        System.out.println("the Id of my Thread is : " + c.getId());
        System.out.println("the name of my Thread is : " + c.getName());

        c2.start();

        System.out.println("the id of c2 is : " + c2.getId());
         System.out.println("the name of my Thread is : " + c2.getName());
    }
}
