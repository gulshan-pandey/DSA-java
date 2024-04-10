package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Features extends JFrame {
   /*
   FlowLayout:Components are arranged in a left-to-right flow, wrapping to the next row if the container's width is exceeded.
FlowLayout(): Constructor without any arguments.
FlowLayout(int align): Constructor with alignment argument (FlowLayout.LEFT, FlowLayout.CENTER, FlowLayout.RIGHT, FlowLayout.LEADING, FlowLayout.TRAILING).
FlowLayout(int align, int hgap, int vgap): Constructor with alignment, horizontal gap, and vertical gap arguments.

BorderLayout : Divides the container into five regions: north, south, east, west, and center. Components can be added to these regions.
BorderLayout(): Constructor without any arguments.
BorderLayout(int hgap, int vgap): Constructor with horizontal and vertical gap arguments.
void addLayoutComponent(Component comp, Object constraints): Adds the specified component with the specified constraint

GridLayout:Components are arranged in a grid of rows and columns.
GridLayout(): Constructor without any arguments.
GridLayout(int rows, int cols): Constructor with row and column count arguments.
GridLayout(int rows, int cols, int hgap, int vgap): Constructor with row count, column count, horizontal gap, and vertical gap arguments.

BoxLayout:Arranges components in a single row or column, respecting their preferred sizes.
Methods:
BoxLayout(Container target, int axis): Constructor with target container and axis (BoxLayout.X_AXIS or BoxLayout.Y_AXIS).
void addLayoutComponent(Component comp, Object constraints): Adds the specified component with the specified constraint. */

public Features() {
        
        super("Testing");
        
        // setExtendedState(JFrame.MAXIMIZED_BOTH);    //for full screen size

        setSize(500, 500);
        setLayout(new BorderLayout());
        
        JColorChooser colorChooser = new JColorChooser();      // to embed color choser
        add(colorChooser, BorderLayout.NORTH);
        
        JFileChooser fileChooser = new JFileChooser();              //to embedd file
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setBackground(getForeground());
        add(fileChooser, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();     // adding menu bar
        setJMenuBar(menuBar);         //implement the menubar
        
        JMenu menu = new JMenu("Title menu");
        JMenu menu2 = new JMenu("Another-Titled menu");
        menuBar.add(menu);                              // adding menus to menu bar
        menuBar.add(menu2);
        
        JLabel label = new JLabel();
        label.setText("kungfu panda!!!");
        ImageIcon img = new ImageIcon("GUI/Gemini_Generated_Image_sfuebbsfuebbsfue.jpeg");
        img.setImage(img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));    //set the size of image
        getContentPane().setBackground(new Color(141, 242, 235));    //or (Color.BLUE)     // setting  background color
        Border border = BorderFactory.createLineBorder(Color.gray, 5);          //setting  border to the label
        label.setBorder(border);
        
        JPanel panel = new JPanel();  // the size and position of the button in border layout is done by using panel

        JButton but = new JButton();             // initializing button
        // but.setBounds(100,500,250,50);   ---- wont work in flow layout
        but.setText("kungfu panda!!!");
        but.setBackground(Color.lightGray);
        but.setForeground(Color.red);
        but.setHorizontalAlignment(JButton.LEFT);
        but.setVerticalAlignment(JButton.TOP);
        but.setFocusable(false);        //prevent the anonymous border at the button    
        but.setFont(new Font("MV Boli", Font.ITALIC, 20));
        add(but, BorderLayout.SOUTH);         //setting the position and adding to panel
        but.setPreferredSize(new Dimension(300, 50));    // setPreferredSize(,) used to setting size
        panel.add(but);
        add(panel);

       
      

        //to set background image
        // ImageIcon backgroundImage = new ImageIcon("background.jpg"); // Provide path to your image
        // JLabel backgroundLabel = new JLabel(backgroundImage);
        
        // // Set bounds for the label to cover the whole frame
        // backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        
        // // Add the label to the frame
        // frame.add(backgroundLabel);
        
        // // Adjust the frame size to fit the background image
        // frame.setSize(backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        



        add(label, BorderLayout.SOUTH);
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);      // setting the label position relative to image
        label.setVerticalTextPosition(JLabel.BOTTOM);
        // label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.magenta);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));        // for setting font
        label.setBackground(Color.black);                           // for setting background of the label and labal image
        label.setOpaque(true);
        label.setBounds(100, 100, 200, 200);
        
        
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Features();

    }
}

  


