package IOstream;

import java.io.IOException;

public class ByteStreamss {

    // two types of io streams -->byte streams and character streams

    public static void main(String[] args) throws IOException {

        // let us see how to print the array of bytes that we get from our keyboard

        byte data[] = new byte[10];
        System.out.println("enter some chars: ");
        System.in.read(data); // for reading whatever is being passed by our console,,, throws exception as sometimes its not possible to read inputs (due to keyboard issues stuff...)
        System.out.print("you entered: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " "); // will print char into binaries
            System.out.print((char) data[i] + " ");
        }

    }

}
