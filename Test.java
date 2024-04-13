

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Test extends JFrame {
    public Test(String str) {
        super(str);
        setSize(600, 600);
        
        JPanel panel = new JPanel();   // Set panel is inside view the JFrame,it helps to arrange the components more efficiently
    
        panel.setLayout(null); // Set layout to null for absolute positioning however we can use ( new FlowLayout()) for dynamic size
        JLabel l4 = new JLabel("Addition calculation");
        
        
        JButton b = new JButton("Add");
        b.setFocusable(false);        // to remove the border in the button
        b.setBounds(100, 300, 100, 40);
        
        JLabel l1 = new JLabel("Enter first number:");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("Enter second number:");
        JTextField t2 = new JTextField();
        JLabel l5 = new JLabel();
        l5.setBounds(70,350,150,30);
        
    
        


        
        l1.setBounds(50, 50, 300, 20);
        t1.setBounds(200, 50, 100, 20);
        l2.setBounds(50, 120, 200, 20);
        t2.setBounds(200, 120, 100, 20);
       
        l4.setBounds(150,10, 200, 20);
       

       
        
        panel.setBackground(new Color(108, 245, 131));

        panel.add(l1);
        panel.add(t1);  
        panel.add(l2);
        panel.add(t2);
        panel.add(b);  
       
        panel.add(l4);
        panel.add(l5);

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // Set default close operation

        setVisible(true);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText()); // it cannot be done by int type casting (int)
                    int b = Integer.parseInt(t2.getText());
                    int sum = a + b;
                    l5.setText("Hello world");
                    // make the font size larger of l5
                    l5.setFont(new Font(l5.getFont().getName(), Font.BOLD, 24));
                    
                } catch (NumberFormatException ex) {
                    l5.setText("Hello world");
                }
            }
        });
    }

    public static void main(String[] args) {
        Test frame = new Test("Addition calculator");

    }
}