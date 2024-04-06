package GUI;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {
    
    public Test() {
        
        super("Testing");
        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        
        JColorChooser colorChooser = new JColorChooser();
        add(colorChooser);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setBackground(getForeground());
        add(fileChooser);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);

        
    }
    
    public static void main(String[] args) {
        new Test();
    }
}
