package IOstream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWriter {

    public static void main(String[] args) {

        String fileName = "file.txt"; //initialised the file name
        try(FileWriter writer = new FileWriter(fileName);) { //the () inside the try use to prevent the resource leak  and it is called {try with resource},when we put the condition in () of the try then it will automatically terimate it at the end of the program creating its object can cause to the checked exception so it must be handled and should be closed to release system resoruces;

            writer.write("hello world"); // what to write
            
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j <= i; j++) {
                    writer.write("*");
                }
                writer.write("\n");
            }
            writer.flush(); // to writes all the data immediately
            System.out.println("the file successfully written!");
        } catch (Throwable th) {
            System.out.println("sorry file cant be written" + th);
            th.printStackTrace();
        }



   //using object method

    String filename = "output.txt"; // File name
    String textToWrite = "Hello, Earth! This is a FileWriter example."; // Text to write to the file

        try {
            File file = new File(filename); // Create a File object
            FileWriter writer = new FileWriter(file); // Pass the File object to FileWriter constructor
            writer.write(textToWrite);
            writer.close();
            System.out.println("Data has been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

}