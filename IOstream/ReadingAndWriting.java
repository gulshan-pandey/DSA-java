package IOstream;

import java.io.File;
import java.io.*;

public class ReadingAndWriting {
    
    public static void main(String[] args) {
        
        
        File file = new File ("IOstream/Text.txt");       //abstracted class used to represent paths of file   
        
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            
            System.out.println("Total size to read in bytes is : "+ fileInputStream.available());    //this available method used tr return the number of bytes(tells the size of words)

            // in order to read the content of a file using io
            int content;
            while((content = fileInputStream.read()) != -1){       //read method returns -1 when the end is reached
                System.out.print((char) content);
            }

        } catch(Exception e){
            System.out.println("exception");
        }
        
    }
    
    
}