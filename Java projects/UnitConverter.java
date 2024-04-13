

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverter {

    private JFrame frame;
    private JLabel input, output;
    private JTextField intext, outtext;
    private JComboBox<String> fromUnit, toUnit;
    private JButton button;

    protected void converter() {
        frame = new JFrame("Unit Converter");
        frame.setSize(400, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    
        // frame.setBackground(new Color(177, 252, 3));       ------------ XXXXXXXXXXXX-------------


        frame.getContentPane().setBackground(new Color(110, 250, 241));      // v r explicitly setting the background color of the content pane, which is the container that holds all the components within the frame. This ensures that the background color affects the entire area where components are displayed, 

        input = new JLabel("Input: ");
        intext = new JTextField(10);
        output = new JLabel("Output: ");
        outtext = new JTextField(10);
        outtext.setEditable(false);       // ----  the output text is non-editable

        

        input.setBounds(20, 50, 100, 20);
        intext.setBounds(130, 50, 100, 20);
        output.setBounds(20, 100, 100, 20);
        outtext.setBounds(130, 100, 100, 20);

        String[] units = {"Kilometer", "Meter", "Feet", "Inches", "Centimeter"};
        fromUnit = new JComboBox<>(units);
        toUnit = new JComboBox<>(units);
        fromUnit.setBounds(270, 50, 100, 20);
        toUnit.setBounds(270, 100, 100, 20);

        button = new JButton("Convert");
        button.setBounds(150, 170, 100, 30);

        frame.add(input);
        frame.add(intext);
        frame.add(output);
        frame.add(outtext);
        frame.add(button);
        frame.add(fromUnit);
        frame.add(toUnit);

        button.addActionListener(new ConvertButtonListener());   //adding event listner in button to convert via anonymous inner class
        frame.setVisible(true);
    }

    public UnitConverter() {       //constructor
        converter();
    }

    private class ConvertButtonListener implements ActionListener {    

        @Override
        public void actionPerformed(ActionEvent e) {
            String fromUnitType = fromUnit.getSelectedItem().toString();
            String toUnitType = toUnit.getSelectedItem().toString();
            double inValue ;     // assigning new variable to store intext value
                        try {
                inValue = Double.parseDouble(intext.getText());    //converting string to double
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number ＞﹏＜");   //JOptionPane class is used to display a message box
                return;
            }
            double outValue = 0;      // assigning new variable to store outtext value
            switch (fromUnitType) {
                case "Kilometer":
                    switch (toUnitType) {
                        case "Meter":
                            outValue = inValue * 1000;
                            break;
                        case "Feet":
                            outValue = inValue * 3280.84;
                            break;
                        case "Inches":
                            outValue = inValue * 39370.1;
                            break;
                        case "Centimeter":
                            outValue = inValue * 100000;
                            break;
                        default:
                            outValue = inValue;
                    }
                    break;
                case "Meter":
                    switch (toUnitType) {
                        case "Kilometer":
                            outValue = inValue / 1000;
                            break;
                        case "Feet":
                            outValue = inValue * 3.28084;
                            break;
                        case "Inches":
                            outValue = inValue * 39.3701;
                            break;
                        case "Centimeter":
                            outValue = inValue * 100;
                            break;
                        default:
                            outValue = inValue;
                    }
                    break;
                case "Feet":
                    switch (toUnitType) {
                        case "Kilometer":
                            outValue = inValue / 3280.84;
                            break;
                        case "Meter":
                            outValue = inValue / 3.28084;
                            break;
                        case "Inches":
                            outValue = inValue * 12;
                            break;
                        case "Centimeter":
                            outValue = inValue * 30.48;
                            break;
                        default:
                            outValue = inValue;
                    }
                    break;
                case "Inches":
                    switch (toUnitType) {
                        case "Kilometer":
                            outValue = inValue / 39370.1;
                            break;
                        case "Meter":
                            outValue = inValue / 39.3701;
                            break;
                        case "Feet":
                            outValue = inValue / 12;
                            break;
                        case "Centimeter":
                            outValue = inValue * 2.54;
                            break;
                        default:
                            outValue = inValue;
                    }
                    break;
                case "Centimeter":
                    switch (toUnitType) {
                        case "Kilometer":
                            outValue = inValue / 100000;
                            break;
                        case "Meter":
                            outValue = inValue / 100;
                            break;
                        case "Feet":
                            outValue = inValue / 30.48;
                            break;
                        case "Inches":
                            outValue = inValue / 2.54;
                            break;
                        default:
                            outValue = inValue;
                    }
                    break;
            }
            outtext.setText(String.valueOf(outValue));
        }
    }

    public static void main(String[] args) {
        new UnitConverter();
    }
}
