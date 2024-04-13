package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypesOfLayouts {

    //Border layout(default layout)----------------------------------------------------------------

    public TypesOfLayouts() {
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
        // new gridLayout();
        // new Jlayeredpane();
        // new WindowOverlay();
        SwingUtilities.invokeLater(() -> new AdvanceFeatures("Food order"));     // this  will create the confilct with EDT(event dispach thread) 
        // new AdvanceFeatures("Food order");   //---- either way is fine
        

        // JOptionPane .showMessageDialog(null,"hello","title:",JOptionPane.INFORMATION_MESSAGE);        // JOptionPane is used to show the message to the screen
        
        // int i =3;
        // while(i>0){
        //     JOptionPane.showMessageDialog(null, "You have been hacked","Hacked warning", JOptionPane.WARNING_MESSAGE);
        //      i--;}

        // JOptionPane.showMessageDialog(null,"we need to talk..","Read this",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"But why???","Question",JOptionPane.QUESTION_MESSAGE);



        //if we want to store and print theinput message  --- use .showInputDialog()
        // String userInput = JOptionPane.showInputDialog(null, "But why?", "Question", JOptionPane.QUESTION_MESSAGE);
        // System.out.println("User's input: " + userInput);



        // JOptionPane.showMessageDialog(null,"window crashed","Dead",JOptionPane.ERROR_MESSAGE);
        
        // ImageIcon icon = new ImageIcon("GUI/Gemini_Generated_Image_sfuebbsfuebbsfue.jpeg");
        // JOptionPane.showMessageDialog(null, "bro do you even code", "myTitle", JOptionPane.YES_NO_CANCEL_OPTION,icon);
 
        // String name = JOptionPane.showInputDialog("Enter your name");    // this can be stored in string
        // JOptionPane.showMessageDialog(null, "hello "+name);

        // String[] responses ={"do","undo","redo","exit"};
        // JOptionPane.showOptionDialog(null,"Choose an action:","myTitle: ",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,responses,0);      // this returns integer(0,1,2,-1)
    
        // JOptionPane.showConfirmDialog(null, "do you want to continue?", "myTitle", JOptionPane.YES_NO_CANCEL_OPTION);       // return type is  int(0,1,2,-1)



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
        panel.setPreferredSize(new Dimension(110,200));
        
        panel.setLayout(new FlowLayout());
        
        JCheckBox cb = new JCheckBox("do you agree?");           // introducing checkbox
        cb.setFocusable(false);
        cb.setFont(new Font("Consolas",Font.ITALIC,12));
        panel.add(cb);
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
class gridLayout{
    public gridLayout() {
        JFrame jf = new JFrame("grid layout");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new java.awt.GridLayout(3,3,10,10));       // 3 rows and 3 columns , horiz-spacing , vert-spacing

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
        lp.setBounds(0,0,500,500);     // the dimensions of the layered pane
        lp.add(l1);
        lp.add(l2);
        lp.add(l3);
        JFrame jframe = new JFrame("layered pane");
        jframe.add(lp);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400,400);
        // jframe.setLayout(new BorderLayout());   --------- no need to specify coz by default layout is borderlayout
        jframe.setVisible(true);


        
    }

}





// Window overlay----------------------------------------------

class WindowOverlay implements ActionListener{
 JFrame jframe1 = new JFrame("Window overlay");
 JButton buttonn = new JButton("click me");
 
 public WindowOverlay(){
     buttonn.setBounds(50,50,100,30);
     buttonn.setFocusable(false);
     jframe1.setLayout(null);     // by default layout is Border layout
     jframe1.add(buttonn);
     jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jframe1.setSize(300,300);
     jframe1.setVisible(true);

     buttonn.addActionListener(this);

   


    }

    public void actionPerformed(ActionEvent e){      // action listener
        if(e.getSource()== buttonn){
            buttonn.setEnabled(false);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                
                System.out.println("sorry!");
            }
            jframe1.dispose();
            new NewWindow ();
        }
     }
}

class NewWindow{        // appeared when button is clicked!

    public NewWindow(){
        JFrame jframe2 = new JFrame("New Window");
        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe2.setSize(420,420);
        
        JLabel lab = new JLabel();
        lab.setText("Hello");
        jframe2.add(lab);
        lab.setBounds(0,0,100,23);
        lab.setFont(new Font("Consolas",Font.ITALIC,25));
        jframe2.setVisible(true);
    }
}




class AdvanceFeatures extends JFrame implements ActionListener{

    private JLabel l1;
    private JRadioButton pizzaBtn;
    private JRadioButton burgurBtn;
    private JRadioButton friesBtn;
    private ButtonGroup option ;     // for grouping the radio buttons
    private JButton btn;


    // progressbar
    JProgressBar progressbar= new JProgressBar();


    public AdvanceFeatures(String str){
          super(str);    // to set the title of the window
          ImageIcon icon = new ImageIcon("GUI/Gemini_Generated_Image_sfuebbsfuebbsfue.jpeg");
          setIconImage(icon.getImage());               // to set the image icon of the window's frame

          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          l1 = new JLabel();
          l1.setText("let me buy the lunch <3");
          pizzaBtn = new JRadioButton("pizza");
          burgurBtn = new JRadioButton("burgurs");
          friesBtn = new JRadioButton("fries");
          option = new ButtonGroup();
          option.add(pizzaBtn);    // adding all 3 in the same group so that once can be selected at one time
          option.add(burgurBtn);
          option.add(friesBtn);
          btn= new JButton("Order Now");


////////////////////// by using flow layout////////

        //   setLayout(new FlowLayout());
        // add(progressbar);
        
        //   add(l1);
        //   add(pizzaBtn);
        //   add(burgurBtn);
        //   add(friesBtn);
        //   add(btn);


        /////////// by using border layout////////

          setLayout(new BorderLayout());
          JPanel radioPanel = new JPanel(new GridLayout(5, 1));
          radioPanel.add(l1);
          radioPanel.add(pizzaBtn);
          radioPanel.add(burgurBtn);
          radioPanel.add(friesBtn);
          radioPanel.add(progressbar);
          add(radioPanel, BorderLayout.CENTER);
          add(btn, BorderLayout.SOUTH);




        progressbar.setValue(0);
        progressbar.setStringPainted(true);
        progressbar.setFont(new Font("MV Boli",Font.BOLD,12));
        progressbar.setForeground(Color.GREEN);
        progressbar.setBackground(Color.BLACK);
   
          pack();
          setVisible(true);
          btn.addActionListener(this);
          
        }

        public void fill(){
            btn.setEnabled(false); // Disable the button while filling the progress bar

        Thread fillThread = new Thread(new Runnable() {     // make another thread other than EDT so that progressbar can fill in seperate thread
        @Override
        public void run() {
            int progress = 0;
            while (progress <= 100) {
                progressbar.setValue(progress);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progress++;
            }
            progressbar.setString("Done!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dispose();
            
        }
    });
    fillThread.start();
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            if(pizzaBtn.isSelected()){
                fill();
                System.out.println("your order is pizza");
                
            }
            else if(burgurBtn.isSelected()){
                fill();
                System.out.println("your order is burger");
                
            }
            else if(friesBtn.isSelected()){
                fill();
                System.out.println("your order is fries");
            
            }
        }
        
    }
}