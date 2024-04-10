package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class typesOfLayout {

    //Border layout----------------------------------------------------------------

    public typesOfLayout() {
        JFrame f1= new JFrame();
        f1.setSize(400,400);
        f1.setLayout(new BorderLayout(10,10));      // vertical and horizontal gap
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.setBackground(Color.red);
        p2.setBackground(Color.blue);
        p3.setBackground(Color.pink);
        p4.setBackground(Color.green);
        p5.setBackground(Color.magenta);
        
        
        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));

        f1.add(p1,BorderLayout.NORTH);
        f1.add(p2,BorderLayout.SOUTH);
        f1.add(p3,BorderLayout.EAST);
        f1.add(p4,BorderLayout.WEST);
        f1.add(p5,BorderLayout.CENTER);
        f1.setVisible(true);
    }
    
    public static void main(String[] args) {
        // new typesOfLayout();
        // new flowlayout();
        // new GridLayout();
        // new Jlayeredpane();
        new WindowOverlay();

        // JOptionPane .showMessageDialog(null,"hello","title:",JOptionPane.INFORMATION_MESSAGE);
        // while(true){
        //     JOptionPane.showMessageDialog(null, "You have been hacked","Hacked warning", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null,"we need to talk..","Read this",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"But why???","Question",JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"window crashed","Dead",JOptionPane.ERROR_MESSAGE);
        // ImageIcon icon = new ImageIcon("GUI/Gemini_Generated_Image_sfuebbsfuebbsfue.jpeg");
        // JOptionPane.showMessageDialog(null, "bro do you even code", "myTitle", JOptionPane.YES_NO_CANCEL_OPTION,icon);
 
    //     String name = JOptionPane.showInputDialog("Enter your name");    // this can be stored in string as well
    //     JOptionPane.showMessageDialog(null, "hello "+name);

    //      String[] responses ={"do","undo","redo","exit"};
    //      JOptionPane.showOptionDialog(null,"you are awsome","Title: ",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,responses,0);
        }
}







//-------------------------------------------flow layout ------------------
class flowlayout{

    public flowlayout() {
        JFrame f = new JFrame("flow layout");
        f.setSize(400,400);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200,200));
        
        panel.setLayout(new FlowLayout());

        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));
        panel.add(new Button("10"));

        f.add(panel);
        f.setVisible(true);

        
    }
}



//-------------------------grid layout --------------------
class GridLayout{
    public GridLayout() {
        JFrame jf = new JFrame("grid layout");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new java.awt.GridLayout(3,3,10,0));         // 3 rows and 3 columns , horiz-spacing , vert-spacing

        jf.add(new JButton("1"));
        jf.add(new JButton("2"));
        jf.add(new JButton("3"));
        jf.add(new JButton("4"));
        jf.add(new JButton("5"));
        jf.add(new JButton("6"));
        jf.add(new JButton("7"));
        jf.add(new JButton("8"));
        jf.add(new JButton("9"));

        jf.setVisible(true);

}

    
}


//--------------------------------jlayered pane ----------------------

class Jlayeredpane{
    public Jlayeredpane(){
        JLabel l1 = new JLabel();
        l1.setBackground(Color.red);
        l1.setOpaque(true);
        l1.setBounds(50,50,200,200);
        JLabel l2 = new JLabel();
        l2.setBackground(Color.blue);
        l2.setOpaque(true);
        l2.setBounds(100,100,200,200);
        JLabel l3 = new JLabel();
        l3.setBackground(Color.green);
        l3.setOpaque(true);
        l3.setBounds(150,150,200,200);

        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(0,0,600,600);
        lp.add(l1);
        lp.add(l2);
        lp.add(l3);
        JFrame jframe = new JFrame("layered pane");
        jframe.add(lp);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400,400);
        jframe.setVisible(true);


        
    }

}





// Window overlay----------------------------------------------

class WindowOverlay implements ActionListener{
 JFrame jframe1 = new JFrame("Window overlay");
 JButton buttonn = new JButton("click me");
 
 public WindowOverlay(){
     buttonn.setBounds(50,50,100,20);
     buttonn.setFocusable(false);
     jframe1.setLayout(null);
     jframe1.add(buttonn);
     jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jframe1.setSize(300,300);
     jframe1.setVisible(true);

     buttonn.addActionListener(this);

   


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== buttonn){
            buttonn.setEnabled(false);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e1) {
                
                System.out.println("sorry!");
            }
            jframe1.dispose();
            new NewWindow ();
        }
     }
}

class NewWindow{

    public NewWindow(){
        JFrame jframe2 = new JFrame("New Window");
        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe2.setSize(420,420);
        
        JLabel lab = new JLabel();
        lab.setText("Hello");
        jframe2.add(lab);
        lab.setBounds(0,0,100,23);
        lab.setFont(new Font(null,Font.ITALIC,25));
        jframe2.setVisible(true);
    }
}
