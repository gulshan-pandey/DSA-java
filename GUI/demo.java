package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// extending Frame class to our class
public class demo extends JFrame {

    // initializing using constructor
    demo() {

        // creating a button
        Button b = new Button("Click Me!!");

       
        b.setBounds(30, 100, 80, 30);    // setting button position on screen

       
        add(b);  // adding button into frame

        // frame size 300 width and 300 height
        setSize(300, 300);

        setTitle("This is basic AWT example");   // setting the title of Frame

        setLayout(null);    // no layout manager

        JCheckBoxMenuItem item = new JCheckBoxMenuItem("Test");
        item.setBounds(30, 150, 80, 30); 
        add(item);


        // now frame will be visible, by default it is not visible-
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program when the frame is closed.

        b.addActionListener(new ActionListener() {      //adding event listner in button to print hiiiiiiiiii
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            }
        });
    }




        // main method
    public static void main(String args[]) {

// creating instance of Frame class
        // new demo();
        SwingUtilities.invokeLater(new Runnable() {    // this allow us to run our code in background thread
            @Override
            public void run() {
                // new demo();
                // SwingDemo s = new SwingDemo();
                new Demo2();
            }
        });



    }

}




 // method 2 by creating the object of JFrame class

// 
class Demo2 {

    // Initializing using constructor
    Demo2() {
        JFrame jFrame = new JFrame("Demo");
               
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null); // Consider using layout managers for better UI design

        JLabel label = new JLabel("Label:");
        JButton button = new JButton("btn");
        JTextField textField = new JTextField();

        label.setBounds(50, 80, 80, 30);
        textField.setBounds(120, 80, 80, 30);
        button.setBounds(50, 150, 80, 30);

        jFrame.add(button);
        jFrame.add(label);
        jFrame.add(textField);

        // Adding combobox
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("One");
        comboBox.addItem("Two");
        comboBox.addItem("Three");
        comboBox.setBounds(200, 150, 80, 30); // Set the bounds for the combobox
        jFrame.add(comboBox);


       

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                button.setText(text);
            }
        });

        jFrame.setVisible(true);

        // JOptionPane.showMessageDialog(jFrame, "Invalid input. Please enter a valid number.");   //JOptionPane class is used to display a message box

    }

}



class SwingDemo {
    private JLabel mylabel;

    public SwingDemo() {
        JFrame jframe = new JFrame("first-swing-application");


        jframe.setLayout(new FlowLayout());  // Set the layout before adding components

        JLabel l1 = new JLabel("my-First-Label");  //Creating a label to the frame
        jframe.add(l1); // it is necessary to add the label to the frame
        jframe.setSize(300, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //terminates the program when the frame is closed.
        jframe.setVisible(true);  //necessary in order to show it


        JButton b1 = new JButton("UP");
        JButton b2 = new JButton("Down");
        JButton b3 = new JButton("Test");
        mylabel = new JLabel("private label");  //mylabel is private, initialized earlier
        b1.setSize(80, 30);
        b2.setSize(80, 30);
        b3.setSize(80, 30);

        // b1.setBounds(30, 100, 80, 30); //for specific location

        // b1.setPreferredSize(new Dimension(80, 30));  // Setting specific size for the buttons
        // b2.setPreferredSize(new Dimension(80, 30));
        // b3.setPreferredSize(new Dimension(80, 30));


        jframe.add(b1);
        jframe.add(b2);
        jframe.add(b3);
        jframe.add(mylabel);

    }


}