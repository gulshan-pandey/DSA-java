import java.io.FileWriter;

public class FileHandlingWriter {

    public static void main(String[] args) {

        String fileName = "file.txt"; //initialised the file name
        try(FileWriter writer = new FileWriter(fileName);) { //the () inside the try use to prevent the resource leak ,when we put the condition in () of the try then it will automatically terimate at the end of the program
             // creating its object leads to the exception so it must be handled and should be close to release system resoruces;

            writer.write("hello world"); // what to write
            
            // for (int i = 0; i < 100; i++) {
            //     for (int j = 0; j <= i; j++) {
            //         writer.write("*");
            //     }
            //     writer.write("\n");
            // }
            writer.flush(); // to writes all the data
            System.out.println("the file successfully written!");
        } catch (Throwable th) {
            System.out.println("sorry file cant be written" + th);
            th.printStackTrace();
        }

    }

}