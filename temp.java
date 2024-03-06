public class temp{


    public static void main(String[] args) {

        double startTime = System.currentTimeMillis();
        for(int i =0;i<=1000;i++){
            System.out.print(i + "* ");
        }
        System.out.println("\n* task complete");
        for(int i =0;i<=1000;i++){
            System.out.print(i + "# ");
        }
        System.out.println("\n # task complete");
        for(int i =0;i<=1000;i++){
            System.out.print(i + "$ ");
        }
        System.out.println("\n $ task complete");

        double endTime = System.currentTimeMillis();

        System.out.printf("total time taken  : %f ",endTime-startTime);

    }
}