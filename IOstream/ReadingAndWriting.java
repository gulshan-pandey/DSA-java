package IOstream;

import java.io.*;

public class ReadingAndWriting {
    
    public static void main(String[] args) {
        
        
        File file = new File ("IOstream/Text.txt");       //abstracted class used to represent paths of file in its constructor
        
        try(FileInputStream fileInputStream = new FileInputStream(file)){    // using try with resource   
            
            System.out.println("Total size to read in bytes is : "+ fileInputStream.available());    //this available method used to return the number of bytes(tells the size of words)

            // in order to read the content of a file using io
            int content;
            while((content = fileInputStream.read()) != -1){       //read method returns -1 when the end is reached
                System.out.print((char) content);
            }

        } catch(Exception e){
            System.out.println("exception occured");
            e.printStackTrace();
        }
        
        
        
        
        
        // to print the file details
     
    if (file.exists()) {
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
    } else {
        System.out.println("File does not exist.");
    }

        //program to delete the file

        // File file2 = new File("IOstream/Text.txt");
        // if(file2.delete()){
        //     System.out.println();
        //     System.out.println("deleted successfully");
        // } else{
        //     System.out.println();
        //     System.out.println("unable to delete");
        // }






        

    }
    
    
}