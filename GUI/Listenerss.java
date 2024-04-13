package GUI;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Listenerss extends JFrame implements KeyListener {
    /////////////key listeners in java////////////
  
    public Listenerss(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.addKeyListener(this);
    }




    
    @Override
    public void keyTyped(KeyEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }













    public static void main(String[] args) {
        new Listenerss();
    }
}
