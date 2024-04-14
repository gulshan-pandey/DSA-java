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
        //KeyTyped - is invoked when a key is typed, uses keyChar, char output
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keypressed: invoked when a physical key is pressed down, used keyCode , int output
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleases is called whenever a button is released
        // System.out.println("you released : "+ e.getKeyChar());
        System.out.println("you released : "+ e.getKeyCode());

    }













    public static void main(String[] args) {
        new Listenerss();
    }
}
