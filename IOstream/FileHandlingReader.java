package IOstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingReader {

    public static void main(String[] args) {

        String filename = "IOstream/Text.txt";
        // the filereader work/reads on the basis of integers
        try (FileReader reader = new FileReader(filename);) { // it is called {try with resource}
            int read = 0; // initially it is zero or we can just initialise the read variable as it will
                          // read on the basis of integer
            do {
                read = reader.read(); // reader object will start to read the file
                System.out.print((char) read); // now converting the read from int to char
            } while (read != -1); // here -1 means read till there is nothing left

            reader.close();
        } catch (IOException exception) {
            System.out.println("exception occcured");
        }







    
        // WAP a program to read a filename from the user and display its content.the
        // program should handle the situation where the file does not exist

        Scanner sc = new Scanner(System.in);
        System.out.println(" \n enter the fileName: ");
        String file = sc.nextLine(); // copy any filename alongwith its path name to access them and paste
        sc.close();
        try (FileReader readed = new FileReader(file);) { // try with resource
            int compare;
            while ((compare = readed.read()) != -1) {

                System.out.print((char) compare);
            };
            readed.close();
        } catch (FileNotFoundException e) {
            System.out.printf("%s not found!! ", file);
        } catch (IOException e) {
            System.out.printf("file not found %s", e);
        }
    

        finally {
            System.out.println("\n\n\nprogram ended");
            
        }


        /// alternatively by using bufferReader////////////////////

        // String nameOfFile = "IOstream/output.txt"; // File name to read from

        // try (FileReader reader = new FileReader(nameOfFile);
        //         BufferedReader br = new BufferedReader(reader)) {
        //     String line;

        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }

        // } catch (IOException e) {
        //     System.out.println("An error occurred: " + e.getMessage());
        //     e.printStackTrace();
        // }



    }
}
