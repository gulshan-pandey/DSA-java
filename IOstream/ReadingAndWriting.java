package IOstream;

import java.io.File;
import java.io.*;

public class ReadingAndWriting {
    
    public static void main(String[] args) {
        
        
        File file = new File ("IOstream/Text.txt");
        
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            
            System.out.println("Total size to read in bytes is : "+ fileInputStream.available());
        } catch(Exception e){
            System.out.println("exception");
        }
        
    }
    
    
}