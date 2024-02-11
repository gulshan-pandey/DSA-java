import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingReader {
    
    public static void main(String[] args) {
        
        String filename = "file.txt";

        try(FileReader reader = new FileReader(filename);){
            int read =0; //initially it is zero
            do{
                read = reader.read();  //reader object will start to read the file
                System.out.println((char)read); //now converting the read from int to char
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






        }
}
