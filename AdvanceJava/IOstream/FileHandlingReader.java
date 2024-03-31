package AdvanceJava.IOstream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingReader {
    
    public static void main(String[] args) {
        
        String filename = "file.txt";
        //the filereader work/reads on the basis of integers
        try(FileReader reader = new FileReader(filename);){ //it is called {try with resource}
            int read =0; //initially it is zero or we can just initialise the read variable as it will read on the basis of integer
            do{
                read = reader.read();  //reader object will start to read the file
                System.out.print((char)read); //now converting the read from int to char
            }while (read !=-1); //here -1 means read till there is nothing left

            
        } catch(IOException exception){
          System.out.println("exception occcured");
        }






    //WAP a program to read a filename from the user and display its content.the program should handle the situation where the file does not exist


    Scanner sc = new Scanner(System.in);
    System.out.println("enter the fileName: ");
    String file = sc.nextLine();  //copy any filename alongwith its path name to access them and paste

    try(FileReader readed =new FileReader(file);){
        int compare;
        while((compare = readed.read()) != -1){
      
        System.out.print((char)compare);
        };
    }
        catch(FileNotFoundException e){
            System.out.printf("%s not found!! " , file);
        }
        catch(IOException e ){
            System.out.printf("file not found %s" , e);
        }




        
        String nameOfFile = "output.txt"; // File name to read from

        try {
            FileReader reader = new FileReader(nameOfFile);
            int character;
            StringBuilder content = new StringBuilder();

            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            reader.close();
            System.out.println("Contents of " + filename + ":\n" + content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }






  
        }
}
